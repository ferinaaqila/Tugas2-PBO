/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author ASUS
 */
public class Balok extends MenghitungRuang {
    double panjang=0;
    double lebar=0;
    double tinggi=0;
    
   private double hitungVolume(double p, double l, double t){
        return p*l*t;
    }
    private double hitungLuasPermukaan(double p, double l, double t){
        return 2*(p*l+p*t+l*t);
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getVolume() {
        return hitungVolume(panjang, lebar, tinggi);
    }
    public double getLuasPermukaan() {
        return hitungLuasPermukaan(panjang, lebar, tinggi);
    }
}
