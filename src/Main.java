import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class Main extends JFrame implements ActionListener {

	public static String mainTitle = "This is a Test";

	public JLabel killsLabel = new JLabel("Kills");
	public JLabel deathsLabel = new JLabel("Deaths");
	public JLabel allTime = new JLabel("All-Time");
	public JLabel currentKills = new JLabel("0");
	public JLabel currentDeaths = new JLabel("0");
	public static JLabel allTimeKills = new JLabel("0");
	public static JLabel allTimeDeaths = new JLabel("0");
	public static JLabel areYouSure = new JLabel("Are you sure you want to reset your overall record?");
	public static JLabel saved = new JLabel("You have saved!");

	public JButton plus = new JButton();
	public JButton plus1 = new JButton();
	public JButton minus = new JButton();
	public JButton minus1 = new JButton();
	public JButton reset = new JButton();
	public JButton newUser = new JButton();
	public JButton save = new JButton();
	public JButton resetAllTime = new JButton();

	public JComboBox chooseUser = new JComboBox();

	public ImageIcon plusButtonImage = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/plusv2.png");
	public ImageIcon minusButtonImage = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/minusv2.png");
	public ImageIcon newUserButtonImage = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/newUser.png");
	public ImageIcon saveButtonImage = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/save.png");
	public ImageIcon resetButtonImage = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/reset.png");
	public ImageIcon resetAllButtonImage = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/startOver.png");
	public ImageIcon frameIcon = new ImageIcon("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/icon.png");
	
	public Border emptyBorder = BorderFactory.createEmptyBorder();

	public static File storage = new File("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/KD.txt");

	public static int allTimeKillsStorage;
	public static int allTimeDeathsStorage;

	public Math math = new Math();
	public Reader read = new Reader();
	public UIManager UI = new UIManager();

	public static String line = null;
	public static String line2 = null;

	public static void readFile() {
		FileReader fr;
		try {
			Scanner scan = new Scanner(storage);
			while (scan.hasNextLine()) {
				String[] numstrs = scan.nextLine().split("\\s+");
				int[] nums = new int[numstrs.length];

				for (int i = 0; i < nums.length; i++)
					nums[i] = Integer.parseInt(numstrs[i]);

				allTimeKillsStorage = nums[0];
				allTimeDeathsStorage = nums[1];

				System.out.println(allTimeKillsStorage + "-" + allTimeDeathsStorage);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		allTimeKills.setText(String.valueOf(allTimeKillsStorage));
		allTimeDeaths.setText(String.valueOf(allTimeDeathsStorage));
	}

	public Main() {
		super(mainTitle);
		setResizable(false);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Users/Ryan/Desktop/My Files/GUI Programs/DayZ Kill-Death/Pictures/DayzTest.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setIconImage(frameIcon.getImage());

		killsLabel.setBounds(22, 160, 55, 15);
		killsLabel.setForeground(Color.white);

		deathsLabel.setBounds(22, 183, 55, 15);
		deathsLabel.setForeground(Color.white);

		allTime.setBounds(22, 234, 75, 15);
		allTime.setForeground(Color.white);

		reset.setBounds(218, 233, 75, 25);

		chooseUser.setBounds(283, 160, 91, 21);
		newUser.setBounds(299, 202, 75, 25);

		plus.setBounds(83, 160, 20, 10);
		minus.setBounds(109, 160, 20, 10);
		plus1.setBounds(83, 183, 20, 10);
		minus1.setBounds(109, 183, 20, 10);

		resetAllTime.setBounds(299, 233, 75, 25);
		save.setBounds(218, 202, 75, 25);

		currentKills.setBounds(150, 157, 65, 35);
		currentKills.setForeground(Color.white);

		currentDeaths.setBounds(219, 157, 65, 35);
		currentDeaths.setForeground(Color.white);

		allTimeKills.setBounds(99, 231, 40, 20);
		allTimeKills.setForeground(Color.white);

		allTimeDeaths.setBounds(150, 231, 40, 20);
		allTimeDeaths.setForeground(Color.white);

		killsLabel.setFont(new Font("Minisystem", Font.PLAIN, 17));
		deathsLabel.setFont(new Font("Minisystem", Font.PLAIN, 14));
		allTime.setFont(new Font("Minisystem", Font.PLAIN, 13));
		currentKills.setFont(new Font("Minisystem", Font.PLAIN, 28));
		currentDeaths.setFont(new Font("Minisystem", Font.PLAIN, 28));
		allTimeKills.setFont(new Font("Minisystem", Font.PLAIN, 19));
		allTimeDeaths.setFont(new Font("Minisystem", Font.PLAIN, 19));

		currentKills.setForeground(Color.green);
		currentDeaths.setForeground(Color.red);

		allTimeKills.setForeground(Color.green);
		allTimeDeaths.setForeground(Color.red);

		plus1.setBorder(emptyBorder);
		plus1.setIcon(plusButtonImage);
		plus.setBorder(emptyBorder);
		plus.setIcon(plusButtonImage);

		minus1.setBorder(emptyBorder);
		minus1.setIcon(minusButtonImage);
		minus.setBorder(emptyBorder);
		minus.setIcon(minusButtonImage);

		save.setBorder(emptyBorder);
		save.setIcon(saveButtonImage);
		reset.setBorder(emptyBorder);
		reset.setIcon(resetButtonImage);
		newUser.setBorder(emptyBorder);
		newUser.setIcon(newUserButtonImage);
		resetAllTime.setBorder(emptyBorder);
		resetAllTime.setIcon(resetAllButtonImage);

		plus1.setBackground(Color.black);
		plus.setBackground(Color.black);
		minus1.setBackground(Color.black);
		minus.setBackground(Color.black);
		save.setBackground(Color.black);
		reset.setBackground(Color.black);
		newUser.setBackground(Color.black);
		resetAllTime.setBackground(Color.black);

		plus.addActionListener(this);
		plus1.addActionListener(this);
		minus.addActionListener(this);
		minus1.addActionListener(this);
		reset.addActionListener(this);
		save.addActionListener(this);
		newUser.addActionListener(this);
		resetAllTime.addActionListener(this);

		add(killsLabel);
		add(deathsLabel);
		add(allTime);
		add(reset);
		add(chooseUser);
		add(newUser);
		add(plus);
		add(minus);
		add(plus1);
		add(minus1);
		add(currentKills);
		add(currentDeaths);
		add(allTimeKills);
		add(allTimeDeaths);
		add(save);
		add(resetAllTime);
		setVisible(true);
	}

	public static void main(String[] args) {
		Main main = new Main();
		Main.readFile();
	}

	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();

		UIManager.put("OptionPane.background", new ColorUIResource(0, 0, 0));
		UIManager.put("Panel.background", new ColorUIResource(0, 0, 0));

		areYouSure.setForeground(Color.white);
		areYouSure.setFont(new Font("Minisystem", Font.PLAIN, 17));

		saved.setForeground(Color.white);
		saved.setFont(new Font("Minisystem", Font.PLAIN, 17));

		if (s == plus) {
			math.addCurrent(currentKills, plus);
			math.addCurrent(allTimeKills, plus);
		}
		if (s == minus) {
			math.subCurrent(minus, currentKills);
			math.subCurrent(minus, allTimeKills);
		}
		if (s == plus1) {
			math.addCurrent(currentDeaths, plus1);
			math.addCurrent(allTimeDeaths, plus1);
		}
		if (s == minus1) {
			math.subCurrent(minus1, currentDeaths);
			math.subCurrent(minus1, allTimeDeaths);
		}
		if (s == reset) {
			math.clear(reset, currentKills);
			math.clear(reset, currentDeaths);
		}
		if (s == save) {
			writeToFile();
			readFile();
			JOptionPane.showMessageDialog(this, saved, "Save", JOptionPane.ERROR_MESSAGE, frameIcon);
		}
		if (s == resetAllTime) {
			int selectedOption = JOptionPane.showConfirmDialog(this, areYouSure, "Start Over", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon);
			if (selectedOption == JOptionPane.YES_OPTION) {
				allTimeKills.setText("0");
				allTimeDeaths.setText("0");
				currentDeaths.setText("0");
				currentKills.setText("0");
				writeToFile();
				readFile();
			}
		}
		if(s == newUser){
			read.createFrame();
		}

	}

	public void writeToFile() {
		try {
			BufferedWriter printer;
			FileWriter fw = new FileWriter(storage.getAbsoluteFile());
			printer = new BufferedWriter(fw);
			printer.write(allTimeKills.getText());
			printer.append(" ");
			printer.write(allTimeDeaths.getText());
			printer.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}