/**
 * This program represents a Person
 * It has 2 values that described the object Person
 * It is an abstract class
 * 
*/
package flower;

public abstract class Person {
	
	protected String name;
	protected String city;
	

	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public abstract Object work(String NameOfFlowers);
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}