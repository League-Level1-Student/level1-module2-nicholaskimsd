package getters_and_setters;

public class Person {
	String name;
	String superPower;
	public String getName() {
		return name;
	}

	public String getSuperpower() {
		return superPower;

	}

	public void setSuperpower(String superPower) {
		this.superPower = superPower;

	}

	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		return name+" has mad "+superPower+" skillz";
		
	}
}
