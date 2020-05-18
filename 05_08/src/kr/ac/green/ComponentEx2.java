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
		// �������� ���� ����
		// tfName.setEditable(false);
		// Ȱ��ȭ ���� ����
		tfName.setEnabled(false);
		
		JLabel lblName = new JLabel("�̸� : ");
		
		JPanel pnlName = new JPanel();
		pnlName.add(lblName);
		pnlName.add(tfName);
		
		JTextArea taInput = new JTextArea(6, 30);
		taInput.setText("Hello Java");
		taInput.append("\n��´�");
		// �ڵ��ٹٲ�
		taInput.setLineWrap(true);		
		// �ܾ� ������ �ٹٲ�
		taInput.setWrapStyleWord(true);
		
		JScrollPane scroll = new JScrollPane(taInput);
		/*
		 * JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS : �׻� ǥ��
		 * JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED : �ʿ��Ҷ��� ǥ��
		 * JScrollPane.HORIZONTAL_SCROLLBAR_NEVER : ������
		 */
		// ��ũ�ѹ� ǥ����å ���� 
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
