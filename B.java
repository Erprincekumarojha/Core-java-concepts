class B 
{
	public static void main(String[] args) 
	{
		/*for(int i=0;i<=i+10;i++) infinity time executed
		System.out.println(" "+i);
        int a=0;
		int b=++a;
        System.out.println(" "+ ++b);
        byte x=1;
		byte y=x+10; Incompatable lossy conversion integer cannot convert 
		System.out.println(" "+y);   Integer values 
		int a[]={10,20,30,40};
		for(int i=1;i<=4;i++)
		{*/
		 int x=0;
		 int y=++x + x++ + x++ + ++x;
		    System.out.println(" "+y);
		
	}
}
