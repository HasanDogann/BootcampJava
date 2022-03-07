package BootcampJava.Week2.Homework6;
import java.util.Scanner;
public class main {
static double kitleIndeksi;
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
double boy,kilo;


System.out.println("Boyunuzu metre cinsinden giriniz");
boy=scn.nextDouble();
System.out.println("Kilonuzu giriniz");
kilo=scn.nextDouble();
System.out.println("Vücut kitle indeksiniz: "+kitleIndeksiHesapla(boy, kilo));


}   
public static double kitleIndeksiHesapla(double boy,double kilo){
    kitleIndeksi=(kilo/(boy*boy));
    return kitleIndeksi;
}


}
