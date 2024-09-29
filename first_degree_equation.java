
import javax.swing.JOptionPane;
	public class first_degree_equation {
		public static void main(String[] agrs) {
			String strNum1,strNum2;
			String strNotification = "Nghiem cua phuong trinh la: ";
			strNum1 = JOptionPane.showInputDialog(null,"He so cua x: ","In put the fist number",JOptionPane.INFORMATION_MESSAGE);
			strNum2=JOptionPane.showInputDialog(null,"He so tu do:"," In put the second number",JOptionPane.INFORMATION_MESSAGE);
			double Num1=Double.parseDouble(strNum1);
			double Num2=Double.parseDouble(strNum2);
			if (Num1 == 0 ) {
				if (Num2 == 0) {
				JOptionPane.showMessageDialog(null,"Phuong trinh co vo so nghiem",null,JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem" ,null,JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			};
			};
			double x = -Num2/Num1;
			strNotification+=x;
			JOptionPane.showMessageDialog(null,strNotification ,null,JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}


}
	
