package lab4_1;

public class CurrentAccount implements Account{

	
	protected static long accNum=1000000000;
	CurrentAccount(){
		accNum++;
	}
	protected double balance;
	protected Person accHolder=new Person();
	final double overdraftLimit=500;
	
	public CurrentAccount(double initialBalance, String name, int age) {
		this.balance=initialBalance;
		this.accHolder.setName(name);
		this.accHolder.setAge(age);
		
	}

	
	
	
	public static long getAccNum() {
		return accNum;
	}




	public static void setAccNum(long accNum) {
		SavingsAccount.accNum = accNum;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public Person getAccHolder() {
		return accHolder;
	}




	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	@Override
	public void deposit(double cash) {
		balance+=cash;
		System.out.println("Rs. "+cash+" has been added into your account");
		System.out.println("Now your balance is: "+getBalance());
		
	}

	@Override
	public boolean withdraw(double withdraw) {
		if (balance-withdraw>overdraftLimit) {
			return true;
		}
		else
			return false;
		
	}

}
