package structural.gof.facade.contracts;

public interface HardDrive {
	byte[] read(long lba, int size);
}
