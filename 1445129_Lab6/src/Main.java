
public class Main 
{

	public static void main(String[] args) 
	{
		AlarmClock AC = new AlarmClock();
		
		AC.SetAlarm(1, 30, 0);
		for(int i = 0; i<10000;i++)
		{
			
			AC.ShowTime();
			AC.tick();
			
		}
	}

}
