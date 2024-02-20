//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class verticalRead_10798 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] words = new String[5];
//		int maxLength = 0;
//		
//		for(int i=0;i<5;i++) {
//			words[i] = br.readLine();
//			if(maxLength<words[i].length()) {				
//				maxLength = words[i].length();
//			}
//		}
//		
//		for(int i=0;i<maxLength;i++) {
//			for(int j=0;j<5;j++) {
//				if(words[j].length()>=i+1) {
//					System.out.print(words[j].charAt(i));
//				}
//			}
//		}
//	}
//}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class verticalRead_10798 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] words = new String[5];
//		int maxLength = 0;
//		
//		for(int i=0;i<5;i++) {
//			words[i] = br.readLine();
//			if(maxLength<words[i].length()) {				
//				maxLength = words[i].length();
//			}
//		}
//		
//		char[][] matrix = new char[5][maxLength];
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<maxLength;j++) {
//				if(words[i].length()>=j+1) {
//					matrix[i][j] = words[i].charAt(j);
//				}
//			}
//		}
//		
//		for(int i=0;i<maxLength;i++) {
//			for(int j=0;j<5;j++) {
//				if(matrix[j][i]!=0) {
//					
//					System.out.print(matrix[j][i]);
//				}
//			}
//		}
//	}
//}
//



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class verticalRead_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] arr = new char[5][15];
		
		for(int i=0;i<5;i++) {
			String word = br.readLine();
			for(int j=0;j<word.length();j++) {
				arr[i][j] = word.charAt(j);
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j][i]!=0) {					
					System.out.print(arr[j][i]);
				}
			}
		}
	}
}

