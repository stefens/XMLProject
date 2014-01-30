package main.java.Manager;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

public class ConvertDBtoXML extends AbstractAction{

	JFileChooser file;
	public ConvertDBtoXML(String texte, JFileChooser file) {
		super(texte);
		this.file = file;
	}

	void convertDBToXml (File f){
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int returnVal = file.showOpenDialog(file);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            file.getSelectedFile().getName());
	    }
		
	}
}
