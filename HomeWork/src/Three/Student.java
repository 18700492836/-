package Three;

public class Student {
	public static void main(String[] args) {
		double stu=3500;
		for(int i=2020;;i++) {
			stu=stu*(1+0.05);
			if(stu>=4500) {
				System.out.println(i+"年后商洛学院人数到达4500人");
				return;
			}
		}
	}
}
