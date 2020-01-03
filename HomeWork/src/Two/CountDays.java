package Two;
import java.util.Scanner;
public class CountDays {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("请输入您所在的年份：");
		int year = input.nextInt();
		System.out.println("请输入您所在的月份：");
		int monthes = input.nextInt();
		switch (monthes) {
		case 1:
		case 3 :
		case 5:
		case 7 :
		case 8:
		case 10 :
		case 12:
			System.out.println("今年 是"+year+"年"+monthes+"月31天");
			break;
		case 4 :
		case 6:
		case 9:
		case 11:
			System.out.println("今年 是"+year+"年"+monthes+"月有30天");
			break;
		default:
			if (year%4==0&&year%100!=0||year%400==0){
				System.out.println("今年是"+year+"年"+monthes+"月有29天");
			}else {
				System.out.println("今年是"+year+"年"+monthes+"月有28天");
			}
			break;
		}
	}

	

}

