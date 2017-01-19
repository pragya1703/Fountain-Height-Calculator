
public class EquationOfContinuity extends new_draw_rect2
{
	public void eqcontinuity(String args[])
	{
		x2 = slider_1.getValue();
        textField_1.setText("Diameter of pipe nozzle  "+x2);
        y2 = slider.getValue();
        textField.setText("Water volume flow rate  "+y2);
        Bernoulli b=new Bernoulli();
        b.bernoulli(x2,y2);
	}

}
