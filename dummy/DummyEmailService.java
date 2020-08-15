package dummy;

public class DummyEmailService implements EmailService{

	@Override
	public void sendMail(String message) {
		throw new AssertionError("method not implemented !!!");
	}

}
