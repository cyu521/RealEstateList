

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class View {

	private boolean isListSelected;
	private int selectedIndex;

	private MessageView messageView;
	private ListView listView;
	private SwitchButtonsView sbv;
	private TableView tableView;
	private BottomView bottomView;

	public View(Model model) {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		// set top message
		messageView = new MessageView(panel);
		// set left list
		listView = new ListView(panel, model);

		// adding switch buttons
		sbv = new SwitchButtonsView(panel);

		// adding table view (right side)
		tableView = new TableView(panel, model);

		// creating bottom panel
		bottomView = new BottomView(panel);

		JFrame frame = new JFrame("Real Estate List");
		frame.getContentPane().add(panel, BorderLayout.WEST);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.pack();
		frame.setVisible(true);
		disableButtons();
	}

	public void addButtonListener(AddController addController,
			ChangeController changeController,
			RemoveController removeController,
			LeftSwitchController leftSwitchController,
			RightSwitchController rightSwitchController) {
		bottomView.addButtonListener(addController, changeController,
				removeController);
		sbv.getLeftSwitch().addActionListener(leftSwitchController);
		sbv.getRightSwitch().addActionListener(rightSwitchController);
	}

	public JTextField[] getTextFields() {
		return bottomView.getTextFields();
	}

	public void setTextFields(JTextField[] textFields) {
		bottomView.setTextFields(textFields);
	}

	public MessageView getMessageView() {
		return messageView;
	}

	public void addListListener(ListController listController,
			ListController tabelController) {
		ListSelectionModel listSelectionModel = listView.getDataList()
				.getSelectionModel();
		listSelectionModel.addListSelectionListener(listController);
		ListSelectionModel tableSelectionModel = tableView.getDataTable()
				.getSelectionModel();
		tableSelectionModel.addListSelectionListener(tabelController);
	}

	public void enableButtons() {
		bottomView.enableButtons(true);
	}

	public void disableButtons() {
		sbv.getLeftSwitch().setEnabled(false);
		sbv.getRightSwitch().setEnabled(false);
		bottomView.enableButtons(false);
	}

	public void enableLeftSwitch() {
		sbv.getLeftSwitch().setEnabled(true);
	}

	public void enableRightSwitch() {
		sbv.getRightSwitch().setEnabled(true);
	}

	public void setIsListSelected(boolean bool) {
		isListSelected = bool;
	}

	public boolean isListSelected() {
		return isListSelected;
	}

	public void setSelectedIndex(int index) {
		selectedIndex = index;
	}

	public int getSelectedIndex() {
		return selectedIndex;
	}

	public void deselect() {
		deselectList();
		deselectTable();
	}
	public void deselectList(){

		listView.getDataList().clearSelection();
	}
	public void deselectTable(){
		tableView.getDataTable().clearSelection();
		
	}

}
