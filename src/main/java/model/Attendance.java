package model;

/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */

public class Attendance implements java.io.Serializable {

	// Fields

	private String studentNo;
	private Student student;
	private Integer normalCount;
	private Integer lateCount;
	private Integer leaveEarlyCount;
	private Integer absenceCount;

	// Constructors

	/** default constructor */
	public Attendance() {
	}

	/** minimal constructor */
	public Attendance(String studentNo, Student student) {
		this.studentNo = studentNo;
		this.student = student;
	}

	/** full constructor */
	public Attendance(String studentNo, Student student, Integer normalCount,
			Integer lateCount, Integer leaveEarlyCount, Integer absenceCount) {
		this.studentNo = studentNo;
		this.student = student;
		this.normalCount = normalCount;
		this.lateCount = lateCount;
		this.leaveEarlyCount = leaveEarlyCount;
		this.absenceCount = absenceCount;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getNormalCount() {
		return this.normalCount;
	}

	public void setNormalCount(Integer normalCount) {
		this.normalCount = normalCount;
	}

	public Integer getLateCount() {
		return this.lateCount;
	}

	public void setLateCount(Integer lateCount) {
		this.lateCount = lateCount;
	}

	public Integer getLeaveEarlyCount() {
		return this.leaveEarlyCount;
	}

	public void setLeaveEarlyCount(Integer leaveEarlyCount) {
		this.leaveEarlyCount = leaveEarlyCount;
	}

	public Integer getAbsenceCount() {
		return this.absenceCount;
	}

	public void setAbsenceCount(Integer absenceCount) {
		this.absenceCount = absenceCount;
	}

}