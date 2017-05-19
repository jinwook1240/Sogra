
public class GarakController {
	public void garakCreat(){
		String command = "schtasks";
		String arg = "/Create /SC MINUTE /MO 1 /TN garak /TR djfklasj.bat /F";
		String workingdir = null;
		Shell32X.executeAsAdministrator(command, arg, workingdir);
	}
	public void garakRun(){
		String command = "schtasks";
		String arg = "/Run /TN garak";
		String workingdir = null;
		Shell32X.executeAsAdministrator(command, arg, workingdir);
	}
	public void garakEnd(){
		String command = "schtasks";
		String arg = "/Delete /Tn garak /F";
		String workingdir = null;
		Shell32X.executeAsAdministrator(command, arg, workingdir);
	}


}
