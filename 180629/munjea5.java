public class munjea5 {
	public static void main(String[] args) {
		//5. 1���� 30���� ¦���� Ȧ���� ���� ���� ���ϼ���.
		int a[]=new int[30];
		int even=0,odd=0;
		for (int i=0;i<a.length;i++){
			a[i]=i+1;
			if (a[i]%2==0){
				even+=a[i];
			}
			else {
				odd+=a[i];
			}
		}
		System.out.println("1~30 ¦���� �� : "+even+" Ȧ���� �� : "+odd);
	}
}