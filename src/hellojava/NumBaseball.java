/*���� ���߱� ���ӿ� �̾�, ���� �߱� ������ ������� �մϴ�. ���� ������ �����ϴ�.

��ǻ�ʹ� 0�� 9 ������ ���� �ٸ� �� ���ڸ� ������ ������ �̽��ϴ�. ����ڴ� ��ǻ�Ͱ� ���� ������ ���� ��ġ�� ���߷��� �մϴ�.
��ǻ�ʹ� ����ڰ� �Է��� �� ���ڿ� ���ؼ�, �Ʒ��� ��Ģ��� ��Ʈ����ũ(S)�� ��(B)�� ������ �˷��ݴϴ�.

������ ���� ��ġ�� ��� ��ġ�ϸ� S�Դϴ�.
������ ���� ��ġ������ ��ġ�� Ʋ������ B�Դϴ�.
���� ��� ��ǻ�Ͱ� 1, 2, 3�� �����Ͽ��µ�, ����ڰ� 1, 3, 5�� �Է��ϸ�, 1S(1�� ���� ��ġ�� ��ġ) 1B(3�� ���� ��ġ)�Դϴ�.
��ȸ�� �������Դϴ�. ������ ����� �õ� ���� ������� ��ϵ˴ϴ�.
3S(�� ������ ���� ��ġ�� ��� ���� ���)�� �� ������ �����ϴ�.
���� ���

"0�� 9 ������ ���� �ٸ� �� ���ڸ� ������ ������ �̾ҽ��ϴ�."�� ��µ˴ϴ�.
"�� ���� �ϳ��� ���ʴ�� �Է��ϼ���."�� ��µ˴ϴ�.
"1��° ���� �Է��ϼ���: "�� ��µǰ�, ����ڷκ��� �Է��� �޽��ϴ�. ���������� "2��° ���� �Է��ϼ���: ", "3��° ���� �Է��ϼ���: "�� ��µǰ�, ����ڷκ��� ���� �Է��� �޽��ϴ�. ���� ����ڰ� �ߺ��Ǵ� ���� �Է��ϰų� ������ ����� ���� �Է��� ���, ����ڷκ��� �Է��� �ٽ� �޽��ϴ�.
����ڰ� �ùٸ��� ���� �ٸ� �� ���� �Է��� ���, ��Ģ�� ���� "*S *B"�� ��µ˴ϴ�. ���� 3S�� �ƴ� ��� (2)���ٺ��� �ٽ� ����˴ϴ�.
����ڰ� 3S�� �޼����� ��, "�����մϴ�. *�� ���� �� ������ ���� ��ġ�� ��� ���߼̽��ϴ�."�� ��µ˴ϴ�.
���ô� �Ʒ��� �����ϴ�.*/

package hellojava;
import java.util.*;


class makearray{
	
	int [] throwball(){
		Random randomize=new Random();
		
		int ballcontrol[]=new int [3];
		for (int i=0;i<ballcontrol.length;i++){
			ballcontrol[i] = randomize.nextInt(9);
			
			for (int j=0;j<i;j++){
				if (ballcontrol[i] == ballcontrol[j]){
					i = i -1;	
				}
				
			}
			
			}
			
		Arrays.sort(ballcontrol);
		
		return ballcontrol;	
	}
}

class userball{
	
	int [] userthrows(){
		
				
		int userball[] = new int [3];
		Scanner makeinput=new Scanner(System.in);
		for (int z=0;z<userball.length;z++){
			System.out.println((z+1)+"��° ���� ��������!");
			userball[z] = makeinput.nextInt();			
		}
		return userball;
		
		
	}
	
}

class umpire{
	int strike_count(int []a, int []b){
		int strikecount = 0;
		
		int computerball[] = new int [3];
		int userthrewball[] = new int [3];
		
		computerball = a;
		userthrewball = b;
		
		for(int n=0;n<computerball.length;n++){
			
			if (computerball[n] == userthrewball[n]){
				strikecount += 1;
			}
		}
		
		
		
		return strikecount;
	}
	
	int ball_count(int []a, int []b){
		int ball_count=0;
		int userball1; int userball2; int userball3;
		int computerball1; int computerball2; int computerball3;
		
		int computersball[] = new int [3];
		int usersball[] = new int [3];
		
		computersball = a;
		usersball = b;
		
		userball1 = usersball[0]; userball2= usersball[1]; userball3= usersball[2];
		computerball1 = computersball[0]; computerball2 = computersball[1]; computerball3 = computersball[2];
		
		Arrays.sort(computersball);
		
		if (Arrays.binarySearch(computersball, userball1) >= 0 && usersball[0] != computersball[0] ){
			ball_count += 1;
			
		}
		
		if (Arrays.binarySearch(computersball, userball2) >= 0 && usersball[1] != computersball[1]) {
			ball_count += 1;
			
		}
	
		if (Arrays.binarySearch(computersball, userball3) >= 0 && usersball[2] != computersball[2]){
			ball_count += 1;
			
		}
		
		return ball_count;
		
		
	}
}


public class NumBaseball {
	
	public static void main (String args[]){
		
		int [] computer_ball = new int [3];
		int [] user_ball = new int [3];
		int strikecall=0;
		int ballcount=0;
		
		makearray printcomputerball=new makearray();
		computer_ball = printcomputerball.throwball();
		
		
		
		userball printuserball=new userball();
		System.out.println("=============================================");
		System.out.println("��� �ִ� ���� �߱� ��-��");
		System.out.println("����� �����°� �߸����� ���ϰڴ�");
		System.out.println("��Ģ: ����� �˾Ƹ��� ���ڴ� 0~9������ �����Դϴ�.");
		System.out.println("=============================================");
		user_ball = printuserball.userthrows();
		
	
		umpire ballpanjeong=new umpire();
		int chance=0;
		while (chance<4){
			
		
			strikecall = ballpanjeong.strike_count(computer_ball, user_ball);
			ballcount = ballpanjeong.ball_count(computer_ball, user_ball);
			if (strikecall == 3){
				System.out.println("���� �ƿ�!");
				break;
				
			}
			else {System.out.println("����� ���������� "+Arrays.toString(user_ball)+"�Դϴ�.");
				System.out.println("���Ѷ���! ���� "+strikecall+"S "+ballcount+"B �Դϴ�. ("+(chance+1)+"��° Ÿ��)");
			}
			
			user_ball = printuserball.userthrows();
			
			chance += 1;
					
			if (chance == 3){
				System.out.println("���� ��ȸ��.... ���� "+Arrays.toString(computer_ball)+"�̾����ϴ�.");
				break;
			}
			
			
			
		}
		
	
		}
			
		}
	


