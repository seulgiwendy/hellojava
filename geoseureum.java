package educast;
import java.util.*;

class billcalc{
	
	void billcalc1(int f){
	
	int geoseureum=0;
	
	
	geoseureum=f;
	

	int changebill []=new int [4];
	changebill[0]=50000;
	changebill[1]=10000;
	changebill[2]=5000;
	changebill[3]=1000;
	
	
	for (int z=0;z<changebill.length;z++){
		System.out.println(changebill[z]+"��:"+geoseureum/changebill[z]+"��");
		geoseureum=geoseureum%changebill[z];
		
		
		
	}
	
	}
	
}

public class geoseureum {
	
	int calculation (int payment, int cost){
		int charge=0;
		
		charge=payment-cost;
		
		return charge;
		
	}

	
	public static void main (String []args){
		
		int eolma1;
		
		
		
		int jipyeoption;
		int jipyecount;
		int sum = 0;
		int result=0;
		int option1=0;
		
		
		
		Scanner eolma=new Scanner(System.in);
		Scanner jipye=new Scanner(System.in);
		Scanner count=new Scanner(System.in);
		Scanner option=new Scanner(System.in);
		
		
		System.out.println("����� ��¥�� ������ �ȾҴ°�.");
		eolma1=eolma.nextInt();
		
		System.out.println("�ճ��� �� ������ ���� �����ߴ°�");
		jipyecount=count.nextInt();
		
		
		int jipye1[]=new int[jipyecount];
		
		for (int n=0;n<jipyecount;n++){
			System.out.println("�ճ��� � ���� �����ߴ��� �Է��϶�. (���� "+jipyecount+"�� �� "+(n+1)+"��° ��)");
			System.out.println("1���� 5 ������ ������ �Է��϶�. 1. 1000�� 2. 5000�� 3. 10000�� 4. 50000��");
			jipyeoption=jipye.nextInt();
				switch(jipyeoption){
				
				case 1: jipye1[n]=1000;
				break;
				
				case 2: jipye1[n]=5000;
				break;
				
				case 3: jipye1[n]=10000;
				break;
				
				case 4: jipye1[n]=50000;
				break;
				
				
				
				}
		
		}
			
		for (int i=0;i<jipye1.length;i++){
			
			sum=sum+jipye1[i];
			
		}
			
		if (sum<eolma1){
			System.out.println("����� �޾ƾ��� ���� "+eolma1+"�ε� ����� ������ ���� ���� "+sum+"�� �Ұ��ϴ�.");
			System.out.println("����� ȣ���ΰ�? ���� �๰ ����� ��谡 �ƴϴ�.");
			
		}
		
		
		geoseureum finalcalc=new geoseureum();
		result=finalcalc.calculation(sum, eolma1);
		
		if (sum<eolma1){
			System.out.println("����� �� �޾ƾ��� �ݾ��� "+Math.abs(result)+"���̴�.");
		
			
			
		
		}
		
		else {
			System.out.println("�ճ��� ������ �ݾ��� �հ�� "+sum+"���̴�.");
			System.out.println("����� �Ž�������� �ݾ��� "+result+"���̴�.");
			System.out.println("���� ����� �ʹ��� ���밡������ �� ¥���� �� �� �Ž�������ϴ� �� ���� ������� �Ѵٸ�,");
			System.out.println("1�� �Է��϶�.");
			option1=option.nextInt();
			
		
		}
		
		if (option1==1){
			
			billcalc finalresult = new billcalc();
			finalresult.billcalc1(result);
			
		
		}
		
		else {
			System.out.println("�Ӹ��� ���⺸�� ������");
		}
			
		}
		
}

		
		
		
				
		
	

	
	
	
	


