class EngHello extends Greeting {
	String name="Moon";
	public void sayHello(){
		System.out.println("Nice To Meet You");
	}	
	public void test(){
		System.out.println(super.name);
		super.sayHello();
	}
}