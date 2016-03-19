import javax.swing.JPanel;


public class TemperatureConversion extends JPanel
{
	ComboBox combobox;
	
	public TemperatureConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_temperature()
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
				combobox.output.setText("" + (combobox.input_data));
			}
		}
		
		
		else if(combobox.cmb_2_command.equals("Degrees Celsius") && combobox.cmb_3_command.equals("Degrees Fahrenheit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data*9)+160)/5);
			}
		}
		
		else if(combobox.cmb_2_command.equals("Degrees Celsius") && combobox.cmb_3_command.equals("Kelvin"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data+273.15));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Degrees Fahrenheit") && combobox.cmb_3_command.equals("Kelvin"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (((combobox.input_data-32)/1.8)+273.15));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Degrees Fahrenheit") && combobox.cmb_3_command.equals("Degrees Celsius"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data-32)/1.8);
			}
		}
		
		else if(combobox.cmb_2_command.equals("Kelvin") && combobox.cmb_3_command.equals("Degrees Fahrenheit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (((combobox.input_data-273.15)*1.8)+32));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Kelvin") && combobox.cmb_3_command.equals("Degrees Celsius"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data-273.15));
			}
		}
	}
}
