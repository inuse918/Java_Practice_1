
public class Circle1 {
	int radius;
	void set(int r) {
		radius=r;
	}
	double getarea() {
		return 3.14*radius*radius;
	}
	public Circle1() {
		radius=5;
	}
	
	//public Circle() {} //default ������
	public static void main(String[] args) {
		Circle1 pizza = new Circle1(15);
		System.out.println("15��ġ ���� "+pizza.getarea());
		
		Circle1 pizza1=new Circle1();
	}
}