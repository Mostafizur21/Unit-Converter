import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Set_Update_Rate extends JPanel
{
	Password password;
	
	Set_Update_Rate set_update_rate;
	
	ButtonHandler buttonHandler = new ButtonHandler();
	
	private JFrame update_frame = new JFrame("Update Rate");
	
	private JLabel label1 = new JLabel("Select Country 1:");
	private JLabel label2 = new JLabel("Select Country 2:");
	private JLabel label3 = new JLabel("Set Rate:");
	
	private JTextField field = new JTextField();
	
	private JComboBox combobox1,combobox2;
	
	private JButton set_button = new JButton("Set");
	private JButton cancel_button = new JButton("Cancel");

	private String Country[];
	
	public Set_Update_Rate(final Password password)
	{
		add_country_to_combobox();
		
		this.password = password;
	
		add(field);
		
		add(label1);
		add(label2);
		add(label3);
		
		add(combobox1);
		add(combobox2);
		
		add(set_button);
		add(cancel_button);
		
		set_button.addActionListener(buttonHandler);
		cancel_button.addActionListener(buttonHandler);
		
		label1.setFont(new Font("",Font.PLAIN,15));
		label2.setFont(new Font("",Font.PLAIN,15));
		label3.setFont(new Font("",Font.PLAIN,15));
		
		field.setFont(new Font("",Font.PLAIN,15));
		
		combobox1.setFont(new Font("",Font.PLAIN,15));
		combobox2.setFont(new Font("",Font.PLAIN,15));
		
		set_button.setFont(new Font("",Font.PLAIN,15));
		cancel_button.setFont(new Font("",Font.PLAIN,15));
		
		update_frame.setSize(600, 300);
		update_frame.add(this);
		update_frame.setVisible(true);
		update_frame.setResizable(false);
		update_frame.setLocationRelativeTo(null);
		
		update_frame.addWindowListener(
				new WindowListener() {
					
					@Override
					public void windowOpened(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowIconified(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowDeiconified(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowDeactivated(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void windowClosing(WindowEvent arg0) {
						// TODO Auto-generated method stub

						update_frame.setVisible(false);
						
						password.combobox.main_class.frame.setVisible(true);
						password.combobox.main_class.frame.setEnabled(true);
						
					}
					
					@Override
					public void windowClosed(WindowEvent arg0) {
						// TODO Auto-generated method stub
					}
					
					@Override
					public void windowActivated(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				}
			);
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		setBackground(Color.magenta);
		
		//setForeground(Color.white);
		combobox1.setLocation(150, 20);
		combobox2.setLocation(150, 100);
		
		label1.setLocation(20, 20);
		label2.setLocation(20, 100);
		label3.setLocation(20, 150);
		
		field.setSize(300, 30);
		field.setLocation(150, 150);
		
		set_button.setLocation(150,200);
		cancel_button.setLocation(250,200);
	}
	
	public void add_country_to_combobox()
	{
		String country[] = {"Australian Dollar (AUD)", "Bangladeshi Taka (BDT)", "Indian Rupee (INR)", "Iranian Rial (IRR)", "Iraqi Dinar (IQD)", "Malaysian Ringgit (MYR)", "Myanmar Kyat (MMK)", "Nepalese Rupee (NPR)", "Pakistan Rupee (PKR)", "Russian Ruble (RUB)", "Saudi Arabian Riyal (SAR)", "Singapore Dollar (SGD)", "South African Rand (ZAR)", "Sri Lankan Rupee (LKR)", "United States Dollar (USD)"};
		
		Country = country;
		
		combobox1 = new JComboBox(Country);
		combobox1.setPreferredSize(new Dimension(300, 30));
		
		combobox2 = new JComboBox(Country);
		combobox2.setPreferredSize(new Dimension(300, 30));
	}
	
	protected class ButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource().equals(set_button))
			{
				//new Set_Update(set_update_rate);
				
				update_frame.setVisible(false);
				
				password.combobox.main_class.frame.setVisible(true);
				password.combobox.main_class.frame.setEnabled(true);
			}
			if(e.getSource().equals(cancel_button))
			{
				update_frame.setVisible(false);
				
				password.combobox.main_class.frame.setVisible(true);
				password.combobox.main_class.frame.setEnabled(true);
			}
		}
	}
}
