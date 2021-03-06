/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import dungchung.message_Cls;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author naruto
 */
public class NhanDataServerThs extends Thread {

    Socket sk;
    ObjectInputStream ois;
    Menu mn;
    HangDoiTimPhong hdtp;

    public NhanDataServerThs(Socket sk, String name, ObjectInputStream ois, Menu mn) {
        super(name);
        this.sk = sk;
        this.ois = ois;
        this.mn = mn;
        this.hdtp = mn.getHdtp();
        System.out.println("luong nhan hoat dong");
    }

    public void run() {
        while (true) {
            try {
                System.out.println("dang hoat dong");
                if (!this.sk.isClosed()) {
                    message_Cls sms = (message_Cls) ois.readObject();
                    if (sms != null) {
                        System.out.println("44->(nhan data server) nhan :::::"+sms.getStatus()+sms.getDesc());
                        switch (sms.getStatus()) {
                            case "rooms":
                                if(sms.isCf()){
                                    hdtp.hienThiPhong(sms.getRoom());
                                }else{
                                    JOptionPane.showMessageDialog(mn,"hệ thống đang bận");
                                }
                                break;
                            case "vao phong":
                                System.out.println("54->(nhan data server) da nhan duoc => " + sms.getDesc()+" co "+sms.isCf());
                                if (sms.isCf()) {
                                    Online onl = new Online(this.mn,false,sms.getIdPhong(),sms.getPort(),sms.getInetAddress());
                                    onl.show();
                                    onl.getCarochess1().setSanSang(true);
//                                    onl.Connect(sms.getPort(),sms.getInetAddress());
                                    this.hdtp.dispose();
                                } else {
                                    JOptionPane.showMessageDialog(mn, sms.getDesc());
                                }
                                break;
                            case "tao phong"://server se cung cap cho 1 id phong
                                if(sms.isCf()){
                                    System.out.println("67->(nhan data server)"+sms.getDesc()+"  ===================== id phog "+sms.getIdPhong());
                                    this.mn.setId_phong(sms.getIdPhong());
//                                    this.mn.getOnl().Connect(sms.getPort(),sms.getInetAddress());
                                    this.mn.getOnl().Connect2();
                                }
                                
                                break;
                            default:
                                this.mn.getSk().SendData(new message_Cls("ok", "da nhan duoc"));
                                System.out.println("75->(nhan data server)da nhan duoc => " + sms.getDesc());
                                this.mn.setNotice(sms.getDesc());
                        }
                    }
                } else {
                    System.out.println("80->(nhan data server) da dong socket");
                    this.sk.close();
                    this.stop();
                }
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("87->loi nhan tin server "+e.getMessage());
            }
        }
    }

    public void closeSk() {
        try {
            if (this.sk != null || !this.sk.isClosed()) {
                this.sk.close();
                this.stop();
                System.out.println("da dong sk");
            }
        } catch (IOException ex) {
            System.out.println("loi dong sk");
            ex.printStackTrace();
        }
    }
}
