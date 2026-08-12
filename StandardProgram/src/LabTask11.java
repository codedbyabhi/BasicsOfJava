
public class LabTask11 {  
	
	public static void main(String[] args) {
		for (int i = 1; i<=5;i++) {
			
			for (int j = 1; j<=i;j++) {
				System.out.print("   ");
			}
				for(int k=1;k<=6-i;k++) {
					
					System.out.print(" "+(char)(64+k)+" ");
				}	
				System.out.println();
			}
			
		}
	}
