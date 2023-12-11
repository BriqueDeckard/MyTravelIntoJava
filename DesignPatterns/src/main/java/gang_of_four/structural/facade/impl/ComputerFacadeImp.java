package gang_of_four.structural.facade.impl;

import gang_of_four.structural.facade.contracts.HardDrive;
import gang_of_four.structural.facade.contracts.Memory;
import gang_of_four.structural.facade.contracts.CPU;
import gang_of_four.structural.facade.contracts.ComputerFacade;

public class ComputerFacadeImp implements ComputerFacade {
	private CPU processor;
	private Memory ram;
	private HardDrive hdd;

	public ComputerFacadeImp() {
		this.processor = new CPUImp();
		this.ram = new MemoryImp();
		this.hdd = new HardDriveImp();
	}

	@Override
	public void start(){
		processor.freeze();
		ram.load(0, hdd.read(0, 1024));
		processor.jump(0);
		processor.execute();
	}
}
