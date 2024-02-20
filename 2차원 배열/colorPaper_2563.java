import java.util.Scanner;

public class colorPaper_2563 {
	public static void main(String[] args) {
		boolean[][] canvas = new boolean[100][100];
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int total_area = 0;
		
		for(int i=0;i<cnt;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int a=y;a<y+10;a++) {
				for(int b=x;b<x+10;b++) {
					if(!canvas[a][b]) {						
						canvas[a][b]=true;
						total_area++;
					}
				}
			}
		}
		
		System.out.println(total_area);
		
	}
}
