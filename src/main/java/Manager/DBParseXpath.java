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
	String xpathRequester (String request){
		String result = request;
		System.out.println(request);
		return result;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		xpathRequester(requete.getText());
		
	}
}
