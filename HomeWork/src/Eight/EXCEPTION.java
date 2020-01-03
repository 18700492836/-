package Eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXCEPTION {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {	
			int []arr=new int[5];
			for(int i=0;i>=0;i++) {
				System.out.println("请输入一个整数");
				int numb=input.nextInt();
				arr[i]=numb;
				System.out.println("是否继续？ 1表示是  2 表示否");
				int choose=input.nextInt();
				if(choose==1) {		
				}else {
					break;
				}		
			}
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
		} catch (InputMismatchException e) {
			System.out.println("请输入整数");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("请输入5个整数");
		}
	}

}
