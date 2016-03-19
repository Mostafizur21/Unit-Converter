import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URL;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Auto_Update
{
	ComboBox combobox;
	
	protected Scanner file_scanner;
	protected FileWriter file_writer;
	
	String Link,Attr,str,s1;
	
	String conversion[] = {"Dollar to Rupee", "Dollar to Rand", "Dollar to Singapore Dollar", "Dollar to Riyal", "Dollar to Ruble", "Dollar to Rupee", "Dollar to Rupee", "Dollar to Kyat", "Dollar to Ringgit", "Dollar to Dinar", "Dollar to Rial","Dollar to Rupee", "Dollar to Taka", "Dollar to Australian Dollar", "Australian Dollar to Dollar",                                                                "Australian Dollar to Taka", "Australian Dollar to Rupee", "Australian Dollar to Rial", "Australian Dollar to Dinar","Australian Dollar to Ringgit","Australian Dollar to Kyat", "Australian Dollar to Rupee", "Australian Dollar to Rupee", "Australian Dollar to Ruble", "Australian Dollar to Riyal", "Australian Dollar to Singapore Dollar", "Australian Dollar to Rand", "Australian Dollar to Rupee",               "Taka to Dollar", "Taka to Australian Dollar", "Taka to Rupee", "Taka to Rial", "Taka to Ringgit", "Taka to Rupee", "Taka to Ruble", "Taka to Riyal", "Taka to Singapore Dollar","Taka to Rand", "Taka to Rupee",                                                                                                   "Rupee to Dollar", "Rupee to Australian Dollar","Rupee to Taka", "Rupee to Rial", "Rupee to Dinar","Rupee to Ringgit","Rupee to Kyat", "Rupee to Rupee","Rupee to Rupee","Rupee to Ruble","Rupee to Riyal","Rupee to Singapore Dollar","Rupee to Rand","Rupee to Rupee",                                                                                                                  "Rial to Taka","Rial to Rupee","Rial to Dinar","Rial to Ringgit","Rial to Kyat","Rial to Rupee","Rial to Rupee","Rial to Ruble","Rial to Riyal","Rial to Singapore Dollar","Rial to Rand","Rial to Rupee",                                                                                                                                 "Dinar to Dollar","Dinar to Australian Dollar","Dinar to Rupee","Dinar to Rial","Dinar to Ringgit","Dinar to Rupee","Dinar to Ruble","Dinar to Riyal","Dinar to Singapore Dollar","Dinar to Rand","Dinar to Rupee",                                                                                                   "Ringgit to Dollar","Ringgit to Australian Dollar","Ringgit to Taka","Ringgit to Rupee","Ringgit to Rial","Ringgit to Dinar","Ringgit to Kyat","Ringgit to Rupee","Ringgit to Rupee","Ringgit to Ruble","Ringgit to Riyal","Ringgit to Singapore Dollar","Ringgit to Rand","Ringgit to Rupee",                                                                                                  "Kyat to Dollar","Kyat to Australian Dollar","Kyat to Rupee","Kyat to Rial","Kyat to Ringgit","Kyat to Rupee","Kyat to Ruble","Kyat to Riyal","Kyat to Singapore Dollar","Kyat to Rand","Kyat to Rupee",                                                                                                                 "Rupee to Dollar","Rupee to Australian Dollar","Rupee to Rupee","Rupee to Rial","Rupee to Ringgit","Rupee to Rupee","Rupee to Ruble","Rupee to Riyal","Rupee to Singapore Dollar","Rupee to Rand","Rupee to Rupee",                                                                                                   "Rupee to Dollar","Rupee to Australian Dollar","Rupee to Taka","Rupee to Rupee","Rupee to Rial","Rupee to Dinar","Rupee to Ringgit","Rupee to Kyat","Rupee to Rupee","Rupee to Ruble","Rupee to Riyal","Rupee to Singapore Dollar","Rupee to Rand","Rupee to Rupee",                                                                                                                                 "Ruble to Dollar","Ruble to Australian Dollar","Ruble to Taka","Ruble to Rupee","Ruble to Rial","Ruble to Dinar","Ruble to Ringgit","Ruble to Kyat","Ruble to Rupee","Ruble to Rupee","Ruble to Riyal","Ruble to Singapore Dollar","Ruble to Rand","Ruble to Rupee",                                                                                                                           "Riyal to Dollar","Riyal to Australian Dollar","Riyal to Taka","Riyal to Rupee","Riyal to Rial","Riyal to Dinar","Riyal to Ringgit","Riyal to Kyat","Riyal to Rupee","Riyal to Rupee","Riyal to Ruble","Riyal to Singapore Dollar","Riyal to Rand","Riyal to Rupee",                                                                                                                                                 "Singapore Dollar to Dollar","Singapore Dollar to Australian Dollar","Singapore Dollar to Taka","Singapore Dollar to Rupee","Singapore Dollar to Rial","Singapore Dollar to Dinar","Singapore Dollar to Ringgit","Singapore Dollar to Kyat","Singapore Dollar to Rupee","Singapore Dollar to Rupee","Singapore Dollar to Ruble","Singapore Dollar to Riyal","Singapore Dollar to Rand","Singapore Dollar to Rupee",                                                       "Rand to Dollar","Rand to Australian Dollar","Rand to Taka","Rand to Rupee","Rand to Rial","Rand to Dinar","Rand to Ringgit","Rand to Kyat","Rand to Rupee","Rand to Rupee","Rand to Ruble","Rand to Riyal","Rand to Singapore Dollar","Rand to Rupee",                                                                                                                                                                                                                                                             "Rupee to Dollar","Rupee to Australian Dollar","Rupee to Taka","Rupee to Rupee","Rupee to Rial","Rupee to Dinar","Rupee to Ringgit","Rupee to Kyat","Rupee to Rupee","Rupee to Rupee","Rupee to Ruble","Rupee to Riyal","Rupee to Singapore Dollar","Rupee to Rand"};
	String conversion2[] = {"American to Sri Lankan", "American to South African", "American to Singapore", "American to Saudi Arabian", "American to Russian", "American to Pakistan", "American to Nepalese", "American to Myanmar", "American to Malaysian", "American to Iraqi","American to Iranian","American to Indian", "American to Bangladeshi", "American to Australian",                                   "Australian to American","Australian to Bangladeshi","Australian to Indian", "Australian to Iranian", "Australian to Iraqi", "Australian to Malaysian", "Australian to Myanmar", "Australian to Nepalese", "Australian to Pakistan", "Australian to Russian", "Australian to Saudi", "Australian to Singapore", "Australian to South African", "Australian to Sri Lankan",                                                 "Bangladesh to American", "Bangladesh to Australian", "Bangladesh to Indian", "Bangladesh to Iranian", "Bangladesh to Malaysian", "Bangladesh to Pakistan", "Bangladesh to Russian", "Bangladesh to Saudi", "Bangladesh to Singapore","Bangladesh to South African", "Bangladesh to Sri Lankan",                     "Indian to American","Indian to Australian","Indian to Bangladeshi","Indian to Iranian","Indian to Iraqi","Indian to Malaysian","Indian to Myanmar","Indian to Nepalese","Indian to Pakistan","Indian to Russian","Indian to Saudi Arabian","Indian to Singapore","Indian to South African","Indian to Sri Lankan",                                                                      "Iranian to Bangladeshi","Iranian to Indian","Iranian to Iraqi","Iranian to Malaysian","Iranian to Myanmar","Iranian to Nepalese","Iranian to Pakistan","Iranian to Russian","Iranian to Saudi Arabian","Iranian to Singapore","Iranian to South African","Iranian to Sri Lankan",                                                         "Iraqi to American","Iraqi to Australian","Iraqi to Indian","Iraqi to Iranian","Iraqi to Malaysian","Iraqi to Pakistan","Iraqi to Russian","Iraqi to Saudi Arabian","Iraqi to Singapore","Iraqi to South African","Iraqi to Sri Lankan",                                                                              "Malaysian to American","Malaysian to Australian","Malaysian to Bangladeshi","Malaysian to Indian","Malaysian to Iranian","Malaysian to Iraqi","Malaysian to Myanmar","Malaysian to Nepalese","Malaysian to Pakistan","Malaysian to Russian","Malaysian to Saudi Arabian","Malaysian to Singapore","Malaysian to South African","Malaysian to Sri Lankan",                                      "Myanmar to American","Myanmar to Australian","Myanmar to Indian","Myanmar to Iranian","Myanmar to Malaysian","Myanmar to Pakistan","Myanmar to Russian","Myanmar to Saudi Arabian","Myanmar to Singapore","Myanmar to South African","Myanmar to Sri Lankan",                                                            "Nepalese to American","Nepalese to Australian","Nepalese to Indian","Nepalese to Iranian","Nepalese to Malaysian","Nepalese to Pakistan","Nepalese to Russian","Nepalese to Saudi Arabian","Nepalese to Singapore","Nepalese to South African","Nepalese to Sri Lankan",                                            "Pakistan to American","Pakistan to Australian","Pakistan to Bangladeshi","Pakistan to Indian","Pakistan to Iranian","Pakistan to Iraqi","Pakistan to Malaysian","Pakistan to Myanmar","Pakistan to Nepalese","Pakistan to Russian","Pakistan to Saudi Arabian","Pakistan to Singapore","Pakistan to South African","Pakistan to Sri Lankan",                                                        "Russian to American","Russian to Australian","Russian to Bangladeshi","Russian to Indian","Russian to Iranian","Russian to Iraqi","Russian to Malaysian","Russian to Myanmar","Russian to Nepalese","Russian to Pakistan","Russian to Saudi Arabian","Russian to Singapore","Russian to South African","Russian to Sri Lankan",                                                               "Saudi Arabian to American","Saudi Arabian to Australian","Saudi Arabian to Bangladeshi","Saudi Arabian to Indian","Saudi Arabian to Iranian","Saudi Arabian to Iraqi","Saudi Arabian to Malaysian","Saudi Arabian to Myanmar","Saudi Arabian to Nepalese","Saudi Arabian to Pakistan","Saudi Arabian to Russian","Saudi Arabian to Singapore","Saudi Arabian to South African","Saudi Arabian to Sri Lankan",       "Singapore Dollar to American","Singapore Dollar to Australian","Singapore Dollar to Bangladeshi","Singapore Dollar to Indian","Singapore Dollar to Iranian","Singapore Dollar to Iraqi","Singapore Dollar to Malaysian","Singapore Dollar to Myanmar","Singapore Dollar to Nepalese","Singapore Dollar to Pakistan","Singapore Dollar to Russian","Singapore Dollar to Saudi Arabian","Singapore Dollar to South African","Singapore Dollar to Sri Lankan",               "South African Rand to American","South African Rand to Australian","South African Rand to Bangladeshi","South African Rand to Indian","South African Rand to Iranian","South African Rand to Iraqi","South African Rand to Malaysian","South African Rand to Myanmar","South African Rand to Nepalese","South African Rand to Pakistan","South African Rand to Russian","South African Rand to Saudi Arabian","South African Rand to Singapore","South African Rand to Sri Lankan",                              "Sri Lankan to American","Sri Lankan to Australian","Sri Lankan to Bangladeshi","Sri Lankan to Indian","Sri Lankan to Iranian","Sri Lankan to Iraqi","Sri Lankan to Malaysian","Sri Lankan to Myanmar","Sri Lankan to Nepalese","Sri Lankan to Pakistan","Sri Lankan to Russian","Sri Lankan to Saudi Arabian","Sri Lankan to Singapore","Sri Lankan to South African"};
	String add[] = {"http://fx-rate.net/USD/", "http://fx-rate.net/USD/", "http://fx-rate.net/USD/", "http://fx-rate.net/SAR/", "http://fx-rate.net/USD/",  "http://fx-rate.net/USD/", "http://fx-rate.net/NPR/", "http://fx-rate.net/MMK/", "http://fx-rate.net/USD", "http://fx-rate.net/IQD/", "http://fx-rate.net/USD/", "http://fx-rate.net/USD/", "http://fx-rate.net/BDT/", "http://fx-rate.net/USD/",          "http://fx-rate.net/AUD/", "http://fx-rate.net/BDT/", "http://fx-rate.net/AUD/", "http://fx-rate.net/AUD/", "http://fx-rate.net/IQD/", "http://fx-rate.net/AUD/", "http://fx-rate.net/MMK/", "http://fx-rate.net/NPR/", "http://fx-rate.net/AUD/", "http://fx-rate.net/AUD/", "http://fx-rate.net/AUD/", "http://fx-rate.net/AUD/", "http://fx-rate.net/AUD/", "http://fx-rate.net/AUD/",                                    "http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/","http://fx-rate.net/BDT/",                     "http://fx-rate.net/INR/","http://fx-rate.net/INR/","http://fx-rate.net/BDT/","http://fx-rate.net/INR/","http://fx-rate.net/IQD/","http://fx-rate.net/INR/","http://fx-rate.net/MMK","http://fx-rate.net/NPR/","http://fx-rate.net/INR/","http://fx-rate.net/INR/","http://fx-rate.net/INR/","http://fx-rate.net/INR/","http://fx-rate.net/INR/","http://fx-rate.net/INR/",              "http://fx-rate.net/BDT/","http://fx-rate.net/IRR/","http://fx-rate.net/IQD/","http://fx-rate.net/IRR/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/IRR/","http://fx-rate.net/IRR/","http://fx-rate.net/IRR/","http://fx-rate.net/IRR/","http://fx-rate.net/IRR/","http://fx-rate.net/IRR/",                   "http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/","http://fx-rate.net/IQD/",                        "http://fx-rate.net/MYR/","http://fx-rate.net/MYR/","http://fx-rate.net/BDT/","http://fx-rate.net/MYR/","http://fx-rate.net/MYR/","http://fx-rate.net/IQD/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/MYR/","http://fx-rate.net/MYR/","http://fx-rate.net/MYR/","http://fx-rate.net/MYR/","http://fx-rate.net/MYR/","http://fx-rate.net/MYR/",                    "http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/","http://fx-rate.net/MMK/",                            "http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/","http://fx-rate.net/NPR/",                       "http://fx-rate.net/PKR/","http://fx-rate.net/PKR/","http://fx-rate.net/BDT/","http://fx-rate.net/PKR/","http://fx-rate.net/PKR/","http://fx-rate.net/IQD/","http://fx-rate.net/PKR/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/PKR/","http://fx-rate.net/PKR/","http://fx-rate.net/PKR/","http://fx-rate.net/PKR/","http://fx-rate.net/PKR/",                         "http://fx-rate.net/RUB/","http://fx-rate.net/RUB/","http://fx-rate.net/BDT/","http://fx-rate.net/RUB/","http://fx-rate.net/RUB/","http://fx-rate.net/IQD/","http://fx-rate.net/RUB/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/RUB/","http://fx-rate.net/RUB/","http://fx-rate.net/RUB/","http://fx-rate.net/RUB/","http://fx-rate.net/RUB/",                    "http://fx-rate.net/SAR/","http://fx-rate.net/SAR/","http://fx-rate.net/BDT/","http://fx-rate.net/SAR/","http://fx-rate.net/SAR/","http://fx-rate.net/IQD/","http://fx-rate.net/SAR/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/SAR/","http://fx-rate.net/SAR/","http://fx-rate.net/SAR/","http://fx-rate.net/SAR/","http://fx-rate.net/SAR/",                                        "http://fx-rate.net/SGD/","http://fx-rate.net/SGD/","http://fx-rate.net/BDT/","http://fx-rate.net/SGD/","http://fx-rate.net/SGD/","http://fx-rate.net/IQD/","http://fx-rate.net/SGD/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/SGD/","http://fx-rate.net/SGD/","http://fx-rate.net/SGD/","http://fx-rate.net/SGD/","http://fx-rate.net/SGD/",                                                                                               "http://fx-rate.net/ZAR/","http://fx-rate.net/ZAR/","http://fx-rate.net/BDT/","http://fx-rate.net/ZAR/","http://fx-rate.net/ZAR/","http://fx-rate.net/IQD/","http://fx-rate.net/ZAR/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/ZAR/","http://fx-rate.net/ZAR/","http://fx-rate.net/ZAR/","http://fx-rate.net/ZAR/","http://fx-rate.net/ZAR/",                                                                                                                                      "http://fx-rate.net/LKR/","http://fx-rate.net/LKR/","http://fx-rate.net/BDT/","http://fx-rate.net/LKR/","http://fx-rate.net/LKR/","http://fx-rate.net/IQD/","http://fx-rate.net/LKR/","http://fx-rate.net/MMK/","http://fx-rate.net/NPR/","http://fx-rate.net/LKR/","http://fx-rate.net/LKR/","http://fx-rate.net/LKR/","http://fx-rate.net/LKR/","http://fx-rate.net/LKR/"};
	
	public Auto_Update(ComboBox combobox)
	{
		this.combobox=combobox;
		
		Link = "a";
		Attr = "title";
		
		for(int x = 0; x<14;x++)
		{
			connect_network(add[x],Link,Attr,conversion[x],conversion2[x]);
		}
		
		JOptionPane.showMessageDialog(null, "Auto Update successfull");
		combobox.main_class.frame.setVisible(true);
		combobox.main_class.frame.setEnabled(true);
	}
	
	public void connect_network(String ADD,String LINK,String ATTR,String CONVERSION,String CONVERSION2)
	{
		try
		{
			URL url = new URL(ADD);
			Document doc= Jsoup.parse(url,3*1000);
			Elements link=doc.select(LINK);
			
			int i = 1,j=0;
			
			for(Element fx: link)
			{
				String string = fx.attr(ATTR);
				if(string.equalsIgnoreCase(CONVERSION)&&(i==1))
				{
					str=fx.text();
					s1 = CONVERSION2;
					i=0;
					if((s1 =="Australian to Pakistan")||(s1 == "American to Pakistan")||(s1 == "Bangladesh to Pakistan")||(s1 == "Iranian to Pakistan")||(s1 == "Iraqi to Pakistan")||(s1 == "Malaysian to Pakistan")||(s1 == "Myanmar to Pakistan")||(s1 == "Pakistan to Bangladeshi")||(s1 == "Russian to Pakistan")||(s1 == "Saudi Arabian to Pakistan")||(s1 == "Singapore Dollar to Pakistan")||(s1 == "South African Rand to Pakistan")||(s1 == "Pakistan to Iraqi")||(s1 == "Pakistan to Myanmar"))
					{
						i=1;
						j++;
						if(j==4)
						{
							j=0;
							i=0;
							update();
						}
					}
					
					else if((s1 =="Australian to Sri Lankan")||(s1 == "American to Sri Lankan")||(s1 == "Bangladesh to Sri Lankan")||(s1 == "Iranian to Sri Lankan")||(s1 == "Iraqi to Sri Lankan")||(s1 == "Malaysian to Sri Lankan")||(s1 == "Myanmar to Sri Lankan")||(s1 == "Russian to Sri Lankan")||(s1 == "Saudi Arabian to Sri Lankan")||(s1 == "Singapore Dollar to Sri Lankan")||(s1 == "South African Rand to Sri Lankan")||(s1 == "Sri Lankan to Bangladeshi")||(s1 == "Sri Lankan to Iraqi")||(s1 == "Sri Lankan to Myanmar")||(s1 == "Indian to Pakistan"))
					{
						i=1;
						j++;
						if(j==3)
						{
							i=0;
							j=0;
							update();
						}
					}
					
					else if((s1 == "Indian to Nepalese"))
					{
						i=1;
						j++;
						if(j==2)
						{
							i=0;
							j=0;
							update();
						}
					}
					
					else if((s1 == "Sri Lankan to Nepalese"))
					{
						i=1;
						j++;
						if(j==6)
						{
							i=0;
							j=0;
							update();
						}
					}
					
					else if((s1 == "Sri Lankan to Pakistan")||(s1 == "Pakistan to Sri Lankan")||(s1 == "Nepalese to Sri Lankan"))
					{
						i=1;
						j++;
						str=fx.text();
						if(j==5)
						{
							i=0;
							j=0;
							update();
						}
					}
					
					else if(s1 == "Pakistan to Nepalese")
					{
						i=1;
						j++;
						if(j==8)
						{
							i=0;
							j=0;
							update();
						}
					}
					
					else if((s1 == "Nepalese to Pakistan"))
					{
						i=1;
						j++;
						if(j==7)
						{
							i=0;
							j=0;
							update();
						}
					}
					
					else
					{	
						update();
					}
						
				}
			}
		}
		
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Connection Error of URL");
		}
	}
	
		public void update()
		{
			 String data = "";

			try
			{
				file_scanner = new Scanner( new File("src/currency.txt"));
				String s;
				while(file_scanner.hasNext())
				{
					s = file_scanner.nextLine();
					if(s.equals(s1))
					{
						data += s + "\n";
						s=file_scanner.nextLine();
						data += str + "\n";	
					}
					else 
					{
						data += s + "\n";
					}
				}
				file_scanner.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			try   
			{
				file_writer = new FileWriter(new File("src/currency.txt"));
				file_writer.write(data);
				file_writer.close();				
			}
			catch(Exception e)
			{
			}
		}
}
