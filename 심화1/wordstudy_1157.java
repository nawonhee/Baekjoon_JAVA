package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wordstudy_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine().toUpperCase();
		int[] wordArr = new int[26];
		
		for(int i=0;i<word.length();i++) {
			int wordNum = word.charAt(i);
			wordArr[wordNum-65]++;
		}
		
		int maxNum=0;
		int maxIdx=0;
		int maxCnt=0;
		
		for(int i=0;i<26;i++) {
			if(wordArr[i]>maxNum) {
				maxNum=wordArr[i];
				maxIdx=i;
				maxCnt=1;
			}else if(wordArr[i]==maxNum) {
				maxCnt++;
			}
		}
		
		if(maxCnt>1) {
			System.out.println("?");
		}else {
			System.out.println((char)(maxIdx+65));
		}
	}
}
