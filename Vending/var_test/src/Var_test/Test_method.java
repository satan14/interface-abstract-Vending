package Var_test;

public class Test_method {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		Subclass sc =new Subclass("aaaa");
//		sc.getText();
//		sc.setText("change value" );
		System.out.println("value: " +sc.getText());
	}
	public void method2() {
		System.out.println("value");
	}

}
