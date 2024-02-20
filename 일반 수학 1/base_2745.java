import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class base_2745 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		int sum = 0;
		int nLength = N.length();
		int j = 1;
		
		br.close();
		
		for(int i=nLength-1;i>=0;i--) {
			char C = N.charAt(i);
			if(C>='A'&&C<='Z') {
				sum+= (C-'A'+10)*j;
			}else {
				sum+= (C-'0')*j;
			}
			j*=B;
		}
		
		System.out.println(sum);
	}
}
