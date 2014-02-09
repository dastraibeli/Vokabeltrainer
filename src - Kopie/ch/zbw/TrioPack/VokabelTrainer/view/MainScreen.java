package ch.zbw.TrioPack.VokabelTrainer.view;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainScreen extends JFrame {
	private static MainScreen mainscreenSingleton;
	private JMenuBar jmenubar1;
	private JMenuItem jmenuitem1;
	private JMenuItem jmenuitem2;
	private JMenuItem jmenuitem1_1;
	private JMenuItem jmenuitem1_1_1;
	private JMenuItem jmenuitem1_1_2;
	private JMenuItem jmenuitem1_1_3;
	private JMenuItem jmenuitem1_1_4;
	private JMenuItem jmenuitem1_2;
	private JMenuItem jmenuitem2_1;
	private JPanel jpanel1;
	private JPanel jpanel2;
	private JPanel jpanel3;
	private JPanel jpanel4;
	private JPanel jpanel5;
	private JButton menubutton3;
	protected InterfaceLanguage interfacelanguage;

	public MainScreen() {
		this.interfacelanguage = new InterfaceLanguage('d');
		this.creategui();
	}

	public static MainScreen getMainScreen() {
		if (mainscreenSingleton == null) {
			mainscreenSingleton = new MainScreen();
		}
		return mainscreenSingleton;
	}

	public void creategui() {

		// initialize JFrame
		setTitle("VocaTrainer 2014 - "
				+ interfacelanguage.getMainScreen_title());
		setSize(600, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

		// center JFrame
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2
				- getSize().height / 2);

		// place four panels on the jframe
		jpanel1 = new JPanel();
		jpanel2 = new JPanel();
		jpanel3 = new JPanel();
		jpanel4 = new JPanel();
		jpanel5 = new JPanel();
		jpanel1.setLayout(new BorderLayout());
		jpanel2.setLayout(new FlowLayout());
		jpanel3.setLayout(new FlowLayout());
		jpanel4.setLayout(new FlowLayout());
		jpanel5.setLayout(new BorderLayout());
		jpanel2.setBackground(Color.WHITE);
		jpanel3.setBackground(Color.WHITE);
		jpanel4.setBackground(Color.WHITE);

		add(jpanel1);
		add(jpanel2);
		add(jpanel3);
		add(jpanel4);
		add(jpanel5);

		jpanel1.setPreferredSize(new Dimension(600, 25));
		jpanel2.setPreferredSize(new Dimension(600, 175));
		jpanel3.setPreferredSize(new Dimension(600, 80));
		jpanel4.setPreferredSize(new Dimension(600, 100));
		jpanel5.setPreferredSize(new Dimension(600, 25));

		// place content on panel1
		createJMenuBar();
		jpanel1.add(jmenubar1, BorderLayout.NORTH);

		// place close button on panel5
		menubutton3 = new JButton(interfacelanguage.getMainScreen_closebutton());
		jpanel5.add(menubutton3, BorderLayout.SOUTH);

		setVisible(true);
	}

	// creates the menu on top
	public void createJMenuBar() {
		jmenubar1 = new JMenuBar();
		jmenuitem1 = new JMenu(interfacelanguage.getMainScreen_jmenuitem1());
		jmenuitem2 = new JMenu(interfacelanguage.getMainScreen_jmenuitem2());
		jmenuitem1_1 = new JMenu(interfacelanguage.getMainScreen_jmenuitem1_1());
		jmenuitem1_1_1 = new JMenuItem(
				interfacelanguage.getMainScreen_jmenuitem1_1_1());
		jmenuitem1_1_2 = new JMenuItem(
				interfacelanguage.getMainScreen_jmenuitem1_1_2());
		jmenuitem1_1_3 = new JMenuItem(
				interfacelanguage.getMainScreen_jmenuitem1_1_3());
		jmenuitem1_1_4 = new JMenuItem(
				interfacelanguage.getMainScreen_jmenuitem1_1_4());
		jmenuitem1_2 = new JMenuItem(
				interfacelanguage.getMainScreen_jmenuitem1_2());
		jmenuitem2_1 = new JMenuItem(
				interfacelanguage.getMainScreen_jmenuitem2_1());

		jmenubar1.add(jmenuitem1);
		jmenuitem1.add(jmenuitem1_1);
		jmenuitem1_1.add(jmenuitem1_1_1);
		jmenuitem1_1.add(jmenuitem1_1_2);
		jmenuitem1_1.add(jmenuitem1_1_3);
		jmenuitem1_1.add(jmenuitem1_1_4);
		jmenuitem1.add(jmenuitem1_2);
		jmenubar1.add(jmenuitem2);
		jmenuitem2.add(jmenuitem2_1);
	}

	// listener for the menubutton3 and the menuitem1_2 (close program)
	public void setCloseListener(ActionListener closelistener) {
		this.menubutton3.addActionListener(closelistener);
		this.jmenuitem1_2.addActionListener(closelistener);
	}

	// listener for the program languages
	public void setLanguageListener(ActionListener languagelistener) {
		this.jmenuitem1_1_1.addActionListener(languagelistener);
		this.jmenuitem1_1_2.addActionListener(languagelistener);
		this.jmenuitem1_1_3.addActionListener(languagelistener);
		this.jmenuitem1_1_4.addActionListener(languagelistener);
	}

	public JPanel getJpanel1() {
		return jpanel1;
	}

	public JPanel getJpanel2() {
		return jpanel2;
	}

	public JPanel getJpanel3() {
		return jpanel3;
	}

	public JPanel getJpanel4() {
		return jpanel4;
	}

	public JPanel getJpanel5() {
		return jpanel5;
	}

}
