import javax.swing.JPanel;


public class LengthConversion extends JPanel
{
	ComboBox combobox;
	
	public LengthConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_length()
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
		
		
		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0328083989501312));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.3937007874015748));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.00001));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.21371192237334e-6));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Centimtres") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0109361329833771));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*30.48));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*12));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0003048));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.3048));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.893939393939394e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*304.8));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*304800000));
			}
		}

		else if(combobox.cmb_2_command.equals("Feet") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.3333333333333333));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.54));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0833333333333333));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0000254));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0254));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.578282828282828e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*25.4));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*25400000));
			}
		}

		else if(combobox.cmb_2_command.equals("Inch") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0277777777777778));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3280.839895013123));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*39370.07874015748));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.621371192237334));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000000000*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilometres") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1093.613298337708));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.280839895013123));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*39.37007874015748));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.21371192237334e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Metre") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.093613298337708));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*160934.4));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*5280));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*63360));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.609344));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1609.344));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1609344));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*160934400*10000));
			}
		}

		else if(combobox.cmb_2_command.equals("Mile") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1760));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0032808398950131));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0393700787401575));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.21371192237334e-7));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Millimetres") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0010936132983377));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.280839895013123e-9));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.937007874015748e-8));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000000000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.21371192237334e-13));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Nanometre") && combobox.cmb_3_command.equals("Yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.093613298337708e-9));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Centimtres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*91.44));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Feet"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*36));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Kilometres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0009144));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.9144));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Mile"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*5.681818181818182e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Millimetres"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*914.4));
			}
		}

		else if(combobox.cmb_2_command.equals("Yard") && combobox.cmb_3_command.equals("Nanometre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*914400000));
			}
		}
	}
}
