public class Param_hw2 {
	public static void main (String[] args) {
		//4. 두 개의 값을 입력받아 두 정수 사이의 3의 배수이거나 7의 배수인 수들의 합과 평균
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int b=0,s=0,sum=0;
		float avg=0;

		if (i>=j){
			b=i;
			s=j;
		} else {
			b=j;
			s=i;
		}
		
		for (int i2=s;i2<=b;i2++){
			if (i2%3==0||i2%7==0){
				sum+=i2;
			}
		}
		avg=(float)sum/(b-s+1);
		System.out.println("두 정수 사이의 3의 배수이거나 7의 배수인 수\n합 : "+sum+" 평균 : " + avg);
	}
}