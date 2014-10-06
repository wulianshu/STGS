package model;

/**
 * RewardsId entity. @author MyEclipse Persistence Tools
 */

public class RewardsId implements java.io.Serializable {

	// Fields

	private String studentNo;
	private String rewardsType;
	private String rewardsReason;
	private String rewardsProve;
	private String comment;

	// Constructors

	/** default constructor */
	public RewardsId() {
	}

	/** full constructor */
	public RewardsId(String studentNo, String rewardsType,
			String rewardsReason, String rewardsProve, String comment) {
		this.studentNo = studentNo;
		this.rewardsType = rewardsType;
		this.rewardsReason = rewardsReason;
		this.rewardsProve = rewardsProve;
		this.comment = comment;
	}

	// Property accessors

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getRewardsType() {
		return this.rewardsType;
	}

	public void setRewardsType(String rewardsType) {
		this.rewardsType = rewardsType;
	}

	public String getRewardsReason() {
		return this.rewardsReason;
	}

	public void setRewardsReason(String rewardsReason) {
		this.rewardsReason = rewardsReason;
	}

	public String getRewardsProve() {
		return this.rewardsProve;
	}

	public void setRewardsProve(String rewardsProve) {
		this.rewardsProve = rewardsProve;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RewardsId))
			return false;
		RewardsId castOther = (RewardsId) other;

		return ((this.getStudentNo() == castOther.getStudentNo()) || (this
				.getStudentNo() != null && castOther.getStudentNo() != null && this
				.getStudentNo().equals(castOther.getStudentNo())))
				&& ((this.getRewardsType() == castOther.getRewardsType()) || (this
						.getRewardsType() != null
						&& castOther.getRewardsType() != null && this
						.getRewardsType().equals(castOther.getRewardsType())))
				&& ((this.getRewardsReason() == castOther.getRewardsReason()) || (this
						.getRewardsReason() != null
						&& castOther.getRewardsReason() != null && this
						.getRewardsReason()
						.equals(castOther.getRewardsReason())))
				&& ((this.getRewardsProve() == castOther.getRewardsProve()) || (this
						.getRewardsProve() != null
						&& castOther.getRewardsProve() != null && this
						.getRewardsProve().equals(castOther.getRewardsProve())))
				&& ((this.getComment() == castOther.getComment()) || (this
						.getComment() != null && castOther.getComment() != null && this
						.getComment().equals(castOther.getComment())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStudentNo() == null ? 0 : this.getStudentNo().hashCode());
		result = 37
				* result
				+ (getRewardsType() == null ? 0 : this.getRewardsType()
						.hashCode());
		result = 37
				* result
				+ (getRewardsReason() == null ? 0 : this.getRewardsReason()
						.hashCode());
		result = 37
				* result
				+ (getRewardsProve() == null ? 0 : this.getRewardsProve()
						.hashCode());
		result = 37 * result
				+ (getComment() == null ? 0 : this.getComment().hashCode());
		return result;
	}

}