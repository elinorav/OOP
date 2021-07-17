/**
 * This program represents a FlowersBouquet
 * It has 2 values that described the object FlowersBouquet
 * 
*/
package flower;

public class FlowersBouquet {
	
	private String NamesOfFlowers;
	private boolean IsArranged;
	
	
	
	public FlowersBouquet(String NamesOfflowers) {
		this.NamesOfFlowers=NamesOfflowers;
		this.IsArranged=false;;
	}

	
	public void ArrangeTheBouquet () {
		IsArranged=true;;
	}


	public String getNamesOfFlowers() {
		return NamesOfFlowers;
	}


	public void setNamesOfFlowers(String namesOfFlowers) {
		this.NamesOfFlowers = namesOfFlowers;
	}


	public boolean IsArranged() {
		return IsArranged;
	}
	
	
	
}