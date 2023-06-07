import java.util.Scanner;
public class FaherneitToCelsius {
    public static void main(String[] args) {

                //  Convert Fahrenheit to Celsius

                Scanner sc = new Scanner(System.in);
                double input = sc.nextFloat();

                double Celsius  = (input - 32) * 5/9;

                System.out.println(Celsius);
            }
        }



