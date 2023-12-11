package structural.facade.impl;

import structural.facade.contracts.HardDrive;

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
