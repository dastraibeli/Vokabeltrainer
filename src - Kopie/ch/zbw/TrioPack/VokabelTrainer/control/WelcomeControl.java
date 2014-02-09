package ch.zbw.TrioPack.VokabelTrainer.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch.zbw.TrioPack.VokabelTrainer.model.*;
import ch.zbw.TrioPack.VokabelTrainer.view.*;

public class WelcomeControl {

	private WelcomeScreen welcomeScreen;
	private User user;
	private UserArray userarray;

	public WelcomeControl(WelcomeScreen view, User model) {
		// TODO Auto-generated constructor stub
		this.user = model;
		this.welcomeScreen = view;
		userarray = new UserArray();
		welcomeScreen.loadUsernames(userarray.getAllUser()); //Bereits gespeicherte Usernamen in Combobox einfügen
		addListener();
	}

	/**
	 * Die Listener, die wir aus den Internen Klassen generieren werden der View
	 * bekannt gemacht, sodass diese mit uns (dem Controller) kommunizieren kann
	 */
	private void addListener() {
		this.welcomeScreen.setSaveuserListener(new SaveuserListener());
		this.welcomeScreen.setRecordListener(new RecordListener());
		this.welcomeScreen.setQueryListener(new QueryListener());
		this.welcomeScreen.setCloseListener(new CloseListener());
		this.welcomeScreen.setLoaduserListener(new LoadUserListener());
	}

	class SaveuserListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("User wurde gespeichert");
			String wert = welcomeScreen.getUsername();
			userarray.addUser(new User(wert));
			welcomeScreen.loadUsernames(userarray.getAllUser()); 	//alles aktualisieren
			welcomeScreen.enableButtons();
		}
	}

	class LoadUserListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("User wird geladen");
			welcomeScreen.loadUsernames(userarray.getAllUser());

		}
	}

	class RecordListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			System.out
					.println("Hier öffnet sich das Fenster zum erfassen von Wörtern");

			// Neue View (Wörter erfassen/Wörter lernen) öffnen

			// singleton
		}
	}

	class QueryListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out
					.println("Hier öffnet sich das Fenster zum abfragen von Wörtern");

			// welcomeView. _model.getName();
			// String wert = welcomeView.getEingabe();
			// _model.berechneWurzel(wert);
			// _view.setErgebnis(String.valueOf(_model.getWurzel()));
		}
	}

	class CloseListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("CloseListener wurde ausgeführt");
			System.exit(0);
		}
	}

}