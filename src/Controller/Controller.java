package Controller;
import Model.Model;
import View.View;




/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class Controller {

	View view;
	Model model;

	public Controller(Model model, View view) {
		this.view = view;
		this.model = model;
		// add controllers to buttons
		view.addButtonListener(new AddController(model, view),
				new ChangeController(model, view), new RemoveController(model,
						view), new LeftSwitchController(model, view),
				new RightSwitchController(model, view));

		// add controller to list/table
		view.addListListener(new ListController(model, view, true),
				new ListController(model, view, false));
	}

}
