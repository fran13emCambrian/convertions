//Francisco Esgardo Escobar Munguia
//A00223609
//Mobile App Development
//Lab 1 (Metric Conversion)



import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class conversions{

private static DecimalFormat df2 = new DecimalFormat("#.##");

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);


System.out.println("To convert from km to mi Press # 1");
System.out.println("To convert from mi to km Press # 2");
System.out.println("To convert from cm to in Press # 3");
System.out.println("To convert from in to cm Press # 4");
System.out.println("To convert from kg to lb Press # 5");
System.out.println("To convert from lb to kg Press # 6");


System.out.println("Please Choose an option: ");
int opt = scan.nextInt();



switch (opt) {

      case 1:
       System.out.println("You Choose Km to mi");
       System.out.println("Enter Km to convert:");
       double km = scan.nextDouble();

       double mi = km * 0.62;
       System.out.println("In  " +  km  +  "   km there are  " +  df2.format(mi)  + "  miles");
       break;


       case 2:
       System.out.println("You Choose Mi to km");
       System.out.println("Enter Mi to convert:");
       double mi2 = scan.nextDouble();

       double km2 = mi2 * 1.61;
       System.out.println("In  " +  mi2  +  "   miles there are  " +  df2.format(km2)  + "  km");
       break;


     case 3:
     System.out.println("You Choose cm to in");
     System.out.println("Enter cm to convert:");
     double cm = scan.nextDouble();

     double in = cm * 0.39;
     System.out.println("In  " +  cm  +  "   centimeters there are  " +  df2.format(in)  + "  inches");
     break;



     case 4:
     System.out.println("You Choose in to cm");
     System.out.println("Enter in to convert:");
     double in2 = scan.nextDouble();

     double cm2 = in2 * 2.54;
     System.out.println("In  " +  in2  +  "   inches there are  " +  df2.format(cm2)  + "  centimeters");
     break;


     case 5:
     System.out.println("You Choose kg to lb");
     System.out.println("Enter kg to convert:");
     double kg = scan.nextDouble();

     double lb = kg * 2.2;
     System.out.println("In  " +  kg  +  "   kilograms there are  " +  df2.format(lb)  + "  pounds");
     break;


     case 6:
     System.out.println("You Choose lb to kg");
     System.out.println("Enter lb to convert:");
     double lb2 = scan.nextDouble();

     double kg2 = lb2 * 0.45;
     System.out.println("In  " +lb2+  "   pounds there are  " +df2.format(kg2)+ "  kilograms");
     break;
   }

}
}
