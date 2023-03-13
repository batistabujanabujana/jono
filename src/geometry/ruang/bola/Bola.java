/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.bola;

/**
 *
 * @author M S I
 */
import geometry.bidang.Lingkaran;
import geometry.ruang.MenghitungRuang; 

public class Bola extends Lingkaran implements MenghitungRuang {
    private double luasPermukaan, volume;
    
   
    
    public Bola(double r) {
        super(r);
    }    
    
    @Override
    public void hitungVolume()
    {
        volume = 4/3*getLuas()*getJarijari();
    }
    
    @Override
    public void hitungLuasPermukaan()
    {
        luasPermukaan = 4*getLuas();
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
}