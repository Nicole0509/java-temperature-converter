import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Temperature Converter\n");

        double[] celsiusTemperatureValues = {25, 0, -40, 100, -300};

        for(double celsius : celsiusTemperatureValues){

            if(celsius < -273.15){
                System.out.println("Attention!! " + celsius + " °C is below absolute zero...");
            } else {
                double fahrenheit =  (celsius * 9/5) + 32;
                System.out.println(celsius + " °C is " + fahrenheit +" °F");
            }

        }
    }
}