package chapter16;

import java.awt.Frame;

public class FrameTest { // 윈도우 창 띄우기
	public static void main(String[] args) {
		Frame f = new Frame("Frame Demo"); // 윈도우 타이틀
		f.setSize(300, 200); // 윈도우 창 크기
		f.setVisible(true); // 화면에 출력, 언제나 지정해줘야함
	}
}