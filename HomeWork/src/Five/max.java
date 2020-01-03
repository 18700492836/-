package Five;

import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输出您要比较的多个数字的个数");
		int num = input.nextInt();
//		建立一个数组进行接收
		double [] arr = new double[num];
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("请输入第"+(i+1)+"个数！");
			arr[i]=input.nextDouble();
		}
		double max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];		
			}	
		}
		System.out.println("输入得数中，最大的数为："+max);
		System.out.println("请输出任意一个数与数组元素进行比较：");
		int numer = input.nextInt();
		double []arr1= {15,18,16,56,49,78,16};
		for(int i=0;i<arr1.length;i++) {
			if(numer==arr1[i]) {
				System.out.println("您的元素下标为"+i);
				return;
			}
		}
		System.out.println("您输入的数字不在范围内。");
	}
}
