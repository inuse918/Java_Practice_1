public class munjea11{
	public static void main(String[] args) {
		//11. 100 ������ �� ���� ������ �Է¹޾� ���� ������ ū ������ ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int big=0,small=0;
		
		if (a>100||b>100){
			System.out.println("100 ������ ������ �Է��ϼ���.");
			return;
		}
		else {
			if (a>=b){
				big=a;
				small=b;
			}
			else {
				big=b;
				small=a;
			}
			for (int i=small;i<=big;i++){
				System.out.println(i);
			}
		}
			

	}
}