import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class firstFrame extends JFrame{
public static JFrame frame1;
public static JLabel label;
public static  JComboBox comboBox;
public static String i;
public static void main(String args[])
{
	frame1=new JFrame();
	frame1.setBounds(330,120,650, 500);
	frame1.getContentPane().setForeground(new Color(135, 206, 250));
	frame1.getContentPane().setBackground(new Color(135, 206, 235));
	frame1.setContentPane(new JLabel(new ImageIcon("C:\\Users\\home\\Desktop\\east1\\Slide1.png")));
	frame1.setLayout(null);
	//label=new JLabel();
	
	String[] list={"Small(100x100)","Medium(250x250)","Large(500x500)"};
	//box=new JComboBox(list);
	//label.setText("Welcome To Water Fountain Height Calculator");
//	frame.getContentPane().add(label,BorderLayout.NORTH);
	//frame.getContentPane().add(box,BorderLayout.CENTER);
	
	
	
	comboBox=new JComboBox(list);
	comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
//	String[] list={"Small(100x100)","Medium(250x250)","Large(500x500)"};

	comboBox.setBounds(31, 135, 282, 29);
	frame1.add(comboBox);
	
	JLabel lblNewLabel_1 = new JLabel("New label");
	lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
	lblNewLabel_1.setText("Welcome To Water Fountain Height Calculator");
	lblNewLabel_1.setBounds(31, 30, 700, 29);
	frame1.add(lblNewLabel_1);
	JLabel lblNewLabel_3 = new JLabel("Adjust vertical slider for water volume rate flow and ");
	lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 16));
	lblNewLabel_3.setBounds(10, 186, 645, 64);
	frame1.add(lblNewLabel_3);
	JLabel lblNewLabel_4 = new JLabel("horizontal slider for diameter of pipe nozzle");
	lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 16));
	lblNewLabel_4.setBounds(10, 203, 645, 64);
	frame1.add(lblNewLabel_4);
	JButton b=new JButton("Submit");
	
	b.setBounds(270, 300, 89, 43);
	frame1.add(b);
	
	JLabel lblNewLabel_2 = new JLabel("New label");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_2.setText("Enter the Area");
	lblNewLabel_2.setBounds(31, 106, 333, 14);
    frame1.add(lblNewLabel_2);
	frame1.setVisible(true);
	comboBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			i=comboBox.getSelectedItem().toString() ;
			System.out.println(""+i);
		}
	});
	
	b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
            {
               if(i=="Small(100x100)")
               {
            	   new_draw_rect nex= new new_draw_rect();
                 	frame1.dispose();

         			nex.NewScreen();
               }
               else if(i=="Medium(250x250)")
               {
            	  
            	   new_draw_rect1 nex1= new new_draw_rect1();
                  	frame1.dispose();

          			nex1.NewScreen();
               }
               else 
               {
            	   new_draw_rect2 nex2= new new_draw_rect2();
                 	frame1.dispose();

         			nex2.NewScreen();
               }
        			
                	
                                    
            }
        }

    });
	
 
			
			
		
	
	

}
}
