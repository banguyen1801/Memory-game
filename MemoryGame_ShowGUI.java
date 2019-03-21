package FirstProject;

import javax.swing.JFrame;

public class MemoryGame_ShowGUI {
	public static void main(String[] args) {
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				MemoryGame_GUI mmr = new MemoryGame_GUI();
				mmr.setSize(900, 800);
				mmr.setTitle("MEMORY GAME!!!");
				mmr.setVisible(true);
				mmr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			
		});
	} //Close main

}//close MemoryGame_ShowGUI
