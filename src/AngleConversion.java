import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AngleConversion extends JPanel
{
	ComboBox combobox;
	Double data;
	
	public AngleConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_angle()
	{
		if(combobox.input.getText().equals(""))
		{
			combobox.output.setText("");
			return;
		}
		
		if(combobox.input.getText().equals("."))
		{
			combobox.output.setText("0.0");
			return;
		}
		
		if(combobox.input.getText().equals("-"))
		{
			combobox.output.setText("0");
			return;
		}
		
		if(combobox.cmb_2_command.equals(combobox.cmb_3_command))
		{
			 if(!combobox.input.getText().equals("Enter value")) 
			{
				 data = Double.parseDouble(combobox.input.getText());
				 combobox.output.setText("" + (data));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Degree") && combobox.cmb_3_command.equals("Gradian"))	
		{
			 if(!combobox.input.getText().equals("Enter value")) 
			{
				 combobox.output.setText("" + (combobox.input_data*1.11111111 ));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Degree") && combobox.cmb_3_command.equals("Radian"))	
		{
			 if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0174532925));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Radian") && combobox.cmb_3_command.equals("Degree"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*57.2957795));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Radian") && combobox.cmb_3_command.equals("Gradian"))	
		{
			 if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*63.6638548));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Gradian") && combobox.cmb_3_command.equals("Radian"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*.0157075));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Gradian") && combobox.cmb_3_command.equals("Degree"))	
		{
			 if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*.9));
			}
		}
	}
}
