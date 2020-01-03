package Two;

import java.util.Scanner;
public class Weekdays {
	public static void main(String[] args) {
		Scanner intput = new Scanner(System.in);
		System.out.println("请输入您的星期号代表今天是星期几：");
		System.out.println("温馨提示：0代表星期天，1代表星期一，以此类推，6代表星期六");
		int figure=intput.nextInt();
		System.out.println("请输入您间隔的天数：");
		int days=intput.nextInt();
		int k = (figure+days)%7;
		switch (k) {
		case 0:
			System.out.println("今天是星期天");
			break;
		case 1:
			System.out.println("今天是星期一");
			break;
		case 2:
			System.out.println("今天是星期二");
			break;
		case 3:
			System.out.println("今天是星期三");
			break;
		case 4:
			System.out.println("今天是星期四");
			break;
		case 5:
			System.out.println("今天是星期五");
			break;
		case 6:
			System.out.println("今天是星期六");
			break;
		default:
			break;
		}
	}
}

