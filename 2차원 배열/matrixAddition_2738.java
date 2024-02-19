import java.util.Scanner;

public class matrixAddition_2738 {
	static Scanner sc = new Scanner(System.in);
	static int[][] input(int N, int M){
		int[][] arr = new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int N,M;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] arrA = new int[N][M];
		int[][] arrB = new int[N][M];
		
		arrA = input(N,M);
		arrB = input(N,M);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(arrA[i][j]+arrB[i][j]+" ");
			}
			System.out.println();
		}
	}
}
