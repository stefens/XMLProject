package main.java.Manager;

import java.io.File;

import org.w3c.dom.Document;

public class ActionsDB {

	public void insert()
	{
		Document doc = DOMTools.getDOMFromXMLFile(new File("contenu_champs_insertion.xml"));
		String requete = "";
	}
	
	public void delete()
	{
		Document doc = DOMTools.getDOMFromXMLFile(new File("contenu_champs_suppression.xml"));
		String requete = "";
	}
}
