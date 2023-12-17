package structural.composite_entity;

public class MyCompositeEntity {
	private final MyConcreteCoarseGrainedObject coarseGrainedObject = new MyConcreteCoarseGrainedObject();

	public void setData(String message, String signal){
		coarseGrainedObject.setData(message, signal);
	}

	public String[] getData(){
		return coarseGrainedObject.getData();
	}

	public void init(){
		coarseGrainedObject.init();
	}
}
