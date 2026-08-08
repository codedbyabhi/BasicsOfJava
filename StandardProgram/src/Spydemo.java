import java.util.Scanner;

class Spydemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int start = sc.nextInt();
		System.out.println("enter value");
		int end = sc.nextInt();
		for (int j = start; j <= end; j++) {
			int sum = 0;
       
//			System.out.println(sum);
			int product = 1;
			int i= j;

			while (i != 0) {

				int n = i % 10;
				sum = sum + n;
				product = product * n;
				i = i / 10;

			}
			if (sum == product) {

				System.out.print(j+" ");
			}
		}
	}
}
