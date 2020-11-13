public class Privacy
{
	private  static String unlock="facelock";
	public static String getUnlock()
	{
		
		return unlock;
	}
	public static void setUnlock(String newUnlock)
	{
		
		if(newUnlock.equals("FingerPrint") || newUnlock.equals("face"))			
		{
			System.out.println("new unlock is "+newUnlock);
			unlock=newUnlock;
		}
		else{
			System.out.println("you cannot change the unlock");
		}
		
	}	
}
