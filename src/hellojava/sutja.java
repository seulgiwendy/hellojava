package hellojava;
import java.util.*;

class randint{
	
	int createrandint(int b){
	int a=0;
	int range=0;
	
	Random random=new Random();
	
	range=b;
	
	a=random.nextInt(range);
	
	
	return a;	
		
	}
	
	
		
}

class chulje{
	
	int chance(){
		
		int chance1=0;
		Scanner chance2=new Scanner(System.in);
		
		
		System.out.println("�� ���� ��ȸ�� �� �����Դϱ�.");
		chance1=chance2.nextInt();
		
		return chance1;
		
		
		
	}
	
}



public class sutja {
	
	public static void main(String args[]){
		
		int number=0;
		int repeat=0;
		int answer=0;
		int range_choice=0;
		
		
		Scanner answerinput=new Scanner(System.in);
		Scanner rangeinput=new Scanner(System.in);
		
		
		
		randint createrandom=new randint();
		System.out.println("������� ���ڸ� ���� �Է��ϼ���. �������� ����");
		
		range_choice=rangeinput.nextInt();
		number=createrandom.createrandint(range_choice);
		
		
		chulje fetchquestion=new chulje();
		repeat=fetchquestion.chance();
		
		for (int i=0;i<repeat;i++){
			
		
			
			System.out.println(repeat-i+"���� ��ȸ�� ���ҽ��ϴ�. ���ڸ� ����������. ��Ʈ: 20 ������.");
			answer=answerinput.nextInt();
			if (answer == number){
				System.out.println("����� õ���Դϴ�. "+(i+1)+"������ �̰� ������. ��õ��");
				break;}
			
			if (i == repeat-1){
				
				System.out.println("��. ���� "+number+"����.");
				break;	
				}
					
				
				
				else if (answer < number){
					System.out.println("���� �� �Ẹ����");
					
				}
				else if (answer > number){
					System.out.println("�ʹ� ���� ����");
				}
			
		
				
					
				}

	
	}
}
		
	
	
	
	
		
		
	


