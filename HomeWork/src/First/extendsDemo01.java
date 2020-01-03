package First;

class Animal {
	String name;
	int size;
	private String color="红色";
//	父类的私有属性
	private void attribute() {	
		System.out.println( "我们都是动物，我们共有一个家！");			
	}
//	父类的公共属性
	public void friends() {
		System.out.println("动物们都是朋友！");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
	//	子类鸡继承父类
class Hen extends Animal {
//		继承父类重写父类的公有方法
		@Override
		public void friends() {
			System.out.println("我是母鸡是父类Friends的子类");
		}
		String name="母鸡";
	   private int age=17;
	   
		public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		void eat( ){
	             System.out.println(name+"吃东西");
	          }
	     private void layEggs( ){
	            System.out.println(name+"在下蛋");
	     }  
	}
//	子类狗继承父类
class Dog extends Animal{
		@Override
		public void friends() {
			System.out.println("我是小狗是父类Friends的子类");
		}

		 String name="小狗";
	     int age;
	     void eat( ){
	             System.out.println(name+"吃东西");
	         }
	     void guard( ){
	            System.out.println(name+"可以看门");
	     }  
}
//	子类牛继承父类
class Cow extends Animal{
		String name="小牛";
		int age=6;
		@Override
		public void friends() {
			System.out.println("我是小牛，是父类friend的子类");
		}
		private void milk(){
			System.out.println(name+"可以产奶！");
		}
}		
public class extendsDemo01 {
	public static void main(String[] args) {
		Animal a = new Animal();
		//	父类可以调用自己的公用方法
			a.friends();
		//	在父类中可以通过“对象名.属性名”调用自己的私有属性
			a.setColor("花色");
			System.out.println(a.getColor());	
		//	通过new对象实例化子类对象
			Hen h = new Hen();
			h.friends();//子类重写父类的方法，执行时子类的重写方法覆盖父类的方法，执行的是子类的方法
			System.out.println("子类独有的公共方法:");
			h.eat();
			System.out.println("子类的独有公共属性"+h.getName());
			System.out.println("子类私有的属性也可以通过getter和setter方法获得"+h.getAge());
			System.out.println("子类中调用父类的私有属性："+h.getColor());
			System.out.println("h.attribute()子类调用父类的私有属性会报错");	
	}
}
