package ch.zbw.TrioPack.VokabelTrainer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class UserArray {

	// private ArrayList<User> user;
	private HashSet<User> player;

	private int countUser;

	public UserArray() {

		this.player = new HashSet<User>();
	}

	// This Method adds an Userobject into the Array

	public void addUser(User nameOfUser) {

		if (player != null) {
			player.add(nameOfUser);
			System.out.println(nameOfUser.getName()+" geadded");
		}

	}

	public String[] getAllUser() {
		int i = 0;
		String[] name;
		name = new String[player.size()];
		for (User nameOfUser : player) {
			name[i] = nameOfUser.getName();
			i++;
		}
		System.out.println("geschafft");
		return name;
	}
}