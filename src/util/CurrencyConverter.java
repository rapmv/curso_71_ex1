package util;

public class CurrencyConverter {
	
	public static double IOF = 1.06;
	
	public static double dolar(double dolar, double real) {
		return dolar * real * IOF;		
	}
}
