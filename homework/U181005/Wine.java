class Wine {
	private String manufacturer, name, country, region, kind;
	private int year, grade;

	public Wine(String manufacturer, String name, String country, String region, String kind, int year, int grade){
		this.manufacturer=manufacturer;
		this.name=name;
		this.country=country;
		this.region=region;
		this.kind=kind;
		this.year=year;
		this.grade=grade;
	}
	public Wine(String manufacturer, String name) {
		this. manufacturer=manufacturer;
		this. name=name;
	}
	public static void main(String[] args) {
		Wine w1=new Wine("아무개","아무개","대한민국","무교","친절",2002,1);
		Wine w2=new Wine("홍길동","홍길동");
		//System.out.println(w1.manufacturer);
	}
}