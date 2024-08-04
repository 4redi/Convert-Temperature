import java.util.*;
public class Main {

	public static void main(String[] args) {
		// A simple program in java to convert temperatures (C->F)
		
		Scanner scan=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter your prefered temperature to convert (F,C)?: ");
			char choice=scan.next().charAt(0);
			choice=Character.toLowerCase(choice);
			switch (choice) {
			case 'c':
				System.out.println("Enter the temperature to convert: ");
				double temp_in_celcius=scan.nextDouble();
				ConvertTemperatureToFahrenheit(temp_in_celcius);
				break;
			case 'f':
				System.out.println("Enter the temperature to convert: ");
				double temp_in_f=scan.nextDouble();
				ConvertTemperatureTCelcius(temp_in_f);
				break;
			case 'q':
				System.out.println("Goodbye!");
				return;
			default:
				System.out.println("Enter F or C");
			}
		}
	}
	
	static void ConvertTemperatureToFahrenheit(double temperature) {
		double result=(temperature*9/5)+32;
		System.out.println("Temperature to FahrenHeit is: " + result);
	}
	
	static void ConvertTemperatureTCelcius(double temperature) {
		double result=(temperature-32)/1.8;
		System.out.println("Temperature to Celcius is: " + result);
	}


}
