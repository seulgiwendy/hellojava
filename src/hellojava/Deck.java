/*(1) private ArrayList<Card> cards

���� �ִ� ī�带 �����ϴ� ArrayList�Դϴ�.

(2) public ArrayList<Card> getCards()

ī�� ����� �������ݴϴ�.

(3) public void addCard(Card card)

�Ķ���ͷ� card�� �ް� cards�� �߰����ݴϴ�.

(4) public void print()

ī�� ��Ͽ� �ִ� ��� ī�带 ����մϴ�. ����� ���� ī�� �ν��Ͻ��� toString �޼ҵ带 ����ϼ���.

(5) public void shuffle()

cards�� ������ ���׹��� �����ϴ�. Random Ŭ������ �̿��ؼ� ������ �����ϰ� �����ּ���!

(6) public Deck deal(int count)

���� hand��� ���ο� Deck �ν��Ͻ��� ���弼��. count�� 5�� ���� ���� cards�� ������ �ټ� ���� ����, �� �ټ� ���� hand�� cards�� �־��ּ���. �׸��� hand�� �������ָ� �˴ϴ�.*/

package hellojava;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
    	
    	cards.add(card);
    }

    public ArrayList<Card> getCards() {
    	return cards;
    }

    public void print() {
    	
    	for (int i = 0; i<cards.size(); i++){
    		System.out.println(cards.get(i).toString());
    	}
    		
    	
    }

    public void shuffle() {
        Random random = new Random(); 
        for (int i = 0;i < cards.size();i++){
        	cards.set(random.nextInt(cards.size()), cards.get(i));}
        }
    

    public Deck deal(int count) {
    	Deck hand = new Deck();
    	int arraySize = cards.size();
    	if (count == 5){
    		for (int i = arraySize ;i > arraySize - 5; i--){
    			hand.cards.add(cards.remove(i - 1));
    			
    		}
    	}
    	return hand;
    }
}