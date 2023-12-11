package structural.gof.facade.impl;

import structural.gof.facade.contracts.HardDrive;

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
