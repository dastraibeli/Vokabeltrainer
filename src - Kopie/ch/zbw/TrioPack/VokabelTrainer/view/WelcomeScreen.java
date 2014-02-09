package ch.zbw.TrioPack.VokabelTrainer.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class WelcomeScreen extends MainScreen {
	private JLabel jlabel1;
	private JLabel usernamelabel;
	private JComboBox<String> username;
	private JButton menubutton1;
	private JButton menubutton2;
	private JButton saveuserbutton;
	private JButton loaduserbutton;
	private MainScreen mainscreen;

	public WelcomeScreen() {
		mainscreen = MainScreen.getMainScreen();
		this.creategui();
	}

	public void creategui() {
		// place Intro text on panel2
		jlabel1 = new JLabel(this.interfacelanguage.getWelcomeScreen_message());
		mainscreen.getJpanel2().add(jlabel1);

		// place user login on panel3
		username = new JComboBox<String>();
		username.setEditable(true);
		username.setPreferredSize(new Dimension(200, 25));
		saveuserbutton = new JButton(
				interfacelanguage.getWelcomeScreen_savebutton());
		loaduserbutton = new JButton(
				interfacelanguage.getWelcomeScreen_loadbutton());
		usernamelabel = new JLabel(
				interfacelanguage.getWelcomeScreen_usernamelabel());
		mainscreen.getJpanel3().add(usernamelabel);
		mainscreen.getJpanel3().add(username);
		mainscreen.getJpanel3().add(saveuserbutton);
		// jpanel3.add(loaduserbutton);

		// panel4
		ImageIcon menubutton1icon = new ImageIcon("/resources/save-words.png");
		ImageIcon menubutton2icon = new ImageIcon("/resources/lean-words.png");
		menubutton1 = new JButton(
				interfacelanguage.getWelcomeScreen_menubutton1(), menubutton1icon);
		menubutton2 = new JButton(
				interfacelanguage.getWelcomeScreen_menubutton2(), menubutton2icon);
		menubutton1.setPreferredSize(new Dimension(200, 50));
		menubutton2.setPreferredSize(new Dimension(200, 50));
		menubutton1.setEnabled(false);
		menubutton2.setEnabled(false);
		mainscreen.getJpanel4().add(menubutton1);
		mainscreen.getJpanel4().add(menubutton2);
	}

	// listener for saving usernames
	public void setSaveuserListener(ActionListener saveuserlistener) {
		this.saveuserbutton.addActionListener(saveuserlistener);
	}

	// listener for loading users
	public void setLoaduserListener(ActionListener loaduserlistener) {
		this.loaduserbutton.addActionListener(loaduserlistener);
	}

	// listener for the menubutton1 (add words)
	public void setRecordListener(ActionListener recordlistener) {
		this.menubutton1.addActionListener(recordlistener);
	}

	// listener for the menubutton2 (learn words)
	public void setQueryListener(ActionListener querylistener) {
		this.menubutton2.addActionListener(querylistener);
	}

	// returns the input in JComboField as a String
	public String getUsername() {
		return (String) username.getSelectedItem();
	}

	public void loadUsernames(String[] input) {
		username.removeAllItems();
		for (int i = 0; i < input.length; i++) {
			username.addItem(input[i]);
		}
	}
	
	public void enableButtons() {
		menubutton1.setEnabled(true);
		menubutton2.setEnabled(true);
	}
}
