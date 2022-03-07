package BootcampJava.Week2.Homework3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    double kenar1,kenar2,kenar3;
    double cevre,alan,cevreFormul;
    Scanner scn=new Scanner(System.in);

    System.out.println("1.kenarı giriniz");
    kenar1=scn.nextDouble();
    System.out.println("2.kenarı giriniz");
    kenar2=scn.nextDouble();
    System.out.println("3.kenarı giriniz");
    kenar3=scn.nextDouble();

    //Cevre hesaplama ve Alan Hesaplarken kullanılacak cevreFormul=cevre/2
    cevre=kenar1+kenar2+kenar3;
    cevreFormul=cevre/2;
    alan=Math.sqrt((cevreFormul*(cevreFormul-kenar1)*(cevreFormul-kenar2)*(cevreFormul-kenar3)));

    System.out.println("Çevre : "+cevre);
    System.out.println("Alan : "+alan);
    }
}
