package jdonut;

import java.util.ArrayList;

import jdonut.tools.DMath;
import jdonut.tools.Output;
import jdonut.utils.Prints;
import jdonut.utils.Version;
@SuppressWarnings("unused") 
class JDonut {
	private static DMath math;
    private static Output ouput;
    

    
	private static double version = Version.getVersion();
	public static void main(String[] args){
		System.out.println("**************************************");
		System.out.println("               JDONUT                 ");
		System.out.println("**************************************");
		System.out.println("           VERSION:" + " " + version);
		System.out.println("**************************************");
	}
	
	
	
	
}
