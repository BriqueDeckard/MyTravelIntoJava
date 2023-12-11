package behavioral.active_object;

public class MyActiveObjectApp {
	static int activeObjects = 10;
	public static void main(String[] args) throws InterruptedException {
		MyConcreteActiveObject concreteActiveObject;
		try {
			for (int i = 0; i < activeObjects; i++) {
				concreteActiveObject =
						new MyConcreteActiveObject(MyConcreteActiveObject.class.getSimpleName().toString() + i);
				concreteActiveObject.eat();
				concreteActiveObject.roam();
			}
			Thread.sleep(1000);
		}catch (InterruptedException e){
			System.err.println(e.getMessage());
		}
	}


}
