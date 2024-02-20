import java.util.Scanner;

public class laundryDonghyuck_2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, C;
		
		T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			C = sc.nextInt();
			
			int quarter = C/25;
			int dime = C%25/10;
			int nickel = C%25%10/5;
			int penny = C%25%10%5;
			
			System.out.print(quarter+" "+dime+" "+nickel+" "+penny+"\n");
		}
	}
}
