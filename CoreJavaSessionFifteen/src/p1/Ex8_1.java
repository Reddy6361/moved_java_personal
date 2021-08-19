package p1;

//continuation of Ex8
public class Ex8_1 implements Ex8 { // implements is the keyword used to
	// do inheritance between class and interface.

	@Override
	public void balance() { // if we don't override this method it will 
		//give error, so this is very benifitial
		//so that we don't miss any features.
		System.out.println("logic of balance");
	}

	@Override
	public void transferMoney() {
		System.out.println("logic of transfer money");
	}

	@Override
	public void generateBankStatement() {
		System.out.println("logic of getting bank statement ");

	}

	public static void main(String[] args) {
		Ex8_1 ex8_1 = new Ex8_1();
		ex8_1.balance();
		ex8_1.transferMoney();
		ex8_1.generateBankStatement();
	}

}
