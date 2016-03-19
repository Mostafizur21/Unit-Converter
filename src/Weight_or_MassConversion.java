import javax.swing.JPanel;


public class Weight_or_MassConversion extends JPanel
{
	ComboBox combobox;
	
	public Weight_or_MassConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_weight_or_mass()
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
		
		
		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*20));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.02));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.2));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.002));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0002));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*200));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0070547923899161));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4.409245243697552e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.149460888355394e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.968413055222121e-7));
			}
		}

		else if(combobox.cmb_2_command.equals("Carat") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.204622621848776e-7));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.05));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0001));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.00001));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.527396194958041e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.204622621848776e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.574730444177697e-6));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.842065276110606e-9));
			}
		}

		else if(combobox.cmb_2_command.equals("Centigram") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.102311310924388e-8));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.5));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0001));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.003527396194958));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.204622621848776e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.574730444177697e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.842065276110606e-8));
			}
		}

		else if(combobox.cmb_2_command.equals("Decigram") && combobox.cmb_3_command.equals("Ton(US"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.102311310924388e-7));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*50));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10000));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.3527396194958041));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0220462262184878));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0015747304441777));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.842065276110606e-6));
			}
		}

		else if(combobox.cmb_2_command.equals("Dekagram") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.102311310924388e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*5));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0352739619495804));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0022046226218488));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.574730444177697e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.842065276110606e-7));
			}
		}

		else if(combobox.cmb_2_command.equals("Gram") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.102311310924388e-6));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*500));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10000));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100000));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.527396194958041));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.2204622621848776));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.015747304441777));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.842065276110606e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Hectogram") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.102311310924388e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*5000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*100));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1000000));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*35.27396194958041));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.204622621848776));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1574730444177697));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.842065276110606e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Kilogram") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0011023113109244));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.005));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.1));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.01));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0001));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.001));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.00001));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.000001));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*3.527396194958041e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.204622621848776e-6));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.574730444177697e-7));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9.842065276110606e-10));
			}
		}

		else if(combobox.cmb_2_command.equals("Milligram") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.102311310924388e-9));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*141.747615625));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2834.9523125));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*283.49523125));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.8349523125));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*28.349523125));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.28349523125));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.028349523125));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*28349.523125));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0625));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0044642857142857));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2.790178571428571e-5));
			}
		}

		else if(combobox.cmb_2_command.equals("Ounce") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.00003125));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2267.96185));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*45359.237));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4535.9237));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*45.359237));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*453.59237));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4.5359237));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.45359237));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*453592.37));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*16));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0714285714285714));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4.464285714285714e-4));
			}
		}

		else if(combobox.cmb_2_command.equals("Pound") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.0005));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*31751.4659));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*635029.318));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*63502.9318));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*635.029318));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6350.29318));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*63.5029318));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6.35029318));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*6350293.18));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*224));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*14));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.00625));
			}
		}

		else if(combobox.cmb_2_command.equals("Stone") && combobox.cmb_3_command.equals("Ton(US)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.007));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*5080234.544));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*101604690.88));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10160469.088));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*101604.69088));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1016046.9088));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*10160.469088));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1016.0469088));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1016046908.8));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*35840));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2240));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*160));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(UK)") && combobox.cmb_3_command.equals("Ton(US"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*1.12));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Carat"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*4535923.7));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Centigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*90718474));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Decigram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9071847.4));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Dekagram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*90718.474));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Gram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*907184.74));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Hectogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*9071.8474));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Kilogram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*907.18474));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Milligram"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*907184740));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Ounce"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*32000));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Pound"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*2000));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Stone"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*142.8571428571429));
			}
		}

		else if(combobox.cmb_2_command.equals("Ton(US)") && combobox.cmb_3_command.equals("Ton(UK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + (combobox.input_data*0.8928571428571429));
			}
		}
	}
}
