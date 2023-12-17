package structural.composite_entity;

public class MyConcreteCoarseGrainedObject extends MyCoarseGrainedObject<String>{
	@Override
	public String[] getData() {
		super.getData();
		return new String[]{
				dependentObjects[0].getData(), dependentObjects[1].getData()
		};
	}

	public void init(){
		dependentObjects = new MyDependentObject[]{
				new MyConcreteDependentObjectA(),
				new MyConcreteDependentObjectB()
		};
	}
}
