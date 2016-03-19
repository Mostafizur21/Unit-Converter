import javax.swing.JPanel;


public class VolumeConversion extends JPanel
{
	ComboBox combobox;
	
	public VolumeConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_volume()
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
		
		
		else if(combobox.cmb_2_command.equals("Cubic centimetre") && combobox.cmb_3_command.equals("Cubic foot"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.531466672148859e-5));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Cubic centimetre") && combobox.cmb_3_command.equals("Cubic inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0610237440947323));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Cubic centimetre") && combobox.cmb_3_command.equals("Cubic metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000001));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Cubic centimetre") && combobox.cmb_3_command.equals("Cubic yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.307950619314392e-6));
			}
		}
		
		else if(combobox.cmb_2_command.equals("Cubic centimetre") && combobox.cmb_3_command.equals("Litre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic foot") && combobox.cmb_3_command.equals("Cubic centimetre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*28316.846592));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic foot") && combobox.cmb_3_command.equals("Cubic inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1728));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic foot") && combobox.cmb_3_command.equals("Cubic metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.028316846592));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic foot") && combobox.cmb_3_command.equals("Cubic yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.037037037037037));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic foot") && combobox.cmb_3_command.equals("Litre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*28.316846592));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic inch") && combobox.cmb_3_command.equals("Cubic centimetre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*16.387064));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic inch") && combobox.cmb_3_command.equals("Cubic foot"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*5.787037037037037e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic inch") && combobox.cmb_3_command.equals("Cubic metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000016387064));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic inch") && combobox.cmb_3_command.equals("Cubic yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.143347050754458e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic inch") && combobox.cmb_3_command.equals("Litre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.016387064));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic metre") && combobox.cmb_3_command.equals("Cubic centimetre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic metre") && combobox.cmb_3_command.equals("Cubic foot"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*35.31466672148859));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic metre") && combobox.cmb_3_command.equals("Cubic inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*61023.74409473228));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic metre") && combobox.cmb_3_command.equals("Cubic yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.307950619314392));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic metre") && combobox.cmb_3_command.equals("Litre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic yard") && combobox.cmb_3_command.equals("Cubic centimetre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*764554.857984));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic yard") && combobox.cmb_3_command.equals("Cubic foot"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*27));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic yard") && combobox.cmb_3_command.equals("Cubic inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*46656));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic yard") && combobox.cmb_3_command.equals("Cubic metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.764554857984));
			}
		}

		else if(combobox.cmb_2_command.equals("Cubic yard") && combobox.cmb_3_command.equals("Litre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*764.554857984));
			}
		}

		else if(combobox.cmb_2_command.equals("Litre") && combobox.cmb_3_command.equals("Cubic centimetre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Litre") && combobox.cmb_3_command.equals("Cubic foot"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0353146667214886));
			}
		}

		else if(combobox.cmb_2_command.equals("Litre") && combobox.cmb_3_command.equals("Cubic inch"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*61.02374409473228));
			}
		}

		else if(combobox.cmb_2_command.equals("Litre") && combobox.cmb_3_command.equals("Cubic metre"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Litre") && combobox.cmb_3_command.equals("Cubic yard"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0013079506193144));
			}
		}
	}
}
