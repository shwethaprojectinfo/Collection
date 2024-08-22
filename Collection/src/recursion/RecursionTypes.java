package recursion;

public class RecursionTypes {
	
	public static void sheela()
	{
		System.out.println("hi");
		dinga();
		System.out.println("bye");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		dinga();
		System.out.println("main end");
	}
	public static void dinga() {
		System.out.println("hi");
		sheela();
		System.out.println("bye");
	}

}
