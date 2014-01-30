package main.java.Manager;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

public class ConvertXMLToText extends AbstractAction {

	private File f;
	JFileChooser file;
	File output;

	public ConvertXMLToText(String texte, JFileChooser fileChooser) {
		super(texte);
		file = fileChooser;
	}

	void convertXMLToText(File file) throws IOException {
	
		output = new File("result.txt");
		BufferedReader buf = new BufferedReader(new FileReader(file));
		FileWriter fileWriter = new FileWriter(output, false);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String s = null;
		while((s = buf.readLine()) != null)
		{
			System.out.println(s);
			bufferedWriter.write(s+"\n");
		}
		
		bufferedWriter.flush();
		bufferedWriter.close();	
		buf.close();
		
//		Logger _mylogger = Logger.getLogger("_mylogger");
//		_mylogger.log(Level.INFO, "hey salut");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int returnVal = file.showOpenDialog(file);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
				try {
					convertXMLToText(file.getSelectedFile());
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
			

		}
	}
}
