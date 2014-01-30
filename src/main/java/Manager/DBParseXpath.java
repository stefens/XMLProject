package main.java.Manager;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class DBParseXpath extends AbstractAction {

        /**
         * 
         */
        private JTextField requete ;
        private JLabel result;
        private static final long serialVersionUID = 1L;
        public DBParseXpath(String texte, JTextField req, JLabel result) {
                super(texte);
                requete = req;
                this.result = result;
        }
        public String xpathRequester (String request){
                Document doc = DOMTools.getDOMFromXMLFile(new File("contenu_champs.xml"));
                NodeList nodelist = DOMTools.getNodeListFromXPathQuery(request, doc);
                String result = DOMTools.nodeListToString(nodelist);
                return result;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
        		String retVal;
        		retVal = xpathRequester(requete.getText());
        		System.out.println(retVal);
                
                
        }
}