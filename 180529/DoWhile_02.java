import java.util.Scanner;

//n을 입력받아 1~n 사이에(n포함) 3의 배수이면서 5의배수 출력
public class DoWhile_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n=sc.nextInt();
		int i=1;
		do
		{
			if ((i%3==0) && (i%5==0))
			{
				System.out.println("3의 배수이며 5의 배수인 수 : " +i);
			}
			i++;
		} while (i<=n);
	}
}