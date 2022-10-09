import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    //C = 5 * ((F-32) / 9).

    Scanner sc = new Scanner (System.in);
    double fahrenheit, celsius;

    System.out.print("Informe a temperatura em graus fahrenheit: ");
    fahrenheit = sc.nextDouble();

    celsius = 5 * ((fahrenheit-32) / 9);
    System.out.println("");

    System.out.print("A temperatura fahrenheit: " + fahrenheit + " é igual a: " + celsius + " Celsius");
    sc.close();

    }
}
