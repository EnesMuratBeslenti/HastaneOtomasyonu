package hastaneotomasyonu;

import java.sql.*;
public class baglantı {
    public static Connection con(){
        Connection baglantı=null;
        try{
            baglantı=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\CENE\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\verıtabanı\\verıtabanı.db");
            System.out.println("Bağlantı Başarılı");

        }catch (Exception e){
            System.out.println("Bağlantı Başarısız"+e.getMessage());
        }       
           return baglantı;        
    }

    baglantı conDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    java.beans.Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
