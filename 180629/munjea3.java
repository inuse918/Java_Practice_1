public class munjea3 {
	public static void main(String[] args) {
		//3. 100~999 사이에 7의 배수의 개수와 합을 구하세요.
		int a[]=new int[900];
		int total=0,sum=0;
		for (int i=0;i<a.length;i++){
			a[i]=i+100;
			if (a[i]%7==0){
				total+=a[i];
				sum++;
			}
		}
		System.out.println("7의 배수 개수 : "+sum+" 합 : "+total);
	}
}