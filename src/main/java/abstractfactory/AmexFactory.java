package abstractfactory;

public class AmexFactory extends CreditCardFactory{

public CreditCard getCreditCard(CardType cardType) {
		
		switch(cardType) {
		case IEFTIN:return new AmexIeftinCreditCard();
		case GOLD: return new AmexGoldCreditCard();
		case PLATINUM: return new AmexPlatinumCreditCard();
		default: return null;
		}
	}
	
	public Validator getValidator(CardType cardType) {
		switch(cardType) {
		case IEFTIN:return new AmexIeftinValidator();
		case GOLD: return new AmexGoldValidator();
		case PLATINUM: return new AmexPlatinumValidator();
		default: return null;
		}
		
	}
}
