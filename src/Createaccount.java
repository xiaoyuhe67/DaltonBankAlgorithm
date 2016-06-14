import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Createaccount {
	
	static JTable AccountTable;
	
	public static void createaccounttable()
	{
		
		//Create columns names
		
		String columnNames[]={"Account Number", "Holder Name", "Balance"};
		
	    //Create some data
		
		String dataValues[][]=
			{
					{"7779311", "Homer Simpson", "1000"},
					{"7779312", "Lucy Linderman", "2300"},
					{"7779313", "Mary Thompson", "3400"}
			};
		
		// Create a new table instance
		
		AccountTable=new JTable(new DefaultTableModel(dataValues, columnNames));
			
	}
	
	public static void createaccount( String accountnumber, String Holdername, String accountbalance)
	{
		
		DefaultTableModel model = new DefaultTableModel();
		model=(DefaultTableModel) AccountTable.getModel();
		
		model.addRow(new Object[]{accountnumber,Holdername, accountbalance});
		
	
	}
	
	

}
