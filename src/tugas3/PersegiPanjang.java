/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Ferina
 */
public class PersegiPanjang extends MenghitungBidang{
    double panjang;
    double lebar;
    
    @Override
    double luas(){
        double luas = panjang*lebar;
        System.out.println(luas);
        return luas;
    }
    
    @Override
    double keliling(){
        double keliling = 2*(panjang+lebar);
        System.out.println(keliling);
        return keliling;
    }
}
