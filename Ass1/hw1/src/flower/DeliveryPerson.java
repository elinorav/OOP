/**
 * This program represents a DeliveryPerson
 * 
*/
package flower;

public  class DeliveryPerson {
	
	public DeliveryPerson(){
		
	}

	public void work(FlowersBouquet ZerForYou,String adress,String nameOfReceiver) {
		Receiver receiver = new Receiver(nameOfReceiver,adress);
		System.out.println("Delivery Person delivers flowers to "+nameOfReceiver);
		receiver.work(ZerForYou.getNamesOfFlowers());
	}
	
	
	
}