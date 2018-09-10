
public class Student {
	private String id;
	private String name;
	private String group;
	private String email;

	Student() {
		this.id = "000";
		this.name = "Student";
		this.email = "uet@vnu.edu.vn";
		this.group = "K60CC";
	}

	Student(String nid, String n, String em) {
		this.id = nid;
		this.name = n;
		this.email = em;
		this.group = "K60CC";
	}

	Student(Student s) {
		this.id = s.getId();
		this.name = s.getName();
		this.email = s.getEmail();
		this.group = s.getGroup();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void getInfo() {
		System.out.println(
				"Id = " + this.id + ", Name = " + this.name + ", Email = " + this.email + ", Group = " + this.group);
	}
}
