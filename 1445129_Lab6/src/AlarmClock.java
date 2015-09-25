
public class AlarmClock extends Clock
{
	private boolean alarmOn;
	private int hrSet, minSet, secSet;
	public AlarmClock()
	{
		alarmOn = false; //alarm is off initially
	}
	public void SetAlarm(int hr, int min, int sec)
	{
		hrSet = hr;
		minSet = min;
		secSet = sec;
		alarmOn = true;
	}
	public void tick ()
	{
		super.tick();
		if((viewHr()==hrSet)&&(viewMin()==minSet)&&(viewSec()==secSet)&& alarmOn)
		{
			System.out.println("Ring Ring Ring!!! Suprise MUFC!!! Some Fries? MUFC!!");
		}
	
	}
	public void resetAlarm()
	{
		alarmOn=false;
	}
}
