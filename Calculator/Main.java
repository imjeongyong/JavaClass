import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends WindowAdapter implements ActionListener {
	private Frame f;
	private TextField tf;
	private Panel p;
	private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bcan, bpl, bmi, bmu, bdi, beq;
	private String inp, op;
	int n1, n2, res;

	public Main() {
		f = new Frame("Calculator");
		f.setSize(300, 400);

		p = new Panel(new GridLayout(4, 4));

		tf = new TextField("0");
		tf.setEditable(false); // 텍스트필드 수정x
		tf.setFocusable(false); // 텍스트필드 커서x

		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		bcan = new Button("cancel");
		bpl = new Button("+");
		bmi = new Button("-");
		bmu = new Button("*");
		bdi = new Button("/");
		beq = new Button("=");

		n1 = 0;
		n2 = 0;
		inp = "";
		op = "";
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		f.addWindowListener(this);
		f.setVisible(true);
		f.add(p, "Center");
		f.add(tf, "North");

		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bdi);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bmu);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bmi);
		p.add(b0);
		p.add(bcan);
		p.add(beq);
		p.add(bpl);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bcan.addActionListener(this);
		bpl.addActionListener(this);
		bmi.addActionListener(this);
		bmu.addActionListener(this);
		bdi.addActionListener(this);
		beq.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("0")) {
			inp = inp + "0";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("1")) {
			inp = inp + "1";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("2")) {
			inp = inp + "2";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("3")) {
			inp = inp + "3";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("4")) {
			inp = inp + "4";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("5")) {
			inp = inp + "5";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("6")) {
			inp = inp + "6";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("7")) {
			inp = inp + "7";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("8")) {
			inp = inp + "8";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("9")) {
			inp = inp + "9";
			System.out.println("String inp = " + inp);
			tf.setText(inp);
		}
		if (e.getActionCommand().equals("+")) {
			n1 = n1 + Integer.parseInt(inp);
			op = "+";
			inp = "";
			System.out.println("int n1 = " + n1);
			System.out.println("int n2 = " + n2);
			tf.setText(op);
		}
		if (e.getActionCommand().equals("-")) {
			n1 = n1 + Integer.parseInt(inp);
			op = "-";
			inp = "";
			System.out.println("int n1 = " + n1);
			System.out.println("int n2 = " + n2);
		}
		if (e.getActionCommand().equals("*")) {
			n1 = n1 + Integer.parseInt(inp);
			op = "*";
			inp = "";
			System.out.println("int n1 = " + n1);
			System.out.println("int n2 = " + n2);
		}
		if (e.getActionCommand().equals("/")) {
			n1 = n1 + Integer.parseUnsignedInt(inp);
			op = "/";
			inp = "";
			System.out.println("int n1 = " + n1);
			System.out.println("int n2 = " + n2);
		}
		if (e.getActionCommand().equals("cancel")) {
			n1 = 0;
			n2 = 0;
			op = "";
			inp = "";
			System.out.println("int n1 = " + n1);
			System.out.println("int n2 = " + n2);
			tf.setText("0");
		}
		if (e.getActionCommand().equals("=")) {
			n2 = Integer.parseInt(inp);

			switch (op) {
			case "+":
				res = n1 + n2;
				System.out.println("n1 = " + n1);
				System.out.println("n2 = " + n2);
				System.out.println("res = " + res);
				tf.setText(Integer.toString(res));
				break;
			case "-":
				res = n1 - n2;
				System.out.println("n1 = " + n1);
				System.out.println("n2 = " + n2);
				System.out.println("res = " + res);
				tf.setText(Integer.toString(res));
				break;
			case "*":
				res = n1 * n2;
				System.out.println("n1 = " + n1);
				System.out.println("n2 = " + n2);
				System.out.println("res = " + res);
				tf.setText(Integer.toString(res));
				break;
			case "/":
				res = n1 / n2;
				System.out.println("n1 = " + n1);
				System.out.println("n2 = " + n2);
				System.out.println("res = " + res);
				tf.setText(Integer.toString(res));
				break;
			}
			n1 = 0;
			n2 = 0;
			res = 0;
			inp = "";
		}
	}

	public static void main(String[] args) {
		Main cal = new Main();
		cal.startFrame();
	}
}