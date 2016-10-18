

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class RemoveController extends ButtonController implements
		ActionListener {

	public RemoveController(Model model, View view) {
		super(model, view);
	}

	public void actionPerformed(ActionEvent arg0) {
		int index = view.getSelectedIndex();
		// list
		if (view.isListSelected()) {
			PropertyListModel plm = model.getPropertyListModel();
			plm.removeValueAt(index);
		}
		// table
		else {
			PropertyTableModel ptm = model.getPropertyTableModel();
			ptm.removeValueAt(index);
		}

		view.getMessageView().setMessageLabel("Removed Successfully",
				Color.BLUE);

	}
}
