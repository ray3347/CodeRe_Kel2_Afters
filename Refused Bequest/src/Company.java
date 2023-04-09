
public class Company extends PersonalTaxCalculator{
	private double revenues;
	private double expenses;
	private PersonalTaxCalculator taxCalc = new PersonalTaxCalculator();
	
	public Company(double revenues, double expenses) {
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double getIncome() {
		return revenues - expenses;
	}
	
	public double calculateTax(double income, double textRate){
		return taxCalc.calculateTax(income, textRate);
	}
	
}
