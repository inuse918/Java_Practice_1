import java.util.*;

public class RandomGame {
	public static void main(String[] args) {
		
		System.out.println("----------숫자 맞추기 게임 !! ----------");
		Scanner sc = new Scanner(System.in);
		
		
		Random r = new Random();
		int i=r.nextInt(100);

		System.out.println("숫자를 입력하세요 : ");
		System.out.println(i);
		
		int cou = 1;

		while (cou <= 10)
		{
			int you = sc.nextInt();
				if (you>i)
				{
					System.out.println("더 큽니다. 줄이세요 ");
				}
				else if (you<i)
				{
					System.out.println("더 작습니다. 늘리세요 ");
				}
				else if (you==i)
				{
					System.out.println("짠 맞췄습니당~");
					break;
				}
			cou++;
		}
		
}
}