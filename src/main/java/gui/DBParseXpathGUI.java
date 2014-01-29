package main.java.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

public class DBParseXpathGUI extends AbstractAction {

	/**
	 * 
	 */
	private JTextField requete ;
	private static final long serialVersionUID = 1L;
	MyWindow fen ;
	public DBParseXpathGUI(String texte, JTextField req) {
		super(texte);
		requete = req;
	}
	 public DBParseXpathGUI(String texte) {
		 super(texte);
		 fen = new MyWindow();
		
		 
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		fen.setVisible(true);
		
	}
}
