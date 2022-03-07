package BootcampJava.Week2.Homework7;
import java.util.Scanner;
public class main {
    static  double toplamUcret;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] meyveler={"Armut","Elma","Domates","Muz","Patlıcan"};
        Double[] kilolar = new Double[5];
        

        for (int i = 0; i < meyveler.length; i++) {
            System.out.println(meyveler[i]+" kaç kilo");
            kilolar[i]=scn.nextDouble();
            if(meyveler[i].contains("Armut")){
                toplamUcret+=kilolar[i]*2.14;
            }
            else if(meyveler[i].contains("Elma")){
                toplamUcret+=kilolar[i]*3.67;
            }
            else if(meyveler[i].contains("Domates")){
                toplamUcret+=kilolar[i]*1.11;
            }
            else if(meyveler[i].contains("Muz")){
                toplamUcret+=kilolar[i]*0.95;
            }
            else if(meyveler[i].contains("Patlıcan")){
                toplamUcret+=kilolar[i]*5;
            }
            }
        System.out.println("Toplam Tutar: "+toplamUcret+" TL");
    }
}
