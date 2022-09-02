package inclasschapter2;
import javax.swing.JOptionPane;
public class ch2inclass2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ticket=75;
		final int processingfee=20;
		final double salestax=0.07;
		String num;
		num=JOptionPane.showInputDialog(null,"Enter the number of Twins tickets");
		final double tax=75*0.07;
		double total=Double.parseDouble(num)*75+Double.parseDouble(num)*processingfee+tax;
		JOptionPane.showMessageDialog(null, "The total cost of the tickets is $"+total);
	}

}
