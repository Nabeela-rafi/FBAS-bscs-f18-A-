package net.codejava;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;
public class Date 
{
	private int day;
	private int month;
	private int year;
	public Date()
	{
		day=0;
		month=0;
		year=0;
	}
	public int getday()
	{
		return day;
	}
	public int getmonth()
	{
		return month;
	}
	public int getyear()
	{
		return year;
	}
	public void setday(int d)
	{
		day=d;
	}
	public void setmonth(int m)
	{
		month=m;
	}
	public void setyear(int y)
	{
		year=y;
	}
	public String toString()
	{
		String str=day+"/"+month+"/"+year;
		return str;
	}
}
