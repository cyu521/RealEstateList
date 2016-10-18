package View;


import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import Model.Model;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class TableView {
	private JTable dataTable;

	public TableView(JPanel panel, Model model) {
		// creating table
		dataTable = new JTable(model.getPropertyTableModel());
		// single select only
		dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// scrollable for long list
		JScrollPane scrollPane = new JScrollPane(dataTable);
		// add header
		scrollPane.setColumnHeaderView(dataTable.getTableHeader());

		scrollPane.setPreferredSize(new Dimension(400, 400));
		panel.add(scrollPane, BorderLayout.EAST);
	}

	public JTable getDataTable() {
		return dataTable;
	}
}
