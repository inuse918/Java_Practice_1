class A1 {
	public A1() {
		System.out.println("������ A");
	}
	public A1(int x) {
		System.out.println("�Ű� ������ �ִ� ������ A");
	}
}
class B1 extends A1{
	public B1() {
		System.out.println("������ B");
	}
	public B1(int x) {
		super(x);
		System.out.println("�Ű� ������ �ִ� ������ B");
	}
}
public class ConEx2 {
	public static void main(String[] args) {
		B1 b=new B1(5);
	}
}