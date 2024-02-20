import java.util.Scanner;

public class centerShiftAlgorithm_2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int n = (int) (Math.sqrt(Math.pow(4, N))+1);
		
		System.out.println(n*n);
	}
}
