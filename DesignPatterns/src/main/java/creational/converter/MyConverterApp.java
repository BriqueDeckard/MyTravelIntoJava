package creational.converter;

public class MyConverterApp {
	public static void main(String[] args) {
		MyDomainEntity myDomainEntity = new MyDomainEntity(1, "Qart");
		MyConcreteConverter myConcreteConverter = new MyConcreteConverter();
		MyDTO myDTO = myConcreteConverter.convertFromEntity(myDomainEntity);
		System.out.println(myDTO);
		MyDomainEntity myDomainEntity1 = myConcreteConverter.convertFromDto(myDTO);
		System.out.println(myDomainEntity1);
	}
}
