package hellojava;	
import java.util.*;

	public class GradeCalculator {
		
		ArrayList <Course> CourseList = new ArrayList<>();//������ �Է¹��� ArrayList ����
		
		String name;
		int prevCredit;//�����б���� �̼�����
		int grade;//����
		double prevGpa;//�����б���� ����
		double finalGpa = 0;//���� ����
		double creditSum = 0;//�����б� �̼����� �հ�
		double finalCreditSum = 0;//�� �̼����� �հ�
		double gpaSum = 0;//�� ����
		
		public GradeCalculator(String name, double prevGpa, int prevCredit){
			this.name = name;
			this.prevGpa = prevGpa;
			this.prevCredit = prevCredit;
		}
		void addCourse(Course newcourse){
			CourseList.add(newcourse);
		}
		
		//�� ���� �ʱ�ȭ
		void CourseInit(){
			setCreditSum();
			calculateGpaSum();
			
		}
		//�̹��б� ���� ���
		void calculateGpaSum(){
			
			double gpaResult = 0;
			String getGpaAlphabet;
			int gpaMultiplier = 0;
			
			double gpaStore [] = new double[CourseList.size()];
			double multiplyStore [] = new double[CourseList.size()];

			for (int i = 0; i < CourseList.size(); i++){
				double gpaTemp = 0;
				getGpaAlphabet = CourseList.get(i).getGpa();
				
				switch(getGpaAlphabet){
					case "A+":
						gpaTemp = 4.5;
						break;
					case "A":
						gpaTemp = 4.0;
						break;
					case "B+":
						gpaTemp = 3.5;
						break;
					case "B":
						gpaTemp = 3.0;
						break;
					case "C+":
						gpaTemp = 2.5;
						break;
					//C+ �Ʒ��� 2.0���� ó��.
					default:
						gpaTemp = 2.0;
						break;

				}
				gpaStore[i] = gpaTemp;//���-���� ȯ��ġ�� Array gpaStore�� ���� 
			}
				for (int z = 0; z < CourseList.size(); z++){
					if (CourseList.get(z).getCourseGroup() == "major") gpaMultiplier = 3;
					if (CourseList.get(z).getCourseGroup() == "general") gpaMultiplier = 2;
					multiplyStore[z] = gpaMultiplier;//����-���� ���� ����ġ�� multiplyStore�� ����
					
				}
				
				for (int c = 0; c < gpaStore.length ; c++){
						gpaResult += gpaStore[c] * multiplyStore[c];//���ʴ�� ���� �� gpaResult�� ����
						
				}
			
				gpaSum = gpaResult;//gpaSum�� ����
			}
		
		
		//�̼����� �հ� ���
		void setCreditSum(){
			double tempSum = 0;
			
			for (int i = 0; i < CourseList.size(); i++){
				if (CourseList.get(i).getCourseGroup() == "major") tempSum += 3;
				else if (CourseList.get(i).getCourseGroup() == "general") tempSum += 2;
				
			}
		creditSum = tempSum;
		finalCreditSum = prevCredit + creditSum;
		}

		void calculateGpaAvg(){		
			this.finalGpa = gpaSum / creditSum;

		}
		//�����б� �ջ� ���� ���
		double calculateTotalGpaEstimate(){
			double prevGpaSum = prevGpa * prevCredit;
			
			return (gpaSum + prevGpaSum) / finalCreditSum;
		}

		//��� ǥ��
		void print(){
			CourseInit();
			calculateGpaAvg();

			System.out.println(name + " �л��� ���� ��� ���. �����մϴ�.");
			System.out.println("���� �б� ����: " + prevGpa + " (�� " + prevCredit + "����)"); 
			
			System.out.println("�̹� �б� ����: " + finalGpa + " (�� " + creditSum + "����)");
			System.out.println("��ü ���� ����: " + calculateTotalGpaEstimate() + " (�� " + finalCreditSum + "����)");
		}
	}


