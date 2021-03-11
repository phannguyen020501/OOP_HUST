package phanguyen.lecture1;
import javax.swing.JOptionPane;
public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA,strB,strC;
		double a,b,c;
		strA = JOptionPane.showInputDialog(null,"Please input A= ","Input A",
				JOptionPane.INFORMATION_MESSAGE);
		strB = JOptionPane.showInputDialog(null,"Please input B= ","Input B",
				JOptionPane.INFORMATION_MESSAGE);
		a=Double.parseDouble(strA);
		b=Double.parseDouble(strB);
		String mess=strA+"X+"+strB+" =0";
		
		JOptionPane.showMessageDialog(null,mess," ",JOptionPane.INFORMATION_MESSAGE);
		if(a==0 && b==0) {
			JOptionPane.showMessageDialog(null, "vo so nghiem", "result",JOptionPane.INFORMATION_MESSAGE);
		}else if(a==0 && b!=0) {
			JOptionPane.showMessageDialog(null, "vo nghiem","result",JOptionPane.INFORMATION_MESSAGE);
		}else {
			double x=-b/a;
			String result="x="+x;
			JOptionPane.showMessageDialog(null, result,"result",JOptionPane.INFORMATION_MESSAGE);
		}
		
		strA = JOptionPane.showInputDialog(null,"Please input A=","Input A",JOptionPane.INFORMATION_MESSAGE);
		strB = JOptionPane.showInputDialog(null,"Please input B=","Input B",JOptionPane.INFORMATION_MESSAGE);
		strC = JOptionPane.showInputDialog(null,"Please input C=","Input C",JOptionPane.INFORMATION_MESSAGE);
		
		mess=strA+"X+ "+strB+"Y +"+strC+" =0";
		JOptionPane.showMessageDialog(null,mess," ",JOptionPane.INFORMATION_MESSAGE);
		a=Double.parseDouble(strA);
		b=Double.parseDouble(strB);
		c=Double.parseDouble(strC);
		if(a!=0 && b!=0) {
			JOptionPane.showMessageDialog(null, "vo so nghiem", "result",JOptionPane.INFORMATION_MESSAGE);
		}else if(a==0 && b!=0) {
			if(c==0) {
				JOptionPane.showMessageDialog(null, "x vo so, y=0", "result",JOptionPane.INFORMATION_MESSAGE);
			}else {
				double y=-c/b;
				String result="x=0, y="+y;
				JOptionPane.showMessageDialog(null, result,"result",JOptionPane.INFORMATION_MESSAGE);
				
			}
		}else if(a!=0 && b==0) {
			if(c==0) {
				JOptionPane.showMessageDialog(null, "x=0, y vo so", "result",JOptionPane.INFORMATION_MESSAGE);
			}else {
				double x=-c/a;
				String result="x="+x+"y= 0";
				JOptionPane.showMessageDialog(null, result,"result",JOptionPane.INFORMATION_MESSAGE);
				
			}
		}else if(a==0 && b==0) {
			if(c==0) {
				JOptionPane.showMessageDialog(null, "vo so nghiem", "result",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "vo nghiem", "result",JOptionPane.INFORMATION_MESSAGE);

			}
		}
		
		strA = JOptionPane.showInputDialog(null,"Please input A=","Input A",JOptionPane.INFORMATION_MESSAGE);
		strB = JOptionPane.showInputDialog(null,"Please input B=","Input B",JOptionPane.INFORMATION_MESSAGE);
		strC = JOptionPane.showInputDialog(null,"Please input C=","Input C",JOptionPane.INFORMATION_MESSAGE);
		
		mess=strA+"X^2+ "+strB+"X +"+strC+" =0";
		JOptionPane.showMessageDialog(null,mess," ",JOptionPane.INFORMATION_MESSAGE);
		a=Double.parseDouble(strA);
		b=Double.parseDouble(strB);
		c=Double.parseDouble(strC);
		
		if(a==0) {
			if(b==0 && c==0) {
				JOptionPane.showMessageDialog(null, "vo so nghiem", "result",JOptionPane.INFORMATION_MESSAGE);
			}else if(b==0 && c!=0) {
				JOptionPane.showMessageDialog(null, "vo nghiem","result",JOptionPane.INFORMATION_MESSAGE);
			}else {
				double x=-c/b;
				String result="x="+x;
				JOptionPane.showMessageDialog(null, result,"result",JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			double detal=b*b-4*a*c;
			if(detal<0) {
				JOptionPane.showMessageDialog(null, "vo nghiem", "result",JOptionPane.INFORMATION_MESSAGE);
			}else if(detal==0) {
				double x=-b/a;
				String result="phuong trinh co nghiem kep x="+x;
				JOptionPane.showMessageDialog(null, result, "result",JOptionPane.INFORMATION_MESSAGE);
			}else {
				double x1=(-b-Math.sqrt(detal))/(2*a);
				double x2=(-b+Math.sqrt(detal))/(2*a);
				String result="x1="+x1+",x2="+x2;
				JOptionPane.showMessageDialog(null, result, "result",JOptionPane.INFORMATION_MESSAGE);
			}
		
		}
		
	}

}
