import java.util.*;
class mun4 {
	public int Add(int a, int b) {
		int result=0;
		result=a+b;
		return result;
	}
	public int Sub(int a, int b) {
		int result=0;
		if (a>=b){
			result=a-b;
		}
		else {
			result=b-a;
		}
		return result;
	}
	public int Mul(int a,int b){
		int result=0;
		result=a*b;
		return result;
	}
	public int Div( int a,int b) {
		int result=0;
		result=a/b;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		mun4 m=new mun4();
		System.out.println("더할 두 수 입력");
		System.out.println("결과는? " +m.Add(sc.nextInt(),sc.nextInt()) );
		System.out.println("뺄 두 수 입력(큰 수 에서 작은 수가 빠집니다)");
		System.out.println("결과는? " +m.Sub(sc.nextInt(),sc.nextInt()) );
		System.out.println("곱할 두 수 입력");
		System.out.println("결과는? " +m.Mul(sc.nextInt(),sc.nextInt()) );
		System.out.println("나눌 두 수 입력 (나머지는 잘립니다)");
		System.out.println("결과는? " +m.Div(sc.nextInt(),sc.nextInt()) );
		
	}
}