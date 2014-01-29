package main.java.gui;

import javax.swing.SwingUtilities;

public class WindowDialog {
	
	public static void main(String[] args){
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run(){
			
			
//			MyWindow fen = new MyWindow();
//			fen.setVisible(true);
			MainWindow fen = new MainWindow();
			fen.setVisible(true);
		}
	});
	}
}
