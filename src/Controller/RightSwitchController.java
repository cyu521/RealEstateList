package Controller;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Model;
import Model.Property;
import View.View;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class RightSwitchController extends ButtonController implements
		ActionListener {

	public RightSwitchController(Model model, View view) {
		super(model, view);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (!view.isListSelected()) {
			view.getMessageView()
					.setMessageLabel(
							"Error, this button should only be enable if the list is selected",
							Color.RED);
		}
		// remove current from list model
		int index = view.getSelectedIndex();
		Property property = model.getPropertyListModel().removeValueAt(index);

		// set current to table model
		model.getPropertyTableModel().addValue(property);

		// add to list
		view.getMessageView().setMessageLabel("Swapped Successfully",
				Color.BLUE);

		// clear text fields
		clearTextFields();
	}

}
