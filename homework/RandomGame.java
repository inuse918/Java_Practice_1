import java.util.*;

public class RandomGame {
	public static void main(String[] args) {
		
		System.out.println("----------���� ���߱� ���� !! ----------");
		Scanner sc = new Scanner(System.in);
		
		
		Random r = new Random();
		int i=r.nextInt(100);

		System.out.println("���ڸ� �Է��ϼ��� : ");
		System.out.println(i);
		
		int cou = 1;

		while (cou <= 10)
		{
			int you = sc.nextInt();
				if (you>i)
				{
					System.out.println("�� Ů�ϴ�. ���̼��� ");
				}
				else if (you<i)
				{
					System.out.println("�� �۽��ϴ�. �ø����� ");
				}
				else if (you==i)
				{
					System.out.println("§ ������ϴ�~");
					break;
				}
			cou++;
		}
		
}
}