import Model.Model;
import View.View;
import Controller.Controller;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class RealEstateList {
	// main program.
	public static void main(String[] args) {
		// create the mvc
		Model model = Model.getInstance();
		View view = new View(model);
		new Controller(model, view);
	}
}
