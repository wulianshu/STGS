package model;

import java.util.Date;

/**
 * StudentInfo entity. @author MyEclipse Persistence Tools
 */

public class StudentInfo implements java.io.Serializable {

	// Fields

	private String studentNo;
	private Student student;
	private AssociationWork associationWork;
	private String idCardNo;
	private String name;
	private String formerName;
	private Integer sex;
	private Date birthday;
	private String nation;
	private String nativePlace;
	private String politicalState;
	private String originArea;
	private String originProvince;
	private String birthPlace;
	private String healthState;
	private String stuCardNo;
	private String trainingDirection;
	private String majorField;
	private Date entranceDate;
	private String middleSchool;
	private String dormitoryNumber;
	private String email;
	private String telephone;
	private String postcode;
	private String admissionCardNo;
	private String eduBackground;
	private String phoneType;
	private String phone;
	private String familyPostcode;
	private String familyTelephone;
	private String fatherName;
	private String fatherWorkplace;
	private String fatherPostcode;
	private String fatherPhone;
	private String motherName;
	private String motherWorkplace;
	private String motherPostcode;
	private String motherPhone;
	private String address;
	private String addressPlace;
	private String photo;
	private String faculty;
	private String field;
	private String marjorName;
	private String teachClass;
	private String adminClass;
	private Integer eduLength;
	private Integer eduLimit;
	private String maintenanceState;
	private String curentGrade;
	private String examCode;
	private String hmtCode;
	private String registerCode;
	private Integer isAthlete;
	private String englishLevel;
	private Float englishScore;
	private Integer admitPage;
	private String interest;
	private Date admitDate;
	private String trainStation;
	private String studyMode;
	private String comment;
	private String certifier;
	private String spellName;

	// Constructors

	/** default constructor */
	public StudentInfo() {
	}

	/** minimal constructor */
	public StudentInfo(String studentNo, Student student) {
		this.studentNo = studentNo;
		this.student = student;
	}

	/** full constructor */
	public StudentInfo(String studentNo, Student student,
			AssociationWork associationWork, String idCardNo, String name,
			String formerName, Integer sex, Date birthday, String nation,
			String nativePlace, String politicalState, String originArea,
			String originProvince, String birthPlace, String healthState,
			String stuCardNo, String trainingDirection, String majorField,
			Date entranceDate, String middleSchool, String dormitoryNumber,
			String email, String telephone, String postcode,
			String admissionCardNo, String eduBackground, String phoneType,
			String phone, String familyPostcode, String familyTelephone,
			String fatherName, String fatherWorkplace, String fatherPostcode,
			String fatherPhone, String motherName, String motherWorkplace,
			String motherPostcode, String motherPhone, String address,
			String addressPlace, String photo, String faculty, String field,
			String marjorName, String teachClass, String adminClass,
			Integer eduLength, Integer eduLimit, String maintenanceState,
			String curentGrade, String examCode, String hmtCode,
			String registerCode, Integer isAthlete, String englishLevel,
			Float englishScore, Integer admitPage, String interest,
			Date admitDate, String trainStation, String studyMode,
			String comment, String certifier, String spellName) {
		this.studentNo = studentNo;
		this.student = student;
		this.associationWork = associationWork;
		this.idCardNo = idCardNo;
		this.name = name;
		this.formerName = formerName;
		this.sex = sex;
		this.birthday = birthday;
		this.nation = nation;
		this.nativePlace = nativePlace;
		this.politicalState = politicalState;
		this.originArea = originArea;
		this.originProvince = originProvince;
		this.birthPlace = birthPlace;
		this.healthState = healthState;
		this.stuCardNo = stuCardNo;
		this.trainingDirection = trainingDirection;
		this.majorField = majorField;
		this.entranceDate = entranceDate;
		this.middleSchool = middleSchool;
		this.dormitoryNumber = dormitoryNumber;
		this.email = email;
		this.telephone = telephone;
		this.postcode = postcode;
		this.admissionCardNo = admissionCardNo;
		this.eduBackground = eduBackground;
		this.phoneType = phoneType;
		this.phone = phone;
		this.familyPostcode = familyPostcode;
		this.familyTelephone = familyTelephone;
		this.fatherName = fatherName;
		this.fatherWorkplace = fatherWorkplace;
		this.fatherPostcode = fatherPostcode;
		this.fatherPhone = fatherPhone;
		this.motherName = motherName;
		this.motherWorkplace = motherWorkplace;
		this.motherPostcode = motherPostcode;
		this.motherPhone = motherPhone;
		this.address = address;
		this.addressPlace = addressPlace;
		this.photo = photo;
		this.faculty = faculty;
		this.field = field;
		this.marjorName = marjorName;
		this.teachClass = teachClass;
		this.adminClass = adminClass;
		this.eduLength = eduLength;
		this.eduLimit = eduLimit;
		this.maintenanceState = maintenanceState;
		this.curentGrade = curentGrade;
		this.examCode = examCode;
		this.hmtCode = hmtCode;
		this.registerCode = registerCode;
		this.isAthlete = isAthlete;
		this.englishLevel = englishLevel;
		this.englishScore = englishScore;
		this.admitPage = admitPage;
		this.interest = interest;
		this.admitDate = admitDate;
		this.trainStation = trainStation;
		this.studyMode = studyMode;
		this.comment = comment;
		this.certifier = certifier;
		this.spellName = spellName;
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

	public AssociationWork getAssociationWork() {
		return this.associationWork;
	}

	public void setAssociationWork(AssociationWork associationWork) {
		this.associationWork = associationWork;
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

	public String getOriginArea() {
		return this.originArea;
	}

	public void setOriginArea(String originArea) {
		this.originArea = originArea;
	}

	public String getOriginProvince() {
		return this.originProvince;
	}

	public void setOriginProvince(String originProvince) {
		this.originProvince = originProvince;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getHealthState() {
		return this.healthState;
	}

	public void setHealthState(String healthState) {
		this.healthState = healthState;
	}

	public String getStuCardNo() {
		return this.stuCardNo;
	}

	public void setStuCardNo(String stuCardNo) {
		this.stuCardNo = stuCardNo;
	}

	public String getTrainingDirection() {
		return this.trainingDirection;
	}

	public void setTrainingDirection(String trainingDirection) {
		this.trainingDirection = trainingDirection;
	}

	public String getMajorField() {
		return this.majorField;
	}

	public void setMajorField(String majorField) {
		this.majorField = majorField;
	}

	public Date getEntranceDate() {
		return this.entranceDate;
	}

	public void setEntranceDate(Date entranceDate) {
		this.entranceDate = entranceDate;
	}

	public String getMiddleSchool() {
		return this.middleSchool;
	}

	public void setMiddleSchool(String middleSchool) {
		this.middleSchool = middleSchool;
	}

	public String getDormitoryNumber() {
		return this.dormitoryNumber;
	}

	public void setDormitoryNumber(String dormitoryNumber) {
		this.dormitoryNumber = dormitoryNumber;
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

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAdmissionCardNo() {
		return this.admissionCardNo;
	}

	public void setAdmissionCardNo(String admissionCardNo) {
		this.admissionCardNo = admissionCardNo;
	}

	public String getEduBackground() {
		return this.eduBackground;
	}

	public void setEduBackground(String eduBackground) {
		this.eduBackground = eduBackground;
	}

	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFamilyPostcode() {
		return this.familyPostcode;
	}

	public void setFamilyPostcode(String familyPostcode) {
		this.familyPostcode = familyPostcode;
	}

	public String getFamilyTelephone() {
		return this.familyTelephone;
	}

	public void setFamilyTelephone(String familyTelephone) {
		this.familyTelephone = familyTelephone;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherWorkplace() {
		return this.fatherWorkplace;
	}

	public void setFatherWorkplace(String fatherWorkplace) {
		this.fatherWorkplace = fatherWorkplace;
	}

	public String getFatherPostcode() {
		return this.fatherPostcode;
	}

	public void setFatherPostcode(String fatherPostcode) {
		this.fatherPostcode = fatherPostcode;
	}

	public String getFatherPhone() {
		return this.fatherPhone;
	}

	public void setFatherPhone(String fatherPhone) {
		this.fatherPhone = fatherPhone;
	}

	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherWorkplace() {
		return this.motherWorkplace;
	}

	public void setMotherWorkplace(String motherWorkplace) {
		this.motherWorkplace = motherWorkplace;
	}

	public String getMotherPostcode() {
		return this.motherPostcode;
	}

	public void setMotherPostcode(String motherPostcode) {
		this.motherPostcode = motherPostcode;
	}

	public String getMotherPhone() {
		return this.motherPhone;
	}

	public void setMotherPhone(String motherPhone) {
		this.motherPhone = motherPhone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressPlace() {
		return this.addressPlace;
	}

	public void setAddressPlace(String addressPlace) {
		this.addressPlace = addressPlace;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMarjorName() {
		return this.marjorName;
	}

	public void setMarjorName(String marjorName) {
		this.marjorName = marjorName;
	}

	public String getTeachClass() {
		return this.teachClass;
	}

	public void setTeachClass(String teachClass) {
		this.teachClass = teachClass;
	}

	public String getAdminClass() {
		return this.adminClass;
	}

	public void setAdminClass(String adminClass) {
		this.adminClass = adminClass;
	}

	public Integer getEduLength() {
		return this.eduLength;
	}

	public void setEduLength(Integer eduLength) {
		this.eduLength = eduLength;
	}

	public Integer getEduLimit() {
		return this.eduLimit;
	}

	public void setEduLimit(Integer eduLimit) {
		this.eduLimit = eduLimit;
	}

	public String getMaintenanceState() {
		return this.maintenanceState;
	}

	public void setMaintenanceState(String maintenanceState) {
		this.maintenanceState = maintenanceState;
	}

	public String getCurentGrade() {
		return this.curentGrade;
	}

	public void setCurentGrade(String curentGrade) {
		this.curentGrade = curentGrade;
	}

	public String getExamCode() {
		return this.examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public String getHmtCode() {
		return this.hmtCode;
	}

	public void setHmtCode(String hmtCode) {
		this.hmtCode = hmtCode;
	}

	public String getRegisterCode() {
		return this.registerCode;
	}

	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}

	public Integer getIsAthlete() {
		return this.isAthlete;
	}

	public void setIsAthlete(Integer isAthlete) {
		this.isAthlete = isAthlete;
	}

	public String getEnglishLevel() {
		return this.englishLevel;
	}

	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	public Float getEnglishScore() {
		return this.englishScore;
	}

	public void setEnglishScore(Float englishScore) {
		this.englishScore = englishScore;
	}

	public Integer getAdmitPage() {
		return this.admitPage;
	}

	public void setAdmitPage(Integer admitPage) {
		this.admitPage = admitPage;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Date getAdmitDate() {
		return this.admitDate;
	}

	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}

	public String getTrainStation() {
		return this.trainStation;
	}

	public void setTrainStation(String trainStation) {
		this.trainStation = trainStation;
	}

	public String getStudyMode() {
		return this.studyMode;
	}

	public void setStudyMode(String studyMode) {
		this.studyMode = studyMode;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCertifier() {
		return this.certifier;
	}

	public void setCertifier(String certifier) {
		this.certifier = certifier;
	}

	public String getSpellName() {
		return this.spellName;
	}

	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}

}