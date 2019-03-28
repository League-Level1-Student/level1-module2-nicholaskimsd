package sea_creature;

public class SeaCreatur {
	public static void main(String[] args) {
		SeaCreatur bob = new SeaCreatur();
		try {
			bob.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
