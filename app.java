package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CurrencyConverter converter = new CurrencyConverter();
		
		
		System.out.printf("What is the dollar price? ");
		converter.dolarValue = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		converter.dolarQuantity = sc.nextDouble();
		
			System.out.printf("Amount to be paid in reais = %.2f%n", converter.totalValueReais());
			
		sc.close();
	}

}
