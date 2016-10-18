

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class PropertyTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8339460509622862297L;
	public final String[] columnNames = { "Street Address", "City",
			"# of Bedrooms", "# of Bathrooms", "Square Feet", "Year Built",
			"Price/SqFt" };
	public List<Property> tableProperty;

	public PropertyTableModel() {
		tableProperty = new ArrayList<Property>();
	}

	// add value to table
	public void addValue(Property property) {
		tableProperty.add(property);
		fireTableRowsInserted(tableProperty.size() - 1,
				tableProperty.size() - 1);
	}

	// change value
	public void setValueAt(int index, Property property) {
		// updates the array
		tableProperty.set(index, property);
		fireTableRowsUpdated(tableProperty.size() - 1, tableProperty.size() - 1);
	}

	// remove value and return
	public Property removeValueAt(int index) {
		Property property = tableProperty.remove(index);
		fireTableRowsDeleted(tableProperty.size() - 1, tableProperty.size() - 1);
		return property;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	// return property based on index
	public Property getPropertyValueAt(int index) {
		Property property = tableProperty.get(index);
		if (property != null) {
			return property;
		}
		return null;
	}

	public String[] getValueAt(int index) {
		Property property = tableProperty.get(index);
		if (property != null) {
			return property.toStringArray();
		}
		return null;
	}

	public String getValueAt(int row, int col) {
		return getValueAt(row)[col];
	}

	public int getRowCount() {
		return tableProperty.size();
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}
}
