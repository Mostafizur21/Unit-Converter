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


public class Password extends JPanel
{
	ComboBox combobox;
	Password password;
	
	private ButtonHandler buttonHandler = new ButtonHandler();
	
	protected JFrame frame_for_password = new JFrame("Password");
	
	protected JLabel label;
	protected JLabel password_label = new JLabel("Input Password");
	
	protected JPasswordField password_field = new JPasswordField();
	
	protected Scanner file_scanner;
	
	protected JButton ok_button = new JButton("Ok");
	protected JButton cancel_button = new JButton("Cancel");
	
	public Password(final ComboBox combobox)
	{
		this.combobox = combobox;	
		
		password_label.setFont(new Font ("", Font.PLAIN, 15) );
		
		password_field.addActionListener(buttonHandler);
		
		add(password_label);
		
		add(password_field);
		
		add(ok_button);
		add(cancel_button);
		
		ok_button.addActionListener(buttonHandler);
		cancel_button.addActionListener(buttonHandler);
		
		ok_button.setFont(new Font("",Font.PLAIN,15));
		cancel_button.setFont(new Font("",Font.PLAIN,15));
		
		password_field.setFont(new Font("",Font.PLAIN,15));
		
		frame_for_password.setSize(400, 200);
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

						frame_for_password.setVisible(false);
						
						combobox.main_class.frame.setVisible(true);
						combobox.main_class.frame.setEnabled(true);
						
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
		
		password_label.setLocation(20, 20);
		
		password_field.setSize(350, 20);
		password_field.setLocation(20, 50);
		
		ok_button.setLocation(80, 80);
		cancel_button.setLocation(160, 80);
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource() == ok_button)
			{
				work_for_password_field();
			}
			if(event.getSource() == cancel_button)
			{
				frame_for_password.setVisible(false);
				combobox.main_class.frame.setVisible(true);
				combobox.main_class.frame.setEnabled(true);
			}
		}
	}
	
	public void work_for_password_field()
	{
		try 
		{
			file_scanner = new Scanner( new File("src/passwod.txt"));
			if(file_scanner.nextLine().equals(password_field.getText()))
			{
				new Set_Update_Rate(this);
				frame_for_password.setVisible(false);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Password Not Matched");
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
