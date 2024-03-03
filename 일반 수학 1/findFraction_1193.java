import java.util.Scanner;

public class findFraction_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X;
		int n = 0;
		int i = 0;
		
		X = sc.nextInt();
		int tmp = X;
		
		while(tmp>0) {
			i++;
			tmp-=i;
			n++;
		}
		
		tmp+=i;
		
		if(n%2==0) {
			System.out.println(tmp+"/"+(n-(tmp-1)));
		}else {
			System.out.println((n-(tmp-1))+"/"+tmp);
		}
	}
}
