package model;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private String teacherNo;
	private String password;
	private TeacherInfo teacherInfo;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	/** full constructor */
	public Teacher(String teacherNo, String password, TeacherInfo teacherInfo) {
		this.teacherNo = teacherNo;
		this.password = password;
		this.teacherInfo = teacherInfo;
	}

	// Property accessors

	public String getTeacherNo() {
		return this.teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TeacherInfo getTeacherInfo() {
		return this.teacherInfo;
	}

	public void setTeacherInfo(TeacherInfo teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

}