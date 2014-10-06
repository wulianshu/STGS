package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TeacherInfo entity. @author MyEclipse Persistence Tools
 */

public class TeacherInfo implements java.io.Serializable {

	// Fields

	private String teacherNo;
	private Teacher teacher;
	private String idCardNo;
	private String name;
	private String formerName;
	private Integer sex;
	private Date birthday;
	private String nation;
	private String nativePlace;
	private String politicalState;
	private String birthPlace;
	private String photo;
	private String healthState;
	private String email;
	private String telephone;
	private String phone;
	private String postcode;
	private String emergencyContact;
	private String emergencyPhone;
	private String party;
	private String joinPartyTime;
	private String middleSchool;
	private String degree;
	private String englishLevel;
	private String interest;
	private String comment;
	private String spellName;
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TeacherInfo() {
	}

	/** minimal constructor */
	public TeacherInfo(String teacherNo, Teacher teacher) {
		this.teacherNo = teacherNo;
		this.teacher = teacher;
	}

	/** full constructor */
	public TeacherInfo(String teacherNo, Teacher teacher, String idCardNo,
			String name, String formerName, Integer sex, Date birthday,
			String nation, String nativePlace, String politicalState,
			String birthPlace, String photo, String healthState, String email,
			String telephone, String phone, String postcode,
			String emergencyContact, String emergencyPhone, String party,
			String joinPartyTime, String middleSchool, String degree,
			String englishLevel, String interest, String comment,
			String spellName, Set courses) {
		this.teacherNo = teacherNo;
		this.teacher = teacher;
		this.idCardNo = idCardNo;
		this.name = name;
		this.formerName = formerName;
		this.sex = sex;
		this.birthday = birthday;
		this.nation = nation;
		this.nativePlace = nativePlace;
		this.politicalState = politicalState;
		this.birthPlace = birthPlace;
		this.photo = photo;
		this.healthState = healthState;
		this.email = email;
		this.telephone = telephone;
		this.phone = phone;
		this.postcode = postcode;
		this.emergencyContact = emergencyContact;
		this.emergencyPhone = emergencyPhone;
		this.party = party;
		this.joinPartyTime = joinPartyTime;
		this.middleSchool = middleSchool;
		this.degree = degree;
		this.englishLevel = englishLevel;
		this.interest = interest;
		this.comment = comment;
		this.spellName = spellName;
		this.courses = courses;
	}

	// Property accessors

	public String getTeacherNo() {
		return this.teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormerName() {
		return this.formerName;
	}

	public void setFormerName(String formerName) {
		this.formerName = formerName;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getPoliticalState() {
		return this.politicalState;
	}

	public void setPoliticalState(String politicalState) {
		this.politicalState = politicalState;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getHealthState() {
		return this.healthState;
	}

	public void setHealthState(String healthState) {
		this.healthState = healthState;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyPhone() {
		return this.emergencyPhone;
	}

	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}

	public String getParty() {
		return this.party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getJoinPartyTime() {
		return this.joinPartyTime;
	}

	public void setJoinPartyTime(String joinPartyTime) {
		this.joinPartyTime = joinPartyTime;
	}

	public String getMiddleSchool() {
		return this.middleSchool;
	}

	public void setMiddleSchool(String middleSchool) {
		this.middleSchool = middleSchool;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEnglishLevel() {
		return this.englishLevel;
	}

	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getSpellName() {
		return this.spellName;
	}

	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}