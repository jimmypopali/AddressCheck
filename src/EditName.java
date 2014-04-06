import javax.swing.JLabel;
import javax.swing.JPanel;


public class EditName extends JPanel{
	public EditName() {
		editNamePanel = new JPanel();
		label1 = new JLabel("This works for Edit name");
		add(label1);
	}
	JLabel label1;
	JPanel editNamePanel;
}
