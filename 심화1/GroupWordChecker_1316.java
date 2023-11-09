package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker_1316 {
	static int groupCheck(String word, int check) {
		int[] arr = new int[26];
		int length = word.length();
		for(int j=0;j<length;j++) {
			int wordNum = word.charAt(j);
			if(j>0) {
				if(word.charAt(j)!=word.charAt(j-1)) {
					if(arr[wordNum-97]>0) {
						check=0;
						break;
					}
				}
			}
			arr[wordNum-97]++;
		}
		return check;
	}
	
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0;i<T;i++) {
			String word = br.readLine();
			int length = word.length();
			int[] arr = new int[26];
			int check = 1;
			
			for(int j=0;j<length;j++) {
				int wordNum = word.charAt(j);
				if(j>0) {
					if(word.charAt(j)!=word.charAt(j-1)) {
						if(arr[wordNum-97]>0) {
							check=0;
							break;
						}
					}
				}
				arr[wordNum-97]++;
			}
			result += check;
		}
		System.out.println(result);
	}
}
