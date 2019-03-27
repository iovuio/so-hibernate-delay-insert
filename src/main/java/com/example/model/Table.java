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
public class Table {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@OneToMany(cascade = {PERSIST, REMOVE})
	@JoinColumn(name="doc_id")
	private List<Row> rows;

	@OneToMany(cascade = {PERSIST, REMOVE})
	@JoinColumn(name="doc_id", nullable = false)
	private List<Column> columns;

	private String textContent;


	public Table() {
	}

	public Table(String textContent) {
		this.textContent = textContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	@Override
	public String toString() {
		return "d{" +
				"id:" + id +
				", textContent: '" + textContent + '\'' +
				'}';
	}
}
