/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.kerucut; 

import geometry.bidang.Lingkaran;
import geometry.ruang.MenghitungRuang;

/**
 *
 * @author M S I
 */
public class KerucutTerpancung extends Kerucut {
    private double jarijaritutup ;
     private  int   tinggitutup;

    public KerucutTerpancung(double jarijaritutup, int tinggitutup, double tinggi, double jarijari) {
        super(tinggi, jarijari);
        this.jarijaritutup = jarijaritutup;
        this.tinggitutup = tinggitutup;
    }
    
    
    public double volumeterpancung() {
        return getvolumekerucut() - 1/3*Math.PI*jarijaritutup*jarijaritutup* (double)tinggitutup;//overloading
    }

   
    public double luaspermukaanterpancung() {
        double sisitutup = Math.sqrt((jarijaritutup*jarijaritutup)+((double)tinggitutup*(double)tinggitutup));
        return getluaskerucut() - Math.PI*jarijaritutup*sisitutup;
    }

    
    
    
}
