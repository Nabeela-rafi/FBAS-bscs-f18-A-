package hospital;
public class OutdoorPatient extends Patient
{
	net.codejava.Date d=new net.codejava.Date();
	net.codejava.Time t=new net.codejava.Time();
	Doctor doc=new Doctor();
	Patient p=new Patient();
	//Methods
	public OutdoorPatient()
	{
		//empty
	}
	public net.codejava.Date getDOA()
	{
		d.getday();
		d.getmonth();
		d.getyear();
		return d;
	}
	public void setAppDate(int da,int mo,int y)
	{
		d.setday(da);
		d.setmonth(mo);
		d.setyear(y);
	}
	public net.codejava.Time getTOA()
	{
		t.gethours();
		t.getmins();
		t.getformat();
		return t;
	}
	public void setAppTime(int hours,int mins,String format)
	{
		t.sethours(hours);
		t.setmins(mins);
		t.setformat(format);
	}
	public Doctor getDoctor()
	{
		return doc;
	}
	public void setDOA(net.codejava.Date date)
	{
		d=date;
	}
	public void getTOA(net.codejava.Time time)
	{
		t=time;
	}
	public void setDoctor(Doctor d)
	{
		doc=d;
	}
	public void setdata(String name,String cnic,String address,String phno,String gender,int age)
	{
		p.setname(name);
		p.getname();
		p.setcnic(cnic);
		p.getcnic();
		p.setphno(phno);
		p.getphno();
		p.setgender(gender);
		p.getgender();
		p.setage(age);
		p.getage();
		p.setaddress(address);	
		p.getaddress();
	}
	public Doctor setdoctorData(String name,String cnic,String phno,String department,String  specialization,String gender)
	{
		doc.setname(name);
		doc.getname();
		doc.setcnic(cnic);
		doc.getcnic();
		doc.setphno(phno);
		doc.getphno();
		doc.setdept(department);
		doc.getdept();
		doc.setspec(specialization);
		doc.getspecialization();
		doc.setgender(gender);
		doc.getgender();
		return doc;
	}
	public String getdocname()
	{
		return doc.getname();
	}
	public String getdocdept()
	{
		return doc.getdept();
	}
	public double calculateFee(int basicFee, int testsFee)
	{
		int totalFee;
		totalFee=basicFee+testsFee;
		return totalFee;
	}
	public String toString()
	{
		String str= "patient : "+p.toString()+"\n has an appointment \n Date : "+d.toString()+"\n Appointment time :   "+t.toString()+"\n  with \n "+doc.toString()+"\n";
		return str;
	}
}