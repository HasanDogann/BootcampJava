package BootcampJava.Week2.Homework1;
import java.util.Scanner;
public class main{
static double  avg;
static String  finalNote;
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

    
    finalNote = avg < 60 ? "Kaldı çünkü notu: "+avg: "Geçti cünkü notu "+avg;
        
    System.out.println(finalNote);
    
    }
}