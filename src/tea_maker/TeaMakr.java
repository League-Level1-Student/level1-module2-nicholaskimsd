package tea_maker;

import tea_maker.Kettle.Water;

public class TeaMakr {
public static void main(String[] args) {
	Kettle hi = new Kettle();
	hi.getWater();
	hi.boil();
	TeaBag bye = new TeaBag(TeaBag.MINT);
	bye.getFlavor();
	Cup ko = new Cup();
	ko.makeTea(bye, hi.getWater());
	
}
}
