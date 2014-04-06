import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App implements ActionListener{

	JPanel cards;
	final static String BUTTONPANEL = "SearchName panel";
	final static String BUTTONPANEL2 = "AddName panel";
	final static String BUTTONPANEL3 = "EditName Panel";
	final static String BUTTONPANEL4 = "About Panel";
	
	JButton searchNameBtn;
	JButton addNameBtn;
	JButton editNameBtn;
	JButton aboutBtn;
	
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
	
	
	
	public void addComponantToPane(Container pane) {
		JPanel titlePanel = new JPanel();
		searchNameBtn = new JButton("Search By Name");
		addNameBtn = new JButton("Add Name");
		editNameBtn = new JButton("Edit name");
		aboutBtn = new JButton("About");
		
		searchNameBtn.addActionListener(this);
		addNameBtn.addActionListener(this);
		editNameBtn.addActionListener(this);
		aboutBtn.addActionListener(this);
		
		titlePanel.add(searchNameBtn);
		titlePanel.add(addNameBtn);
		titlePanel.add(editNameBtn);
		titlePanel.add(aboutBtn);
		
		
		//adds the cards
		
		SearchByName searchByNamePanel = new SearchByName();
		AddName addNamePanel = new AddName();
		EditName editNamePanel = new EditName();
		About aboutPanel = new About();
		
		
		//create the panel that contains the 'cards'
		cards = new JPanel(new CardLayout());
		cards.add(searchByNamePanel, BUTTONPANEL);
		cards.add(addNamePanel, BUTTONPANEL2);
		cards.add(editNamePanel, BUTTONPANEL3);
		cards.add(aboutPanel, BUTTONPANEL4);
		
		pane.add(titlePanel, BorderLayout.PAGE_START);
		pane.add(cards, BorderLayout.CENTER);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == searchNameBtn) {
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, BUTTONPANEL);
		} else if (e.getSource() == addNameBtn) {
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, BUTTONPANEL2);
		} else if (e.getSource() == editNameBtn) {
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, BUTTONPANEL3);
		} else if (e.getSource() == aboutBtn) {
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, BUTTONPANEL4);
		}
	}
	
	

	public void itemStateChanged(ItemEvent evt) {
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, (String)evt.getItem());
	}
	
	public static void createAndShowGUI() {
		//setting up the window
		JFrame frame = new JFrame("Application1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600,600));
		
		App application = new App();
		application.addComponantToPane(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
}
