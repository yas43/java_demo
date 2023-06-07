package forth_pro;

class somme {
	int num1;
	int num2;

	somme(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("first constructor running  " + num1 + "  and  " + num2);
	}

	somme(int num1) {
		this(num1, num1);
	}

	somme() {
		this(0);
	}

	void my_method() {
		System.out.println("this is my_method running");
	}
}

public class this_demo0 {

	static void demo_method(int a, int b, int c, int d) {
		System.out.println("thi is a " + a + "  this is b  " + b + "  this is c  " + c + "  this is d  " + d);
	}

	public static void main(String[] args) {
		somme my_set = new somme(10, 15);
		somme my_set_0 = new somme(30);
		somme my_set_1 = new somme();
		my_set.my_method();
		// demo_method(10, ,,200);
	}

}
