package BootcampJava.Week2.Homework5;

import java.util.Scanner;

public class main {
static double r,pi=3.14,alan;

public static void main(String[] args) {
double a;
Scanner scn = new Scanner(System.in);
System.out.println("Dairenin yarıçapını giriniz");
r=scn.nextDouble();
System.out.println("Dairenin merkez açısının ölçüsünü giriniz");
a=scn.nextDouble();
System.out.println("Dairenin alanı : "+daireninAlani(r, a));
} 

public static double daireninAlani(double r,double a){
alan=(pi*(r*r)*a)/360;
    return alan;
}


}
