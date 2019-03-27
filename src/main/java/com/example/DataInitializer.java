package com.example;

import com.example.model.Cell;
import com.example.model.Column;
import com.example.model.Row;
import com.example.model.Table;
import com.example.service.DocService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataInitializer implements CommandLineRunner {
	@Autowired
	private DocService docService;

	@Override
	public void run(String... strings) throws Exception {
		Cell cell1 = new Cell("cell1");
		Cell cell2 = new Cell("cell2");
		Cell cell3 = new Cell("cell3");
		Cell cell4 = new Cell("cell4");
		Cell cell5 = new Cell("cell5");
		Cell cell6 = new Cell("cell6");
		Row row1 = new Row("row1");
		row1.setCells(Arrays.asList(cell1, cell2, cell3));
		Row row2 = new Row("row2");
		row2.setCells(Arrays.asList(cell4, cell5, cell6));

		Column col1 = new Column("col1");
		col1.setCells(Arrays.asList(cell1, cell4));
		Column col2 = new Column("col2");
		col2.setCells(Arrays.asList(cell2, cell5));
		Column col3 = new Column("col3");
		col3.setCells(Arrays.asList(cell3, cell6));

		Table table = new Table("table");

		table.setRows(Arrays.asList(row1, row2));
		table.setColumns(Arrays.asList(col1, col2, col3));

		docService.save(table);
	}
}
