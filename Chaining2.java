package day2;

public class Chaining2 {

	Chaining2()
	{
		System.out.println("no argument");
	}

	Chaining2(int u)
	{   this();
		System.out.println("one argument");
	}
	Chaining2(int y ,int z)
	{   this(y);
		System.out.println("two argument");
	}
	public static void main(String[] args) {
		
		Chaining2 k= new Chaining2(99,88);
		

	}

}