package Seven;
public class ThreadDemo1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"="+i+"开始卖票");
			try {
				Thread.sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"="+i+"卖票结束");
		}		                                                                                                                                                                                                                                                                                                                                
	}
	public static void main(String[] args) {
		ThreadDemo1 task=new ThreadDemo1();
		Thread t1=new Thread(task,"窗口1");
		Thread t2=new Thread(task,"窗口2");
		t1.start();
		t2.start();		
	}
}
