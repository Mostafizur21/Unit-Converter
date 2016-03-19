import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import javax.swing.JPanel;
import org.omg.DynamicAny.DynValueBoxOperations;
import java.io.*;
import java.util.Scanner;


public class CurrencyConversion extends JPanel
{
	ComboBox combobox;
	
	protected Double data;
	
	protected String s;
	
	protected static Scanner file_scanner;

	public CurrencyConversion(ComboBox combobox) 
	{
		// TODO Auto-generated constructor stub
		this.combobox = combobox;
	}
	
	public void calculation_of_currency()
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
		
		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("American Dollar (USD)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "American to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to American";
				open_file();	
			}
		}
		
		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Bangladeshi";
				open_file();	
			}
		}
		
		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Saudi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Australian Dollar (AUD)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Australian to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Saudi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Bangladeshi Taka (BDT)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Bangladesh to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Indian Rupee (INR)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Indian to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iranian Rial (IRR)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iranian to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Iraqi Dinar (IQD)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Iraqi to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Malaysian Ringgit (MYR)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Malaysian to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Myanmar Kyat (MMK)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Myanmar to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Nepalese Rupee (NPR)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Nepalese to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Pakistan Rupee (PKR)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Pakistan to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Russian Ruble (RUB)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Russian to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Saudi Arabian Riyal (SAR)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Saudi Arabian to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MY"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to South African";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Singapore Dollar (SGD)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Singapore Dollar to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("South African Rand (ZAR)") && combobox.cmb_3_command.equals("Sri Lankan Rupee (LKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "South African Rand to Sri Lankan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("American Dollar (USD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to American";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Australian Dollar (AUD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Australian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Bangladeshi Taka (BDT)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Bangladeshi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Indian Rupee (INR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Indian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Iranian Rial (IRR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Iranian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Iraqi Dinar (IQD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Iraqi";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Malaysian Ringgit (MYR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Malaysian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Myanmar Kyat (MMK)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Myanmar";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Nepalese Rupee (NPR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Nepalese";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Pakistan Rupee (PKR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Pakistan";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Russian Ruble (RUB)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Russian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Saudi Arabian Riyal (SAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Saudi Arabian";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("Singapore Dollar (SGD)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to Singapore";
				open_file();	
			}
		}

		else if(combobox.cmb_2_command.equals("Sri Lankan Rupee (LKR)") && combobox.cmb_3_command.equals("South African Rand (ZAR)"))	
		{
			if(!combobox.input.getText().equals("Enter value")) 
			{
				s = "Sri Lankan to South African";
				open_file();	
			}
		}
		
	}
	
	
	public void open_file()
	{
		try
		{
			file_scanner = new Scanner( new File("src/currency.txt"));
			String str;
			while(file_scanner.hasNext())
			{
				str = file_scanner.nextLine();
				if(str.equals(s))
				{
					str = file_scanner.nextLine();
					data = Double.parseDouble(str);
					combobox.output.setText("" + (combobox.input_data*data));
					break;
				}
			}
			file_scanner.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
