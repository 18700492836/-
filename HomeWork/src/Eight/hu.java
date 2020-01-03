package Eight;

import java.util.Scanner;

public class hu {
	public static void main(String[] args)  {
		Scanner input =new Scanner(System.in);
//		创建一个数组
		int[]arr=new int[5];
		
		System.out.println("请输出五个整数：");	
	
			for( int i=0;i<arr.length;i++) {
				try {
				int number=input.nextInt();
				arr[i]=number;
				
				}catch(Exception e) {
					System.out.println("请输入整数");
					break;
				}
				try {
					
					if(i>4||i<4);
				}catch(IndexOutOfBoundsException e) {
					System.out.println("请输入5个整数");
					break;
				}
			}
			for(int a :arr) {
				System.out.println(a);
			}
		
	}
}
