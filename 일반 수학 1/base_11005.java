import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class base_11005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int B = sc.nextInt();
		
		int q = N/B;
		
		List<Integer> r = new ArrayList<>();
		
		r.add(N%B);
		
		while(q>0) {
			r.add(q%B);
			q = q/B;
		}
		
		for(int i=r.size()-1;i>=0;i--) {
			if(r.get(i)>=10) {
				System.out.print((char)(r.get(i)-10+65));
			}else {
				System.out.print(r.get(i));
			}
		}
	}
}
