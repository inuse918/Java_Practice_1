class overloading_Test1 {

	public void  add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	public String add(String a, String b) {
		return (a+b);
	}
	public void add(int a, int b, String c) {
		System.out.println(a+b+c);
	}
public static void main(String[] args) {
	overloading_Test1 t=new overloading_Test1();
	t.add(2,5);
	t.add(3.5,2.8,9.2);
	System.out.println(t.add("java","c"));
	t.add(3,5,"cool");
}
}