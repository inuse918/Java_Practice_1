class Melon extends Food{
	String location;

	public Melon(int price,double kcal,double weight,String location){
		super(price,kcal,weight);
		this.location=location;
	}
	public String toString(){
		return "[����] "+price+"\n[kĮ�θ�] "+kcal+"\n[�߷�] "+weight+"\n[���۳������] "+location;

	}
}