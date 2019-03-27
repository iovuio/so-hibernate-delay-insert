package com.example.model;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints={
		@UniqueConstraint(columnNames = {"column_id", "row_id"})
})
public class Cell {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	private String textContent;

	public Cell() {
	}

	public Cell(String textContent) {
		this.textContent = textContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	@Override
	public String toString() {
		return "cell{" +
				"id:" + id +
				", textContent: '" + textContent + '\'' +
				'}';
	}
}
