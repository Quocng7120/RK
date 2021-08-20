package vti.entity;

public class Admin extends User {

	private int ExpInYear;
	private int projectId;


	public Admin(int id, String fullName, String email, String password, int ExpInYear, int projectId) {
		super(id, fullName, email, password);
		this.ExpInYear = ExpInYear;
		this.projectId = projectId;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	@Override
	public String toString() {
		return "Admin [ExpInYear=" + ExpInYear + ", getId()=" + getId() + ", getFullName()=" + getFullName()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
