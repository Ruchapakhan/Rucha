class override
{
	void m1(int x)
	   {
		   System.out.println("this is first class:"+x);
	   }
}
public class MethodOverRiding extends override
{
   void m1(int x)
   {
	   System.out.println("this method is:"+x);
   }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverRiding obj=new MethodOverRiding();
		obj.m1(90);
				
	}

}
