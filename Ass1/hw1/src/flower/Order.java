/**
 * This program represents a Order
 * It has 3 values that described the object Order
 * 
*/
package flower;

public class Order extends Person {
	
	private String ReceiverName;
	protected String DeliveryAdress;

	public Order(String name, String city,String ReceiverName,String DeliveryAdress) {
		super(name, city);
		this.ReceiverName=ReceiverName;
		this.DeliveryAdress=DeliveryAdress;
	}

	@Override
	public Object work(String NamesofFlowers) {
		Florist floristFred=new Florist("Fred",city,DeliveryAdress,ReceiverName);
		System.out.println(name + " orders flowers from " + floristFred.getName() + ": " + NamesofFlowers);
		return floristFred.work(NamesofFlowers);
	}

	
	
	public String getReceiverName() {
		return ReceiverName;
	}

	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}
	
	public String getDeliveryAdress() {
		return DeliveryAdress;
	}

	public void setDeliveryAdress(String NewDeliveryAdress) {
		DeliveryAdress = NewDeliveryAdress;
	}
	
}