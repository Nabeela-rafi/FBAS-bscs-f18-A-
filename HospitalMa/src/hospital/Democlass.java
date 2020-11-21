package hospital;
import javax.swing.JOptionPane;
public class Democlass
{
	String s1=JOptionPane.showInputDialog(null,"Enter the size of array of type Patient:   ");
	int sz=Integer.parseInt(s1);
	IndoorPatient[] ip=new IndoorPatient[sz];
	OutdoorPatient[] op=new OutdoorPatient[sz];
	Doctor[] doc=new Doctor[sz];
	Doctor[] doc1=new Doctor[sz];
	int ipcount=0;
	int opcount=0;
	//Add an indoor patient
	public Democlass()
	{
		//empty
	} 
	public void indoorPatient()
	{
		for(int i=0;i<sz;i++)	
		{
			ip[i]=new IndoorPatient();
			doc[i]=new Doctor();
			String string1=JOptionPane.showInputDialog("Enter your name:   ");
			String s2=JOptionPane.showInputDialog("Enter your cnic:   ");
			String s3=JOptionPane.showInputDialog("Enter your phone no:   ");
			String s4=JOptionPane.showInputDialog("Enter your gender(M/F):   ");
			String s5=JOptionPane.showInputDialog("Enter your age:   ");
			int ag=Integer.parseInt(s5);
			String s6=JOptionPane.showInputDialog("Enter your address:   ");
			ip[i].setdata(string1, s2, s6, s3,s4, ag );
			//System.out.print(ip[i].getdocname());
			//ip[i].getdocdept();
			JOptionPane.showMessageDialog(null,"    Admission date   ","info",JOptionPane.INFORMATION_MESSAGE);
			String s=JOptionPane.showInputDialog("Enter today's day:   ");
			int da=Integer.parseInt(s);
			String str1=JOptionPane.showInputDialog("Enter current month:   ");
			int mo=Integer.parseInt(str1);
			String str2=JOptionPane.showInputDialog("Enter current year:   ");
			int y=Integer.parseInt(str2);
			ip[i].setAdmDate(da,mo,y);
			String str3=JOptionPane.showInputDialog("Enter Basic fee:   ");
			int bf=Integer.parseInt(str3);
			String str4=JOptionPane.showInputDialog("Enter testing fee:   ");
			int tf=Integer.parseInt(str4);
			String str5=JOptionPane.showInputDialog("Enter admission fee:   ");
			int af=Integer.parseInt(str5);
			JOptionPane.showMessageDialog(null,"Enter  doctor info:    ","info",JOptionPane.INFORMATION_MESSAGE);
			String st1=JOptionPane.showInputDialog("Enter your name:   ");
			String st2=JOptionPane.showInputDialog("Enter your cnic:   ");
			String st3=JOptionPane.showInputDialog("Enter your phone no:   ");
			String st4=JOptionPane.showInputDialog("Enter your gender(M/F):   ");
			String st5=JOptionPane.showInputDialog("Enter your  department:   ");
			String st6=JOptionPane.showInputDialog("Enter your specialization:   ");
			doc[i]=ip[i].setdoctorData(st1, st2, st3, st5, st6, st4);
			System.out.print(doc[i].getname());
			doc[i].getcnic();
			doc[i].getdept();
			doc[i].getgender();
			doc[i].getphno();
			doc[i].getspecialization();
			JOptionPane.showMessageDialog(null,"Total fee  :   "+ip[i].calculateFee(bf,tf,af)+"\n","info",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, ip[i].toString(),"output",JOptionPane.INFORMATION_MESSAGE);		
			ipcount++;
		}
	}
	public void doctorList()
	{
		for(int i=0;i<sz;i++)
		{
			JOptionPane.showMessageDialog(null,"  "+doc[i]+"\n"+doc1[i],"List of doctors",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void outdoorPatient()
	{
		for(int i=0;i<sz;i++)
		{
			op[i]=new OutdoorPatient();
			doc1[i]=new Doctor();
			String string1=JOptionPane.showInputDialog("Enter your name:   ");
			String s2=JOptionPane.showInputDialog("Enter your cnic:   ");
			String s3=JOptionPane.showInputDialog("Enter your phone no:   ");
			String s4=JOptionPane.showInputDialog("Enter your gender(M/F):   ");
			String s5=JOptionPane.showInputDialog("Enter your age:   ");
			int ag=Integer.parseInt(s5);
			String s6=JOptionPane.showInputDialog("Enter your address:   ");
			op[i].setdata(string1, s2, s6, s3,s4, ag );
			op[i].getdocname();
			op[i].getdocdept();
			JOptionPane.showMessageDialog(null, "DATE OF APPOINTMENT","     ",JOptionPane.INFORMATION_MESSAGE);
			String s=JOptionPane.showInputDialog("Enter APPOINTMENT day:   ");
			int da=Integer.parseInt(s);
			String str1=JOptionPane.showInputDialog("Enter APPOINTMENT month:   ");
			int mo=Integer.parseInt(str1);
			String str2=JOptionPane.showInputDialog("Enter APPOINTMENT year:   ");
			int y=Integer.parseInt(str2);
			op[i].setAppDate(da,mo,y);
			op[i].d.getday();
			op[i].d.getmonth();
			op[i].d.getyear();
			String hr=JOptionPane.showInputDialog("Enter hours's time :   ");
			int h=Integer.parseInt(hr);
			String mn=JOptionPane.showInputDialog("Enter mins's time  :   ");
			int m=Integer.parseInt(mn);
			String fr=JOptionPane.showInputDialog("Enter format am/pm:   ");
			op[i].setAppTime(h,m,fr);
			op[i].getTOA();
			String str3=JOptionPane.showInputDialog("Enter Basic fee:   ");
			int bf=Integer.parseInt(str3);
			String str4=JOptionPane.showInputDialog("Enter testing fee:   ");
			int tf=Integer.parseInt(str4);
			JOptionPane.showMessageDialog(null,"Enter  doctor info:    ","info",JOptionPane.INFORMATION_MESSAGE);
			String st1=JOptionPane.showInputDialog("Enter your name:   ");
			String st2=JOptionPane.showInputDialog("Enter your cnic:   ");
			String st3=JOptionPane.showInputDialog("Enter your phone no:   ");
			String st4=JOptionPane.showInputDialog("Enter your gender(M/F):   ");
			String st5=JOptionPane.showInputDialog("Enter your  department:   ");
			String st6=JOptionPane.showInputDialog("Enter your specialization:   ");
			doc1[i]=op[i].setdoctorData(st1, st2, st3, st5, st6, st4);
			JOptionPane.showMessageDialog(null,op[i].toString()+" total fee  :  "+op[i].calculateFee(bf,tf),"info",JOptionPane.INFORMATION_MESSAGE);
			opcount++;
		}
	}
	public String searchDoctor()
	{
		String name;
		name=JOptionPane.showInputDialog(null,"Enter name you want to search   :    ");
		String str=" ";
		for(int i=0;i<sz;i++)
		{
			doc[i]=new Doctor();
			doc1[i]=new Doctor();
			if(doc[i].getname().compareTo(name)==0)
			{
				str="Doctor Details  \n"+doc[i].toString()+"   Search by name  ";
			}
			if(doc1[i].getname().compareTo(name)==0) 
			{
				str="Doctor Details  \n"+doc1[i].toString()+"   Search by name  ";
			}	
		
		}
		return str;
	}
	public void inPaList()
	{
		for(int i=0;i<ipcount;i++)
		{
			JOptionPane.showMessageDialog(null, ip[i]+"  \n  ","Indoor Patient list",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void appList()
	{
		int day;
		int m;
		int y;
		//OutdoorPatient outp=new OutdoorPatient();
		String s1=JOptionPane.showInputDialog("Enter certain day   :   ");
		day=Integer.parseInt(s1);
		String s2=JOptionPane.showInputDialog("Enter certain month   :   ");
		m=Integer.parseInt(s2);
		String s3=JOptionPane.showInputDialog("Enter certain year   :   ");
		y=Integer.parseInt(s3);
		for(int i=0;i<opcount;i++)
		{
			op[i]=new OutdoorPatient();
			System.out.print(op[i].d);
			if(op[i]!=null)
			{
			if(op[i].d.getday()==day)
			{
					if(op[i].d.getmonth()==m)
					{
						if(op[i].d.getyear()==y)
						{
							JOptionPane.showMessageDialog(null,"DATE OF APPOINTMENTS"+op[i].getDOA(),"  ",JOptionPane.INFORMATION_MESSAGE);
						}
					}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Sorry,No appointments on the day");
			}
			}
		}
	}
	public String DoctorApp()
	{
		String name=" ";
		//IndoorPatient ip[]=new IndoorPatient[sz];
		//Doctor doc=new Doctor();
		String str = "Appointment of an indoor patient ";
		String str1 = "";
		String str2 = " with Doctor '" + name +"'.";
		for (int i = 0; i < ip.length; i++)
		{
			if (ip[i] != null) 
			{
				if (ip[i].doc.getname().compareTo(name) == 0)
					str1 = str1 + str + str2 + "\n";
				else
					str1 = " ";
			}
		}
		if (str1 == " ")
			str1 = "No indoor patient appointment with Doctor '" + name + "'.\n";
		return str1;
	}
	 public void dChanger()
	 {
		  String l;
		  IndoorPatient a=new IndoorPatient();
		  l=JOptionPane.showInputDialog("Give new day:");
	      int day=Integer.parseInt(l);
	      l=JOptionPane.showInputDialog("Give new month:");
		  int month=Integer.parseInt(l);
		  l =JOptionPane.showInputDialog("Give new year:");
		  int year=Integer.parseInt(l);
		  a.d.setday(day);
		  a.d.setmonth(month);
		  a.d.setyear(year);
	 }
}
