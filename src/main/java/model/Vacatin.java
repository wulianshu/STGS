package model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Vacatin entity. @author MyEclipse Persistence Tools
 */

public class Vacatin implements java.io.Serializable {

	// Fields

	private Long id;
	private Student student;
	private String type;
	private String reason;
	private Timestamp time;
	private String counsellor;
	private Set attendanceDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vacatin() {
	}

	/** minimal constructor */
	public Vacatin(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Vacatin(Long id, Student student, String type, String reason,
			Timestamp time, String counsellor, Set attendanceDetails) {
		this.id = id;
		this.student = student;
		this.type = type;
		this.reason = reason;
		this.time = time;
		this.counsellor = counsellor;
		this.attendanceDetails = attendanceDetails;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getCounsellor() {
		return this.counsellor;
	}

	public void setCounsellor(String counsellor) {
		this.counsellor = counsellor;
	}

	public Set getAttendanceDetails() {
		return this.attendanceDetails;
	}

	public void setAttendanceDetails(Set attendanceDetails) {
		this.attendanceDetails = attendanceDetails;
	}

}