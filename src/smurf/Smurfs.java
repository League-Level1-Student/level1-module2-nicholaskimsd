package smurf;

public class Smurfs {
public static void main(String[] args) {
	Smurf hi = new Smurf("Handy boiiiii");
	hi.getName();
	String bob = hi.getName();
	System.out.println(bob);
	hi.eat();
	String ko = hi.getHatColor();
	System.out.println("Handy boiiiii is wearing a "+ko+" hat.");
	
	Smurf bye = new Smurf("PAPA  boiiii");
	String lob = bye.getName();
			System.out.println(lob);
	String lol = bye.getHatColor();
	System.out.println("PAPA  boiiii is wearing a "+lol+" hat.");
	String ki = bye.isGirlOrBoy();
	System.out.println("PAPA Smurf boiiii is a "+ki);
	
	Smurf go = new Smurf("Smurfette");
	String joe  = go.getName();
	System.out.println(joe);
	String kol = go.getHatColor();
	System.out.println("Smurfette is wearing a "+kol+" hat.");
	String koi  = go.isGirlOrBoy();
	System.out.println("Smurfette is a "+koi);
}
}
