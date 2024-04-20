class Animal
{
	void run()
	{
		System.out.println("Run method in animal class");
	}
}
public class Inheritance extends Animal
{
    void run()
    {
    System.out.println("Run method in inheritance class");
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Inheritance obj=new Inheritance();
		obj.run();
	}

}
