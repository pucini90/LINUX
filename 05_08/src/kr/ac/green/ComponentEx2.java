package kr.ac.green;

import java.awt.BorderLayout;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentEx2 extends JFrame {
	public ComponentEx2() {
		JTextField tfName = new JTextField(20);
		tfName.setText("HI~");
		// 편집가능 여부 설정
		// tfName.setEditable(false);
		// 활성화 여부 설정
		tfName.setEnabled(false);
		
		JLabel lblName = new JLabel("이름 : ");
		
		JPanel pnlName = new JPanel();
		pnlName.add(lblName);
		pnlName.add(tfName);
		
		JTextArea taInput = new JTextArea(6, 30);
		taInput.setText("Hello Java");
		taInput.append("\n잠온다");
		// 자동줄바꿈
		taInput.setLineWrap(true);		
		// 단어 단위로 줄바꿈
		taInput.setWrapStyleWord(true);
		
		JScrollPane scroll = new JScrollPane(taInput);
		/*
		 * JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS : 항상 표시
		 * JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED : 필요할때만 표시
		 * JScrollPane.HORIZONTAL_SCROLLBAR_NEVER : 사용안함
		 */
		// 스크롤바 표시정책 결정 
		scroll.setHorizontalScrollBarPolicy(
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
		);
		
		JPasswordField pwPass = new JPasswordField();
		pwPass.setText("myPassword");
		pwPass.setEchoChar('x');
		char[] password = pwPass.getPassword();
		System.out.println(String.valueOf(password));
		
		System.out.println(Arrays.toString(password));
		
		add(pnlName, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
		add(pwPass, BorderLayout.SOUTH);
		
		setTitle("ComponentEx2");
		pack();
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComponentEx2();
	}
}
