/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.bidang;

/**
 *
 * @author M S I
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author M S I
 */
public class Lingkaran implements MenghitungBidang {
    public  double jarijari, luas, keliling; 
public Lingkaran() {
    }
     public Lingkaran(double r) {
        jarijari = r;
    }
    public double getJarijari() {
        return jarijari;
    }
    
    
     @Override
    public void hitungluas() {
       luas = jarijari*jarijari*Math.PI;
    }
    
    @Override
    public void hitungkeliling() {
       keliling = 2*Math.PI*jarijari; 
    }
    
    public double getLuas() {
        return luas;
    }
    
    public double getKeliling() {
        return keliling;
    }
    
   
    
  
    
}   





