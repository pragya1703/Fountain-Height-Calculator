import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bernoulli extends new_draw_rect2{
			public void bernoulli(int x,int y)
			{
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
			

			}
}
