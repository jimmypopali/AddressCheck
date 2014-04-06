import javax.swing.JLabel;
import javax.swing.JPanel;


public class About extends JPanel{
	public About() {
		aboutPanel = new JPanel();
		label1 = new JLabel("This works for About Panel");
		add(label1);
	}
	JLabel label1;
	JPanel aboutPanel;
}
