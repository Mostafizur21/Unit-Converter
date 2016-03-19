import javax.swing.JPanel;


public class EnergyConversion extends JPanel
{
	ComboBox combobox;
	
	public EnergyConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_energy()
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
		
		
		else if(combobox.cmb_2_command.equals("British Thermal Unit") && combobox.cmb_3_command.equals("Calorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*251.9957963122194));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit") && combobox.cmb_3_command.equals("Eloctron-Volts"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.585142025517001e+21));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit") && combobox.cmb_3_command.equals("Foot-Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*778.1693709678747));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit") && combobox.cmb_3_command.equals("Joule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1055.056));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit") && combobox.cmb_3_command.equals("Kilocalorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.2519957963122194));
			}
		}

		else if(combobox.cmb_2_command.equals("British Thermal Unit") && combobox.cmb_3_command.equals("Kilojoule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.055056));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Calorie") && combobox.cmb_3_command.equals("British Thermal Unit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.003968320164996));
			}
		}

		else if(combobox.cmb_2_command.equals("Calorie") && combobox.cmb_3_command.equals("Eloctron-Volts"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.61319518892216e+19));
			}
		}

		else if(combobox.cmb_2_command.equals("Calorie") && combobox.cmb_3_command.equals("Foot-Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.088025206594056));
			}
		}

		else if(combobox.cmb_2_command.equals("Calorie") && combobox.cmb_3_command.equals("Joule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4.1868));
			}
		}

		else if(combobox.cmb_2_command.equals("Calorie") && combobox.cmb_3_command.equals("Kilocalorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Calorie") && combobox.cmb_3_command.equals("Kilojoule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0041868));
			}
		}

		else if(combobox.cmb_2_command.equals("Eloctron-Volts") && combobox.cmb_3_command.equals("British Thermal Unit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.518570132770204e-22));
			}
		}

		else if(combobox.cmb_2_command.equals("Eloctron-Volts") && combobox.cmb_3_command.equals("Calorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.826732898633801e-20));
			}
		}

		else if(combobox.cmb_2_command.equals("Eloctron-Volts") && combobox.cmb_3_command.equals("Foot-Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.181704764988391e-19));
			}
		}

		else if(combobox.cmb_2_command.equals("Eloctron-Volts") && combobox.cmb_3_command.equals("Joule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.60217653e-19));
			}
		}

		else if(combobox.cmb_2_command.equals("Eloctron-Volts") && combobox.cmb_3_command.equals("Kilocalorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.826732898633801e-23));
			}
		}

		else if(combobox.cmb_2_command.equals("Eloctron-Volts") && combobox.cmb_3_command.equals("Kilojoule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.60217653e-22));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Foot-Pound") && combobox.cmb_3_command.equals("British Thermal Unit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0012850672839464));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound") && combobox.cmb_3_command.equals("Calorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.3238315535328652));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound") && combobox.cmb_3_command.equals("Eloctron-Volts"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*8.462350577132721e+18));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound") && combobox.cmb_3_command.equals("Joule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.3558179483314));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound") && combobox.cmb_3_command.equals("Kilocalorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.238315535328652e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Foot-Pound") && combobox.cmb_3_command.equals("Kilojoule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0013558179483314));
			}
		}

		else if(combobox.cmb_2_command.equals("Joule") && combobox.cmb_3_command.equals("British Thermal Unit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.478169879134378e-4));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Joule") && combobox.cmb_3_command.equals("Calorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.2388458966274959));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Joule") && combobox.cmb_3_command.equals("Eloctron-Volts"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.241509479607718e+18));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Joule") && combobox.cmb_3_command.equals("Foot-Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.7375621492772656));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Joule") && combobox.cmb_3_command.equals("Kilocalorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.388458966274959e-4));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Joule") && combobox.cmb_3_command.equals("Kilojoule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Kilocalorie") && combobox.cmb_3_command.equals("British Thermal Unit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.968320164995981));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilocalorie") && combobox.cmb_3_command.equals("Calorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilocalorie") && combobox.cmb_3_command.equals("Eloctron-Volts"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.61319518892216e+22));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilocalorie") && combobox.cmb_3_command.equals("Foot-Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3088.025206594056));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilocalorie") && combobox.cmb_3_command.equals("Joule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4186.8));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilocalorie") && combobox.cmb_3_command.equals("Kilojoule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4.1868));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilojoule") && combobox.cmb_3_command.equals("British Thermal Unit"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.9478169879134378));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilojoule") && combobox.cmb_3_command.equals("Calorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*238.8458966274959));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilojoule") && combobox.cmb_3_command.equals("Eloctron-Volts"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.241509479607718e+21));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilojoule") && combobox.cmb_3_command.equals("Foot-Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*737.5621492772656));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilojoule") && combobox.cmb_3_command.equals("Joule"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilojoule") && combobox.cmb_3_command.equals("Kilocalorie"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.2388458966274959));
			}
		}
	}
}
