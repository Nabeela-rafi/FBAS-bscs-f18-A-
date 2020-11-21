package hospital;
public class Patient 
{
	private String name;
	private String cnic;
	private String phno;
	private String gender;
	private int age;
	private String address;
	private double fee;
	//Methods
	public Patient()
	{
		name=" ";
		cnic=" ";
		phno=" ";
		gender=" ";
		age=0;
		address=" ";
		fee=0.0;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String n)
	{
		name=n;
	}
	public String getcnic()
	{
		return cnic;
	}
	public void setcnic(String c)
	{
		cnic=c;
	}
	public String getphno()
	{
		return phno;
	}
	public void setphno(String ph)
	{
		phno=ph;
	}
	public String getgender()
	{
		return gender;
	}
	public void setgender(String g)
	{
		gender=g;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int a)
	{
		age=a;
	}
	public String getaddress()
	{
		return address;
	}
	public void setaddress(String ad)
	{
		address=ad;
	}
	public double calculateFee()
	{
		return fee;
	}
	public String toString()
	{
		String  str="\n Name    :  "+name+"\n cnic  :  "+cnic+"\n phno  :  "+phno+"\n gender  :  "+gender+"\n  age  :  "+age+"\n  address  :  "+address+"\n";
		return str;
	}
}