package structural.gof.facade.impl;

import structural.gof.facade.contracts.HardDrive;
import structural.gof.facade.contracts.Memory;
import structural.gof.facade.contracts.CPU;
import structural.gof.facade.contracts.ComputerFacade;

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
