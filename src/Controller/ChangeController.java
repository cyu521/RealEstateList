package Controller;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Model;
import Model.Property;
import Model.PropertyListModel;
import Model.PropertyTableModel;
import View.View;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */

public class ChangeController extends ButtonController implements
		ActionListener {

	public ChangeController(Model model, View view) {
		super(model, view);
	}

	public void actionPerformed(ActionEvent arg0) {
		// make sure fields are not empty
		if (isFieldsEmpty()) {
			view.getMessageView().setMessageLabel(
					"Unable to change the list, one or more fields are empty",
					Color.RED);
			return;
		}

		// get field property
		Property property = getProperty();
		int index = view.getSelectedIndex();
		// list
		if (view.isListSelected()) {
			PropertyListModel plm = model.getPropertyListModel();
			plm.setValueAt(index, property);
		}
		// table
		else {
			PropertyTableModel ptm = model.getPropertyTableModel();
			ptm.setValueAt(index, property);
		}
		// add to list
		view.getMessageView().setMessageLabel("Changed Successfully",
				Color.BLUE);

		// clear text fields
		clearTextFields();

	}
}