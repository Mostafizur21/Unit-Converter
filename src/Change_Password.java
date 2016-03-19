import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Change_Password extends JPanel
{
	ComboBox combobox;
	
	private ButtonHandler buttonHandler = new ButtonHandler();
	
	protected JFrame frame_for_password = new JFrame("Change Password");
	
	protected JLabel password_label = new JLabel("Current password");
	protected JLabel change_password_label = new JLabel("New password");
	protected JLabel Re_change_password_label = new JLabel("Re_type new password");
	
	protected JPasswordField password_field = new JPasswordField("", 20);
	protected JPasswordField change_password_field = new JPasswordField("", 20);
	protected JPasswordField Re_change_password_field = new JPasswordField("", 20);
	
	protected Scanner file_scanner;
	protected FileWriter file_writer;
	
	protected JButton save_button = new JButton("Save changes");
	protected JButton cancel_button = new JButton("Cancel");
	
	public Change_Password(final ComboBox combobox)
	{
		this.combobox = combobox;
		
		add(password_field);
		add(change_password_field);
		add(Re_change_password_field);
		
		add(save_button);
		add(cancel_button);
		
		add(password_label);
		add(change_password_label);
		add(Re_change_password_label);
		
		save_button.addActionListener(buttonHandler);
		cancel_button.addActionListener(buttonHandler);
		
		save_button.setFont(new Font("",Font.PLAIN,15));
		cancel_button.setFont(new Font("",Font.PLAIN,15));
		
		password_label.setFont(new Font ("", Font.PLAIN, 15) );
		
		change_password_label.setFont(new Font ("", Font.PLAIN, 15) );
		
		Re_change_password_label.setFont(new Font ("", Font.PLAIN, 15) );
		
		password_field.addActionListener(buttonHandler);
		password_field.setFont(new Font("",Font.PLAIN,15));
		
		change_password_field.addActionListener(buttonHandler);
		change_password_field.setFont(new Font("",Font.PLAIN,15));
		
		Re_change_password_field.setFont(new Font("",Font.PLAIN,15));
		Re_change_password_field.addActionListener(buttonHandler);
		
		frame_for_password.setSize(500, 300);
		frame_for_password.add(this);
		frame_for_password.setVisible(true);
		frame_for_password.setResizable(false);
		frame_for_password.setLocationRelativeTo(null);		
	
		frame_for_password.addWindowListener(
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
						combobox.main_class.frame.setVisible(true);
						combobox.main_class.frame.setEnabled(true);
						frame_for_password.setVisible(false);
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
		setBackground(Color.ORANGE);
		
		password_field.setLocation(180, 40);
		change_password_field.setLocation(180, 100);
		Re_change_password_field.setLocation(180, 160);
		
		password_label.setLocation(20, 40);
		change_password_label.setLocation(20, 100);
		Re_change_password_label.setLocation(20, 160);
		
		save_button.setLocation(180,200);
		cancel_button.setLocation(330,200);
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource() == cancel_button)
			{
				frame_for_password.setVisible(false);
				combobox.main_class.frame.setVisible(true);
				combobox.main_class.frame.setEnabled(true);
			}
			
			if(event.getSource() == save_button)
			{
				try 
				{
					file_scanner = new Scanner( new File("src/passwod.txt"));
					if(file_scanner.nextLine().equals(password_field.getText()))
					{
						if(change_password_field.getText().equals(Re_change_password_field.getText()))
						{
							String s = change_password_field.getText();
							if(s.equals(""))
							{
								JOptionPane.showMessageDialog(null,"Enter new password");
							}
							else
							{
								try
								{					
										file_writer = new FileWriter( new File("src/passwod.txt") );
										file_writer.write(change_password_field.getText());
										file_writer.close();
										frame_for_password.setVisible(false);
										combobox.main_class.frame.setVisible(true);
										combobox.main_class.frame.setEnabled(true);
								}
								catch(Exception e)
								{
									e.printStackTrace();
								}
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null,"New passord and Re-type password not matched");
							Re_change_password_field.setText(null);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Current Password Not Matched");
						password_field.setText(null);
					}
					file_scanner.close();
				} 
				
				catch (FileNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
