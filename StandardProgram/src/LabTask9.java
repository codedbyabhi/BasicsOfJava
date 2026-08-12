
public class LabTask9 {
	public static void main(String[] args) {
		int sum = 1;
		int space = 4;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i + j >= 6) {
					System.out.print(""+sum+"\t");
					sum += 2;
				} else {
					System.out.print("        ");
				}
			}
			System.out.println();
		}

	}
}