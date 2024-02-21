import java.util.Scanner;

public class beehive_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = 1;
		int cnt = 1;
		
		while(n<N) {
			n+=cnt*6;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
