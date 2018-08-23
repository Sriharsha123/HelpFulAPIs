package abt.BuilderPatter;

/**
 * @author SSarvothamai
 * 
 * Builder pattern is useful in creating objects with many optional properties
 * 
 * Avoid the possibility of using an Object in inconsistent state
 * 
 * ***** Drawbacks:
 * 
 * Redundant Code
 * No Code reusability
 * Any change in concrete class requires same change in Builder as well, if it's required 
 * parameter then change in Client as well
 * 
 *
 */
public class Computer {
	
	//required parameters
	private String RAM;
	private String HRD;
	private String CPU;
	
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	private Computer(Builder builder) {
		this.RAM = builder.RAM;
		this.HRD = builder.HRD;
		this.CPU = builder.CPU;
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	

	public String getRAM() {
		return RAM;
	}
	public String getHRD() {
		return HRD;
	}
	public String getCPU() {
		return CPU;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	//builder has to static class and nested class and it can use private constructor of Computer Class
	
	public static class Builder {
		
		//required parameters
		private String RAM;
		private String HRD;
		private String CPU;
		
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public Builder(String ram,String hrd,String cpu){
			this.RAM = ram;
			this.HRD = hrd;
			this.CPU = cpu;
		}

		public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		
		public Computer build(){
			return new Computer(this);
		}
		
		
		
	}
	

}
