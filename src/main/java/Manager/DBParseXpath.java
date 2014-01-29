package main.java.Manager;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

import main.java.gui.MyWindow;

public class DBParseXpath extends AbstractAction {

	/**
	 * 
	 */
	private JTextField requete ;
	private static final long serialVersionUID = 1L;
	MyWindow fen ;
	public DBParseXpath(String texte, JTextField req) {
		super(texte);
		requete = req;
	}
	 public DBParseXpath(String texte) {
		 super(texte);
		 fen = new MyWindow();
		
		 
	}
	DBFormat xpathRequester (String request){
		DBFormat result = null;
		
		return result;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(requete.getText());
		
	}
}
