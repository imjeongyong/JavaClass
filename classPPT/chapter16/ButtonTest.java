package chapter16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter implements ActionListener {

	private Frame f;
	private Button b;

	public ButtonTest() {
		f = new Frame("Login");
		b = new Button("확인");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		f.addWindowListener(this);
		f.setLayout(null);
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);

		b.addActionListener(this);
		b.setSize(100, 50);
		b.setLocation(100, 75);
	}

	public void actionPerformed(ActionEvent e) {
//		if (e.getActionCommand().equals("확인")) {
//			b.setLabel("취소");
//		}
//		if (e.getActionCommand().equals("취소")) {
//			b.setLabel("확인");
//		}

		if (b.getLabel().equals("확인")) { // 이방법을 더 추천!
			b.setLabel("취소");
		} else {
			b.setLabel("확인");
		}
	}

	public static void main(String[] args) {
		ButtonTest b = new ButtonTest();
		b.startFrame();
	}
}