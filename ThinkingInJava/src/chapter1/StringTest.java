package chapter1;

public class StringTest {
	static int id = 0;
	private int idNum;

	public StringTest() {
		id++;
		idNum = id;
		System.out.println("id=" + idNum);
	}

	public void f() {
		{
			int x = 12;
			// only x available
			{
				int q = 96;
				// both x ,q available
			}
			// only x available
			// q is "out of scope"
		}
	}

	public void f2() {
		{
			int x = 12;
			{
				// int x = 96; // Illegal
			}
		}
	}

}
