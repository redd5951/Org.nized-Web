package com.msuaitp.orgnized.webapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.sql.Date;

@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Answer {

	private int id;
	private int question_id;
	private String text;
	private Person email;
	private Date createdAt;
	private Date updatedAt;
	private int count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Person getEmail () {
		return email;
	}

	public void setEmail (Person email) {
		this.email = email;
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

		Answer answer = (Answer) o;

		if (id != answer.id) {
			return false;
		}
		if (question_id != answer.question_id) {
			return false;
		}
		if (createdAt != null ? !createdAt.equals(answer.createdAt)
				: answer.createdAt != null) {
			return false;
		}
		if (text != null ? !text.equals(answer.text) : answer.text != null) {
			return false;
		}
		return !(updatedAt != null ? !updatedAt.equals(answer.updatedAt)
				: answer.updatedAt != null);

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + question_id;
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
		result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
		return result;
	}

	@Override
	public String toString () {
		return "Answer{" +
				"id=" + id +
				", question_id=" + question_id +
				", text='" + text + '\'' +
				", email=" + email +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				'}';
	}
}