package creating_object.reflection;

public class MyEntity {
	private String subject;

	public MyEntity(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "MyEntity{" +
				"subject='" + subject + '\'' +
				'}';
	}
}
