package gang_of_four.structural.facade.impl;

import gang_of_four.structural.facade.contracts.Memory;

public class MemoryImp implements Memory {
	@Override
	public void load(long position, byte[] data) {
		System.out.println("MEMORY: \n" +
				"\tPosition: " + position + "\n" +
				"\tData : " + data);
	}
}
