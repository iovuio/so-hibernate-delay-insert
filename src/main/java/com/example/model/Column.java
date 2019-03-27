package com.example.model;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Column {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@OneToMany(cascade = {PERSIST, REMOVE})
	@JoinColumn(name="column_id", nullable = false)
	private List<Cell> cells;

	private String textContent;

	public Column() {
	}

	public Column(String textContent) {
		this.textContent = textContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	@Override
	public String toString() {
		return "c{" +
				"id:" + id +
				", textContent: '" + textContent + '\'' +
				'}';
	}
}
