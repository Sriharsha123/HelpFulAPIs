package abt.FactoryPattern;

public class ComputerClient {
	public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(ComputerType.PC,"12GB","4TB","Intel Core 2");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER,"22GB","2TB","Intel i 7");
        Computer supercomputer  = ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER,"223GB","23TB","Intel i 73");
	}

}

