//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        float celcius = (float) 21.7;

        System.out.println("Temperature Converter");
        System.out.println("Temperature in celcius: " + celcius +" C");

        float fahrenheit =  (celcius * 9/5) + 32;

        System.out.println("Temperature in fahrenheit: " + fahrenheit +" F");


    }
}