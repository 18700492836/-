package Seven;

public class TheadDemo extends Thread {
//	String name;
	public TheadDemo(String name) {
		super(name);
//		this.name = name;
	}
	public void run() {
		for(int i=0;i<7;i++) {
			System.out.println(getName()+"="+(i+1));
		}
	}
	public static void main(String[] args) {
		TheadDemo t1=new TheadDemo("线程A");
		TheadDemo t2 = new  TheadDemo("线程B");
		t1.start();
		t2.start();
	}
}
