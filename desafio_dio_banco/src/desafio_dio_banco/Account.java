package desafio_dio_banco;

public abstract class Account implements InterfaceAccount {
    
	private static final int STANDARD_AGENCY = 1;
	private static int SEQUENTIAL = 1;

	protected int agency;
	protected int number;
	protected double balance;
	
	public Account() {
		this.agency = Account.STANDARD_AGENCY;
		this.number = SEQUENTIAL++;
	}
	
	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double value) {
		balance -= value;
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, Account destineAccount) {
		this.withdraw(value);
		destineAccount.deposit(value);
	}
	
	protected void printCommonInfos() {
        System.out.println(String.format("Agence: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    
    }

}
