

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class LeftSwitchController extends ButtonController implements
		ActionListener {

	public LeftSwitchController(Model model, View view) {
		super(model, view);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (view.isListSelected()) {
			view.getMessageView()
					.setMessageLabel(
							"Error, this button should only be enable if the table is selected",
							Color.RED);
		}
		// remove current from table model
		int index = view.getSelectedIndex();
		Property property = model.getPropertyTableModel().removeValueAt(index);

		// set current to list model
		model.getPropertyListModel().addValue(property);

		// add to list
		view.getMessageView().setMessageLabel("Swapped Successfully",
				Color.BLUE);

		// clear text fields
		clearTextFields();
	}
}
