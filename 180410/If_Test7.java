class If_Test7 {
	public static void main(String[] args){
		int a=10; 
		int b=20; 
		char c='*';
		if (c=='+')
		{
			System.out.println(a+b);
		}
		else if(c=='-')
		{
			System.out.println(a-b);
		}
		else if(c=='*')
		{
			System.out.println(a*b);
		}
		else if(c=='/')
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println(a%b);
		}
		
	}
}