
public class MethodOverloding
{
   void m1(int x)
   {
	   System.out.println("in first method"+x);
   }
   void m1(int x,int y )
   {
	   System.out.println("in second method:" +x+"\t"+y);
   }
   void m1(int x,String name)
   {
	   System.out.println("in third method:"+x+"\t"+name);
   }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       MethodOverloding obj=new MethodOverloding();
       obj.m1(10);
       obj.m1(10,20);
       obj.m1(10,"Rucha");
	}
	

}
