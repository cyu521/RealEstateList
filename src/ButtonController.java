

import javax.swing.JTextField;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class ButtonController {
	protected View view;
	protected Model model;

	// constructor, set the model and view
	public ButtonController(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	// check if any of the text fields are empty
	protected boolean isFieldsEmpty() {
		JTextField[] textFields = view.getTextFields();
		for (JTextField field : textFields) {
			if (field.getText().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	// read the text fields value and create a property object
	protected Property getProperty() {
		JTextField[] textFields = view.getTextFields();
		return new Property(textFields[0].getText(), textFields[1].getText(),
				textFields[2].getText(), textFields[3].getText(),
				textFields[4].getText(), textFields[5].getText(),
				textFields[6].getText());
	}

	// clear text field and deselect the list/table
	protected void clearTextFields() {
		JTextField[] textFields = view.getTextFields();
		for (JTextField field : textFields) {
			field.setText("");
		}
		view.deselect();
	}
}
