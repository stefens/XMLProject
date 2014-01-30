package main.java.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

public class DBParseXpathGUI extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DBParseXpathCreation fen ;

	 public DBParseXpathGUI(String texte) {
		 super(texte);
		 fen = new DBParseXpathCreation();
		 fen.setDefaultCloseOperation(fen.HIDE_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		fen.setVisible(true);
		
	}
}
