import javax.swing.JPanel;


public class AreaConversion extends JPanel
{
	ComboBox combobox;
	
	public AreaConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_area()
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
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Hectares"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.404685642));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square centimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*40468564.224));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square foot"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*43560));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square inch"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*6272640));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square kilometre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.0040469));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square metre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4046.9));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square mile"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.0015625));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square millimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4046856422.4));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Acres") && combobox.cmb_3_command.equals("Square yard"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*2.471053814671653));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square centimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*100000000));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square foot"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*107639.1041670972));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square inch"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*15500031.000062));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square kilometre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.01));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square metre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*10000));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square mile"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.0038610215854245));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square millimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*2000000000*5));//10000000000 is out of int range so 10000000000/5==2000000000
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Hectares") && combobox.cmb_3_command.equals("Square yard"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*11959.9004630108));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*2.471053814671653e-8));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Hectares"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.00000001));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Square foot"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.001076391041671));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Square inch"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.15500031000062));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Square kilometre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.0000000001));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Square metre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.0001));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Square mile"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*3.861021585424458e-11));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Square millimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*100));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square centimetre") && combobox.cmb_3_command.equals("Square yard"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*1.19599004630108e-4));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*2.295684113865932e-5));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Hectares"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.000009290304));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Square centimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*929.0304));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Square inch"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*144));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Square kilometre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.00000009290304));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Square metre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.09290304));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Square mile"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*3.587006427915519e-8));
				
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Square millimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*92903.04));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square foot") && combobox.cmb_3_command.equals("Square yard"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.1111111111111111));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*1.594225079073564e-7));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Hectares"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.000000064516));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Square centimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*6.4516));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Square foot"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.0069444444444444));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Square kilometre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.00000000064516));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Square metre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.00064516));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Square mile"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*2.490976686052444e-10));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Square millimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*645.16));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square inch") && combobox.cmb_3_command.equals("Square yard"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*7.716049382716049e-4));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*247.1053814671653));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Hectares"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*100));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Square centimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*1000000000*10));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Square foot"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*10763910.41670972));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Square inch"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*1550003100.0062));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Square metre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*1000000));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Square mile"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*0.3861021585424458));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Square millimetre"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*1000000000*1000));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square kilometre") && combobox.cmb_3_command.equals("Square yard"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*1195990.04630108));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square metre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
				
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square mile") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square millimetre") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
		
		else if(combobox.cmb_2_command.equals("Square yard") && combobox.cmb_3_command.equals("Acres"))
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
					combobox.output.setText("" + ((combobox.input_data)*4840));
			}	
		}
	}
}
