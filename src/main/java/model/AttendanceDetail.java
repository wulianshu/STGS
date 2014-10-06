package model;

/**
 * AttendanceDetail entity. @author MyEclipse Persistence Tools
 */

public class AttendanceDetail implements java.io.Serializable {

	// Fields

	private String studentNo;
	private Vacatin vacatin;
	private Student student;
	private String time;
	private String classroom;
	private String course;
	private String teacher;
	private String attendanceType;
	private String comment;

	// Constructors

	/** default constructor */
	public AttendanceDetail() {
	}

	/** minimal constructor */
	public AttendanceDetail(String studentNo, Student student) {
		this.studentNo = studentNo;
		this.student = student;
	}

	/** full constructor */
	public AttendanceDetail(String studentNo, Vacatin vacatin, Student student,
			String time, String classroom, String course, String teacher,
			String attendanceType, String comment) {
		this.studentNo = studentNo;
		this.vacatin = vacatin;
		this.student = student;
		this.time = time;
		this.classroom = classroom;
		this.course = course;
		this.teacher = teacher;
		this.attendanceType = attendanceType;
		this.comment = comment;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public Vacatin getVacatin() {
		return this.vacatin;
	}

	public void setVacatin(Vacatin vacatin) {
		this.vacatin = vacatin;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getClassroom() {
		return this.classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getAttendanceType() {
		return this.attendanceType;
	}

	public void setAttendanceType(String attendanceType) {
		this.attendanceType = attendanceType;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}