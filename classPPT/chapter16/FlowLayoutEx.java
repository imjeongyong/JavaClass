package chapter16;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutEx {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowLayoutEx() { //https://gocoding.tistory.com/m/42 <-한글 깨질때
		frame = new Frame("FlowLayout example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
	}

	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutEx flow = new FlowLayoutEx();
		flow.startFrame();
	}
}
