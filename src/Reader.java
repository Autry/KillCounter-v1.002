import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Reader extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static Border emptyBorder = BorderFactory.createEmptyBorder();

	public static JLabel title = new JLabel("New User");
	public static JLabel usernameLabel = new JLabel("Username:");
	public static JLabel passwordLabel = new JLabel("Password:");
	public static JLabel image = new JLabel();

	public static JTextField username = new JTextField();
	public static JPasswordField password = new JPasswordField();

	public static JButton enter = new JButton();

	public static ImageIcon icon = new ImageIcon("C:\\Users\\Ryan\\Desktop\\My Files\\GUI Programs\\DayZ Kill-Death\\Pictures\\images.jpg");
	public static ImageIcon enterImage = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/enter.png");

	public static void createFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("New User");
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setSize(400, 250);
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
				frame.getContentPane().setLayout(null);
				frame.setBackground(Color.black);

				title.setBounds(189, 20, 179, 58);
				title.setFont(new Font("Minisystem", Font.PLAIN, 35));
				title.setForeground(Color.white);

				usernameLabel.setBounds(181, 94, 81, 23);
				usernameLabel.setFont(new Font("Minisystem", Font.PLAIN, 13));
				usernameLabel.setForeground(Color.white);

				passwordLabel.setBounds(181, 123, 81, 26);
				passwordLabel.setFont(new Font("Minisystem", Font.PLAIN, 13));
				passwordLabel.setForeground(Color.white);

				image.setBounds(10, 10, 154, 191);
				image.setIcon(icon);

				username.setBounds(268, 94, 106, 21);
				username.setFont(new Font("Minisystem", Font.PLAIN, 15));
				username.setForeground(Color.black);

				password.setBounds(268, 123, 106, 21);

				enter.setBounds(293, 176, 75, 25);
				enter.setBorder(emptyBorder);
				enter.setBackground(Color.black);
				enter.setIcon(enterImage);

				enter.addActionListener(new Reader());

				frame.add(title);
				frame.add(usernameLabel);
				frame.add(passwordLabel);
				frame.add(image);
				frame.add(username);
				frame.add(password);
				frame.add(enter);
				frame.setVisible(true);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		String fff;
		String lll;
		if (source == enter) {
			
			fff = password.getText();
			lll = username.getText();
			
			System.out.println(fff + " " + lll);
		}
	}

}
