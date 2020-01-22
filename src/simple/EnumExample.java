package simple;

public class EnumExample {

	public static void main(String[] args) {

		Level l = Level.Low;
		System.out.println(l);
		System.out.println(e.A.toString());
		for(e e1 :e.values())
		{
			System.out.println(e1);
		}
		
	}
	enum e
	{
		A,B,C,D
	}

}
