import java.awt.*;
import java.awt.event.*;
import java.net.PasswordAuthentication;
import javax.swing.*;

public class ComboBox extends JPanel 
{
	ButtonHandler buttonHandler = new ButtonHandler();
	
	JComboBox combobox1 ,combobox2,combobox3;
	ComboBox comboBox;
	
	protected int index, type_counter;
	protected double input_data;
	
	protected JLabel label;
	
	protected String compact_type[][], unit_type[];
	protected String cmb_2_command, cmb_3_command ;
	
	protected Main_class main_class;
	
	protected JTextField input;
	protected JTextField output;
	
	protected JMenuItem exit,info,change_password;
	
	protected JButton update_button ;
	
	AngleConversion angleConversion = new AngleConversion(this);
	
	AreaConversion areaConversion = new AreaConversion(this);
	
	CurrencyConversion currencyConversion = new CurrencyConversion(this);
	
	EnergyConversion energyConversion = new EnergyConversion(this);
	
	LengthConversion lengthConversion = new LengthConversion(this);
	
	PowerConversion powerConversion = new PowerConversion(this);
	
	PressureConversion pressureConversion = new PressureConversion(this);

	TemperatureConversion temperatureConversion = new TemperatureConversion(this);
	
	TimeConversion timeConversion = new TimeConversion(this);
	
	VelocityConversion velocityConversion = new VelocityConversion(this);
	
	VolumeConversion volumeConversion = new VolumeConversion(this);
	
	Weight_or_MassConversion weight_or_massConversion = new Weight_or_MassConversion(this);
	
	public ComboBox(Main_class main_class)
	{
		this.main_class = main_class;
		this.comboBox = this;
		
		this.update_button = main_class.update_button;
		update_button.addActionListener(buttonHandler);
		
		this.combobox1 = main_class.combobox1;
		this.combobox2 = main_class.combobox2;
		this.combobox3 = main_class.combobox3;
		
		this.compact_type = main_class.compact_type;
		this.index = main_class.index;
		this.type_counter = main_class.type_counter;
		this.unit_type = main_class.Unit_type;
		
		this.input = main_class.input;
		this.output = main_class.output;
		this.input.addMouseListener(buttonHandler);
		this.input.addKeyListener(buttonHandler);
		
		this.combobox1.addActionListener(buttonHandler);
		this.combobox2.addActionListener(buttonHandler);
		this.combobox3.addActionListener(buttonHandler);  
		
		
		this.exit = main_class.exit;
		exit.addActionListener(buttonHandler);
		
		this.info = main_class.info;
		info.addActionListener(buttonHandler);
		
		this.change_password = main_class.change_password;
		change_password.addActionListener(buttonHandler);
		
		this.label = main_class.label;
	}
	
	protected class ButtonHandler implements ActionListener, KeyListener, MouseListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == exit)
			{
				System.exit(0);//to exit the frame
			}
			
			if(event.getSource() == info)
			{
				main_class.frame.setEnabled(false);
				new Information(comboBox);
			}
			
			if(event.getSource() == change_password)
			{
				main_class.frame.setEnabled(false);
				new Change_Password(comboBox);
			}
			
			if(event.getSource() == update_button)
			{
				main_class.frame.setEnabled(false);
				//new Password(comboBox);
				new Auto_Update(comboBox);
			}
			
			if(event.getSource() == combobox1)
			{
				input.setEditable(false);
				input.setText("Enter value");
				type_counter = 0;
				
				index = combobox1.getSelectedIndex();
				
				combobox2.removeAllItems();
				combobox3.removeAllItems();
				
				for(int i=0; i<compact_type[index].length; i++)
				{
					combobox2.insertItemAt(compact_type[index][i], i);
					combobox3.insertItemAt(compact_type[index][i], i);
				}
				
				combobox2.setSelectedIndex(0);
				combobox3.setSelectedIndex(0);
				
				output.setText("");
				
				if(combobox1.getSelectedItem() == "Currency")
				{
					update_button.setVisible(true);
				}
				else
					update_button.setVisible(false);
			}
			
			else if(event.getSource() == combobox2)
			{
				cmb_2_command = "" + combobox2.getSelectedItem();
				cmb_3_command = "" + combobox3.getSelectedItem();
				
				if(combobox1.getSelectedItem() == "Angle")
				{
					angleConversion.calculation_of_angle();
				}
				
				else if(combobox1.getSelectedItem() == "Area")
				{
					areaConversion.calculation_of_area();
				}

				else if(combobox1.getSelectedItem() == "Currency")
				{
					currencyConversion.calculation_of_currency();
				}
				
				else if(combobox1.getSelectedItem()=="Energy")
				{
					energyConversion.calculation_of_energy();
				}
				
				else if(combobox1.getSelectedItem()=="Length")
				{
					lengthConversion.calculation_of_length();
				}
				
				else if(combobox1.getSelectedItem()=="Power")
				{
					powerConversion.calculation_of_power();
				}
				
				else if(combobox1.getSelectedItem()=="Pressure")
				{
					pressureConversion.calculation_of_pressure();
				}
				
				else if(combobox1.getSelectedItem() == "Temperature") 
				{
					temperatureConversion.calculation_of_temperature();
				}

				else if(combobox1.getSelectedItem() == "Time") 
				{
					timeConversion.calculation_of_time();
				}

				else if(combobox1.getSelectedItem() == "Velocity") 
				{
					velocityConversion.calculation_of_velocity();
				}

				else if(combobox1.getSelectedItem() == "Volume") 
				{
					volumeConversion.calculation_of_volume();
				}

				else if(combobox1.getSelectedItem() == "Weight/Mass") 
				{
					weight_or_massConversion.calculation_of_weight_or_mass();
				}
			}
			
			else if(event.getSource() == combobox3)
			{
				cmb_2_command = "" + combobox2.getSelectedItem();
				cmb_3_command = "" + combobox3.getSelectedItem();

				if(combobox1.getSelectedItem() == "Angle")
				{
					angleConversion.calculation_of_angle();
				}
			
				else if(combobox1.getSelectedItem() == "Area")
				{
					areaConversion.calculation_of_area();
				}

				else if(combobox1.getSelectedItem() == "Currency")
				{
					currencyConversion.calculation_of_currency();
				}
				
				else if(combobox1.getSelectedItem()=="Energy")
				{
					energyConversion.calculation_of_energy();
				}

				else if(combobox1.getSelectedItem()=="Length")
				{
					lengthConversion.calculation_of_length();
				}
				
				else if(combobox1.getSelectedItem()=="Power")
				{
					powerConversion.calculation_of_power();
				}

				else if(combobox1.getSelectedItem()=="Pressure")
				{
					pressureConversion.calculation_of_pressure();
				}
				
				else if(combobox1.getSelectedItem() == "Temperature") 
				{
					temperatureConversion.calculation_of_temperature();
				}

				else if(combobox1.getSelectedItem() == "Time") 
				{
					timeConversion.calculation_of_time();
				}

				else if(combobox1.getSelectedItem() == "Velocity") 
				{
					velocityConversion.calculation_of_velocity();
				}

				else if(combobox1.getSelectedItem() == "Volume") 
				{
					volumeConversion.calculation_of_volume();
				}

				else if(combobox1.getSelectedItem() == "Weight/Mass") 
				{
					weight_or_massConversion.calculation_of_weight_or_mass();
				}
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub		
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == input)
			{
				try
				{
					String s = input.getText() + "";
					if(s.equals("")) 
						output.setText("");
					
					else if(s.equals("-"));
					
					else if(!s.equals("."))
					{	
						input_data = Double.parseDouble(input.getText());
						output.setText("0");
					}
					
				}
				catch(Exception exception)
				{
					JOptionPane.showMessageDialog(null, "Please insert data correctly!");
					output.setText("");
					return; 
				}
				
				
				if(combobox1.getSelectedItem() == "Angle")
				{
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					angleConversion.calculation_of_angle();
				}
			
				else if(combobox1.getSelectedItem() == "Area")
				{
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					areaConversion.calculation_of_area();
				}

				else if(combobox1.getSelectedItem() == "Currency")
				{
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					currencyConversion.calculation_of_currency();
				}
				
				else if(combobox1.getSelectedItem() == "Currency")
				{
					System.out.println("Password called");
				}
			
				else if(combobox1.getSelectedItem() == "Energy")
				{
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					energyConversion.calculation_of_energy();
				}

				else if(combobox1.getSelectedItem() == "Length")
				{
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					lengthConversion.calculation_of_length();
				}
				
				else if(combobox1.getSelectedItem() == "Power")
				{
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					powerConversion.calculation_of_power();
				}
				
				else if(combobox1.getSelectedItem() == "Pressure")
				{
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					pressureConversion.calculation_of_pressure();
				}
		
				else if(combobox1.getSelectedItem() == "Temperature")
				{
					
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					temperatureConversion.calculation_of_temperature();
				}

				else if(combobox1.getSelectedItem() == "Time")
				{
					
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					timeConversion.calculation_of_time();
				}

				else if(combobox1.getSelectedItem() == "Velocity")
				{
					
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					velocityConversion.calculation_of_velocity();
				}

				else if(combobox1.getSelectedItem() == "Volume")
				{
					
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					volumeConversion.calculation_of_volume();
				}

				else if(combobox1.getSelectedItem() == "Weight/Mass")
				{
					
					cmb_2_command = "" + combobox2.getSelectedItem();
					cmb_3_command = "" + combobox3.getSelectedItem();
					weight_or_massConversion.calculation_of_weight_or_mass();
				}
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stu
			type_counter++;
			if(type_counter== 1)
			{
				input.setEditable(true);
				input.setText("");
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}