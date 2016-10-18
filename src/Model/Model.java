package Model;


/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class Model {

	private static Model instance;
	private PropertyListModel propertyListModel;
	private PropertyTableModel propertyTableModel;

	// constructor
	public Model() {
		setPropertyListModel(new PropertyListModel());
		setPropertyTableModel(new PropertyTableModel());
	}

	// use instance to access same model
	public static Model getInstance() {
		if (null == instance) {
			instance = new Model();
		}
		return instance;
	}

	// getters and setters
	public PropertyListModel getPropertyListModel() {
		return propertyListModel;
	}

	public void setPropertyListModel(PropertyListModel propertyListModel) {
		this.propertyListModel = propertyListModel;
	}

	public PropertyTableModel getPropertyTableModel() {
		return propertyTableModel;
	}

	public void setPropertyTableModel(PropertyTableModel propertyTableModel) {
		this.propertyTableModel = propertyTableModel;
	}

}
