package FirstProject;

public interface MemoryGame {
	public void setBoard(); //create new random board 3x4
	public void resetBoard(); // the flip down button aka the continue button
	public boolean Equal(); // check if 2 card is matched
	public int checkAttempt(); // check number of attempt by the current player
	public int checkMatches(); // check number of matches in number of attempt made
	public int gameResult(); // calculate score base on attemp and matches
	public String evaluatingPlayerMemory(); //>97 AMAZING, >80 EXCELENT, >60 OK, >30 LACKING, >10 SUFFERING, >=0 Brain escaped
	public void checkFlippingStatus();
//	public void hideCard();
//	public void showCard();
	
	public void updateCurrentPlayer();
	public void currentPlayer(); // start record new result on current player
	public void bestRecord(); // best score saved by player (close game make result disappear)

}

