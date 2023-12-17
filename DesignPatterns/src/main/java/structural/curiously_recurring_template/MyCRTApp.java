package structural.curiously_recurring_template;

public class MyCRTApp {
	public static void main(String[] args) {
		MmaBantamWeightFighter fighter1 = new MmaBantamWeightFighter("Cheng", "You", "Hong","Litoratristique");
		MmaBantamWeightFighter fighter2 = new MmaBantamWeightFighter("CesarJiao", "JinLiao", "YingTesfaye","Litoratristique");
		fighter1.fight(fighter2);
		MmaHeavyWeightFighter fighter3 = new MmaHeavyWeightFighter("CesarJiao", "JinLiao", "YingTesfaye",
				"Litoratristique");
//		fighter1.fight(fighter3); // Raise a compilation error
	}
}
