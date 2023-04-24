package revision;

public class ThisExamp {
	public void print() 
	{
		System.out.println("hello");
	}
	public void display() 
	{
		this.print();
		System.out.println("hello java");
	}

	public static void main(String[] args) 
	{
		ThisExamp obj=new ThisExamp();
		obj.display();

	}

}
