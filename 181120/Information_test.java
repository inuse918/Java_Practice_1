import java.util.*;

class Information {
	private String name,telephone,skill,address;
	private int age;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
	public String getTelephone(){
		return telephone;
	}
	public void setSkill(String skill){
		this.skill=skill;
	}
	public String getSkill(){
		return skill;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}

	public void print(){
		System.out.println("***************************************");
		System.out.println("�̸� | "+getName());
		System.out.println("���� | "+getAge());
		System.out.println("��ȭ��ȣ | "+getTelephone());
		System.out.println("Ư�� | "+getSkill());
		System.out.println("�ּ� | "+getAddress());
	}
}

class  Information_test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("***************************************");
		System.out.print("�Է��� �ο� : "); //121431 dbtjdud02!
		int num=sc.nextInt();
		Information i[]=new Information[num];
		System.out.println("***************���� �Է�***************");
		for (int j=0;j<i.length ;j++){
			i[j]=new Information();
			System.out.print("�̸� �Է� : ");
			i[j].setName(sc.next());
			System.out.print("���� �Է� : ");
			i[j].setAge(sc.nextInt());
			System.out.print("��ȭ��ȣ �Է� : ");
			i[j].setTelephone(sc.next());
			System.out.print("Ư�� �Է� : ");
			i[j].setSkill(sc.next());
			System.out.print("�ּ� �Է� : ");
			i[j].setAddress(sc.next());
		}
	}
}