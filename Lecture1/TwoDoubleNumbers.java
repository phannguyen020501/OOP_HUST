package phanguyen.lecture1;
import javax.swing.JOptionPane;
public class TwoDoubleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1,strNum2;
		strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1=Double.parseDouble(strNum1);
		double num2=Double.parseDouble(strNum2);
		double sum=num1+num2,diff=num1-num2,product=num1*num2;
		double quotient;

		JOptionPane.showMessageDialog(null, String.valueOf(sum),"Sum ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, String.valueOf(diff),"Different ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, String.valueOf(product),"Product ",JOptionPane.INFORMATION_MESSAGE);
		if(num2!= 0) {
			quotient=num1/num2;
			JOptionPane.showMessageDialog(null, String.valueOf(quotient),"Quotient",JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);

	}

}
