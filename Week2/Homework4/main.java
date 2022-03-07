package BootcampJava.Week2.Homework4;

import java.util.Scanner;

public class main {
static double  ucret;
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double km;
    System.out.println("Kaç km gideceksiniz? ");
    km=scn.nextDouble();
    System.out.println("Ödeyeceğiniz tutar "+ucretHesapla(km)+" TL");
    }


    public static double ucretHesapla(double km){
        ucret=(km*2.20)+10;
        if(ucret<20){
            return 20;
        }
        return ucret;
    }




}
