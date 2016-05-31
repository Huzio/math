import java.util.Scanner;



/**
 * Created by Huzio on 2016-05-31.
 */
public class FunkcjaKwadratowa {
    public static void main(String[] args) {
        System.out.println("Podaj pierwiastki równania kwadratowego a,b,c -> ");

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double delta;
        delta = b*b-4*a*c;
        System.out.println( "Delta wynosi > " + delta);

        if (delta>0){
            delta=Math.sqrt(delta);
            double x1=(-b-delta)/(2*a);
            double x2=(-b+delta)/(2*a);
            System.out.println( "x1 > " + x1 + "\nx2 > " + x2);
        }
        else if (delta==0){
            double x0= -b/(2*a);
            System.out.println( "x0 > " + x0);
        }
        else if (delta<0){
            System.out.println( "Równanie nie posiada miejsc zerowych");
        }
    }
}
