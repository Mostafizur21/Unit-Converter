import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class Main_class extends JPanel
{
	protected JFrame frame = new JFrame("Desktop based unit converter");
	
	protected JLabel label = new JLabel("Enter password");	
	protected JLabel choseLabel1 = new JLabel("Select the type of unit you want to convert");
	protected JLabel choseLabel2 = new JLabel("From");
	protected JLabel choseLabel3 = new JLabel("To");
	
	protected ComboBox mainComboBox;
	protected JComboBox combobox1 , combobox2,combobox3;
	
	protected int index = 0;
	protected int type_counter = 0;
	
	protected String Unit_type[], compact_type[][], angle_type[], Area_type[], temp_type[];
	
	protected JTextField input = new JTextField("Enter value");
	protected JTextField output = new JTextField();
	
	protected JButton update_button = new JButton("Auto Update");
	
	protected JMenuBar bar = new JMenuBar();
	protected JMenu menu = new JMenu("File");
	protected JMenuItem exit = new JMenuItem("Exit");
	
	protected JMenu menu1 = new JMenu("Security");
	protected JMenuItem change_password = new JMenuItem("Change Password");

	protected JMenu menu2 = new JMenu("About");
	protected JMenuItem info = new JMenuItem("Info");
	
	public Main_class() 
	{		
		set_look_and_feel_of_the_project();
		add_type_to_ComboBox();
		
		input.setEditable(false);
	
		update_button.setVisible(false);
		
		add(update_button);		
		
		add(bar);
		bar.add(menu);
		bar.add(menu1);
		bar.add(menu2);
		menu.add(exit);
		menu1.add(change_password);
		menu2.add(info);
		
		label.setVisible(false);
		add(label);
		add(choseLabel1);
		add(choseLabel2);
		add(choseLabel3);
		
		add(combobox1);
		add(combobox2);
		add(combobox3);
		
		add(input);
		add(output);
		
		menu.setFont(new Font("",Font.PLAIN,15));
		exit.setFont(new Font("",Font.PLAIN,15));
		menu1.setFont(new Font("",Font.PLAIN,15));
		menu2.setFont(new Font("",Font.PLAIN,15));
		
		change_password.setFont(new Font("",Font.PLAIN,15));
		
		info.setFont(new Font("",Font.PLAIN,15));
		
		choseLabel1.setFont(new Font("",Font.PLAIN,15));
		choseLabel2.setFont(new Font("",Font.PLAIN,15));
		choseLabel3.setFont(new Font("",Font.PLAIN,15));
		
		output.setFont(new Font("",Font.PLAIN,15));
		input.setFont(new Font("",Font.PLAIN,15));
		
		update_button.setFont(new Font("",Font.PLAIN,15));
		
		mainComboBox = new ComboBox(this);
		
		frame.setSize(600, 450);
		frame.add(this);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);//to stop the minimize and maximize option
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new Main_class();
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.GREEN);
		
		menu.setLocation(5,0);
		menu1.setLocation(40,0);
		menu2.setLocation(110,0);
		bar.setSize(getWidth(), 25);
		bar.setLocation(0, 0);
		
		combobox1.setLocation(10,60);
		combobox2.setLocation(10, 155);
		combobox3.setLocation(10, 270);
		
		combobox1.setFont(new Font("",Font.PLAIN,15));
		combobox2.setFont(new Font("",Font.PLAIN,15));
		combobox3.setFont(new Font("",Font.PLAIN,15));
		
		choseLabel1.setLocation(10, 35);
		choseLabel2.setLocation(10, 100);
		choseLabel3.setLocation(10, 215);
		
		
		input.setSize(300,25);
		input.setLocation(10, 125);
		
		output.setSize(300, 25);
		output.setLocation(10, 240);
		output.setEditable(false);
		
		update_button.setLocation(200, 350);
	}
	
	public void add_type_to_ComboBox()
	{
		String[] unit_type = { "Angle", "Area","Currency", "Energy","Length","Power","Pressure","Temperature","Time","Velocity","Volume","Weight/Mass"};
		Unit_type = unit_type;
		combobox1 = new JComboBox(Unit_type);
		combobox1.setPreferredSize(new Dimension(300, 30));
		
		String compact[][] = 
			{
				{"Degree", "Gradian", "Radian"},
				
				{"Acres", "Hectares", "Square centimetre", "Square foot", "Square inch", "Square kilometre", "Square metre", "Square mile", "Square millimetre", "Square yard"},
				
				{"American Dollar (USD)", "Australian Dollar (AUD)", "Bangladeshi Taka (BDT)", "Indian Rupee (INR)", "Iranian Rial (IRR)", "Iraqi Dinar (IQD)", "Malaysian Ringgit (MYR)", "Myanmar Kyat (MMK)", "Nepalese Rupee (NPR)", "Pakistan Rupee (PKR)", "Russian Ruble (RUB)", "Saudi Arabian Riyal (SAR)", "Singapore Dollar (SGD)", "South African Rand (ZAR)", "Sri Lankan Rupee (LKR)"},
				
				{"British Thermal Unit", "Calorie", "Eloctron-Volts", "Foot-Pound", "Joule", "Kilocalorie", "Kilojoule"},
				
				{"Centimtres", "Feet", "Inch", "Kilometres", "Metre", "Mile", "Millimetres", "Nanometre","Yard"},
				
				{"British Thermal Unit/minute", "Foot-Pound/minute", "Horsepower", "Kilowatt", "Watt"},
				
				{"Atmosphere", "Bar", "Kilo Pascal", "Millimetre of mercury", "Pascal", "Pound per square inch"},
				
				{"Degrees Celsius", "Degrees Fahrenheit", "Kelvin"},
				
				{"Day", "Hour", "Microsecond", "Millisecond", "Mintue", "Second", "Week"},
				
				{"Centimetres per second", "Feet per second", "Kilometres per hour", "Metres per second", "Miles per hour"},
				
				{"Cubic centimetre", "Cubic foot","Cubic inch", "Cubic metre", "Cubic yard", "Litre"},
				
				{"Carat", "Centigram", "Decigram", "Dekagram", "Gram", "Hectogram", "Kilogram", "Milligram", "Ounce", "Pound","Stone", "Ton(UK)", "Ton(US)"}			
			};
		
		compact_type = compact;
			
		combobox2 = new JComboBox(compact_type[index]);
		combobox2.setPreferredSize(new Dimension(300, 30));
		combobox3 = new JComboBox(compact_type[index]);
		combobox3.setPreferredSize(new Dimension(300, 30));
	}
	
	public void set_look_and_feel_of_the_project()
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
