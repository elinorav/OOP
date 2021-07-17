/**
 * This program represents a Receiver
 * It has 2 values that described the object Receiver
 * 
*/
package flower;

public class Receiver extends Person {

	public Receiver(String name, String city) {
		super(name, city);
	}

	@Override
	public Object work(String NamesofFlowers) {
		System.out.println(name + " accepts the flowers:" + NamesofFlowers);
		return true;
	}
	
	
	
}