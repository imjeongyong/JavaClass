package chapter16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridLayoutEx {
	private Frame frame;
	private Button b1, b2, b3;
	private TextField tf1, tf2, tf3;

	public GridLayoutEx() {
		frame = new Frame("GridLayout example");
		b1 = new Button("button1");
		b2 = new Button("button2");
		b3 = new Button("button3");

		tf1 = new TextField("Input Text 1");
		tf2 = new TextField("Input Text 2");
		tf3 = new TextField("Input Text 3");
	}

	public void startFrame() {
		frame.setLayout(new GridLayout(3, 0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b2);
		frame.add(tf2);
		frame.add(b3);
		frame.add(tf3);

		frame.pack(); // 프레임 크기 및 위치 자동으로 설정(필요한 데이터 만큼만), 주석처리하면 작게 실행
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GridLayoutEx flow = new GridLayoutEx();
		flow.startFrame();
	}
}