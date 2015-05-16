import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Count extends JFrame{
	JButton jbtCnt = new JButton("計算");
	JButton jbtCle = new JButton("清除");
	JTextField cirrad = new JTextField("");
	JTextField tritall = new JTextField("");
	JTextField triend = new JTextField("");
	JTextField reclong = new JTextField("");
	JTextField recwid = new JTextField("");
	JTextField TrianglePrint1 = new JTextField("");
	JTextField TrianglePrint2 = new JTextField("");
	JTextField RectanglePrint1 = new JTextField("");
	JTextField RectanglePrint2 = new JTextField("");
	JTextField CirclePrint1 = new JTextField("");
	JTextField CirclePrint2 = new JTextField("");
	JLabel Circle1 = new JLabel("Circle Radius : ");
	JLabel Triangle1 = new JLabel("Triangle Tall : ");
	JLabel Triangle2 = new JLabel("Triangle End : ");
	JLabel Rectangle1 = new JLabel("Rectangle Long : ");
	JLabel Rectangle2 = new JLabel("Rectangle Width : ");
	JLabel Triangle = new JLabel("Triangle : ");
	JLabel Rectangle = new JLabel("Rectangle : ");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	
	int Radius;
	int TriangleTall;
	int TriangleEnd;
	int RectangleLong;
	int RectangleWidth;
	double TriPar;
	
	Count(){
		this.setLayout(new GridLayout(10,1));
		panel.setLayout(new GridLayout(1,2));
		panel.add(Circle1);
		panel.add(cirrad);
		this.add(panel);
		panel1.setLayout(new GridLayout(2,2)); 
		panel1.add(Triangle1);
		panel1.add(tritall);
		panel1.add(Triangle2);
		panel1.add(triend);
		this.add(panel1);
		panel2.setLayout(new GridLayout(2,2));
		panel2.add(Rectangle1);
		panel2.add(reclong);
		panel2.add(Rectangle2);
		panel2.add(recwid);
		this.add(panel2);
		panel3.setLayout(new GridLayout(1,2));
		panel3.add(jbtCnt);
		panel3.add(jbtCle);
		this.add(panel3);
		this.add(new JLabel("Circle : "));
		panel5.setLayout(new GridLayout(2,2));
		panel5.add(new JLabel("The area is : "));
		panel5.add(CirclePrint1);
		panel5.add(new JLabel("The perimeter is : "));
		panel5.add(CirclePrint2);
		this.add(panel5);
		this.add(new JLabel("Triangle : "));
		panel7.setLayout(new GridLayout(2,2));
		panel7.add(new JLabel("The area is : "));
		panel7.add(TrianglePrint1);
		panel7.add(new JLabel("The perimeter is : "));
		panel7.add(TrianglePrint2);
		this.add(panel7);
		this.add(new JLabel("Rectangle : "));
		panel6.setLayout(new GridLayout(2,2));
		panel6.add(new JLabel("The area is : "));
		panel6.add(RectanglePrint1);
		panel6.add(new JLabel("The perimeter is : "));
		panel6.add(RectanglePrint2);
		this.add(panel6);
		
		jbtCnt.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {
				Radius = Integer.parseInt(cirrad.getText());
				TriangleTall = Integer.parseInt(tritall.getText());
				TriangleEnd = Integer.parseInt(triend.getText());
				RectangleLong = Integer.parseInt(reclong.getText());
				RectangleWidth = Integer.parseInt(recwid.getText());
				CirclePrint1.setText((Radius * Radius * 3.14) + "");
				CirclePrint2.setText((2 * Radius * 3.14) + "");
				RectanglePrint1.setText((RectangleLong * RectangleWidth) + "");
				RectanglePrint2.setText(((RectangleLong + RectangleWidth) * 2) + "");
				TrianglePrint1.setText((TriangleTall * TriangleEnd / 2) + "");
				TriPar = Math.sqrt(TriangleTall * TriangleTall + TriangleEnd * TriangleEnd) + TriangleTall + TriangleEnd;
				TrianglePrint2.setText(TriPar + "");
				
			}
		}
		);
		
		jbtCle.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {
				cirrad.setText("");
				tritall.setText("");
				triend.setText("");
				reclong.setText("");
				recwid.setText("");
				CirclePrint1.setText("");
				CirclePrint2.setText("");
				RectanglePrint1.setText("");
				RectanglePrint2.setText("");
				TrianglePrint1.setText("");
				TrianglePrint2.setText("");
			}
		}
		);
	}
	
	public static void main(String[] args) {
		JFrame frame = new Count();
		frame.setTitle("U10316009_GeoCalculate");
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
