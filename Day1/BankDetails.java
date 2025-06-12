package OOPS;

class SbiAcc{
	private String AccHolder;
	private int Balance;
	
	public SbiAcc(String AccHolder , int Balance) {
		this.AccHolder=AccHolder;
		this.Balance=Balance;
		
	}
	public String getAccHolder() {
		return AccHolder;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int dep){
		if(Balance > 0) {
			Balance+=dep;
			System.out.println("Deposited Amount: "+dep);
			System.out.println("Your Balance: "+Balance);
		}
		else {
			System.out.println("Deposited Amount: "+dep);
			System.out.println("Your Balance: "+dep);
		}
	}
}

public class BankDetails {

	public static void main(String[] args) {
		SbiAcc s = new SbiAcc("Bino",10000);
		System.out.println("Account Holder Name: "+s.getAccHolder());
		System.out.println("Account Balance: "+s.getBalance());
		s.setBalance(5000);
	}
}
