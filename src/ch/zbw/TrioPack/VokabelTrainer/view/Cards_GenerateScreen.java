package ch.zbw.TrioPack.VokabelTrainer.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cards_GenerateScreen extends MainScreen {

	private MainScreen mainscreen;
	private JLabel jlabel1;

	public Cards_GenerateScreen() {
		mainscreen = new MainScreen(); //MainScreen.getMainScreen();
		creategui();
	}
	
	public void creategui() {
		//place conent on panel2
		jlabel1 = new JLabel("Erfasse eine neue Karte");
		System.out.println(mainscreen);
		//mainscreen.getJpanel2().add(jlabel1);
		//place conent on panel3
		//place conent on panel4
		
		
	}

}
