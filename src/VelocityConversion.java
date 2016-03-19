import javax.swing.JPanel;


public class VelocityConversion extends JPanel
{
	ComboBox combobox;
	
	public VelocityConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_velocity()
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
		
		
		else if(combobox.cmb_2_command.equals("Centimetres per second") && combobox.cmb_3_command.equals("Feet per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0328083989501312));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimetres per second") && combobox.cmb_3_command.equals("Kilometres per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.036));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimetres per second") && combobox.cmb_3_command.equals("Metres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimetres per second") && combobox.cmb_3_command.equals("Miles per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.022369362920544));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet per second") && combobox.cmb_3_command.equals("Centimetres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*30.48));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet per second") && combobox.cmb_3_command.equals("Kilometres per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.09728));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet per second") && combobox.cmb_3_command.equals("Metres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.3048));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet per second") && combobox.cmb_3_command.equals("Miles per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.6818181818181818));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres per hour") && combobox.cmb_3_command.equals("Centimetres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*27.77777777777778));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres per hour") && combobox.cmb_3_command.equals("Feet per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.9113444152814232));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres per hour") && combobox.cmb_3_command.equals("Metres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.2777777777777778));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres per hour") && combobox.cmb_3_command.equals("Miles per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.621371192237334));
			}
		}

		else if(combobox.cmb_2_command.equals("Metres per second") && combobox.cmb_3_command.equals("Centimetres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Metres per second") && combobox.cmb_3_command.equals("Feet per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.280839895013123));
			}
		}

		else if(combobox.cmb_2_command.equals("Metres per second") && combobox.cmb_3_command.equals("Kilometres per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.6));
			}
		}

		else if(combobox.cmb_2_command.equals("Metres per second") && combobox.cmb_3_command.equals("Miles per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.236936292054402));
			}
		}

		else if(combobox.cmb_2_command.equals("Miles per hour") && combobox.cmb_3_command.equals("Centimetres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*44.704));
			}
		}

		else if(combobox.cmb_2_command.equals("Miles per hour") && combobox.cmb_3_command.equals("Feet per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.466666666666667));
			}
		}

		else if(combobox.cmb_2_command.equals("Miles per hour") && combobox.cmb_3_command.equals("Kilometres per hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.609344));
			}
		}

		else if(combobox.cmb_2_command.equals("Miles per hour") && combobox.cmb_3_command.equals("Metres per second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.44704));
			}
		}
	}
}
