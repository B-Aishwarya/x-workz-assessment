public class PrivacyTester{
	
	
	public static void main(String[] test)
{
System.out.println("JVM invoked main");

String value=test[0];
String unlockValue=Privasy.getUnlock();

System.out.println("unlockValue"+unlockValue);

Privacy.setUnlock(value);

unlockValue=Privacy.getUnlock();

System.out.println("unlockValue"+unlockValue);

System.out.println("EXIT :: main");

}
	
}
