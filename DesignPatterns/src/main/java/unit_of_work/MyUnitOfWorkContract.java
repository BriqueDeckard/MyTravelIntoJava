package unit_of_work;

public interface MyUnitOfWorkContract<T> {
	public enum UnitActions  {
		INSERT("INSERT"),
		DELETE("DELETE"),
		MODIFY("MODIFY");

		UnitActions(String actionValue) {
			this.actionValue = actionValue;
		}

		private final String actionValue;

		public String getActionValue() {
			return actionValue;
		}
	}

	void registerNew(T entity);

	void registerModified(T entity);

	void registerDeleted(T entity);

	void commit();
}
