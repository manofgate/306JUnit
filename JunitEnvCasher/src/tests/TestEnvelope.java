package tests;

import junit.framework.Assert;
import mainOnes.Envelope;

import org.junit.Before;
import org.junit.Test;

public class TestEnvelope {
	private Envelope envelope;
	@Before
	public void setUp(){
		//envelope = new Envelope();
	}
	@Test
	public void test() {
		envelope = new Envelope(1,1,1,1,1);
		Assert.assertEquals(141, envelope.getTotalCents());
	}
	@Test
	public void test2() {
		envelope = new Envelope(1,1,0,0,0);
		Assert.assertEquals(125, envelope.getTotalCents());
	}
	@Test
	public void test3() {
		envelope = new Envelope(1,0,1,1,0);
		Assert.assertEquals(115, envelope.getTotalCents());
	}
	@Test
	public void test4() {
		envelope = new Envelope(0,0,1,1,1);
		Assert.assertEquals(16, envelope.getTotalCents());
	}
}
