package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String studentNo;
	private Role role;
	private String pasword;
	private Set rewardses = new HashSet(0);
	private AttendanceDetail attendanceDetail;
	private Set baseDicts = new HashSet(0);
	private Attendance attendance;
	private StudentInfo studentInfo;
	private Set vacatins = new HashSet(0);
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Student(String studentNo, Role role, String pasword, Set rewardses,
			AttendanceDetail attendanceDetail, Set baseDicts,
			Attendance attendance, StudentInfo studentInfo, Set vacatins,
			Set courses) {
		this.studentNo = studentNo;
		this.role = role;
		this.pasword = pasword;
		this.rewardses = rewardses;
		this.attendanceDetail = attendanceDetail;
		this.baseDicts = baseDicts;
		this.attendance = attendance;
		this.studentInfo = studentInfo;
		this.vacatins = vacatins;
		this.courses = courses;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getPasword() {
		return this.pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public Set getRewardses() {
		return this.rewardses;
	}

	public void setRewardses(Set rewardses) {
		this.rewardses = rewardses;
	}

	public AttendanceDetail getAttendanceDetail() {
		return this.attendanceDetail;
	}

	public void setAttendanceDetail(AttendanceDetail attendanceDetail) {
		this.attendanceDetail = attendanceDetail;
	}

	public Set getBaseDicts() {
		return this.baseDicts;
	}

	public void setBaseDicts(Set baseDicts) {
		this.baseDicts = baseDicts;
	}

	public Attendance getAttendance() {
		return this.attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

	public StudentInfo getStudentInfo() {
		return this.studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}

	public Set getVacatins() {
		return this.vacatins;
	}

	public void setVacatins(Set vacatins) {
		this.vacatins = vacatins;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}