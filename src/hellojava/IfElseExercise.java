package hellojava;
import java.util.Scanner;



public class IfElseExercise {
	
	    public static void main(String[] args) {
	    	
	    	Scanner scankey = new Scanner(System.in);
	    	System.out.println("���ڸ� �Է��ϼ���. a: ");
	    	int a = scankey.nextInt();
	    	System.out.println("���ڸ� �Է��ϼ���. b: ");
	    	int b = scankey.nextInt();
	    	
	    	
	     
	       if (a == b){
	    	   System.out.println("a�� b�� �����ϴ�. a = b = " + a);}
	       else if (a > b){
	    	   System.out.println("a�� b�� ���� �ʽ��ϴ�.");
	    	   System.out.println("a�� b���� " + (a - b) + "��ŭ �� Ů�ϴ�.");}
	       else if (b > a){
	    	   System.out.println("a�� b�� ���� �ʽ��ϴ�.");
	    	   System.out.println("b�� a���� " + (b - a) + "��ŭ �� Ů�ϴ�.");}
	       }
	    }
	


