package unit_of_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyConcreteMyUnitOfWork implements MyUnitOfWorkContract<MyDbEntity> {

	private final Map<String, List<MyDbEntity>> context;

	public MyConcreteMyUnitOfWork() {
		this.context = new HashMap<>();
	}

	@Override
	public void registerNew(MyDbEntity entity) {
		System.out.println("Registering " + entity + " for insert in context.");
		register(entity, UnitActions.INSERT.getActionValue());
	}

	@Override
	public void registerModified(MyDbEntity entity) {
		System.out.println("Registering " + entity + " for modify in context.");
		register(entity, UnitActions.MODIFY.getActionValue());
	}

	@Override
	public void registerDeleted(MyDbEntity entity) {
		System.out.println("Registering " + entity + " for delete in context.");
		register(entity, UnitActions.DELETE.getActionValue());
	}

	@Override
	public void commit() {
		if (context == null || context.size() == 0) {
			return;
		}
		System.out.println("Commit started");
		if (context.containsKey(UnitActions.INSERT.getActionValue())) {
			commitInsert();
		}

		if (context.containsKey(UnitActions.MODIFY.getActionValue())) {
			commitModify();
		}

		if (context.containsKey(UnitActions.DELETE.getActionValue())) {
			commitDelete();
		}
		System.out.println("Commit finished");
	}

	private void commitInsert() {
		List<MyDbEntity> entitiesToBeInserted = context.get(UnitActions.INSERT.getActionValue());
		for (MyDbEntity entity : entitiesToBeInserted) {
			System.out.println("Inserting a new entity " + entity.getName() + " to DB");
			// Insert to database
		}
	}

	private void commitModify() {
		List<MyDbEntity> entitiesToBeModified = context.get(UnitActions.MODIFY.getActionValue());
		for (MyDbEntity entity : entitiesToBeModified) {
			System.out.println("Modifying an entity " + entity.getName() + " to DB");
			// Update database
		}
	}

	private void commitDelete() {
		List<MyDbEntity> entitiesToBeModified = context.get(UnitActions.DELETE.getActionValue());
		for (MyDbEntity entity : entitiesToBeModified) {
			System.out.println("Deleting an entity " + entity.getName() + " to DB");
			// Update database
		}
	}

	private void register(MyDbEntity myDbEntity, String operation) {
		List<MyDbEntity> entityToOperate = context.get(operation);
		if (entityToOperate == null) {
			entityToOperate = new ArrayList<>();
		}
		entityToOperate.add(myDbEntity);
		context.put(operation, entityToOperate);
	}
}
