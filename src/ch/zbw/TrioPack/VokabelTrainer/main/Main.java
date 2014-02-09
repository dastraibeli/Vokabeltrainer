package ch.zbw.TrioPack.VokabelTrainer.main;

import ch.zbw.TrioPack.VokabelTrainer.control.*;
import ch.zbw.TrioPack.VokabelTrainer.model.*;
import ch.zbw.TrioPack.VokabelTrainer.view.*;

/**
 * @author omikron
 * 
 */
public class Main {

	static WelcomeControl wController;
	static User wModel;
	static WelcomePanel wView;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		wModel = new User();


		// wController = new WelcomeControl(wView, wModel);
		// MainScreen mainScreen = new MainScreen();
		new MainScreen();
		// new Cards_GenerateScreen();
		// wView.setVisible(true);

	}

}