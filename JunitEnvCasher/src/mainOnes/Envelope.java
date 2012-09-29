package mainOnes;

public class Envelope {
	private int dollars;
	private int quaters;
	private int dimes;
	private int nickles;
	private int pennies;
	
	public Envelope() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Envelope(int dollars, int quaters, int dimes, int nickles,
			int pennies) {
		super();
		this.dollars = dollars;
		this.quaters = quaters;
		this.dimes = dimes;
		this.nickles = nickles;
		this.pennies = pennies;
	}


	public int getDollars() {
		return dollars;
	}
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}
	public int getQuaters() {
		return quaters;
	}
	public void setQuaters(int quaters) {
		this.quaters = quaters;
	}
	public int getDimes() {
		return dimes;
	}
	public void setDimes(int dimes) {
		this.dimes = dimes;
	}
	public int getNickles() {
		return nickles;
	}
	public void setNickles(int nickles) {
		this.nickles = nickles;
	}
	public int getPennies() {
		return pennies;
	}
	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	public int getTotalCents(){
		//return 0;
		return dollars*100 + quaters*25 + dimes*10 + nickles*5 + pennies;
	}
}
