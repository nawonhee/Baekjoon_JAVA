import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class dial_5662 {
	public static void main(String[] args) throws IOException {
		String[] arr = {"ABC","DEF","GHI","JKL", "MNO", "PQRS","TUV","WXYZ"}; //다이얼 숫자에 해당하는 문자열 각각 담기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split("");
		int inputlength = input.length; //입력받은 문자열
		int sec = inputlength*2; //다이얼 숫자마다 무조건 1보다 크니 기본적으로 2초씩 걸리므로 누르는 숫자개수만큼 2를 곱해준다
		
		for(int i=0;i<inputlength;i++) { //입력받은 문자 개수만큼 반복
			for(int j=0;j<8;j++) { //다이얼 배열 검사
				for(int k=0;k<arr[j].length();k++) { //다이얼 배열 요소 하나하나 검사할 것, 요소의 길이만큼 반복 
					if(String.valueOf(arr[j].charAt(k)).equals(input[i])) { //입력받은 문자와 같은 문자가 있는지 비교
						//있으면 문자에 해당하는 숫자를 sec에 더하기
						//이유 : 한칸당 1초 추가된다고 했기 때문 (ex. 8을 누르려면 7초가 추가된다)
						sec += (j+1);
						break; //발견했으면 걸리는 시간 추가해주고 반복문 빠져나가서 다음문자 비교
					}
				}
			}
		}
		
		bw.write(String.valueOf(sec));
		
		br.close();
		bw.close();
	}
}