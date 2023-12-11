package structural.gof.facade.impl;

import structural.gof.facade.contracts.CPU;

public class CPUImp implements CPU {
	@Override
	public void freeze() {
		System.out.println("FREEZE");
	}

	@Override
	public void jump(long position) {
		System.out.println("Jump to : " + position);
	}

	@Override
	public void execute() {
		System.out.println("Execute");
	}
}
