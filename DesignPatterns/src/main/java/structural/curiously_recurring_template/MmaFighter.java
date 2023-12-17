package structural.curiously_recurring_template;

public class MmaFighter <T extends MmaFighter<T>> implements Fighter<T>{
	private final String name;
	private final String surname;
	private final String nickname;
	private final String speciality;

	public MmaFighter(String name, String surname, String nickname, String speciality) {
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
		this.speciality = speciality;
	}

	@Override
	public void fight(T opponent) {
		System.out.println(this + " fights " + opponent);
	}

	@Override
	public String toString() {
		return "MmaFighter{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", nickname='" + nickname + '\'' +
				", speciality='" + speciality + '\'' +
				'}';
	}
}
