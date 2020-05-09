public class Dice {
	
	private int sides;
	 
	//constructor (1-6)
	public Dice(int sidesToBeSet) {
		sides = sidesToBeSet;
	}
	public int roll(int sidesToBeSet) {
		sides=sidesToBeSet;
		
		return (1+(int)(Math.random()*6));
	}
	 public static final int MAX_VALUE = 6;
	 public static final int MIN_VALUE = 1;
	
	
}