/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometry;
 import geometry.bidang.Lingkaran;
import geometry.ruang.bola.Bola;
import geometry.ruang.bola.Juring;
import geometry.ruang.bola.Keratan;
import geometry.ruang.bola.Tembereng;
import geometry.ruang.kerucut.KerucutTerpancung;
import geometry.ruang.tabung.Tabung;
import java.util.Scanner;
/**
 *
 * @author M S I
 */
public class Geometry {

   public static void main(String[] args) {

        int menu;
        char ulang;
        int  tinggi;
        float     r;
        
        Scanner input = new Scanner(System.in); 
        System.out.println("==========");
        System.out.println("Geomrty "); 
        System.out.println("==========");
       System.out.println("Bangun Datar Lingkaran");
        
        System.out.print("Masukan Jari-Jari : ");            
        r = input.nextInt();
        Lingkaran circle = new Lingkaran(r);
         circle.hitungluas(); 
                    circle.hitungkeliling();
                    
        System.out.println("Luas Lingkaran = " + circle.getLuas());
        System.out.println("Keliling Lingkaran = " + circle.getKeliling()); 
        System.out.println("    ");
        
               
        
        
        do { 
            System.out.println("       ");
            System.out.println("Menu");
            System.out.println("1. Tabung");
            System.out.println("2. Kerucut");
            System.out.println("3. Bola");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt(); 
            System.out.println("   ");
            
            switch (menu) { 
                
                case 1: 
                    System.out.println("===========================");
                    System.out.println("Anda memilih menu 1.Tabung"); 
                    System.out.println("==========================="); 
                    System.out.print("Masukan Tinggi Tabung : ");
                    tinggi = input.nextInt();
                    Tabung tb = new Tabung(tinggi, r); 
                    tb.hitungluas(); 
                    tb.hitungkeliling();
                    tb.hitungVolume();
                    tb.hitungLuasPermukaan();

                    System.out.println("Volume Tabnung = " + tb.getVolumetabung());
                    System.out.println("Luas Tabung = " + tb.getLuastabung()); 
                    System.out.println("    ");
                    break;
                case 2:
                    System.out.println("===========================");
                    System.out.println("Anda memilih menu 2.Kerucut"); 
                    System.out.println("===========================");  
                    
                    System.out.print("Masukan Tinggi Kerucut    : ");
                    tinggi = input.nextInt();
                    System.out.print("Masukan Jari-Jari tutup   : ");
                    double jarijaritutup = input.nextInt();
                    System.out.print("Masukan Tinggi tutup      : ");
                    int tinggitutup = input.nextInt();
                    
                    KerucutTerpancung kT = new KerucutTerpancung(jarijaritutup,tinggitutup, tinggi ,circle.jarijari);
                    kT.hitungluas(); 
                    kT.hitungkeliling();
                    kT.hitungVolume();
                    kT.hitungLuasPermukaan();
                    System.out.println("Volume Kerucut = " + kT.getluaskerucut());
                    System.out.println("Luas Keucut = " + kT.getluaskerucut());
                    System.out.println("Volume Kerucut Terpancung = " + kT.volumeterpancung() );
                    System.out.println("Luas Kerucut Terpancung = " + kT.luaspermukaanterpancung());
                    System.out.println("    ");
                    break;
                case 3: 
                    System.out.println("===========================");
                    System.out.println("Anda memilih menu 3.Bola"); 
                    System.out.println("==========================="); 
                    System.out.print("Masukan Tinggi : ");
                    tinggi = input.nextInt();
//                    Bola bl = new Bola(jarijari);
                    Juring jr = new Juring(circle.jarijari, tinggi); 
                     jr.hitungluas(); 
                   
                    jr.hitungVolume();
                    jr.hitungLuasPermukaan();
                    Keratan kr = new Keratan(circle.jarijari, tinggi); 
                    kr.hitungluas(); 
                    kr.hitungkeliling();
                    kr.hitungVolume();
                    kr.hitungLuasPermukaan();
                    Tembereng tm = new Tembereng(circle.jarijari, tinggi);
                     tm.hitungluas(); 
                    tm.hitungkeliling();
                    tm.hitungVolume();
                    tm.hitungLuasPermukaan();
                    System.out.println("    ");
                    System.out.println("Volume Bola = " + jr.getVolume());
                    System.out.println("Luas Bola = " + jr.getLuasPermukaan());
                    System.out.println("    ");
                    
                    System.out.println("Volume Juring = " + jr.volumejuring());
                    System.out.println("    ");
                    
                    System.out.println("Luas Keratan = " + kr.luaspermukaanKeratan());
                    System.out.println("    ");
                    
                    System.out.println("Volume Temberng = " + tm.volumeTemberng());
                    System.out.println("Luas Temberng = " + tm.luaspermukaanTemberng());
                    System.out.println("    ");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input Tidak Valid");
            }
            System.out.print("Ingin Kembali ke Menu ? (Ya=y/ Tidak=n): ");
            ulang = input.next().charAt(0); 
            System.out.println("    ");
        } while (ulang != 'n');
        
        
        
    }
    
}

    


