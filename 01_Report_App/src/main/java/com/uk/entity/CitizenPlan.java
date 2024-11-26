package com.uk.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CITIZEN_PLANS_INFO")
public class CitizenPlan implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitAmt;
	private String denialReason;
	private LocalDate terminateDate;
	private String terminationRsn;
	@Override
	public String toString() {
		return "CitizenPlan [citizenId=" + citizenId + ", citizenName=" + citizenName + ", gender=" + gender
				+ ", planName=" + planName + ", planStatus=" + planStatus + ", planStartDate=" + planStartDate
				+ ", planEndDate=" + planEndDate + ", benefitAmt=" + benefitAmt + ", denialReason=" + denialReason
				+ ", terminateDate=" + terminateDate + ", terminationRsn=" + terminationRsn + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(benefitAmt, citizenId, citizenName, denialReason, gender, planEndDate, planName,
				planStartDate, planStatus, terminateDate, terminationRsn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CitizenPlan other = (CitizenPlan) obj;
		return Objects.equals(benefitAmt, other.benefitAmt) && Objects.equals(citizenId, other.citizenId)
				&& Objects.equals(citizenName, other.citizenName) && Objects.equals(denialReason, other.denialReason)
				&& Objects.equals(gender, other.gender) && Objects.equals(planEndDate, other.planEndDate)
				&& Objects.equals(planName, other.planName) && Objects.equals(planStartDate, other.planStartDate)
				&& Objects.equals(planStatus, other.planStatus) && Objects.equals(terminateDate, other.terminateDate)
				&& Objects.equals(terminationRsn, other.terminationRsn);
	}
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public Double getBenefitAmt() {
		return benefitAmt;
	}
	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public LocalDate getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(LocalDate terminateDate) {
		this.terminateDate = terminateDate;
	}
	public String getTerminationRsn() {
		return terminationRsn;
	}
	public void setTerminationRsn(String terminationRsn) {
		this.terminationRsn = terminationRsn;
	}
}
