/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry.ruang.bola;
import geometry.ruang.MenghitungRuang; 

/**
 *
 * @author M S I
 */
 
import geometry.bidang.Lingkaran; 

public class Tembereng extends Bola{

    private double tinggi;
    
    public Tembereng(double jarijari, double tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
    }
//    @Override
    public double volumeTemberng() {
       return 0.5*getLuas()*tinggi + 1/6*Math.PI*tinggi*tinggi*tinggi;
    }

//    @Override
    public double luaspermukaanTemberng() {
        return getKeliling()*tinggi;
    }
    
}