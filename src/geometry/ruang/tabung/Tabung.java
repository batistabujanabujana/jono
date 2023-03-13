/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.tabung;
import geometry.bidang.Lingkaran;
import geometry.ruang.MenghitungRuang;

/**
 *
 * @author M S I
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi,luastabung,volumetabung;

    public Tabung(double r, double t) {
        super(r);
        tinggi = t;
    }    
    

    
    @Override
    public void hitungVolume() {
        volumetabung= getLuas()*tinggi;
         }

    @Override
    public void hitungLuasPermukaan() {
         luastabung= 2*getKeliling()*(super.jarijari+ tinggi);

    }

    public double getTinggi() {
        return tinggi;
    }

    public double getLuastabung() {
        return luastabung;
    }

    public double getVolumetabung() {
        return volumetabung;
    }
    
    
}
