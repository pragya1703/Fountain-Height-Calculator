import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;


import javax.swing.*;

public class Last_frame {
public static JFrame frame1;
public static JLabel label;
public static  JComboBox comboBox;
public static String i;
public int a;
public int b;
public int c;

public  void NewScreen2()
{
	frame1=new JFrame();
	frame1.setBounds(330,130,650, 500);
	frame1.getContentPane().setForeground(new Color(135, 206, 250));
	frame1.getContentPane().setBackground(new Color(135, 206, 235));
	frame1.setContentPane(new JLabel(new ImageIcon("C:\\Users\\home\\Desktop\\east1\\Slide1.png")));
	frame1.setLayout(null);
	//label=new JLabel();
	
	//String[] list={"Small(100x100)","Medium(250x250)","Large(500x500)"};
	//box=new JComboBox(list);
	//label.setText("Welcome To Water Fountain Height Calculator");
//	frame.getContentPane().add(label,BorderLayout.NORTH);
	//frame.getContentPane().add(box,BorderLayout.CENTER);
	
	
	
	
	JLabel lblNewLabel_1 = new JLabel("New label");
	lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
	lblNewLabel_1.setText("Thankyou for using Height Calculator");
	lblNewLabel_1.setBounds(31, 30, 700, 29);
	frame1.add(lblNewLabel_1);
	JLabel lblNewLabel_3 = new JLabel("Adjusted water volume rate flow ="+a);
	lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 16));
	lblNewLabel_3.setBounds(10, 186, 645, 64);
	frame1.add(lblNewLabel_3);
	JLabel lblNewLabel_4 = new JLabel("Adjusted diameter of pipe nozzle ="+b);
	lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 16));
	lblNewLabel_4.setBounds(10, 203, 645, 64);
	frame1.add(lblNewLabel_4);

	
	JLabel lblNewLabel_2 = new JLabel("Heigt of the Fountain is ="+c);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
	//lblNewLabel_2.setText("Enter the Area");
	lblNewLabel_2.setBounds(31, 106, 333, 20);
    frame1.add(lblNewLabel_2);
	frame1.setVisible(true);
	
                                   
	
 
			
			
		
	
	

}
}

