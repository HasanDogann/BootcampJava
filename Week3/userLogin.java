package BootcampJava.Week3;

import java.util.Scanner;

public class userLogin {
     static String username,password,temp;
    public static void main(String[] args) {
       
        int counter = 0;
        boolean check=false;
        Scanner scn = new Scanner(System.in);

        while(check==false){ 
            
            System.out.println("Kullanıcı adınızı giriniz");
            username=scn.nextLine();
            System.out.println("Şifrenizi giriniz");
            password=scn.nextLine();

            if((password.equals("java123")||password.equals(temp)) && username.equals("patika")){
                check= true;
                System.out.println("Hoşgeldiniz "+username);
            }
            else if((username.equals("patika")&&!password.equals("java123"))&&counter!=5){
                System.out.println(" şifreniz yanlış tekrar giriniz"); 
                counter+=1;
                System.out.println("Kalan hakkınız "+(5-counter));
            }
            else if(counter==5){
                System.out.println("Kullanım haklarınızı doldurdunuz yeni şifre oluşturmanız gerekmektedir.Mail adresinize gelen şifreyi yazınız: ");
                System.out.println("Yeni şifreniz");
                temp=scn.nextLine();
                counter=0;
            }
        }
    }
}
