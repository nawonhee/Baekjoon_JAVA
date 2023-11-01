package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet_2941 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int alphabetCnt = word.length(); //알파벳 개수 (초기에는 전체 문자 개수, 하나씩 검사해서 뺄 예정)
		int wordLength = word.length(); //단어 길이
		
		for(int i=0;i<wordLength;i++) { 
			if(i>0) { //문자가 첫번째 이상일 때만 검사
				switch(word.charAt(i)) {
				case '=':
					alphabetCnt--;
					if(i>1) { //문자가 두번째 이상일 때만 해당되는 조건
						if(word.charAt(i-1)=='z' && word.charAt(i-2)=='d') {					
							alphabetCnt--;
						}
					}
					break;
				case '-':
					alphabetCnt--;
					break;
				case 'j':
					if(word.charAt(i-1)=='l' || word.charAt(i-1)=='n') {
						alphabetCnt--;
					}
					break;
				}
			}
		}
		
		System.out.println(alphabetCnt);
	}
}
