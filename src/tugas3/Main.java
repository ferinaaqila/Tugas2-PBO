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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int pilih;
        char ulang;
        
        Scanner scan=new Scanner(System.in);
        
        do{
            System.out.println("\n-------- Menu --------");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            switch(pilih){
                case 1 -> {
                    MenghitungBidang mbidang = new MenghitungBidang();
                    MenghitungRuang mruang = new MenghitungRuang();
                    
                            Balok blk = new Balok();
                            PersegiPanjang segipanjang = new PersegiPanjang();
                            System.out.print("Panjang\t: "); 
                            segipanjang.panjang = scan.nextDouble();
                            System.out.print("Lebar\t: "); 
                            segipanjang.lebar = scan.nextDouble();
                            System.out.print("Tinggi\t: "); 
                            blk.setTinggi(scan.nextDouble());
                            System.out.println("\n---------OUTPUT-------------");
                            System.out.println("\nLuas Persegi Panjang : ");
                            mbidang.luas();
                            segipanjang.luas();
                            System.out.println("\nKeliling Persegi Panjang : ");
                            mbidang.keliling();
                            segipanjang.keliling();
                            System.out.println("\nVolume Balok : ");
                            mruang.volume();
                            System.out.println(blk.getVolume());
                            System.out.println("\nLuas Permukaan Balok: ");
                            mruang.permukaan();
                            System.out.println(blk.getLuasPermukaan());
                 
                    break;
                }
                case 2 -> {
                    MenghitungBidang mbidang = new MenghitungBidang();
                    MenghitungRuang mruang = new MenghitungRuang();
                    
                            Lingkaran lkr = new Lingkaran();
                            Kerucut krc = new Kerucut();
                            System.out.print("Jari-Jari\t: "); 
                            lkr.jari = scan.nextDouble();
                            System.out.print("Tinggi\t: "); 
                            krc.tinggi = scan.nextDouble();
                            System.out.print("Selimut\t: "); 
                            krc.selimut = scan.nextDouble();
                            System.out.println("\n---------OUTPUT-------------");
                            System.out.println("\nLuas Lingkaran : ");
                            mbidang.luas();
                            lkr.luas();
                            System.out.println("\nKeliling Lingkaran: ");
                            mbidang.keliling();
                            lkr.keliling();
                            System.out.println("\nVolume Kerucut : ");
                            mruang.volume();
                            System.out.println(krc.getVolume());
                            System.out.println("\nLuas Permukaan Kerucut: ");
                            mruang.permukaan();
                            System.out.println(krc.getLP());
                  break;
                    }
            }System.out.print("Ingin Kembali Ke Menu?(Y/N)  ");
        ulang = scan.next().charAt(0);
        }while(ulang=='Y'||ulang=='y');
}
}