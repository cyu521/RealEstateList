package View;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class MessageView {

	private JLabel messageLabel = new JLabel();

	public MessageView(JPanel panel) {
		// Message board on top.
		JPanel messagePanel = new JPanel();
		messagePanel
				.setLayout(new BoxLayout(messagePanel, BoxLayout.PAGE_AXIS));
		// center the message
		messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		messagePanel.add(messageLabel);
		panel.add(messagePanel, BorderLayout.NORTH);
	}

	public void setMessageLabel(String message, Color color) {
		messageLabel.setText(message);
		messageLabel.setForeground(color);
	}

	public void clearMessage() {
		messageLabel.setText("");
	}
}
