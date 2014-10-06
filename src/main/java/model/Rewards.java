package model;

/**
 * Rewards entity. @author MyEclipse Persistence Tools
 */

public class Rewards implements java.io.Serializable {

	// Fields

	private RewardsId id;
	private Student student;

	// Constructors

	/** default constructor */
	public Rewards() {
	}

	/** minimal constructor */
	public Rewards(RewardsId id) {
		this.id = id;
	}

	/** full constructor */
	public Rewards(RewardsId id, Student student) {
		this.id = id;
		this.student = student;
	}

	// Property accessors

	public RewardsId getId() {
		return this.id;
	}

	public void setId(RewardsId id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}