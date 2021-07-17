/**
 * This program represents a v
 * It has 2 values that described the object Gardener
 * 
*/
package flower;

public class  Gardener extends Person{
	
	public Gardener(String DeliveryAdress) {
		super("Gardener", DeliveryAdress);
		
	}

	@Override
	public FlowersBouquet work(String NamesofFlowers) {
		FlowersBouquet ZerForYou =new FlowersBouquet(NamesofFlowers);
		System.out.println("Gardener prepares flowers");
		System.out.println("Gardener returns flowers to Grower");
		return ZerForYou;
	}
	
	
	
}