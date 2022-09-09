import BangunDatar.*;
import BangunRuang.*;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Bangun Datar : \n");
        Lingkaran bulet = new Lingkaran(7);
        System.out.println("Lingkaran :");
        bulet.hitungLuas();
        bulet.hitungKeliling();
        bulet.printInfo();
        
        Persegi kotak = new Persegi(3);
        System.out.println("\nPersegi :");
        kotak.hitungLuas();
        kotak.hitungKeliling();
        kotak.printInfo();
        
        PersegiPanjang kotakPanjang = new PersegiPanjang(4, 8);
        System.out.println("\nPersegi Panjang :");
        kotakPanjang.hitungLuas();
        kotakPanjang.hitungKeliling();
        kotakPanjang.printInfo();
        
        System.out.println("\nBangun Ruang : \n");
        Balok kayu = new Balok(8, 5, 2);
        System.out.println("Balok : ");
        kayu.hitungLuas();
        kayu.hitungKeliling();
        kayu.hitungVolume();
        kayu.printInfo();
        
        Bola meriam = new Bola(14);
        System.out.println("\nBola : ");
        meriam.hitungLuas();
        meriam.hitungKeliling();
        meriam.printInfo();
        
        Kubus kubus = new Kubus(3);
        System.out.println("\n Kubus : ");
        kubus.hitungLuas();
        kubus.hitungKeliling();
        kubus.hitungVolume();
        kubus.printInfo();
        
    }
    
}