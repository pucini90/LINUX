package kr.ac.green;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * JDialog
 * 1. �޴��� ���� �� ����.
 * 2. base container
 * 3. �⺻���̾ƿ� : BorderLayout
 * 4. modal ���� ���� : �θ�â�� ��ɵ��� ����
 */
public class MyDialog extends JDialog{
	private JButton btnClose;
	private MyFrame owner;
	public MyDialog(MyFrame owner) {
		// 1. �θ�â, 2. Ÿ��Ʋ, 3. modal����
		super(owner, "MyDialog", false);
		this.owner = owner;
		JLabel lblInput = new JLabel("�Է�");
		JTextField tfInput = new JTextField(15);
		JButton btnInput = new JButton("����ϱ�");
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(lblInput);
		pnlCenter.add(tfInput);
		pnlCenter.add(btnInput);
		
		btnClose = new JButton("Close");
		
		JPanel pnl = new JPanel();
		pnl.add(btnClose);
		
		add(pnlCenter, BorderLayout.CENTER);
		add(pnl, BorderLayout.SOUTH);
		
		btnClose.addActionListener((e)-> dispose());
		
		btnInput.addActionListener((e)-> {
			String words = tfInput.getText();
			if(owner.exists(words)) {
				JOptionPane.showMessageDialog(
					MyDialog.this, 
					"�̹� �����ϴ� ���Դϴ�.", 
					"�˸�", 
					JOptionPane.WARNING_MESSAGE
				);
				tfInput.requestFocus();
				tfInput.selectAll();
			} else {
				owner.add(words);
				dispose();
			}
		});
		
		setSize(300, 200);
		// �θ�â�� �߾ӿ� ��ġ
		setLocationRelativeTo(owner);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}











