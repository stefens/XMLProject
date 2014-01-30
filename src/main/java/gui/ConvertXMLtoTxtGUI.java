package main.java.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class ConvertXMLtoTxtGUI extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ConvertXMLtoTxtCreation fen ;

	 public ConvertXMLtoTxtGUI(String texte) {
		 super(texte);
		 fen = new ConvertXMLtoTxtCreation();
		 fen.setDefaultCloseOperation(fen.HIDE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fen.setVisible(true);
		
		
	}
}
