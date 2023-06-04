package week3.day1;

public class Samsung extends Androidtv implements Android {

	public static void main(String[] args) {
		Samsung mob=new Samsung();
		mob.openApp();
		mob.watchvideo();
		
	}


	@Override
	public void watchvideo() {
		System.out.println("watching the video");
		
	}


		
	}

	



