package structural.facade.impl;

import structural.facade.contracts.CPU;
import structural.facade.contracts.ComputerFacade;
import structural.facade.contracts.HardDrive;
import structural.facade.contracts.Memory;

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
