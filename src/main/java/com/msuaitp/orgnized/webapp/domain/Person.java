package com.msuaitp.orgnized.webapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person implements UserDetails {
	private static final long serialVersionUID = 2744190502477312547L;

	private String email;
	private String password;
	private String first_name;
	private String last_name;
	private Date expire_date;
	private String mobile_number;
	private localPaidEnum is_local_paid;
	private boolean is_member;
	private String major;
	private classYearEnum class_year;
	private Date last_sync_date;
	private List<Checkins> checkins;
	private List<ClassBonus> class_bonuses;
	private List<Role> roles;
	private Date createdAt;
	private Date updatedAt;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities () {
		return null;
	}

	@Override
	public String getPassword () {
		return null;
	}

	@Override
	public String getUsername () {
		return null;
	}

	@Override
	public boolean isAccountNonExpired () {
		return false;
	}

	@Override
	public boolean isAccountNonLocked () {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired () {
		return false;
	}

	@Override
	public boolean isEnabled () {
		return false;
	}

	public enum classYearEnum {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}

	public enum localPaidEnum {
		TRUE, FALSE, PENDING
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public localPaidEnum getIs_local_paid() {
		return is_local_paid;
	}

	public void setIs_local_paid(localPaidEnum is_local_paid) {
		this.is_local_paid = is_local_paid;
	}

	public boolean isIs_member() {
		return is_member;
	}

	public void setIs_member(boolean is_member) {
		this.is_member = is_member;
	}


	public String getMajor () {
		return major;
	}

	public void setMajor (String major) {
		this.major = major;
	}



	public classYearEnum getClass_year() {
		return class_year;
	}

	public void setClass_year(classYearEnum class_year) {
		this.class_year = class_year;
	}

	public Date getLast_sync_date() {
		return last_sync_date;
	}

	public void setLast_sync_date(Date last_sync_date) {
		this.last_sync_date = last_sync_date;
	}

	public List<Checkins> getCheckins() {
		return checkins;
	}

	public void setCheckins(List<Checkins> checkins) {
		this.checkins = checkins;
	}

	public List<ClassBonus> getClass_bonuses() {
		return class_bonuses;
	}

	public void setClass_bonuses(List<ClassBonus> class_bonuses) {
		this.class_bonuses = class_bonuses;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Person person = (Person) o;

		if (is_member != person.is_member) {
			return false;
		}
		if (checkins != null ? !checkins.equals(person.checkins) : person.checkins != null) {
			return false;
		}
		if (class_bonuses != null ? !class_bonuses.equals(person.class_bonuses)
				: person.class_bonuses != null) {
			return false;
		}
		if (class_year != person.class_year) {
			return false;
		}
		if (createdAt != null ? !createdAt.equals(person.createdAt) : person.createdAt != null) {
			return false;
		}
		if (email != null ? !email.equals(person.email) : person.email != null) {
			return false;
		}
		if (expire_date != null ? !expire_date.equals(person.expire_date)
				: person.expire_date != null) {
			return false;
		}
		if (first_name != null ? !first_name.equals(person.first_name) : person.first_name != null) {
			return false;
		}
		if (is_local_paid != person.is_local_paid) {
			return false;
		}
		if (last_name != null ? !last_name.equals(person.last_name) : person.last_name != null) {
			return false;
		}
		if (last_sync_date != null ? !last_sync_date.equals(person.last_sync_date)
				: person.last_sync_date != null) {
			return false;
		}
		if (mobile_number != null ? !mobile_number.equals(person.mobile_number)
				: person.mobile_number != null) {
			return false;
		}
		if (password != null ? !password.equals(person.password) : person.password != null) {
			return false;
		}
		if (roles != null ? !roles.equals(person.roles) : person.roles != null) {
			return false;
		}
		return !(updatedAt != null ? !updatedAt.equals(person.updatedAt) : person.updatedAt != null);

	}

	@Override
	public int hashCode() {
		int result = email != null ? email.hashCode() : 0;
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
		result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
		result = 31 * result + (expire_date != null ? expire_date.hashCode() : 0);
		result = 31 * result + (mobile_number != null ? mobile_number.hashCode() : 0);
		result = 31 * result + (is_local_paid != null ? is_local_paid.hashCode() : 0);
		result = 31 * result + (is_member ? 1 : 0);
		result = 31 * result + (class_year != null ? class_year.hashCode() : 0);
		result = 31 * result + (last_sync_date != null ? last_sync_date.hashCode() : 0);
		result = 31 * result + (checkins != null ? checkins.hashCode() : 0);
		result = 31 * result + (class_bonuses != null ? class_bonuses.hashCode() : 0);
		result = 31 * result + (roles != null ? roles.hashCode() : 0);
		result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
		result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Person{" + "email='" + email + '\'' + ", password='" + password + '\''
				+ ", first_name='" + first_name + '\'' + ", last_name='" + last_name + '\''
				+ ", expire_date=" + expire_date + ", mobile_number='" + mobile_number + '\''
				+ ", is_local_paid=" + is_local_paid + ", is_member=" + is_member + ", class_year="
				+ class_year + ", last_sync_date=" + last_sync_date + ", checkins=" + checkins
				+ ", class_bonuses=" + class_bonuses + ", roles=" + roles
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
	}

}