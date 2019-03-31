package getters_and_setters;

public class PersonRunner {
	public static void main(String[] args) {
		Person bob = new Person();
		bob.setName("Jug");
		bob.setSuperpower("eating");
		Person dob = new Person();
		dob.setName("Jug1");
		dob.setSuperpower("drinking");
		Person lob = new Person();
		lob.setName("Jug2");
		lob.setSuperpower("chewing");
		System.out.println(bob.toString());
		System.out.println(dob.toString());
		System.out.println(lob.toString());
	}
}
