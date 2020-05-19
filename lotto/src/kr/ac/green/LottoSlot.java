package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class LottoSlot extends JFrame {
	private LottoOpening opening;
	//BorderLayout - South
	private JButton confirm;
	private JButton cancel;
	private JPanel pnlSouth;
	
	//BorderLayout.Center -> BorderLayout.west
	private JPanel pnlCenter;
	private JCheckBox[] cbCheck;
	private JPanel pnlCWest;
	
	//BorderLayout.Center -> BorderLayout.center
	private JPanel pnlCCenter;
	private JRadioButton[] rbAuto;
	private JRadioButton[] rbManual;
	
	private ButtonGroup[] group;
	
	private JPanel[] pnlAutoAndManual;
	
	//BorderLayout.center -> BorderLayout.east : 번호
	private JCheckBox[] number;
	private JPanel pnlCEast;
	private JTabbedPane tab;
	private JPanel[] pnlCE;
	
	public LottoSlot() {
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	
	private void init() {
		//south
		confirm = new JButton("확인");
		cancel = new JButton("취소");
		pnlSouth = new JPanel();
		//Center
		cbCheck = new JCheckBox[5];
		rbAuto = new JRadioButton[5];
		rbManual = new JRadioButton[5];
		pnlAutoAndManual = new JPanel[5];
		
		pnlCenter = new JPanel(new BorderLayout());
		pnlCWest = new JPanel(new GridLayout(0,1));
		pnlCCenter = new JPanel(new GridLayout(0,1));
		group = new ButtonGroup[5];
		
		number = new JCheckBox[45];
		pnlCEast = new JPanel();
		
	
	}
	private void setDisplay() {
		getButtonSouth();
		
		//center -> west, center
		for (int i = 0; i < cbCheck.length; i++) {
			getCheck(i);
			getRadioButton(i);
		}
//		for (int i = 0; i < number.length; i++) {
//			number[i] = new JCheckBox("");
//			pnlCEast.add(number[i]);
//			pnlCEast.add(new JLabel(new ImageIcon("img/circlebasic" + (i+1) + ".png" )));
//		}
		
		for (int i = 0; i < number.length; i++) {
			number[i] = new JCheckBox("");
			pnlCE[0].add(number[i]);
			pnlCE[0].add(new JLabel(new ImageIcon("img/circlebasic" + (i+1) + ".png" )));
			pnlCE[1].add(number[i]);
			pnlCE[1].add(new JLabel(new ImageIcon("img/circlebasic" + (i+1) + ".png" )));
			pnlCE[2].add(number[i]);
			pnlCE[2].add(new JLabel(new ImageIcon("img/circlebasic" + (i+1) + ".png" )));
			pnlCE[3].add(number[i]);
			pnlCE[3].add(new JLabel(new ImageIcon("img/circlebasic" + (i+1) + ".png" )));
			pnlCE[4].add(number[i]);
			pnlCE[4].add(new JLabel(new ImageIcon("img/circlebasic" + (i+1) + ".png" )));
		}
		
				
		tab.setTabPlacement(JTabbedPane.LEFT);
		
		pnlCEast.add(tab, BorderLayout.WEST);
		
		pnlCenter.add(pnlCWest, BorderLayout.WEST);
		pnlCenter.add(pnlCCenter, BorderLayout.CENTER);
		pnlCenter.add(pnlCEast, BorderLayout.EAST);
		
		pnlCenter.add(pnlCE[0]);
		pnlCenter.add(pnlCE[1]);
		pnlCenter.add(pnlCE[2]);
		pnlCenter.add(pnlCE[3]);
		pnlCenter.add(pnlCE[4]);
		
		pnlSouth.add(confirm);
		pnlSouth.add(cancel);
		
		
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
	}
	private void getButtonSouth() {
		//button
		confirm.setMargin(new Insets(2,2,2,2));
		cancel.setMargin(new Insets(2,2,2,2));
	}
	private void getCheck(int i) {
		cbCheck[i] = new JCheckBox(i+1+".");
		pnlCWest.add(cbCheck[i]);
	}
	private void getRadioButton(int i) {
		rbAuto[i] = new JRadioButton("자동");
		rbManual[i] = new JRadioButton("수동");
		
		group[i] = new ButtonGroup();
		group[i].add(rbAuto[i]);
		group[i].add(rbManual[i]);
		
		pnlAutoAndManual[i] = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 19));
		pnlAutoAndManual[i].add(rbAuto[i]);
		pnlAutoAndManual[i].add(rbManual[i]);
		
		pnlCCenter.add(pnlAutoAndManual[i]);
	}
	private void addListeners() {
		
	}
	
	private void showFrame() {
		setTitle("로또자동수동");
		pack();
		setLocationRelativeTo(opening);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LottoSlot();
	}

}
