public class Player {
	
	public String name;
	private int totalScore;
	private int currentScore;

	//Constructor
	public Player(String playerName) {
		name = playerName;
		totalScore = 0;
		currentScore=0;
	}
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	//set player name
	public void setPlayerName(String playerName) {
		name = playerName;
	}
	
	//get player name
	public String getPlayerName() {
		return name;	
	}
	
	//set player score
	public void setPlayerScore(int num) {
		totalScore = totalScore + num;
		
	}
	//get player score
	public int getPlayerScore() {
		return totalScore;
	}
	
	
	public void updatePlayerName(String playerName) {
		name = playerName;
	}
	
	public void updatePlayerScore(int num) {
		totalScore = totalScore + num;
	}
	//waldos try set player score
	public void setPlayerTotal() {
		totalScore = totalScore -currentScore;
			
		}
		//waldos try get player score
	public int getPlayerTotal() {
		return totalScore;
		}

	
	
	
	//clip for instructions
	
}




