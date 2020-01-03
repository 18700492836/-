package First;
class College{
	 String name="商洛学院";
	 public College pp() {
		 return this;
	 }
	 public String toString() {
		 return "学校名："+name;
	 }
}
public class Text {
	public static void main(String[] args) {
		College a = new College();
		System.out.println(a.pp());
	}
}
