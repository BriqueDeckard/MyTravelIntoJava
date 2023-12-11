package creational.converter;

public class MyConcreteConverter extends MyConverter<MyDTO, MyDomainEntity> {
	public MyConcreteConverter() {
		super(MyConcreteConverter::convertToEntity, MyConcreteConverter::convertToDTO);
	}

	private static MyDTO convertToDTO(MyDomainEntity myDomainEntity) {
		return new MyDTO(myDomainEntity.getId(), myDomainEntity.getName());
	}

	private static MyDomainEntity convertToEntity(MyDTO myDTO) {
		return new MyDomainEntity(myDTO.getId(), myDTO.getName());
	}
}
