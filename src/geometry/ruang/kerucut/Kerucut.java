/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.kerucut;

import geometry.bidang.Lingkaran;
import geometry.ruang.MenghitungRuang;

/**
 *
 * @author  M S I
 */ 

public class Kerucut extends Lingkaran implements MenghitungRuang{
    private double tinggi, luaskerucut,volumekerucut;
    
    public Kerucut(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
        
    } 
   
    
    @Override
    public void  hitungVolume() {
       luaskerucut = getLuas()*tinggi;
    }

    @Override
    public void hitungLuasPermukaan() {
         double sisi = Math.sqrt((jarijari*jarijari)+(tinggi*tinggi));
        volumekerucut = Math.PI*jarijari*sisi + getLuas();
    } 

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getluaskerucut() {
        return luaskerucut;
    }

    public void setluaskerucut(double luaskerucut) {
        this.luaskerucut = luaskerucut;
    }

    public double getvolumekerucut() {
        return volumekerucut;
    }

    public void setvolumekerucut(double volumekerucut) {
        this.volumekerucut = volumekerucut;
    }
    

    
}