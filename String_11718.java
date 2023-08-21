import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class String_11718{
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		while((str=br.readLine())!=null) {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			System.out.println(str);
		}
	}
}