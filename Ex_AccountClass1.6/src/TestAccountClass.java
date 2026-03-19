public class TestAccountClass {
	public static void main(String[] args) {
		AccountClass a1 = new AccountClass("A101", "Tan Ah Teck", 88);
		System.out.println(a1);
		AccountClass a2 = new AccountClass("A102", "Kumar");
		System.out.println(a2);
		//test getter
		System.out.println("ID: " + a1.getId());
		System.out.println("Name: " + a1.getName());
		System.out.println("Balance: " + a1.getBalance());
		//test credit and debit
		a1.credit(100);
		System.out.println(a1);
		a1.debit(50);
		System.out.println(a1);
		a1.debit(500);
		System.out.println(a1);
		//test transfer
		a1.transferTo(a2, 100);
		System.out.println(a1);
		System.out.println(a2);
	}	
}
