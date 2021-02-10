/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Kullanıcı;

/**
 *
 * @author CENE
 */
public class Kulllanıcı {
   private int k_id;
   private int k_tc;
   private String k_ad;
   private String type;
   String sifre;

    public Kulllanıcı(int k_id, int k_tc, String k_ad, String type, String sifre) {
        this.k_id = k_id;
        this.k_tc = k_tc;
        this.k_ad = k_ad;
        this.type = type;
        this.sifre = sifre;
    }

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public int getK_tc() {
        return k_tc;
    }

    public void setK_tc(int k_tc) {
        this.k_tc = k_tc;
    }

    public String getK_ad() {
        return k_ad;
    }

    public void setK_ad(String k_ad) {
        this.k_ad = k_ad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    

    
  
}
