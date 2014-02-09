package ch.zbw.TrioPack.VokabelTrainer.view;

public class InterfaceLanguage {
	private char interfacelanguage;
	private String mainScreen_title;
	private String mainScreen_closebutton;
	private String mainScreen_jmenuitem1;
	private String mainScreen_jmenuitem2;
	private String mainScreen_jmenuitem1_1;
	private String mainScreen_jmenuitem1_1_1;
	private String mainScreen_jmenuitem1_1_2;
	private String mainScreen_jmenuitem1_1_3;
	private String mainScreen_jmenuitem1_1_4;
	private String mainScreen_jmenuitem1_2;
	private String mainScreen_jmenuitem2_1;

	private String welcomeScreen_message;
	private String welcomeScreen_menubutton1;
	private String welcomeScreen_menubutton2;
	private String welcomeScreen_savebutton;
	private String welcomeScreen_loadbutton;
	private String welcomeScreen_usernamelabel;

	public InterfaceLanguage(char interfacelanguage) {
		this.interfacelanguage = interfacelanguage;
		if (interfacelanguage == 'd') {
			this.mainScreen_title = "Herzlich Willkommen";
			this.mainScreen_closebutton = "Programm beenden";
			this.mainScreen_jmenuitem1 = "Datei";
			this.mainScreen_jmenuitem2 = "Info";
			this.mainScreen_jmenuitem1_1 = "Programmsprache wählen";
			this.mainScreen_jmenuitem1_1_1 = "Deutsch";
			this.mainScreen_jmenuitem1_1_2 = "Französisch";
			this.mainScreen_jmenuitem1_1_3 = "Italienisch";
			this.mainScreen_jmenuitem1_1_4 = "Englisch";
			this.mainScreen_jmenuitem1_2 = "Programm beenden";
			this.mainScreen_jmenuitem2_1 = "Über uns";

			this.welcomeScreen_message = "<html><body><font color=#F42642 size='10'><p>Herzlich Willkommen!</p></font>Dies ist der VokabelTrainer 2014 von Team TrioPack. <br>Um mit dem Lernen zu beginnen oder neue Wörter zu erfassen,<br> musst Du als erstes einen Benutzer anlegen oder laden.<br><br> Viel Erfolg beim Lernen wünscht Team TrioPack!<br><br></body></html>";
			this.welcomeScreen_menubutton1 = "Wörter erfassen";
			this.welcomeScreen_menubutton2 = "Wörter Lernen";
			this.welcomeScreen_savebutton = "User speichern";
			this.welcomeScreen_loadbutton = "User laden";
			this.welcomeScreen_usernamelabel = "Benutzer: ";
		}
		if (interfacelanguage == 'e') {

		}
	}

	public String getMainScreen_title() {
		return mainScreen_title;
	}

	public String getWelcomeScreen_message() {
		return welcomeScreen_message;
	}

	public String getWelcomeScreen_menubutton1() {
		return welcomeScreen_menubutton1;
	}

	public String getWelcomeScreen_menubutton2() {
		return welcomeScreen_menubutton2;
	}

	public String getMainScreen_closebutton() {
		return mainScreen_closebutton;
	}

	public String getWelcomeScreen_savebutton() {
		return welcomeScreen_savebutton;
	}

	public String getWelcomeScreen_loadbutton() {
		return welcomeScreen_loadbutton;
	}

	public char getInterfacelanguage() {
		return interfacelanguage;
	}

	public String getMainScreen_jmenuitem1() {
		return mainScreen_jmenuitem1;
	}

	public String getMainScreen_jmenuitem2() {
		return mainScreen_jmenuitem2;
	}

	public String getMainScreen_jmenuitem1_1() {
		return mainScreen_jmenuitem1_1;
	}

	public String getMainScreen_jmenuitem1_1_1() {
		return mainScreen_jmenuitem1_1_1;
	}

	public String getMainScreen_jmenuitem1_1_2() {
		return mainScreen_jmenuitem1_1_2;
	}

	public String getMainScreen_jmenuitem1_1_3() {
		return mainScreen_jmenuitem1_1_3;
	}

	public String getMainScreen_jmenuitem1_1_4() {
		return mainScreen_jmenuitem1_1_4;
	}

	public String getMainScreen_jmenuitem1_2() {
		return mainScreen_jmenuitem1_2;
	}

	public String getMainScreen_jmenuitem2_1() {
		return mainScreen_jmenuitem2_1;
	}

	public String getWelcomeScreen_usernamelabel() {
		return welcomeScreen_usernamelabel;
	}

}
