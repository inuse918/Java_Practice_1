import java.util.*;

public class NumberTop2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=i;j<=i+3;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}