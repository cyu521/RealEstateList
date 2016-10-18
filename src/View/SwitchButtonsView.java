package View;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class SwitchButtonsView {

	private JButton rightSwitch = new JButton(">>");

	private JButton leftSwitch = new JButton("<<");

	public SwitchButtonsView(JPanel panel) {
		// creating switch buttons
		JPanel switchButtons = new JPanel();
		switchButtons.setLayout(new BoxLayout(switchButtons,
				BoxLayout.PAGE_AXIS));
		// try to put it in the middle by adding rigid area
		switchButtons.add(Box.createRigidArea(new Dimension(0, 150)));

		rightSwitch.setAlignmentX(Component.CENTER_ALIGNMENT);
		switchButtons.add(rightSwitch);
		leftSwitch.setAlignmentX(Component.CENTER_ALIGNMENT);
		switchButtons.add(leftSwitch);

		switchButtons.setPreferredSize(new Dimension(100, 200));
		panel.add(switchButtons, BorderLayout.CENTER);
	}

	public JButton getRightSwitch() {
		return rightSwitch;
	}

	public JButton getLeftSwitch() {
		return leftSwitch;
	}
}
