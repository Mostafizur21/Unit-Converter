import javax.swing.JPanel;


public class PowerConversion extends JPanel
{
	ComboBox combobox;
	
	public PowerConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_power()
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
		
		
		else if(combobox.cmb_2_command.equals("British Thermal Unit/minute") && combobox.cmb_3_command.equals("Foot-Pound/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*778.1693709678747));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit/minute") && combobox.cmb_3_command.equals("Horsepower"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0235808900293295));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit/minute") && combobox.cmb_3_command.equals("Kilowatt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0175842666666667));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit/minute") && combobox.cmb_3_command.equals("Watt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*17.58426666666667));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound/minute") && combobox.cmb_3_command.equals("British Thermal Unit/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0012850672839464));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound/minute") && combobox.cmb_3_command.equals("Horsepower"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.030303030303029e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound/minute") && combobox.cmb_3_command.equals("Kilowatt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.259696580552333e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound/minute") && combobox.cmb_3_command.equals("Watt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0225969658055233));
			}
		}

		else if(combobox.cmb_2_command.equals("Horsepower") && combobox.cmb_3_command.equals("British Thermal Unit/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*42.40722037023268));
			}
		}

		else if(combobox.cmb_2_command.equals("Horsepower") && combobox.cmb_3_command.equals("Foot-Pound/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*33000.00000000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Horsepower") && combobox.cmb_3_command.equals("Kilowatt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.7456998715822702));
			}
		}

		else if(combobox.cmb_2_command.equals("Horsepower") && combobox.cmb_3_command.equals("Watt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*745.6998715822702));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilowatt") && combobox.cmb_3_command.equals("British Thermal Unit/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*56.86901927480627));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilowatt") && combobox.cmb_3_command.equals("Foot-Pound/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*44253.72895663593));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilowatt") && combobox.cmb_3_command.equals("Horsepower"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.341022089595028));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilowatt") && combobox.cmb_3_command.equals("Watt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Watt") && combobox.cmb_3_command.equals("British Thermal Unit/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0568690192748063));
			}
		}

		else if(combobox.cmb_2_command.equals("Watt") && combobox.cmb_3_command.equals("Foot-Pound/minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*44.25372895663593));
			}
		}

		else if(combobox.cmb_2_command.equals("Watt") && combobox.cmb_3_command.equals("Horsepower"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001341022089595));
			}
		}

		else if(combobox.cmb_2_command.equals("Watt") && combobox.cmb_3_command.equals("Kilowatt"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}
	}
}
