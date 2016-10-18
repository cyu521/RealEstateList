

import java.util.ArrayList;

import javax.swing.DefaultListModel;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class PropertyListModel extends DefaultListModel<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1301973968745038638L;

	private ArrayList<Property> listProperty;

	public PropertyListModel() {
		listProperty = new ArrayList<Property>();
	}

	// add new property
	public void addValue(Property property) {
		listProperty.add(property);
		addElement(property.toString());
	}

	public void setValueAt(int index, Property property) {
		// changes the view and updates the array
		set(index, property.toString());
		listProperty.set(index, property);
	}

	// return property based on index
	public Property getValueAt(int index) {
		Property property = listProperty.get(index);
		if (property != null) {
			return property;
		}
		return null;
	}

	// remove property but also return it for swap
	public Property removeValueAt(int index) {
		Property property = listProperty.remove(index);
		remove(index);
		return property;
	}

}
