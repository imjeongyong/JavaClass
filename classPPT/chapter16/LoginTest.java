package chapter16;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginTest implements ActionListener {
	private Frame f;
	private Button b;
	TextField id;
	TextField pwd;
	TextField info;

	LoginTest() {
		f = new Frame("Login");
		b = new Button("Login");
	}

	public void actionPerformed(ActionEvent e) {
		if (b.getLabel().equals("Login")) {
			if (id.getText().equals("ididid") && pwd.getText().equals("123456")) {
				info.setText("로그인이 되었습니다.");
			} else {
				info.setText("다시 입력하세요.");
			}
		}
	}

	public void startFrame() {
		f.setSize(450, 175);
		f.setLayout(new FlowLayout());
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		id = new TextField(10);
		pwd = new TextField(10);
		info = new TextField(48);
		pwd.setEchoChar('*');

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.add(info);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		LoginTest lt = new LoginTest();
		lt.startFrame();
	}
}