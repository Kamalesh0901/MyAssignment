package week1.day1;

public class Mobile {
	private void makeCall() {
String mobileModel= "Samsung";
float mobileWeight= 20f;
System.out.println(mobileModel);
System.out.println(mobileWeight);
	}
private void sendMsg() {
boolean isFullycharged= true;
int mobileCost= 30000;
System.out.println(isFullycharged);
System.out.println(mobileCost);
}
public static void main(String[] args) {
	System.out.println("This is My mobile");
	Mobile obj= new Mobile();
	obj.makeCall();
	obj.sendMsg();
	
}
}
