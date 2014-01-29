package main.java.Manager;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

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
	public String xpathRequester (String request){
		Document doc = DOMTools.getDOMFromXMLFile(new File("contenu_champs.xml"));
		NodeList nodelist = DOMTools.getNodeListFromXPathQuery(request, doc);
		String result = DOMTools.nodeListToString(nodelist);
		System.out.println(result);
		return result;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		xpathRequester(requete.getText());
		
	}
}
