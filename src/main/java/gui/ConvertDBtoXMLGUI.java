package main.java.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ConvertDBtoXMLGUI extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ConvertDBtoXMLCreation fen ;

	 public ConvertDBtoXMLGUI(String texte) {
		 super(texte);
		 fen = new ConvertDBtoXMLCreation();
		 fen.setDefaultCloseOperation(fen.HIDE_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		fen.setVisible(true);
		
		
	}
}
