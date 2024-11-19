package entities;

public class CurrencyConverter {
	
	public double dolarValue;
	public double dolarQuantity;
	public static final double imposto = 0.06;
	
	
	public double totalValueReais() {
		return (dolarValue * dolarQuantity) * imposto + (dolarValue * dolarQuantity);
	}

}
