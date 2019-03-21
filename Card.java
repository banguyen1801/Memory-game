package FirstProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Card extends MemoryGame_ShowGUI implements ActionListener {
	
	public static String btnClicked1;
//	public static void main(String[]  arg) {
	//	System.out.println(MemoryGame_GUI.countCard);
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		//System.out.println("Button Clicked was + " + e.getActionCommand());
		//JButton btnClicked1 = (JButton) e.getSource();
		//String btnClicked = e.getActionCommand();
		String btnClicked =btnClicked1;
//			cardFlip.setEnabled(false);
		if (MemoryGame_GUI.countCard < MemoryGame_GUI.countCardLimit){
		if (btnClicked.equals("0,0") ){
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/aries.png"));
			MemoryGame_GUI.gridButtons[0][0].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("1,0"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/leo.png"));
			MemoryGame_GUI.gridButtons[1][0].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("2,0"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/libra.png"));
			MemoryGame_GUI.gridButtons[2][0].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("0,1"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/pisces.png"));
			MemoryGame_GUI.gridButtons[0][1].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("1,1"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/scorpion.png"));
			MemoryGame_GUI.gridButtons[1][1].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("2,1"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/taurus.png"));
			MemoryGame_GUI.gridButtons[2][1].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("0,2"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/aries.png"));
			MemoryGame_GUI.gridButtons[0][2].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("1,2"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/libra.png"));
			MemoryGame_GUI.gridButtons[1][2].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("2,2"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/pisces.png"));
			MemoryGame_GUI.gridButtons[2][2].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("0,3"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/scorpion.png"));
			MemoryGame_GUI.gridButtons[0][3].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("1,3"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/taurus.png"));
			MemoryGame_GUI.gridButtons[1][3].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		else if (btnClicked.equals("2,3"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/leo.png"));
			MemoryGame_GUI.gridButtons[2][3].setIcon(card);
			MemoryGame_GUI.countCard++;
		}
		} else if (MemoryGame_GUI.countCard == 2) {
			JOptionPane.showMessageDialog(null, "Need matches checker method!");
			MemoryGame_GUI.countCard++;
		} else {
			
		}
	}

}
