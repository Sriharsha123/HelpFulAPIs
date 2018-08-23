package abt.FactoryPattern;

/**
 * @author SSarvothamai
 * 
 * Abstration
 * Loosely coupled code
 * Remove the burden from client to Factory
 * Easy to extend
 * 
 * 
 * JDK examples
 * 
 * Calendar class
 * 
 * Number format class
 * 
 * 
 *
 */
public class ComputerFactory {
	
	public static Computer createComputer(ComputerType type,String rAM,String hDD,String cPU){
		
		Computer comp = null;
		switch(type){
		case PC:
			comp = new PC(rAM,hDD,cPU);
			break;
		case SERVER:
			comp = new Server(rAM,hDD,cPU);
			break;
		case SUPERCOMPUTER:
			comp = new SuperComputer();
		}
		
		return comp;
		
	}

}
