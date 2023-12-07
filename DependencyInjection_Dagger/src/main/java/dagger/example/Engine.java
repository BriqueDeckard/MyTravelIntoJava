package dagger.example;

public class Engine {
	String mark;

	public Engine(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Engine{" +
				"mark='" + mark + '\'' +
				'}';
	}
}
