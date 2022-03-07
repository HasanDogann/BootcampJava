package BootcampJava.Week2.Homework2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    double price,kdv18=0.18;
    double kdv8=0.08,kdvTotal,priceTotal;   
    Scanner scn=new Scanner(System.in);
    System.out.println("Ücreti giriniz");
    price=scn.nextDouble();

    if(price>0 && price<1000){
        priceTotal=price+(price*kdv18);
        kdvTotal=price*kdv18;
        System.out.println("Toplam ücret: "+priceTotal+" Toplam KDV tutarı: "+kdvTotal);
    }
    else if(price>1000){
        priceTotal=price+(price*kdv8);
        kdvTotal=price*kdv8;
        System.out.println("Toplam ücret: "+priceTotal+" Toplam KDV tutarı: "+kdvTotal);
    }





    }
    
}
