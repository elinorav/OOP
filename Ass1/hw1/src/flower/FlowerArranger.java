/**
 * This program represents a FlowerArranger
 * 
*/
package flower;

public  class FlowerArranger {
	
	public FlowerArranger () {
		
	}

	public boolean work(FlowersBouquet ZerForYou) {
		System.out.println("Flower Arranger arranges flowers");
		ZerForYou.ArrangeTheBouquet();
		System.out.println("Flower Arranger returns arranged flowers to Robin's Florist");
		return true;
	}
	
	
	
}