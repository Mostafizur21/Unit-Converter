import javax.swing.JPanel;


public class PressureConversion extends JPanel
{
	ComboBox combobox;
	
	public PressureConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_pressure()
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
		
		
		else if(combobox.cmb_2_command.equals("Atmosphere") && combobox.cmb_3_command.equals("Bar"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.01325));
			}
		}

		else if(combobox.cmb_2_command.equals("Atmosphere") && combobox.cmb_3_command.equals("Kilo Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*101.325));
			}
		}

		else if(combobox.cmb_2_command.equals("Atmosphere") && combobox.cmb_3_command.equals("Millimetre of mercury"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*760.1275318829707));
			}
		}

		else if(combobox.cmb_2_command.equals("Atmosphere") && combobox.cmb_3_command.equals("Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*101325));
			}
		}

		else if(combobox.cmb_2_command.equals("Atmosphere") && combobox.cmb_3_command.equals("Pound per square inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*14.69594940039221));
			}
		}

		else if(combobox.cmb_2_command.equals("Bar") && combobox.cmb_3_command.equals("Atmosphere"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.9869232667160128));
			}
		}

		else if(combobox.cmb_2_command.equals("Bar") && combobox.cmb_3_command.equals("Kilo Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Bar") && combobox.cmb_3_command.equals("Millimetre of mercury"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*750.1875468867217));
			}
		}

		else if(combobox.cmb_2_command.equals("Bar") && combobox.cmb_3_command.equals("Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100000));
			}
		}

		else if(combobox.cmb_2_command.equals("Bar") && combobox.cmb_3_command.equals("Pound per square inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*14.50377438972831));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilo Pascal") && combobox.cmb_3_command.equals("Atmosphere"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0098692326671601));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilo Pascal") && combobox.cmb_3_command.equals("Bar"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilo Pascal") && combobox.cmb_3_command.equals("Pound per square inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1450377438972831));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilo Pascal") && combobox.cmb_3_command.equals("Millimetre of mercury"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*7.501875468867217));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilo Pascal") && combobox.cmb_3_command.equals("Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetre of mercury") && combobox.cmb_3_command.equals("Atmosphere"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0013155687145324));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetre of mercury") && combobox.cmb_3_command.equals("Bar"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001333));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetre of mercury") && combobox.cmb_3_command.equals("Kilo Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1333));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetre of mercury") && combobox.cmb_3_command.equals("Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*133.3));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetre of mercury") && combobox.cmb_3_command.equals("Pound per square inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0193335312615078));
			}
		}

		else if(combobox.cmb_2_command.equals("Pascal") && combobox.cmb_3_command.equals("Atmosphere"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.869232667160128e-6));
			}
		}

		else if(combobox.cmb_2_command.equals("Pascal") && combobox.cmb_3_command.equals("Bar"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.00001));
			}
		}

		else if(combobox.cmb_2_command.equals("Pascal") && combobox.cmb_3_command.equals("Kilo Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Pascal") && combobox.cmb_3_command.equals("Millimetre of mercury"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0075018754688672));
			}
		}

		else if(combobox.cmb_2_command.equals("Pascal") && combobox.cmb_3_command.equals("Pound per square inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.450377438972831e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound per square inch") && combobox.cmb_3_command.equals("Atmosphere"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.068045961016531));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound per square inch") && combobox.cmb_3_command.equals("Bar"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.06894757));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound per square inch") && combobox.cmb_3_command.equals("Kilo Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.894757));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound per square inch") && combobox.cmb_3_command.equals("Millimetre of mercury"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*51.72360840210053));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound per square inch") && combobox.cmb_3_command.equals("Pascal"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6894.757));
			}
		}
	}
}
