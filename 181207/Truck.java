class Truck extends Car {
	private int loadage;
	private int luggage;
	public Truck(String name, int displacement, int loadage){
		super(name,displacement);
		this.loadage=loadage;
	}
	public Truck(){}

	public void setLoadage(int loadage){
		this.loadage=loadage;
	}
	public int getLoadage(){
		return loadage;
	}	

	public void klaxon(){
		System.out.println("���~");
		System.out.println("����!");
		System.out.println("�ѿ;Ӗؾ�!!");
	}
	public void setLuggage(int luggage){
		this.luggage+=luggage;
	}
	public int getLuggage(){
		return luggage;
	}
}