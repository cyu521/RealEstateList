package View;


import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import Model.Model;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class ListView {

	private JList<String> dataList;

	public ListView(JPanel panel, Model model) {
		// creating list
		dataList = new JList<String>(model.getPropertyListModel());
		// only allow single select
		dataList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// allow scrolling if list gets too long
		JScrollPane scrollPane = new JScrollPane(dataList);
		// set dimensions for panel
		scrollPane.setPreferredSize(new Dimension(400, 200));
		panel.add(scrollPane, BorderLayout.WEST);
	}

	public JList<String> getDataList() {
		return dataList;
	}
}
