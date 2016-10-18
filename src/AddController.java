

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class AddController extends ButtonController implements ActionListener {

	public AddController(Model model, View view) {
		super(model, view);
	}

	public void actionPerformed(ActionEvent arg0) {
		// make sure fields are not empty
		if (isFieldsEmpty()) {
			view.getMessageView().setMessageLabel(
					"Unable to add to list, one or more fields are empty",
					Color.RED);
			return;
		}

		// get field property
		Property property = getProperty();

		// add to list
		model.getPropertyListModel().addValue(property);

		// add to list
		view.getMessageView().setMessageLabel("Added Successfully", Color.BLUE);

		// clear text fields
		clearTextFields();
	}
}