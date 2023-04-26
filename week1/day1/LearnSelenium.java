package week1.day1;

public class LearnSelenium {
	
	private void sendSMS() {
		System.out.println("sendSMS");	
	}
	public void videoCall() {
		System.out.println("videoCall");

	}
	protected void voiceCall() {
		System.out.println("voiceCall");
	}
	public static void main(String[] args) {
		LearnSelenium obj=new LearnSelenium();
		obj.sendSMS();
		obj.videoCall();
		obj.voiceCall();
		System.out.println("hello selenium");
	}

}
