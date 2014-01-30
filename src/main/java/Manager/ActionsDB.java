package main.java.Manager;

import java.io.File;
import java.sql.Connection;

import main.sql.CreateBDD;

import org.w3c.dom.Document;

public class ActionsDB {

	public void insert()
	{
		Document doc = DOMTools.getDOMFromXMLFile(new File("contenu_champs_insertion.xml"));
		String requete = "";
		CreateBDD bdd;
		try {
			bdd = new CreateBDD();
			Connection con = bdd.getConnection();
			//bdd.insertRow("INSERT INTO "+)
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete()
	{
		Document doc = DOMTools.getDOMFromXMLFile(new File("contenu_champs_suppression.xml"));
		String requete = "";
	}
}
