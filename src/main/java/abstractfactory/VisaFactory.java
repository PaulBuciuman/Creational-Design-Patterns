package abstractfactory;

public class VisaFactory extends CreditCardFactory {

	public CreditCard getCreditCard(CardType cardType) {
		
		switch(cardType) {
		case GOLD: return new VisaGoldCreditCard();
		case PLATINUM: return new VisaPlatinumCreditCard();
		case IEFTIN:return null;
		default: return null;
		}
	}
	
	public Validator getValidator(CardType cardType) {
		switch(cardType) {
		case GOLD: return new VisaGoldValidator();
		case PLATINUM: return new VisaPlatinumValidator();
		default: return null;
		}
		
	}
}
