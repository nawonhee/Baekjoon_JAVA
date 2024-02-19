import java.util.Scanner;

public class max_2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int row = 1;
		int col = 1;
		int[][] matrix = new int[9][9];
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				matrix[i][j] = sc.nextInt();
				if(max<matrix[i][j]) {
					max = matrix[i][j];
					row = i+1;
					col = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(row+" "+col);
	}
}
