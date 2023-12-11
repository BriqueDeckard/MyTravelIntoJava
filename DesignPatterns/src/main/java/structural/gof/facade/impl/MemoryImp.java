package structural.gof.facade.impl;

import structural.gof.facade.contracts.Memory;

public class MemoryImp implements Memory {
	@Override
	public void load(long position, byte[] data) {
		System.out.println("MEMORY: \n" +
				"\tPosition: " + position + "\n" +
				"\tData : " + data);
	}
}
