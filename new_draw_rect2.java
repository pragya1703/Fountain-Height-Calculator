

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class new_draw_rect2 extends JPanel {
	public static int x2;
	public static int y2;
	public static double x3;
	public static int x4;	

	public static int x5;	
public static int x;
public static int y;
public static int z;
 public static JTextField textField;
public static JTextField textField_1;
public static JTextField textField_2;
 public static JTextField textField_3;
 public static JSlider slider;
 public static JSlider slider_1;

public static JPanel Fountain_comp;
public static JPanel Volume_rate;
public static JPanel Diameter;
public static JFrame frame;
public static JPanel End;



  

  public static void NewScreen() {
	    new_draw_rect2 rects2 = new new_draw_rect2();
		
       frame = new JFrame("Water Fountain For Large Area ");
       frame.setBounds(10,10,650,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\home\\Desktop\\east1\\Slide1.png")));    
        Fountain_comp = new JPanel();
	    Fountain_comp.setBounds(10, 11, 353, 47);
	    Fountain_comp.setLayout(new BorderLayout());

	    textField = new JTextField();
		textField.setBounds(30, 16, 86, 20);
		textField.setFont(new Font("Monospaced", Font.BOLD, 16));
		  textField.setBackground(new Color(173, 216, 230));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 16, 86, 20);
		textField_1.setFont(new Font("Monospaced", Font.BOLD, 16));
		  textField_1.setBackground(new Color(173, 216, 230));
	    textField_1.setColumns(10);
	    
	    /*textField_3 = new JTextField();
		textField_3.setBounds(407, 16, 86, 20);
	    textField_3.setColumns(10);
	    textField_3.setFont(new Font("Times New Roman", Font.BOLD, 15));

	    textField_3.setText("Height Calculator");
		frame.add(textField_3);*/
	    frame.add(Fountain_comp,BorderLayout.NORTH);
		Fountain_comp.add(textField,BorderLayout.NORTH);
		Fountain_comp.add(textField_1,BorderLayout.SOUTH);
		
		
		Volume_rate = new JPanel();
		Volume_rate.setBounds(373, 11, 120, 239);
		Volume_rate.setLayout(new BorderLayout());
		JSlider slider = new JSlider();
		
		slider.setMinimum(1200);
		slider.setMaximum(1800);
		slider.setOrientation(SwingConstants.VERTICAL);
	    frame.add(Volume_rate,BorderLayout.EAST);
		Volume_rate.add(slider,BorderLayout.EAST);
    		
			
		Diameter = new JPanel();
		Diameter.setBounds(10, 194, 353, 180);
	    Diameter.setLayout(new BorderLayout());
	    	JTextField textField_2=new JTextField();
	    	JSlider slider_1 = new JSlider();
	    	slider_1.setBounds(10, 202, 414, 48);
	    	textField_2.setFont(new Font("Monospaced", Font.BOLD, 16));
			  textField_2.setBackground(new Color(173, 216, 230));
			slider_1.setMinimum(1);
			slider_1.setMaximum(5);
			slider_1.setOrientation(SwingConstants.HORIZONTAL);
			End = new JPanel();
			End.setBounds(10, 28, 76, 222);
			frame.add(End,BorderLayout.WEST);
			End.setLayout(new BorderLayout(0, 0));
			
			JButton Finish = new JButton("Finish");
			End.add(Finish, BorderLayout.SOUTH);
		     Finish.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            
		            {
		           
		            	   Last_frame last= new Last_frame();
		            	   last.a=x2;
		            	   last.b=y2;
		            	   last.c=x4;
		            	   frame.dispose();
		            	   
		         			last.NewScreen2();

		                 	

		               }
		        }

		        });
		     JButton Back = new JButton("Back");
				End.add(Back, BorderLayout.NORTH);
			     Back.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			            
			            {
			           
			      
			            	 
			           firstFrame fre1=new firstFrame();	   
			           fre1.frame1.setVisible(true);
			         	frame.setVisible(false);

			         	 

			               }
			        }

			        });
		     



		textField_2.setBounds(52, 0, 86, 70);
		slider_1.setMinimum(1);
		slider_1.setMaximum(5);
		textField_2.setColumns(10);
		frame.add(Diameter,BorderLayout.SOUTH);
		Diameter.add(textField_2,BorderLayout.NORTH);
		Diameter.add(slider_1,BorderLayout.SOUTH);
		slider_1.addChangeListener( new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				x2 = slider_1.getValue();
		        textField_1.setText("Diameter of pipe nozzle  "+x2);
		        x3=(y2*y2)/((3.14*x2*x2)*(3.14*x2*x2)*(20));
		          //x3=989.99;
			    x4=(int)x3;
				textField_2.setText("height of fountain  "+x4);
				frame.repaint();
				//slider_1.addChangeListener(this);
			}
			
			
		});
	
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				y2 = slider.getValue();
		          textField.setText("Water volume flow rate  "+y2);
		          x3=(y2*y2)/((3.14*x2*x2)*(3.14*x2*x2)*(20));
		          //x3=989.99;
				    x4=(int)x3;
				    textField_2.setText(""+x4);
				    frame.repaint();
				  //  slider.addChangeListener(this);

			}
		});
	
		
	

		frame.add(rects2);
        

	  
	  frame.setSize(650,500);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);

  }
  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);
     // Graphics2D g2d = (Graphics2D) g;
  	//x2 = slider_1.getValue();
     // x5=Integer.parseInt(textField_2.getText());
     // g.setColor(new Color(212, 212, 212));
      //g.drawRect(150, 195, 90, 100);
     // dodraw(g, x4);
      g.setColor(Color.BLUE);
      g.fillRect(150, 20, 90,x4 );
     

      //g.setColor(new Color(31, 21, 1));
      //g.fillRect(250, 195, 90, 60);

    } // public void dodraw(Graphics g,int x4)
 // {
  	
 // }	repaint();
}
