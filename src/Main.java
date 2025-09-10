//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double celsius =  -273.15;

        System.out.println("Temperature Converter");

        double fahrenheit =  (celsius * 9/5) + 32;

        if(celsius < 0){
            System.out.println("Attention!! The temperature is below zero...");
        }

        System.out.println(celsius + " °C is " + fahrenheit +" °F");


    }
}