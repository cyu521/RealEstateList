

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class BottomView {

	private final int TEXT_FIELD_SIZE = 10;
	private JButton addButton = new JButton("ADD");
	private JButton changeButton = new JButton("CHANGE");
	private JButton removeButton = new JButton("REMOVE");
	private JTextField[] textFields = { new JTextField(TEXT_FIELD_SIZE),
			new JTextField(TEXT_FIELD_SIZE), new JTextField(TEXT_FIELD_SIZE),
			new JTextField(TEXT_FIELD_SIZE), new JTextField(TEXT_FIELD_SIZE),
			new JTextField(TEXT_FIELD_SIZE), new JTextField(TEXT_FIELD_SIZE) };

	public BottomView(JPanel panel) {
		JPanel bottomPane = new JPanel();
		bottomPane.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		// borders
		gbc.insets = new Insets(2, 2, 2, 2);
		String[] columnNames = { "Street Address", "City", "# of Bedrooms",
				"# of Bathrooms", "Square Feet", "Year Built", "Price/SqFt" };

		// first row, list of columns
		for (String label : columnNames) {
			bottomPane.add(new JLabel(label), gbc);
			gbc.gridx++;
		}
		gbc.gridx = 0;
		gbc.gridy++;
		// second row textboxes for each column
		gbc.fill = GridBagConstraints.HORIZONTAL;
		for (int i = 0; i < 7; i++) {
			bottomPane.add(textFields[i], gbc);
			gbc.gridx++;
		}

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		// starts towards the end/right side, add three buttons add,change, and
		// remove
		gbc.gridx = 4;
		bottomPane.add(addButton, gbc);
		gbc.gridx++;
		bottomPane.add(changeButton, gbc);
		gbc.gridx++;
		bottomPane.add(removeButton, gbc);

		// add bottompane to main panel
		panel.add(bottomPane, BorderLayout.SOUTH);

	}

	public void addButtonListener(AddController addController,
			ChangeController changeController, RemoveController removeController) {
		addButton.addActionListener(addController);
		changeButton.addActionListener(changeController);
		removeButton.addActionListener(removeController);
	}

	public JTextField[] getTextFields() {
		return textFields;
	}

	public void setTextFields(JTextField[] tf) {
		this.textFields = tf;
	}

	public void enableButtons(boolean enable) {
		changeButton.setEnabled(enable);
		removeButton.setEnabled(enable);
	}
}
