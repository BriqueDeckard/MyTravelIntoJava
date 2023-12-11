package gang_of_four.structural.facade.contracts;

public interface HardDrive {
	byte[] read(long lba, int size);
}
