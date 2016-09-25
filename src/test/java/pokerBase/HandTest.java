package pokerBase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pokerEnums.eRank;
import pokerEnums.eSuit;
public class HandTest {

	private static final Object[] ActisHandFullHouse = null;
	private static final Object ActisisRoyalFlus = null;
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
	public void TestRoyalFlush() {	
	}

	@Test
	public void TestFourOfAKind() {	
	}

	@Test
	public void TestStraightFlush() {	
	}
	
	@Test
	public void TestbIsFlushFalse() {	
		HandScore hs = new HandScore();
		ArrayList<Card> bIsFlush = new ArrayList<Card>();
		bIsFlush.add(new Card(eSuit.HEARTS,eRank.FIVE,0));
		bIsFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,0));
		bIsFlush.add(new Card(eSuit.DIAMONDS,eRank.FIVE,0));
		bIsFlush.add(new Card(eSuit.HEARTS,eRank.FIVE,0));
		bIsFlush.add(new Card(eSuit.HEARTS,eRank.FIVE,0));
		Hand h = new Hand();
		h = SetHand(bIsFlush);
		boolean ActisbIsFlush = Hand.isHandFlush(h,hs);
		boolean ExpisbIsFlush = true;
		assertEquals(ActisbIsFlush ,ExpisbIsFlush);
	}
	@Test
	public void TestisHandFlushTrue() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isHandFlush = new ArrayList<Card>();
		isHandFlush.add(new Card(eSuit.SPADES,eRank.FIVE,10));
		isHandFlush.add(new Card(eSuit.SPADES,eRank.FIVE,4));
		isHandFlush.add(new Card(eSuit.SPADES,eRank.FIVE,12));
		isHandFlush.add(new Card(eSuit.SPADES,eRank.FIVE,7));
		isHandFlush.add(new Card(eSuit.SPADES,eRank.FIVE,2));
		Hand h = new Hand();
		h = SetHand(isHandFlush);
		boolean ActisHandFlush = Hand.isHandFlush(h,hs);
		boolean ExpisisHandFlush = true;
		assertEquals(ActisHandFlush,ActisHandFlush);
	}

	


	private Hand SetHand(ArrayList<Card> isHandFlush) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	public void TestiTestRoyalFlushFalse() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isRoyalFlush = new ArrayList<Card>();
		isRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,0));
		isRoyalFlush.add(new Card(eSuit.HEARTS,eRank.FIVE,0));
		isRoyalFlush.add(new Card(eSuit.DIAMONDS,eRank.FIVE,0));
		isRoyalFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,0));
		isRoyalFlush.add(new Card(eSuit.CLUBS,eRank.FIVE,0));
		Hand h = new Hand();
		h = SetHand(isRoyalFlush);
		boolean ActIsisRoyalFlush = Hand.isHandRoyalFlush(h,hs);
		boolean ExpisisRoyalFlush = true;
		assertEquals(ActisisRoyalFlus,ExpisisRoyalFlush);

	}
	@Test
	public void TestisRoyalFlushTrue() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isRoyalFlush = new ArrayList<Card>();
		isRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,10));
		isRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,11));
		isRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,12));
		isRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,13));
		isRoyalFlush.add(new Card(eSuit.SPADES,eRank.FIVE,14));
		Hand h = new Hand();
		h = SetHand(isRoyalFlush);
		boolean ActisRoyalFlush = Hand.isHandRoyalFlush(h,hs);
		boolean ExpisisRoyalFlush = true;
		assertEquals(ActisRoyalFlush,ExpisisRoyalFlush);
		
	
	}
	@Test
	public void TestisFourOfKindFalse1() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isFourOfKind = new ArrayList<Card>();
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,4));
		isFourOfKind.add(new Card(eSuit.SPADES,eRank.FIVE,5));
		isFourOfKind.add(new Card(eSuit.SPADES,eRank.FIVE,6));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,7));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		Hand h = new Hand();
		h = SetHand(isFourOfKind);
		boolean ActisisFourOfKind = Hand.isHandFourOfAKind(h,hs);
		boolean ExpisisFourOfKind = true;
		assertEquals(ActisisFourOfKind,ExpisisFourOfKind);
	
	}
	@Test
	public void TestisStrightFlushTrue() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isFourOfKind = new ArrayList<Card>();
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,4));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,5));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,6));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,7));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		Hand h = new Hand();
		h = SetHand(isFourOfKind);
		boolean ActisSisFourOfKind = Hand.isHandStraightFlush(h,hs);
		boolean ExpisisFourOfKind = true;
		assertEquals(ActisSisFourOfKind,ExpisisFourOfKind);
	
	}

	@Test
	public void TestisFourOfKindTrue() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isFourOfKind = new ArrayList<Card>();
		isFourOfKind.add(new Card(eSuit.SPADES,eRank.FIVE,14));
		isFourOfKind.add(new Card(eSuit.DIAMONDS,eRank.FIVE,14));
		isFourOfKind.add(new Card(eSuit.CLUBS,eRank.FIVE,14));
		isFourOfKind.add(new Card(eSuit.SPADES,eRank.FIVE,14));
		isFourOfKind.add(new Card(eSuit.SPADES,eRank.FIVE,14));
		Hand h = new Hand();
		h = SetHand(isFourOfKind);
		boolean ActisFourOfKind = Hand.isHandFlush(h,hs);
		boolean ExpisisFourOfKind = true;
		assertEquals(ActisFourOfKind,ExpisisFourOfKind);
}
	
	@Test
	public void TestisFourOfKindFalse() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isFourOfKind = new ArrayList<Card>();
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,4));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,5));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,6));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,7));
		isFourOfKind.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		Hand h = new Hand();
		h = SetHand(isFourOfKind);
		boolean ActisSisFourOfKind = Hand.isHandStraightFlush(h,hs);
		boolean ExpisisFourOfKind = true;
		assertEquals(ActisSisFourOfKind,ExpisisFourOfKind);
	
	}
	

	@Test
	public void TestisFullHouseTrue() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isFullHouse = new ArrayList<Card>();
		isFullHouse.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isFullHouse.add(new Card(eSuit.DIAMONDS,eRank.FIVE,8));
		isFullHouse.add(new Card(eSuit.CLUBS,eRank.FIVE,8));
		isFullHouse.add(new Card(eSuit.HEARTS,eRank.FIVE,13));
		isFullHouse.add(new Card(eSuit.SPADES,eRank.FIVE,13));
		Hand h = new Hand();
		h = SetHand(isFullHouse);
		boolean ExpisisFullHouse = true;
		assertEquals(ActisHandFullHouse,ExpisisFullHouse);
	}
	

	@Test
	public void TestisHandStraightFalse() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isHandStraight = new ArrayList<Card>();
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,0));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,0));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,0));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,0));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,0));
		Hand h = new Hand();
		h = SetHand(isHandStraight);
		boolean ActisisHandStraight= Hand.isHandFlush(h,hs);
		boolean ExpisisHandStraight = true;
		assertEquals(ActisisHandStraight,ExpisisHandStraight);
	}
	
	@Test
	public void TestisHandStraightTrue() {	
		HandScore hs = new HandScore();
		ArrayList<Card> isHandStraight = new ArrayList<Card>();
		isHandStraight.add(new Card(eSuit.CLUBS,eRank.FIVE,7));
		isHandStraight.add(new Card(eSuit.HEARTS,eRank.FIVE,8));
		isHandStraight.add(new Card(eSuit.DIAMONDS,eRank.FIVE,9));
		isHandStraight.add(new Card(eSuit.HEARTS,eRank.FIVE,10));
		isHandStraight.add(new Card(eSuit.SPADES,eRank.FIVE,11));
		Hand h = new Hand();
		h = SetHand(isHandStraight);
		boolean ActisisHandStraight= Hand.isHandFlush(h,hs);
		boolean ExpisisHandStraight = true;
		assertEquals(ActisisHandStraight,ExpisisHandStraight);
	}
	
	
		@Test
		public void TestisHandThreeOfAKindFalse() {	
			HandScore hs = new HandScore();
			ArrayList<Card> isHandThreeOfAKind = new ArrayList<Card>();
			isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,0));
			isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,0));
			isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,0));
			isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,0));
			isHandThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,0));
			Hand h = new Hand();
			h = SetHand(isHandThreeOfAKind);
			boolean ActisisHandThreeOfAKind= Hand.isHandFlush(h,hs);
			boolean ExpisisHandThreeOfAKind = true;
			assertEquals(ActisisHandThreeOfAKind,ExpisisHandThreeOfAKind);
		}
			
		@Test
		public void TestisThreeOfAKindTrue() {	
			HandScore hs = new HandScore();
			ArrayList<Card> isThreeOfAKind = new ArrayList<Card>();
			isThreeOfAKind.add(new Card(eSuit.HEARTS,eRank.FIVE,12));
			isThreeOfAKind.add(new Card(eSuit.SPADES,eRank.FIVE,12));
			isThreeOfAKind.add(new Card(eSuit.DIAMONDS,eRank.FIVE,12));
			isThreeOfAKind.add(new Card(eSuit.HEARTS,eRank.FIVE,5));
			isThreeOfAKind.add(new Card(eSuit.CLUBS,eRank.FIVE,14));
			Hand h = new Hand();
			h = SetHand(isThreeOfAKind);
			boolean ActIsisThreeOfAKind= Hand.isHandFourOfAKind(h,hs);
			boolean ExpisisThreeOfAKind = true;
			assertEquals(ActIsisThreeOfAKind,ExpisisThreeOfAKind);
		}
		
		
			@Test
			public void TestisHandTwoPairFalse() {	
				HandScore hs = new HandScore();
				ArrayList<Card> isHandTwoPair = new ArrayList<Card>();
				isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
				isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
				isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
				isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
				isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
				Hand h = new Hand();
				h = SetHand(isHandTwoPair);
				boolean ActisisHandTwoPair= Hand.isHandFlush(h,hs);
				boolean ExpisisHandTwoPair= true;
				assertEquals(ActisisHandTwoPair,ExpisisHandTwoPair);
			}
				
			@Test
				public void TestisHandTwoPairTrue() {	
				HandScore hs = new HandScore();
				ArrayList<Card> isHandTwoPair = new ArrayList<Card>();
				isHandTwoPair.add(new Card(eSuit.HEARTS,eRank.FIVE,3));
				isHandTwoPair.add(new Card(eSuit.DIAMONDS,eRank.FIVE,3));
				isHandTwoPair.add(new Card(eSuit.CLUBS,eRank.FIVE,6));
				isHandTwoPair.add(new Card(eSuit.HEARTS,eRank.FIVE,6));
				isHandTwoPair.add(new Card(eSuit.SPADES,eRank.FIVE,13));
				Hand h = new Hand();
				h = SetHand(isHandTwoPair);
				boolean ActisisHandTwoPair= Hand.isHandFlush(h,hs);
				boolean ExpisisHandTwoPair = true;
				assertEquals(ActisisHandTwoPair,ExpisisHandTwoPair);
			}
					
@Test
	public void TestisHandPairFalse() {	
	HandScore hs = new HandScore();
	ArrayList<Card> isHandPair = new ArrayList<Card>();
	isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	Hand h = new Hand();
	h = SetHand(isHandPair);
	boolean ActisisHandPair= Hand.isHandFlush(h,hs);			
	boolean ExpisisHandPair = true;
	assertEquals(ActisisHandPair,ExpisisHandPair);
					}
						
@Test
	public void TestiisHandPairTrue() {	
	HandScore hs = new HandScore();
	ArrayList<Card> isHandPair = new ArrayList<Card>();			
	isHandPair.add(new Card(eSuit.HEARTS,eRank.FIVE,5));
	isHandPair.add(new Card(eSuit.SPADES,eRank.FIVE,5));
	isHandPair.add(new Card(eSuit.CLUBS,eRank.FIVE,2));
	isHandPair.add(new Card(eSuit.CLUBS,eRank.FIVE,1));
	isHandPair.add(new Card(eSuit.DIAMONDS,eRank.FIVE,14));
	Hand h = new Hand();
	h = SetHand(isHandPair);
	boolean ActisisHandPair= Hand.isHandFlush(h,hs);
	boolean ExpisisHandPair = true;
	assertEquals(ActisisHandPair,ExpisisHandPair);
						}
							
							
@Test
	public void TestisHandHighCardFalse() {	
	HandScore hs = new HandScore();
	ArrayList<Card> isHandHighCard = new ArrayList<Card>();
	isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,0));
	Hand h = new Hand();
	h = SetHand(isHandHighCard);
	boolean ActisisHandHighCard= Hand.isHandFlush(h,hs);
	boolean ExpisisHandHighCard = true;
	assertEquals(ActisisHandHighCard,ExpisisHandHighCard);
							}
								
@Test
	public void TestisHandHighCardTrue() {	
	HandScore hs = new HandScore();
	ArrayList<Card> isHandHighCard = new ArrayList<Card>();
	isHandHighCard.add(new Card(eSuit.DIAMONDS,eRank.FIVE,2));
	isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,5));
									isHandHighCard.add(new Card(eSuit.SPADES,eRank.FIVE,6));
									isHandHighCard.add(new Card(eSuit.HEARTS,eRank.FIVE,11));
									isHandHighCard.add(new Card(eSuit.CLUBS,eRank.FIVE,14));
									Hand h = new Hand();
									h = SetHand(isHandHighCard);
									boolean ActisisHandHighCard= Hand.isHandFlush(h,hs);
									boolean ExpisisHandHighCard = true;
									assertEquals(ActisisHandHighCard,ExpisisHandHighCard);
								}
									
								}

