import java. util.*;

public class methodpractice3_2 {
	public void zero(int a) {
		if (a<0){
			System.out.println("음수입니다. ");
		}
		else {
			System.out.println("양수입니다. ");
		}
	}

	public static void main(String[] args) {
		methodpractice3_2 t3_2=new methodpractice3_2();
		Scanner sc=new Scanner (System.in);
		System.out.print("음수양수인지 알고싶은 수 입력: ");
		t3_2.zero(sc.nextInt());
	}
}