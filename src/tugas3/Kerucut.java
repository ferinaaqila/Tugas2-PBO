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
public class Kerucut {
    double jari=0;
    double tinggi=0;
    double selimut=0;
    
    private double hitungVolume(double r, double t) {
        return (3.14*r*r*t)/3;
    }
    private double hitungLP(double r, double s) {
        return 3.14*r*(r+s);
    }
    public void setJari(double jari) {
        this.jari = jari;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public void setSelimut(double selimut) {
        this.selimut = selimut;
    }
    public double getVolume() {
        return hitungVolume(jari, tinggi);
    }
    public double getLP() {
        return hitungLP(jari, selimut);
    }
    
}
