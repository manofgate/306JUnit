package mainOnes;

public class Cashier {

	public Envelope makeChange(Envelope envelope, int priceDollars, int priceCents) throws NegativeBalanceException {
		int centsRemaining = envelope.getTotalCents() - 100 * priceDollars - priceCents;
		if(centsRemaining < 0) throw new NegativeBalanceException("Price exceeds envelope contents by "
					+ Math.abs(centsRemaining) + " cents");
		Envelope remaining = new Envelope();
		int dollars = 0;
		while(centsRemaining >= 100) {
			dollars++;
			centsRemaining -= 100;
		}
		int quarters = 0;
		while(centsRemaining >= 25) {
			quarters++;
			centsRemaining -= 25;
		}
		int dimes = 0;
		while(centsRemaining >= 10) {
			dimes++;
			centsRemaining -= 10;
		}
		int nickels = 0;
		while(centsRemaining >= 5) {
			nickels++;
			centsRemaining -= 5;
		}
		int pennies = 0;
		while(centsRemaining >= 1) {
			pennies++;
			centsRemaining -= 1;
		}
		
		remaining.setDollars(dollars);
		remaining.setQuaters(quarters);
		remaining.setDimes(dimes);
		remaining.setNickles(nickels);
		remaining.setPennies(pennies);
		
		return remaining;
	}
	
}
