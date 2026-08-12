public class LabTast5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
				int temp=i;
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(temp+"\t");
				temp = temp+i;

			}
			System.out.println();
		}
	}
}
