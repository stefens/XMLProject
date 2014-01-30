package main.java.Manager;

import java.awt.event.ActionEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

import main.sql.CreateBDD;

public class ConvertDBtoXML extends AbstractAction{

	JFileChooser file;
	public ConvertDBtoXML(String texte, JFileChooser file) {
		super(texte);
		this.file = file;
	}

	void convertDBToXml (File f){
		try 
		{
			CreateBDD db = new CreateBDD();
			try {
				ResultSet r = db.select("SELECT * FROM person");
			 	while(r.next())
			    {
			 		
			 		System.out.println("0 = " + r.getInt(0));
			        System.out.println("1 = " + r.getString(1));
			    }
				
			} catch (SQLException e) {e.printStackTrace();}
		} catch (ClassNotFoundException e) {e.printStackTrace();}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int returnVal = file.showOpenDialog(file);
		
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            file.getSelectedFile().getName());
	       		convertDBToXml(new File(file.getSelectedFile().getName()));
	    }
		
	}
}
