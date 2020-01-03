package Five;

public class op {
	public static void main(String[] args) {
		int[][]arr={{4,5,56,6},{4,5,5}};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr[0].length;i++) {
			sum=sum+arr[0][i];
		}
		System.out.println("数组一维的和为："+sum);
		for(int j=0;j<arr[1].length;j++) {
			sum1=sum1+arr[1][j];
		}
		System.out.println("数组第二行的和为："+sum1);
	}

}
