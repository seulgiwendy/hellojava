package educast;
import java.util.Scanner;




public class gpa {
	public static void main(String []args){
		
		
		
		float gpa;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("����� �̼������� �Է��ϼ���");
		int total=scanner.nextInt();
		
		System.out.println("����� �̹��б� ���������� �� ��Դϱ�?");
		int subjectcount=scanner.nextInt();
		
		float subjectgrade[]=new float [subjectcount];
		
		for (int n=0;n<subjectcount;n++){
			
			System.out.println(n+1+"��° ������ ����� �Է��Ͽ� �ֽʽÿ�");
			System.out.println("����� �������� �Է��Ͽ� �ֽʽÿ�.");
			System.out.println("A+�� 4.5, A�� 4, B+�� 3.5,B�� 3, C+�� 2.5 �Դϴ�");
				subjectgrade[n]=scanner.nextFloat();
				
		}
		
		float gradesum=0;
		
		for (int j=0;j<subjectgrade.length;j++){
		gradesum+=subjectgrade[j];
		
		
			
		}
		
		gpa=gradesum/subjectcount;
		System.out.println("����� �̹��б� ���� ������ "+gpa+"�Դϴ�. ����");
		
	}

}
