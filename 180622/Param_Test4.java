public class Param_Test4{
	public static void main(String[] ar){
		//1��
		int n=Integer.parseInt(ar[0]);
		int m=Integer.parseInt(ar[1]);
		int big=0;
		int small=0;
		int total=0;

		if(n>=m){
			big=n;
			small=m;
		} else if(n<m){
			big=m;
			small=n;
		}
		for (int i=small;i<=big;i++ )
		{
			total+=i;
		}
		System.out.println("���� : " +total);

	}
}