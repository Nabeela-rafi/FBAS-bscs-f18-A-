package hospital;
public class Doctor 
{
	private String name;
	private String cnic;
	private String phno;
	private String gender;
	private String department;
	private String specialization;
	//Methods
	public Doctor()
	{
		name=" ";
		cnic=" ";
		phno=" ";
		gender="  ";
		department=" ";
		specialization=" ";
	}
	public void setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}
	public void setcnic(String c)
	{
		cnic=c;
	}
	public String getcnic()
	{
		return cnic;
	}
	public void setphno(String p)
	{
		phno=p;
	}
	public String getphno()
	{
		return phno;
	}
	public void setgender(String g)
	{
		gender=g;
	}
	public String getgender()
	{
		return gender;
	}
	public void setdept(String d)
	{
		department=d;
	}
	public String getdept()
	{
		return department;
	}
	public void setspec(String s)
	{
		specialization=s;
	}
	public String getspecialization()
	{
		return specialization;
	}
	public String toString()
	{
		String str="Name  :  "+name+"\n cnic  no:  "+cnic+"\n phno   :  "+phno+"\n  gender  :    "+gender+"\n department   :  "+department+"\n specialization    :   "+specialization+"\n";;
		return str;
	}
}