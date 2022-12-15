package chapter16;

import java.awt.CheckboxMenuItem;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoMenu extends WindowAdapter implements ActionListener {
	Frame f;
	TextField tf;

	MemoMenu() {
		f = new Frame("메모장");
		f.setSize(500, 300);
		f.addWindowListener(this);
		
		tf = new TextField();

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일(F)");
		MenuItem miNewF = new MenuItem("새로만들기(N)");
		MenuItem miNewW = new MenuItem("새 창(W)");
		MenuItem miOpen = new MenuItem("열기(O)");
		miOpen.addActionListener(this);
		MenuItem miSave = new MenuItem("저장(S)");
		MenuItem miSaveO = new MenuItem("다른이름으로 저장(A)");
		MenuItem miPageU = new MenuItem("페이지 설정(U)");
		MenuItem miPrint = new MenuItem("인쇄(P)");
		MenuItem miExit = new MenuItem("끝내기(X)");
		miExit.addActionListener(this);


		mFile.add(miNewF);
		mFile.add(miNewW);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miSaveO);
		mFile.addSeparator();
		mFile.add(miPageU);
		mFile.add(miPrint);
		mFile.addSeparator();
		mFile.add(miExit);

		Menu mEdit = new Menu("편집(E)");
		MenuItem miUnDo = new MenuItem("실행 취소(U)");
		MenuItem miCut = new MenuItem("잘라내기(T)");
		MenuItem miCopy = new MenuItem("복사(C)");
		MenuItem miPaste = new MenuItem("붙여넣기(P)");
		MenuItem miDel = new MenuItem("삭제(L)");
		MenuItem miSer = new MenuItem("Bing으로 검색(S)");
		MenuItem miNeSer = new MenuItem("다음 찾기(N)");
		MenuItem miPrSer = new MenuItem("이전 찾기(V)");
		MenuItem miSwap = new MenuItem("바꾸기(R)");
		MenuItem miMov = new MenuItem("이동(G)");
		MenuItem miAll = new MenuItem("모두 선택(A)");
		MenuItem miTiDa = new MenuItem("시간/날짜(D)");

		mEdit.add(miUnDo);
		mEdit.addSeparator();
		mEdit.add(miCut);
		mEdit.add(miCopy);
		mEdit.add(miPaste);
		mEdit.add(miDel);
		mEdit.addSeparator();
		mEdit.add(miSer);
		mEdit.add(miNeSer);
		mEdit.add(miPrSer);
		mEdit.add(miSwap);
		mEdit.add(miMov);
		mEdit.addSeparator();
		mEdit.add(miAll);
		mEdit.add(miTiDa);

		Menu mForm = new Menu("서식(O)");
		MenuItem miAutLi = new MenuItem("자동 줄 바꿈(W)");
		MenuItem miFont = new MenuItem("글꼴(F)");
		mForm.add(miAutLi);
		mForm.add(miFont);

		Menu mView = new Menu("보기(V)");
		Menu miExRe = new Menu("확대하기/축소하기");
		CheckboxMenuItem miMar = new CheckboxMenuItem("상태 표시줄(S)");

		MenuItem miExte = new MenuItem("확대(I)");
		MenuItem miRedu = new MenuItem("축소(O)");
		MenuItem miReset = new MenuItem("확대하기/축소하기 기본값 복원");

		mView.add(miExRe);
		mView.add(miMar);
		miExRe.add(miExte);
		miExRe.add(miRedu);
		miExRe.add(miReset);

		Menu mHelp = new Menu("도움말(H)");
		MenuItem miRead = new MenuItem("도움말 보기(H)");
		MenuItem miFeed = new MenuItem("피드백 보내기(F)");
		MenuItem miMeInf = new MenuItem("메모장 정보(A)");

		mHelp.add(miRead);
		mHelp.add(miFeed);
		mHelp.addSeparator();
		mHelp.add(miMeInf);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mForm);
		mb.add(mView);
		mb.setHelpMenu(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);
		f.add(tf);
	}

	public static void main(String[] args) {
		new MemoMenu();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("열기(O)")) {
			FileDialog fo = new FileDialog(f, "File Open", FileDialog.LOAD);
			fo.setDirectory("C:\\Windows");
			fo.setVisible(true);
		}
		if (e.getActionCommand().equals("끝내기(X)")) {
			System.exit(0);
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}