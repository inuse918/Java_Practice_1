public class Param_hw1 {
	public static void main(String[] ar){
		// n,m을 입력받아 n부터 m사이의 정수 평균

		int n=Integer.parseInt(ar[0]);
		int m=Integer.parseInt(ar[1]);
		int b=0,s=0,sum=0;
		float avg=0;

		if (n>=m){
			b=n;
			s=m;
		} else {
			b=m;
			s=n;
		}

		for (int i=s;i<=b;i++){
			sum+=i;
		}
		avg=(float)sum/(b-s+1) ;
		
		System.out.println("평균 : "+avg);
	}
}