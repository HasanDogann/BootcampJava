package BootcampJava;
import java.util.Scanner;
public class main{
static double  avg;
    public static void main(String []args){
        Scanner x = new Scanner(System.in);
        String classes[]={"Math","Pyhsic","Chem","Turkish","History","Music"};
        Double notes[]=new Double[6];
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]+ " note :");
            notes[i]=x.nextDouble();
            avg+=notes[i];
        }
        avg/=notes.length;

        if(avg<60){
            System.out.println("Kaldı çünkü notu: "+avg);
        }
        else if(avg>=60 && avg<=100){
            System.out.println("Geçti cünkü notu "+avg);
        }   
    }
}