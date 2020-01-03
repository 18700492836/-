package Three;

public class Statics {
	{System.out.println("我是静态代码块");}
	public static void main(String[] args) {
		Statics statics = new Statics();
	}
}
