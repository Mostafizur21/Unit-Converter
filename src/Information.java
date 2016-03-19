import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Information extends JPanel
{
	ComboBox combobox;
	
	protected JFrame frame_for_information = new JFrame("About Us");

	protected JLabel my_name = new JLabel("Md.Mostafizur Rahman");
	
	protected JLabel my_roll = new JLabel("Roll: 1107021");
	
	protected JLabel my_contact_no = new JLabel("Mobile No: +8801740-080747");
	
	protected JLabel my_email = new JLabel("Email: mostafizur_cse21@yahoo.com");
	
	protected JLabel partner_name = new JLabel("Md.Al Amin");
	
	protected JLabel partner_roll = new JLabel("Roll: 1107032");
	
	protected JLabel partner_contact_no = new JLabel("Mobile No: +8801740-257676");
	
	protected JLabel partner_email = new JLabel("Email: alamin_kuet@ovi.com");

	public Information(final ComboBox combobox)
	{
		this.combobox = combobox;	
		
		frame_for_information.setVisible(true);
		frame_for_information.setSize(400,300);
		frame_for_information.setLocationRelativeTo(null);
		frame_for_information.setResizable(false);
		frame_for_information.setFont(new Font ("", Font.PLAIN, 20) );
		frame_for_information.add(this);
		
		add(my_name);
		add(my_roll);
		add(my_contact_no);
		add(my_email);
		
		add(partner_name);
		add(partner_roll);
		add(partner_contact_no);
		add(partner_email);
		
		my_name.setFont(new Font ("", Font.PLAIN, 20) );
		my_roll.setFont(new Font ("",Font.PLAIN,15) );
		my_contact_no.setFont(new Font ("",Font.PLAIN,15) );	
		my_email.setFont(new Font ("",Font.PLAIN,15) );
		
		partner_name.setFont(new Font ("",Font.PLAIN,20) );
		partner_roll.setFont(new Font ("",Font.PLAIN,15) );
		partner_contact_no.setFont(new Font ("",Font.PLAIN,15) );
		partner_email.setFont(new Font ("",Font.PLAIN,15) );
		
		frame_for_information.addWindowListener( 
				new  WindowListener() {
					
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
						combobox.main_class.frame.setEnabled(true);
						frame_for_information.setVisible(false);
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
		
		setBackground(Color.LIGHT_GRAY);
		
		my_name.setLocation(20,25);
		my_roll.setLocation(20, 50);
		my_contact_no.setLocation(20,75);
		my_email.setLocation(20, 100);
		
		partner_name.setLocation(20,140);
		partner_roll.setLocation(20, 165);
		partner_contact_no.setLocation(20, 190);
		partner_email.setLocation(20,215);
	}
}
