package sea_creature;

public class SeaCreatur {
	public static void main(String[] args) {
		SeaCreature bob = new SeaCreature("SpongeBob");
		String hi = bob.getName();
		System.out.println(hi);
		bob.eat();
		bob.laugh();

		SeaCreature lob = new SeaCreature("Patrick");
		String bye = lob.getName();
		System.out.println(bye);
		lob.eat();
		lob.laugh();

		SeaCreature cob = new SeaCreature("Sqidward");
		String kai = cob.getName();
		System.out.println(kai);
		cob.eat();
		cob.laugh();
	}

}
