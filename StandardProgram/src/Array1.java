import java.util.Scanner;

public class Array1 {

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);

	        int size = sc.nextInt();
	        int[] a = new int[size];

	        for(int i = 0; i < a.length; i++){
	            a[i] = sc.nextInt();
	        }

	        for(int i = 0; i < a.length; i++){

	            if(a[i] == Integer.MIN_VALUE)
	                continue;

	            int count = 1;

	            for(int j = i + 1; j < a.length; j++){

	                if(a[i] == a[j]){
	                    count++;
	                    a[j] = Integer.MIN_VALUE;
	                }
	            }

	            System.out.println("Element: " + a[i] + ", Frequency: " + count);
	        }
	    }
	}