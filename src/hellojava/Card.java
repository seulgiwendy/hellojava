/*(1) public final int suitNumber
ī���� ����� ���մϴ�. ī�� ��翡�� ���� 1, 2, 3, 4�� ǥ���Ǵ� 'Ŭ�ι�(Clubs)', '��Ʈ(Hearts)', '���̾Ƹ��(Diamonds', '�����̵�(Spades)'�� �ֽ��ϴ�.
�� �� �������� �ٲ� ������ ���� ������ final�Դϴ�. ���� Ư���� getter�� �ʿ� ���� ������ public �Դϴ�.
(2) public final int rankNumber
ī���� ���� ���մϴ�. 1, 11, 12, 13�� ���� 'Ace', 'Jack', 'Queen', 'King'�� ǥ���ǰ�, 2~10�� �� ���� ��ü�� ǥ���˴ϴ�.
���������� �� �� �������� �ٲ� ������ ���� ������ public final�Դϴ�.
(3) public Card(int suitNumber, int rankNumber)
�Ķ���ͷ� ������ suit�� rank�� �ް�, �ν��Ͻ� ���� suit�� rank�� ���� �������ݴϴ�. 1 <= suit <= 4, 1 <= rank <= 13��� �����սô�!
(4) public String getSuit()
���� suit�� ���� ���� �ش��ϴ� ��Ʈ(suit)�� �������ݴϴ�.*/

package hellojava;
import java.io.*;
import java.util.*;

public class Card {
	   public final int suitNumber;
	    public final int rankNumber;
	    
	    public String clover = "Clubs";
	    public String hearts = "Hearts";
	    public String dia = "Diamonds";
	    public String spades = "Spades";
	    
	    public Card(int suitNumber, int rankNumber) {
	    	this.suitNumber = suitNumber;
	    	this.rankNumber = rankNumber;
	    }
	    public String getSuit() {
	    	switch(suitNumber){
	    	
	    	case 1:
	    		return clover;
	    		
	    	case 2: 
	    		return hearts;
	    	case 3:
	    		return dia;
	    	case 4:
	    		return spades;	    	
	    		}
	    	return "cardError";	
	    }

	    public String getRank() {
	    	if (2 <= rankNumber && rankNumber <= 10) 
	    		return String.valueOf(rankNumber);
	    	else{
	    		switch(rankNumber){
	    		case 1: 
	    			return "Ace";
	    		case 11:
	    			return "Jack";
	    		case 12:
	    			return "Queen";
	    		case 13:
	    			return "King";
	    		}
	    	}
	    	return "SystemError";
	    }
	    
	    public String toString() {
	    	return (this.getRank() + " of " + this.getSuit());
	    }

	}

