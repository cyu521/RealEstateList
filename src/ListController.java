

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class ListController implements ListSelectionListener {
	private Model model;
	private View view;
	private boolean isList;

	// constructor
	public ListController(Model model, View view, boolean isList) {
		this.model = model;
		this.view = view;
		this.isList = isList;
	}

	public void valueChanged(ListSelectionEvent e) {
		// get current select model
		ListSelectionModel lsm = (ListSelectionModel) e.getSource();
		boolean isAdjusting = e.getValueIsAdjusting();

		// if not selecting, disable some buttons
		if (lsm.isSelectionEmpty()) {
			view.disableButtons();
		}
		// after click
		else if (!isAdjusting) {
			// Find out which indexes are selected.
			int minIndex = lsm.getMinSelectionIndex();
			int maxIndex = lsm.getMaxSelectionIndex();
			for (int i = minIndex; i <= maxIndex; i++) {
				if (lsm.isSelectedIndex(i)) {
					// list select
					if (isList) {
						view.deselectTable();
						// enable right switch
						view.enableRightSwitch();
						view.setIsListSelected(true);
						// get property from selection and set textfields
						// accordingly
						Property property = model.getPropertyListModel()
								.getValueAt(i);
						setTextFields(property);
					}
					// table select
					else {
						view.deselectList();
						// enable left switch
						view.enableLeftSwitch();
						view.setIsListSelected(false);
						// get property from table and set text fields
						Property property = model.getPropertyTableModel()
								.getPropertyValueAt(i);
						setTextFields(property);
					}
					// enable bottom buttons
					view.enableButtons();
					view.setSelectedIndex(i);
				}
			}
		}
	}

	// set the fields based on property
	private void setTextFields(Property property) {
		JTextField[] textFields = view.getTextFields();
		textFields[0].setText(property.getAddress());
		textFields[1].setText(property.getCity());
		textFields[2].setText(property.getBedrooms());
		textFields[3].setText(property.getBathrooms());
		textFields[4].setText(property.getSquareFeet());
		textFields[5].setText(property.getYearBuilt());
		textFields[6].setText(property.getPricePerSqFt());
	}
}