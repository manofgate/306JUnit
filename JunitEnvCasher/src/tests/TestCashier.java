package tests;

import junit.framework.Assert;
import mainOnes.Cashier;
import mainOnes.Envelope;
import mainOnes.NegativeBalanceException;

import org.junit.Test;

public class TestCashier {

	private Cashier cashier;
	
	@Test
	public void test() {
		cashier = new Cashier();
		Envelope envelope = new Envelope(1,0,0,0,0);
		try {
			Envelope result = cashier.makeChange(envelope, 0, 50);
			System.out.println(result.getTotalCents());
			Assert.assertEquals(result.getTotalCents(), 50);
		} catch (NegativeBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		cashier = new Cashier();
		Envelope envelope = new Envelope(1,0,0,0,0);
		try {
			Envelope result = cashier.makeChange(envelope, 1, 50);
			Assert.fail();
		} catch (NegativeBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3() {
		cashier = new Cashier();
		Envelope envelope = new Envelope(1,4,10,0,0);
		try {
			Envelope result = cashier.makeChange(envelope, 1, 50);
			Assert.assertEquals(result.getDollars(), 1);
			Assert.assertEquals(result.getQuaters(), 2);
		} catch (NegativeBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4() {
		cashier = new Cashier();
		Envelope envelope = new Envelope(10,0,0,0,0);
		try {
			Envelope result = cashier.makeChange(envelope, 8, 76);
			Assert.assertEquals(result.getTotalCents(), 124);
			Assert.assertEquals(result.getDollars(), 1);
			Assert.assertEquals(result.getDimes(), 2);
			Assert.assertEquals(result.getPennies(), 4);
		} catch (NegativeBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
