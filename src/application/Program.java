package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Cotação do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.print("Valor em dolar que quer comprar: ");
		double real = sc.nextDouble();
		
		double result = CurrencyConverter.dolar(dolar, real);
		
		System.out.printf("Valor total em reais a pagar: R$%.2f%n", result);
		
		sc.close();

	}

}
