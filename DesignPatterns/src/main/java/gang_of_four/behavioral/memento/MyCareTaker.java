package gang_of_four.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class MyCareTaker {
	List<MyMemento> mementoList = new ArrayList<>();

	public void add(MyMemento state){
		mementoList.add(state);
	}

	public MyMemento get(int index){
		return mementoList.get(index);
	}
}
