package core_classes.records;

public class MyRecordApp {
	public static void main(String[] args) {
		MyRecordClass myRecordClass = new MyRecordClass("NAME", "BABYLON");
		System.out.println(myRecordClass.name());
		System.out.println(myRecordClass.address());

		MyRecordClass myRecordClass1 = new MyRecordClass("NAME", "BABYLON");
		System.out.println(myRecordClass.equals(myRecordClass1));
	}
}
