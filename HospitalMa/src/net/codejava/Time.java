package net.codejava;
public class Time 
{
	private int hours;
	private int mins;
	private String format;
	public Time()
	{
		hours=0;
		mins=0;
		format=" ";
	}
	public int gethours()
	{
		return hours;
	}
	public int getmins()
	{
		return mins;
	}
	public String getformat()
	{
		return format;
	}
	public void sethours(int h)
	{
		hours=h;
	}
	public void setmins(int mi)
	{
		mins=mi;
	}
	public void setformat(String f)
	{
		format=f;
	}
	public String toString()
	{
		String str=hours+" : "+mins+" "+format+"\n";
		return str;
	}
}
