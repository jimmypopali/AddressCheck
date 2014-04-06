import javax.swing.JLabel;
import javax.swing.JPanel;


public class AddName extends JPanel{
	public AddName() {
		addNamePanel = new JPanel();
		label1 = new JLabel("THIS WORKS FOR ADD NAME");
		add(label1);
	}
	JLabel label1;
	JPanel addNamePanel;
}
