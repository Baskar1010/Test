package week5.bank;

public class BankInfo extends Axis{
 public void saving() {
	 System.out.println("saving");
 }
 public void fixed() {
	 System.out.println("fixed");
 }
 public void deposit() {
	 System.out.println("deposit");
 }
 public static void main(String[] args) {
	 BankInfo axis = new BankInfo();
	 axis.saving();
	 axis.fixed();
	 axis.deposit();
} 
}
