package OOP2;

public class SuperTest2 {
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.method();
	}
}

class Parent1 {
	int x = 10;
}

class Child1 extends Parent {
	int x = 20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x); // <- Child클래스(자기자신)의 멤버변수
		System.out.println("super.x=" + super.x); // <- Parent클래스(부모클래스)의 멤버변수
	}
}