package phanguyen.lecture2;
import javax.swing.JOptionPane;
public class Lab02_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option  = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket");
		JOptionPane.showMessageDialog(null,"You've chosen: "+(option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}

}
