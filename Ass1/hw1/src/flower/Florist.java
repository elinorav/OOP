/**
 * This program represents a Florist
 * It has 4 values that described the object Florist
 * 
*/
package flower;

public class Florist extends Person  {
	
	private String ReceiverName;
	protected String DeliveryAdress;

	public Florist(String name, String city,String DeliveryAdress,String ReceiverName) {
		super(name, city);
		this.DeliveryAdress=DeliveryAdress;
		this.ReceiverName=ReceiverName;
	}

	@Override
	public Object work(String NamesofFlowers) {
		if (!(this.city.equals(this.DeliveryAdress))) {
			System.out.println(this.name+" forwards order to "+ReceiverName+"'s florist");
			return new Florist(name,DeliveryAdress,DeliveryAdress,ReceiverName).work(NamesofFlowers);
		}
		else {
			System.out.println(ReceiverName+"'s florist forwards request to Wholesaler");
			Wholesaler wholesaler= new Wholesaler(NamesofFlowers);
			FlowersBouquet ZerForYou= wholesaler.work(NamesofFlowers);
			FlowerArranger arrange= new FlowerArranger();
			System.out.println(ReceiverName+"'s Florist request flowers arrangement from Flower Arranger");
			arrange.work(ZerForYou);
			DeliveryPerson deliver=new DeliveryPerson();
			System.out.println(ReceiverName+"'s Florist forwards flowers to Delivery Person");
			deliver.work(ZerForYou, DeliveryAdress,ReceiverName);
			
		}
		
		return true;
	}
	
	public String getReceiverName() {
		return ReceiverName;
	}
	
	public String getDeliveryAdress() {
		return DeliveryAdress;
	}
	
	
	public void setCityReceiverName(String NewReceiverName) {
		this.ReceiverName = NewReceiverName;
	}
	
	public void setDeliveryAdress(String NewDeliveryAdress) {
		this.DeliveryAdress = NewDeliveryAdress;
	}
	
	
}