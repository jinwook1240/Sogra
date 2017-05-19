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
		
		File dirlist = new File(System.getenv("APPDATA")+"\\GarakCloud");
		if(!dirlist.exists()){
			dirlist.mkdir();
		}
		
		dirlist = new File(System.getenv("APPDATA")+"\\GarakCloud\\dirlist");
		dirlist.mkdir();
		return true;
	}
	
	public String getDir(){
		return new String();
	}
	
}
