class Figure extends DObject {
	String type;
	public void draw(){
		switch (type){
		case "Heart" : System.out.println("Heart"); break;
		case "Star": System.out.println("Star"); break;
		case "Circle" : System.out.println("Circle"); break;
		case "":System.out.println("(������)");break;
		default : System.out.println("Error!!"); break;
		}
	}
}