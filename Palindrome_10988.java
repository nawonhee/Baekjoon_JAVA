import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler;

public class Palindrome_10988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int slength = s.length();
		int start=0; //시작지점에서부터의 인덱스
		int end=slength-1; //끝지점에서부터의 인덱스, 배열은 0부터 시작하니까 1 빼주기
		
		while(start<slength/2-1) { //start가 절반지점을 넘지 말아야 함
			if(s.charAt(start)!=s.charAt(end)) { //처음과 끝부터 차례차례 비교해서 다른 순간 0출력하고 종료
				System.out.println(0);
				return;
			}
			start++; //처음부터 전진
			end--; //끝에서 후진
		}
		
		System.out.println(1); //반복문을 무사히 빠져나왔다면 다 같다는 얘기이므로 1출력
	}

}
