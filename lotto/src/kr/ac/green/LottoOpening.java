package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class LottoOpening extends JFrame {
	
	private JLabel lottoImg;
	private TitledBorder tBorder;
	private Font click;

	public LottoOpening() {
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	private void init() {
		lottoImg = new JLabel(new ImageIcon("Lotto.jpg"));
		tBorder = new TitledBorder(new LineBorder(Color.YELLOW, 3), "CLICK");
		click = new Font(Font.DIALOG, Font.BOLD, 20);
	}
	private void setDisplay() {
		tBorder.setTitleJustification(TitledBorder.CENTER);
		tBorder.setTitlePosition(TitledBorder.ABOVE_BOTTOM);
		tBorder.setTitleFont(click);
		tBorder.setTitleColor(Color.YELLOW);
		add(lottoImg, BorderLayout.CENTER);
	}
	private void addListeners() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				lottoImg.setBorder(tBorder);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent me) {
				lottoImg.setBorder(null);
			}
		});
		
	}
	private void showFrame() {
		setTitle("로또사세요");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LottoOpening();
	}

}
