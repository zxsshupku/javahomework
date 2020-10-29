import java.util.Date;

public class Account {
	private	int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String getdateCreated() {
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12.0;
	}
	
	public void withDraw(int w) {
		balance = balance - w;
	}
	
	public void deposit(int d) {
		balance = balance + d;
	}
}
