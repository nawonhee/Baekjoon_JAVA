import java.util.Scanner;

public class YourGPA_25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		double point_sum = 0.0;
		String grade_arr[] = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
		double point_arr[] = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};
		
		for(int i=0;i<20;i++) {
			String subject_name= sc.next();
			double point = sc.nextDouble();
			String grade = sc.next();
			double grade_point = 0.0;
			
			if(!grade.equals("P")) {
				
				for(int j=0; j<9; j++) {
					if(grade.equals(grade_arr[j])){
						grade_point=point_arr[j];
						break;
					}
				}
				sum += point*grade_point;
				point_sum += point;
				System.out.println(sum);
				System.out.println(point_sum);
			}
			
		}
		
		double average = sum/point_sum;
		
		System.out.printf("%.6f\n", average);
	}
}
