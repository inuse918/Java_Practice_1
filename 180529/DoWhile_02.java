import java.util.Scanner;

//n�� �Է¹޾� 1~n ���̿�(n����) 3�� ����̸鼭 5�ǹ�� ���
public class DoWhile_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int n=sc.nextInt();
		int i=1;
		do
		{
			if ((i%3==0) && (i%5==0))
			{
				System.out.println("3�� ����̸� 5�� ����� �� : " +i);
			}
			i++;
		} while (i<=n);
	}
}