package chapter16;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest_1 implements ActionListener {
	Dialog info;

	DialogTest_1() {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		info = new Dialog(f, "Information", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());

		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");

		ok.addActionListener(this);

		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);
	}

	public static void main(String[] args) {
		new DialogTest_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("OK")) {
			info.dispose();
		}
	}
}