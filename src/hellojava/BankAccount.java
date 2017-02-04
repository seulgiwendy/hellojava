package hellojava;

public class BankAccount {
	
	
	private int balance;
	Person owner;
	
	

    // �Ķ���� : �Ա��� �׼�(����)
    // ���� : ��������(�Ҹ�)
	
	void setBalance(int amount){
		if (amount >= 0){
			balance = amount;
		}
		else 
			System.out.println("������ �������� �ʽ��ϴ�.");
		
	}
	
	int getBalance(){
		return balance;
	}
	
    boolean deposit(int amount) {
        if (amount > owner.getCash()){
        System.out.println("�Ա� ����: ���� ����. �Ա� �õ���: " + amount + "����: " + owner.getCash());
    	return false;}
        else{
        	balance += amount;
        	owner.setCash(owner.getCash() - amount);
        	System.out.println(amount + "�� �Ա� �Ͽ����ϴ�. �ܰ� : " + balance + "��, ���� : " + owner.getCash() +"��");
        	
        	return true;
    }
    }

    // �Ķ���� : ����� �׼�(����)
    // ���� : ��������(�Ҹ�)
    boolean withdraw(int amount) {
    	if (amount > balance){
    		System.out.println("��ݿ� �����߽��ϴ�. �ܾ�: " + balance + " ����: " + owner.getCash());
    		return false;
    }
    	else{
    		balance = balance - amount;
    		owner.setCash(owner.getCash() + amount);
    		System.out.println(amount+"�� ��� �Ͽ����ϴ�. �ܰ� :" + balance + "��, ���� : " + owner.getCash() + "��");
    		return true;}
    }

    // ù ��° �Ķ���� : �޴� ���(Person)
    // �� ��° �Ķ���� : ��ü�� �ݾ�(����)
    // ���� : ��������(�Ҹ�)
    boolean transfer(Person to, int amount) {
    	
    	if (amount > balance){
    		System.out.println("��ü�� �����߽��ϴ�. �ܾ� ����.");
    		return false;
    	}
    	else{
    		balance -= amount;
    		to.account.balance += amount;
    		System.out.println(amount + "���� " + to.getName() + "���� ���¿� �Ա��߽��ϴ�.");
    		return true;
    
    }

    }

}



