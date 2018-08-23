package abt.BuilderPatter;

public class ComputerBuilderDirector {

	public Computer getBasicComputer() {

		return new Computer.Builder("2GB", "2TB", "Intel i 7").build();

	}
	
	public Computer getGraphicsCardEnabledComputer(){
		
		 return new Computer.Builder("2GB","2TB","Intel i 7").setGraphicsCardEnabled(true).build();
	}

}
