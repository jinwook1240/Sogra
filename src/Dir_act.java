import java.io.File;
import java.util.*;

public class Dir_act {
	String mkbatch_default = "@echo off\n"
			+"cd ";
	String mkbatch_init = "git ";
	String mkbatch_sync = "@echo off\n"

			+"cd";
	String mkbatch_merge = "";
	
	public boolean setDir(String dir){
		File f = new File(dir+"\\.git\\sync.bat");
		
		List<String> cmd = new ArrayList<String>();
		
		
		File dirlist = new File("C:\\Program Files\\GarakCloud");
		
		dirlist = new File("C:\\Program Files\\GarakCloud\\dirlist");
		dirlist = new File("C:\\Program Files\\GarakCloud\\dirlist");
		dirlist = new File("C:\\Program Files\\GarakCloud\\dirlist");
		dirlist.mkdir();
		return true;
	}
	
	public String getDir(){
		return new String();
	}/*
	private String execute(List<String> l, String dir){
		ProcessBuilder process = new ProcessBuilder(l);
		process.directory(new File(dir));
		process.start();
		
		
		
	}*/
}
