/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Kullanıcı;

import javax.swing.JOptionPane;

/**
 *
 * @author CENE
 */
public class Helper {
    public static void showMsg(String str ){
        String msg;
        
        switch (str){
        
            case "eksik":
                msg ="Lütfen eksik alanları doldurunuz.";
                break;
            default :
                msg= str;
        }
        
       JOptionPane.showMessageDialog(null,msg,"Mesaj",JOptionPane.INFORMATION_MESSAGE);
        
    }
        
    }
    

