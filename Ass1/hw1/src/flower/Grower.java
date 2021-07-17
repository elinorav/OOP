/**
 * This program represents a Grower
 * It has 2 values that described the object Grower
 * 
*/
package flower;

public class  Grower extends Person{
	
	public Grower(String DeliveryAdress) {
		super("Grower", DeliveryAdress);
		
	}

	@Override
	public FlowersBouquet work(String NamesofFlowers) {
		Gardener gardener = new Gardener (this.city);
		System.out.println("Grower forwards request to Gardener");
		FlowersBouquet output = gardener.work(NamesofFlowers);
		System.out.println("Grower returns flowers to Wholeser");
		return output;
	}
	
	
	
}