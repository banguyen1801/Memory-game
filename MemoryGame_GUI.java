package FirstProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MemoryGame_GUI extends JFrame implements MemoryGame, ActionListener	 {
	private JPanel mainPanel, BoardPanel, UpperPanel, HintPanel, ForTitle;
	public static JButton [][] gridButtons;
	private JButton continueButton, resetButton, playButton, pic1, pic2, hintpicture;
	private JLabel Status, Matches, Attemps, Score, Title;
	private int numAttempt = 0;
	private int numMatches = 0;
	private int gameResult;
	private boolean defaultCard = true; // default card face down set as true
	public static int countCard = 0;
	public static int countCardLimit = 2;
	public static int Count = 0;
	private String [] btn = new String[2];
	Font d = new Font("Serif", Font.BOLD, 20);
	
	
	Icon one;
	Icon two;
	
	public MemoryGame_GUI() {
		String file[] = {"aries.png","leo.png","libra.png","pisces.png","scorpion.png","taurus.png"};
		ImageIcon faceDown = new ImageIcon("questionmark.png");
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		BoardPanel = new JPanel(new GridLayout(3,0,2,2));
		ForTitle = new JPanel(new GridLayout(1,1));
		setBoard();
		mainPanel.setBackground(Color.RED);

		
		BoardPanel.setVisible(false);
		
		UpperPanel = new JPanel();
		//mainPanel.add(UpperPanel, BorderLayout.PAGE_START);
		
//		HintPanel = new JPanel();
//		mainPanel.add(BoardPanel, BorderLayout.CENTER);
//		HintPanel.setVisible(true);
//		HintPanel.setIcon(new ImageIcon(this.getClass().getResource("/FirstProject/questionmark.png")));
		
		//Title
		Title = new JLabel("ZODIAC MEMORY GAME");
//		Score = new JLabel("   GAME RESULT: " + gameResult);
		ForTitle.add(Title, BorderLayout.NORTH);
//		ForTitle.add(Score, BorderLayout.SOUTH);
		Title.setFont(d);
		Title.setForeground(Color.RED);
		
		//continueButton
		continueButton = new JButton("CONTINUE");
		continueButton.setPreferredSize(new Dimension(128,64));
		continueButton.addActionListener(this);
		continueButton.setEnabled(false);
		
		//reset Button
		resetButton = new JButton("RESET");
		resetButton.setPreferredSize(new Dimension(128,64));
		resetButton.addActionListener(this);
		resetButton.setEnabled(false);
		
		//chosen button view
		pic1 =new JButton("");
		pic2 =new JButton("");
		pic1.setPreferredSize(new Dimension(128,128));
		pic2.setPreferredSize(new Dimension(128,128));
		pic1.setVisible(false);
		pic2.setVisible(false);
		
		
		//play Button
		playButton = new JButton("PLAY");
		playButton.setPreferredSize(new Dimension(128,64));
		playButton.addActionListener(this);

		
		
		
		mainPanel.add(BoardPanel, BorderLayout.CENTER);
		UpperPanel.add(ForTitle, BorderLayout.WEST);
		mainPanel.add(UpperPanel, BorderLayout.NORTH);
		
//		UpperPanel.add(resetButton);
//		UpperPanel.add(pic1);
//		UpperPanel.add(pic2);
//		UpperPanel.add(continueButton);
//		UpperPanel.add(playButton);
		UpperPanel.add(resetButton, BorderLayout.WEST);
		UpperPanel.add(pic1, BorderLayout.WEST);
		UpperPanel.add(pic2, BorderLayout.WEST);
		UpperPanel.add(continueButton, BorderLayout.EAST);
		UpperPanel.add(playButton, BorderLayout.CENTER);
		
		add(mainPanel);
		
		
		
		
		
		
	}
	
	
	
	//gridButtons ActionListener
	@Override
	public void actionPerformed (ActionEvent e) {
		System.out.println("Button Clicked was + " + e.getActionCommand());
		JButton source = (JButton) e.getSource();
		String btnClicked = e.getActionCommand();
		Card.btnClicked1 = btnClicked;
		
		
//			cardFlip.setEnabled(false);
//		;
//		if (countCard == 1){
//			first = btnClicked;
//			System.out.println(first);
//		} else if (countCard == 2){
//			second = btnClicked;
//			System.out.println(second);
//		} if( first == second) {
//			System.out.println("YAY!");
//		}
		
//		if (countCard < 2){
		if (btnClicked.equals("0,0") ){
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/1.png"));
			gridButtons[0][0].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("1,0"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/2.png"));
			gridButtons[1][0].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("2,0"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/3.png"));
			gridButtons[2][0].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("0,1"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/4.png"));
			gridButtons[0][1].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("1,1"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/5.png"));
			gridButtons[1][1].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("2,1"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/6.png"));
			gridButtons[2][1].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("0,2"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/6.png"));
			gridButtons[0][2].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("1,2"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/5.png"));
			gridButtons[1][2].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("2,2"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/4.png"));
			gridButtons[2][2].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("0,3"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/3.png"));
			gridButtons[0][3].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("1,3"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/2.png"));
			gridButtons[1][3].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
		else if (btnClicked.equals("2,3"))  {
			Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/1.png"));
			gridButtons[2][3].setIcon(card);
			countCard++;
			System.out.println("Countcard is " + countCard);
		}
//		} else if (countCard == 2) {
//			JOptionPane.showMessageDialog(null, "Need matches checker method!");
//			countCard++;
//		} else {
//			countCard = 0;
//			System.out.println("Countcard is " + countCard);
//		}
		
//		for(int row = 0; row< gridButtons.length; row ++){
//			for(int col = 0; col < gridButtons[row].length; col++) {
		//button identification
		if (Count == 0){
			btn[0] = btnClicked;
			one = source.getIcon();
			pic1.setIcon(one);
//			System.out.println(Count);
			Count++;
		} 
		else if (Count == 1) {
			btn[1] = btnClicked;
			two = source.getIcon();
			pic2.setIcon(two);
//			System.out.println(Count);
			Count = 0;
		}
		//game mechanic
		if (countCard >=1.2 && countCard % 2 == 0){
			int rep = JOptionPane.showConfirmDialog(null, "Are they the same picture?", "HONESTY CHECK", JOptionPane.YES_NO_OPTION);
			if (rep == JOptionPane.YES_OPTION) {
				numMatches++;
				numAttempt++;
				System.out.println(numMatches);
				System.out.println(numAttempt);
				System.out.println(gameResult);
			} else {
				numAttempt++;
				gameResult = numMatches/numAttempt;
				System.out.println(numMatches);
				System.out.println(numAttempt);
				System.out.println(gameResult);
				JOptionPane.showMessageDialog(null, "Try again!!!");
				resetBoard();
			}
		}
		
		
		
		
		
//		int x = Integer.parseInt(btnClicked.split(",")[0]);
//		int y = Integer.parseInt(btnClicked.split(",")[1]);
//		Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/aries.png"));
//		gridButtons[x][y].setIcon(card);
//		System.out.println(btnClicked);
		
		
		if (e.getSource() == continueButton){
			System.out.println("Continue Button was clicked");
			int reply = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "CONTINUE", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
        	resetBoard();
        } else {
        	JOptionPane.showMessageDialog(null, "GOODBYE");
        	System.exit(0);
        }}
		
		if (e.getSource() == resetButton){
			resetBoard();
			
		
		}
		
		if (e.getSource() == playButton){
			resetButton.setEnabled(true);
			continueButton.setEnabled(true);
			BoardPanel.setVisible(true);
			pic1.setVisible(true);
			pic2.setVisible(true);
			
		}

		
		
	}

	@Override
	public void setBoard() {
		
		gridButtons = new JButton[3][4];
		for(int row = 0; row< gridButtons.length; row ++){
			for(int col = 0; col < gridButtons[row].length; col++) {
//				gridButtons[row][col] = new JButton("[" +row + "]["  + col + "]");
				gridButtons[row][col] = new JButton();
				gridButtons[row][col].addActionListener(this);
				String RowCol = row + "," + col;
				gridButtons[row][col].setActionCommand(RowCol);
				Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/questionmark.png"));
				
				gridButtons[row][col].setIcon(card);
//				gridButtons[row][col].setIcon(new ImageIcon("questionmark.png")); //default show question mark until clicked
				BoardPanel.add(gridButtons[row][col]);
		
		
			}
		}
		
		
//		continueButton.addActionListener(this);
	}

	@Override
	public void resetBoard() {
		for(int row = 0; row< gridButtons.length; row ++){
			for(int col = 0; col < gridButtons[row].length; col++) {
				Icon card = new ImageIcon(this.getClass().getResource("/FirstProject/questionmark.png"));
				gridButtons[row][col].setIcon(card);
				countCard = 0;
				pic1.setIcon(null);
				pic2.setIcon(null);
				System.out.println("Countcard is " + countCard);
			}
		}
		
	}

	@Override
	public void updateCurrentPlayer() {
		// TODO Auto-generated method stub
		//extra credit
	}

	@Override
	public void currentPlayer() {
		// TODO Auto-generated method stub
		// extra credit
	}

	@Override
	public boolean Equal() {
		if (btn[0] == btn[1]) {
			return true;
		} 
		return false;
	}

	@Override
	public int checkAttempt() {
		// TODO Auto-generated method stub
		// return number of attempt ( count up every 2 card flip up)
		return this.numAttempt;
	}

	@Override
	public int checkMatches() {
		// TODO Auto-generated method stub
		// check how many matches had been made in all the attempt that been executed in checkAttempt()
		return this.numMatches;
	}

	@Override
	public int gameResult() {
		// TODO Auto-generated method stub
		//display the result in texbox below
//		(numMatches/numAttempt)*100
		
		return 0;

	}

	@Override
	public String evaluatingPlayerMemory() {
		// TODO Auto-generated method stub
		// calculate player's score base on number of attempt (count up per try/2 button click) and number of matches(cards) that player was able to select
		if (gameResult > 0) {
			return "you are a genius!";
		}
		return null;
		
	}

	@Override
	public void bestRecord() {
		// TODO Auto-generated method stub
		// extra credit
	}



	@Override
	public void checkFlippingStatus() {
		// TODO Auto-generated method stub
		
	}
	
	


//	@Override
//	public void hideCard() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	@Override
//	public void showCard() {
//		// TODO Auto-generated method stub
//		
//	}

	
	

}
