/**
 * This program represents a Wholesaler
 * It has 2 values that described the object Wholesaler
 * 
*/
package flower;

public class Wholesaler extends Person {
	
	public Wholesaler(String DeliveryAdress) {
		super("Wholesaler",DeliveryAdress);
	}

	@Override
	public FlowersBouquet work(String NamesofFlowers) {
		Grower grower = new Grower (this.city);
		System.out.println("Wholesaler forwards request to Grower");
		FlowersBouquet output = grower.work(NamesofFlowers);
		System.out.println("Wholesaler returns flowers to Robin's Florist");
		return output;
	}
	
	
	
}