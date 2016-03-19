import javax.swing.JPanel;


public class TimeConversion extends JPanel
{
	ComboBox combobox;
	
	public TimeConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_time()
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
		
		
		else if(combobox.cmb_2_command.equals("Day") && combobox.cmb_3_command.equals("Hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*24));
			}
		}

		else if(combobox.cmb_2_command.equals("Day") && combobox.cmb_3_command.equals("Microsecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*864000000*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Day") && combobox.cmb_3_command.equals("Millisecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*86400000));
			}
		}

		else if(combobox.cmb_2_command.equals("Day") && combobox.cmb_3_command.equals("Minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1440));
			}
		}

		else if(combobox.cmb_2_command.equals("Day") && combobox.cmb_3_command.equals("Second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*86400));
			}
		}

		else if(combobox.cmb_2_command.equals("Day") && combobox.cmb_3_command.equals("Week"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1428571428571429));
			}
		}

		else if(combobox.cmb_2_command.equals("Hour") && combobox.cmb_3_command.equals("Day"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0416666666666667));
			}
		}

		else if(combobox.cmb_2_command.equals("Hour") && combobox.cmb_3_command.equals("Microsecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*360000000*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Hour") && combobox.cmb_3_command.equals("Millisecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3600000));
			}
		}

		else if(combobox.cmb_2_command.equals("Hour") && combobox.cmb_3_command.equals("Minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*60));
			}
		}

		else if(combobox.cmb_2_command.equals("Hour") && combobox.cmb_3_command.equals("Second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3600));
			}
		}

		else if(combobox.cmb_2_command.equals("Hour") && combobox.cmb_3_command.equals("Week"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.005952380952381));
			}
		}

		else if(combobox.cmb_2_command.equals("Microsecond") && combobox.cmb_3_command.equals("Day"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.157407407407407e-11));
			}
		}

		else if(combobox.cmb_2_command.equals("Microsecond") && combobox.cmb_3_command.equals("Hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.777777777777778e-10));
			}
		}

		else if(combobox.cmb_2_command.equals("Microsecond") && combobox.cmb_3_command.equals("Millisecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Microsecond") && combobox.cmb_3_command.equals("Minute"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.666666666666667e-8));
			}
		}

		else if(combobox.cmb_2_command.equals("Microsecond") && combobox.cmb_3_command.equals("Second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Microsecond") && combobox.cmb_3_command.equals("Week"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.653439153439153e-12));
			}
		}

		else if(combobox.cmb_2_command.equals("Millisecond") && combobox.cmb_3_command.equals("Day"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.157407407407407e-8));
			}
		}

		else if(combobox.cmb_2_command.equals("Millisecond") && combobox.cmb_3_command.equals("Hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.777777777777778e-7));
			}
		}

		else if(combobox.cmb_2_command.equals("Millisecond") && combobox.cmb_3_command.equals("Microsecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Millisecond") && combobox.cmb_3_command.equals("Mintue"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.666666666666667e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Millisecond") && combobox.cmb_3_command.equals("Second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Millisecond") && combobox.cmb_3_command.equals("Week"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.653439153439153e-9));
			}
		}

		else if(combobox.cmb_2_command.equals("Mintue") && combobox.cmb_3_command.equals("Day"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.944444444444444e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Mintue") && combobox.cmb_3_command.equals("Hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0166666666666667));
			}
		}

		else if(combobox.cmb_2_command.equals("Mintue") && combobox.cmb_3_command.equals("Microsecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*60000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Mintue") && combobox.cmb_3_command.equals("Millisecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*60000));
			}
		}

		else if(combobox.cmb_2_command.equals("Mintue") && combobox.cmb_3_command.equals("Second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*60));
			}
		}

		else if(combobox.cmb_2_command.equals("Mintue") && combobox.cmb_3_command.equals("Week"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.920634920634921e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Second") && combobox.cmb_3_command.equals("Day"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.157407407407407e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Second") && combobox.cmb_3_command.equals("Hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.777777777777778e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Second") && combobox.cmb_3_command.equals("Microsecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Second") && combobox.cmb_3_command.equals("Millisecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Second") && combobox.cmb_3_command.equals("Mintue"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0166666666666667));
			}
		}

		else if(combobox.cmb_2_command.equals("Second") && combobox.cmb_3_command.equals("Week"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.653439153439153e-6));
			}
		}

		else if(combobox.cmb_2_command.equals("Week") && combobox.cmb_3_command.equals("Day"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*7));
			}
		}

		else if(combobox.cmb_2_command.equals("Week") && combobox.cmb_3_command.equals("Hour"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*168));
			}
		}

		else if(combobox.cmb_2_command.equals("Week") && combobox.cmb_3_command.equals("Microsecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*604800000*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Week") && combobox.cmb_3_command.equals("Millisecond"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*604800000));
			}
		}

		else if(combobox.cmb_2_command.equals("Week") && combobox.cmb_3_command.equals("Mintue"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10080));
			}
		}

		else if(combobox.cmb_2_command.equals("Week") && combobox.cmb_3_command.equals("Second"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*604800));
			}
		}
	}
}
