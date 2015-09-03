import javax.swing.JButton;
import javax.swing.JLabel;

public class Math {
	int answer, killText, killCounter;
	String currentKillsCounter, currentDeathsCounter;

	public JLabel addCurrent(JLabel label, JButton button) {
		currentKillsCounter = label.getText();
		killCounter = Integer.parseInt(currentKillsCounter);
		killText = killCounter + 1;
		label.setText(String.valueOf(killText));
		return label;
	}
	
	public JLabel subCurrent(JButton button, JLabel label) {
		currentKillsCounter = label.getText();
		killCounter = Integer.parseInt(currentKillsCounter);
		killText = killCounter - 1;
		label.setText(String.valueOf(killText));
		return label;
	}
	
	public JLabel clear(JButton button, JLabel label){
		currentKillsCounter = label.getText();
		killCounter = Integer.parseInt(currentKillsCounter);
		killText = 0;
		label.setText(String.valueOf(killText));
		return label;
	}
	
	public JLabel test(String string, JLabel label){
		int test = Integer.parseInt(string);
		
		
		return label;
	}

	public int addCurrentInt(JLabel label) {
		currentKillsCounter = label.getText();
		int integer = Integer.parseInt(currentKillsCounter);
		return integer;
	}
	
	public JLabel background(JLabel label, String string){
		currentKillsCounter = label.getText();
		killCounter = Integer.parseInt(currentKillsCounter);
		int something = Integer.parseInt(string);
		killText = killCounter + something;
		label.setText(String.valueOf(killText));
		return label;
	}
	

}
