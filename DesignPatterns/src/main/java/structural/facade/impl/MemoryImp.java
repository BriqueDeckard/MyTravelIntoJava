package structural.facade.impl;

import structural.facade.contracts.Memory;

public class MemoryImp implements Memory {
	@Override
	public void load(long position, byte[] data) {
		System.out.println("MEMORY: \n" +
				"\tPosition: " + position + "\n" +
				"\tData : " + data);
	}
}
