package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabEx extends JFrame {
	
	private char c = 'A';
	
	public TabEx() {
		JTabbedPane tab = new JTabbedPane();
		
		for(char c='a'; c<='z'; c++) {
			tab.addTab("tab - " + c, new ImageIcon("icon.png"), getPanel());
		}
		/*
		 * tab�� ��ġ���(ȭ���� ������ ���� ���)
		 * SCROLL_TAB_LAYOUT : ��ũ���� �̿��� �ټ��� ���� ǥ���Ѵ�.
		 * WRAP_TAB_LAYOUT : ���� �׾Ƽ� ǥ���Ѵ�.(default) 
		 */
		tab.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		/*
		 * tab�� ��ġ ����(TOP, LEFT, BOTTOM, RIGHT)
		 */
		tab.setTabPlacement(JTabbedPane.LEFT);
		
		add(tab, BorderLayout.CENTER);
		setTitle("Tab Ex");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private JPanel getPanel() {
		JPanel pnl = new JPanel(new BorderLayout());
		JLabel lbl = new JLabel(String.valueOf(c), JLabel.CENTER);
		lbl.setFont(new Font(Font.SERIF, Font.BOLD, 60));
		pnl.add(lbl, BorderLayout.CENTER);
		c++;
		return pnl;
	}
	
	
	public static void main(String[] args) {
		new TabEx();
	}
}
