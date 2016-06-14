import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Check {
	
static JTable CheckTable;
	
	public static void createchecktable()
	{
		
		//Create columns names
		
		String columnNames[]={"Account Number", "Check Amount", "Check Date"};
		
	    //Create some data
		
		String dataValues[][]=
			{
					{"7779311", "555", "08/02/2015"},
					{"7779312", "666", "08/04/2015"},
					{"7779313", "777", "08/05/2015"}
			};
		
		// Create a new table instance
		
		CheckTable=new JTable(new DefaultTableModel(dataValues, columnNames));
			
	}
	
	public static void createcheck( String accountnumberforcheck, String checkamount, String checkdate)
	{
		
		DefaultTableModel model = new DefaultTableModel();
		model=(DefaultTableModel) CheckTable.getModel();
		
		model.addRow(new Object[]{accountnumberforcheck,checkamount, checkdate});
		
		
	
	}

}
