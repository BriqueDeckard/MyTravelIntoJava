package unit_of_work;

public class MyUnitOfWorkApp {
	public static void main(String[] args) {
		MyDbEntity firstEntity = new MyDbEntity(1, "Pablo");
		MyDbEntity secondEntity = new MyDbEntity(2, "Marcel");
		MyDbEntity thirdEntity = new MyDbEntity(3, "Joaqm");

		MyConcreteMyUnitOfWork repository = new MyConcreteMyUnitOfWork();

		repository.registerNew(firstEntity);
		repository.registerModified(secondEntity);
		repository.registerDeleted(thirdEntity);
		repository.commit();
	}
}
