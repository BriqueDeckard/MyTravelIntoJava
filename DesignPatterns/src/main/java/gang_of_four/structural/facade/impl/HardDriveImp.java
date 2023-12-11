package gang_of_four.structural.facade.impl;

import gang_of_four.structural.facade.contracts.HardDrive;

public class HardDriveImp implements HardDrive {
	@Override
	public byte[] read(long lba, int size) {
		System.out.println("HARD DRIVE : \n" +
				"\tlba: " + lba + "\n" +
				"\tsize : " + size);
		return new byte[] {
				1, 0, 1, 0, 1, 0
		};
	}
}
