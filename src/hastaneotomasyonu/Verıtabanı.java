/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneotomasyonu;
import java.sql.*;

/**
 *
 * @author CENE
 */
public class Verıtabanı {
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
    public int VerıAlma() {
        
        return 0;
    }
    
    
}
