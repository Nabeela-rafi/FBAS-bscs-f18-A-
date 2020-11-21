package hospital;
import javax.swing.JOptionPane;
public class IndoorPatient extends Patient
{
	private static int wardno;
	private static int roomno;
	private static int bedno;
	private  double fee;
	Doctor doc=new Doctor();
	Patient p=new Patient();
	net.codejava.Date d=new net.codejava.Date();
	//Methods
	public IndoorPatient()
	{
		super();
		this.wardno=1;
		this.roomno=1;
		if(this.bedno<26)
		{
			this.bedno++;
		}
		else if(this.bedno>26)
		{
			this.roomno++;
		}
		if(this.roomno>100)
		{
			this.wardno++;
		}
		this.fee=0.0;
	}
	public void setdata(String name,String cnic,String address,String phno,String gender,int age)
	{
		p.setname(name);
		System.out.print(p.getname());
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
	public int getwardno()
	{
		return wardno;
	}
	public int getroomno()
	{
		return roomno;
	}
	public int getbedno()
	{
		return bedno;
	}
	public void setwardno(int w)
	{
		if(wardno<100)
		{
			wardno=w;
		}
	}
	public void setroomno(int r)
	{
		if(roomno<200)
		{
			roomno=r;
		}
	}
	public void setbedno(int b)
	{
		if(bedno<50)
		{
			bedno=b;
		}
	}
	public String getdocname()
	{
		return doc.getname();
	}
	public String getdocdept()
	{
		return doc.getdept();
	}
	public net.codejava.Date getAdmDate()
	{
		return d;
	}
	public void setAdmDate(int da,int mo,int y)
	{
		d.setday(da);
		d.setmonth(mo);
		d.setyear(y);
	}
	public double calculateFee(int basicFee,int testsFee,int admFee)
	{
		fee=basicFee+testsFee+admFee;
		return fee;
	}
	public String toString()
	{
		String str= "ward no: "+wardno+"\n roomno "+roomno+"\n and bedno "+bedno+"\n is alloted to the patient  "+p.toString()+" admitted on "+d.toString()+"\n  by doctor:  \n "+doc.toString()+"\n";
		return str;
	}
}
