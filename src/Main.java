
public class Main {
	public static void main(String[] args){
		//Dir_act da = new Dir_act();
		//da.setDir("");
		String command = "schtasks";
		String arg = "/Create /SC Minute /MO 1 /TN garak /TR notepad.exe";
		String workingdir = null;
		Shell32X.executeAsAdministrator(command, arg, workingdir);
			
	}
	/*
	*/
}
