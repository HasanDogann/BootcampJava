package BootcampJava.Week3;

import java.util.Scanner;

public class hesapMakinesi{
   public static void main(String[] args) {
     int number1,number2,choose;

      Scanner scn = new Scanner(System.in);
      System.out.println("Birinci sayıyı giriniz");
      number1=scn.nextInt();
      
      System.out.println("İkinci sayıyı giriniz");
      number2=scn.nextInt();

      System.out.println("1-Toplama\n2-Cıkarma\n3-Çarpma\n4-Bölme");
      choose=scn.nextInt();

      switch (choose) {
         case 1:    
         System.out.println("Sayıların Toplamı: "+(number1+number2));
            break;
         case 2:    
         System.out.println("Sayıların Farkı: "+(number1-number2));
            break;
         case 3:    
         System.out.println("Sayıların Çarpımı: "+(number1*number2));
            break;
         case 4:    
         System.out.println("Sayıların Bölümü: "+(number1/number2));
            break;
      
         default:
        
         System.out.println("Seçiminiz Yanlıştır");
          
            break;
      }

   } 

}
