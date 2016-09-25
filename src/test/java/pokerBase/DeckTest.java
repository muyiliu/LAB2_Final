/**
 * 
 */
package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DeckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void BuildDeck(){
		Deck d = new Deck();
		assertTrue(d.Cards_left()==52);
	}
	@Test 
	public void DeckOverDraw(){
		Deck d = new Deck();
		d.Draw();
		assertTrue(d.Cards_left()==51);
	}
	
}
