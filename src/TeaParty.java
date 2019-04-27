import javax.swing.JOptionPane;

public class TeaParty {
	public class teaParty {
		private String name;
		private boolean isWoman;
		private boolean isKnighted;
	       public void welcome(String name, boolean isWoman, boolean isKnighted)
	       {
			this.name =name;
			this.isWoman = isWoman;
			this.isKnighted = isKnighted;
			if(name.equalsIgnoreCase("Jane Austen")) {
				JOptionPane.showMessageDialog(null, "Hello Ms. Austen");
			}
			
			else if(name.equalsIgnoreCase("George Orwell")){
				 JOptionPane.showMessageDialog(null, "hello Mr. Orwell");
			 }
			 else {
				 JOptionPane.showMessageDialog(null, "Hello sir Issac Newton");
			 }

	       }}

	public String welcome(Object object, boolean b, boolean c) {
		// TODO Auto-generated method stub
		return null;
	}


}
