
public class Score {
	
	private String username;
	private int score;
	
	public Score(){
		this.username = "CCS";
		this.score = -1;
	}
	
	public Score(String username, int score){
		this.username = username;
		this.score = score;
	}
	
	public int getScore(){
		return this.score;
		
	}
	
	public String getUsername(){
		return this.username;
		
	}
	
	public String toString(){
		return username + " - " + score;
	}
}
