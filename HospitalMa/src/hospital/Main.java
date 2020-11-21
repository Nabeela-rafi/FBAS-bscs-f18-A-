package hospital;
import javax.swing.JOptionPane;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//menu
		JOptionPane.showMessageDialog(null,"1)   Add an indoor patient \n 2)   Add an outdoor patient \n  3)   List of doctors  \n  4)  Search doctor by name or department  \n ","menu",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"3)   List of doctors \n ","menu",JOptionPane.INFORMATION_MESSAGE);
		int choice;
		Democlass dm=new Democlass();
		do
		{
			String str=JOptionPane.showInputDialog("Enter your choice:   ");
			choice=Integer.parseInt(str);
			if(choice==1)
			{
				dm.indoorPatient();
			}
			else if(choice==2)
			{
				dm.outdoorPatient(); 
			}
			else if(choice==3)
			{
				dm.doctorList();
			}
			else if(choice==4)
			{
				JOptionPane.showMessageDialog(null, dm.searchDoctor(),"Search doctor by name",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(choice==5)
			{
				dm.inPaList();
			}
			else if(choice==6)
			{
				dm.appList();
			}
			else if(choice==7)
			{
				dm.DoctorApp();
			}
			else if(choice==8)
			{
				dm.dChanger();
			}
		}while(choice!=9);
	}
}