package Quanlydiem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Toolkit;

public class GUI_Dangnhap extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt_user;
	private JPasswordField txt_pass;
	private Process_Student ps = new Process_Student();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Dangnhap frame = new GUI_Dangnhap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Dangnhap() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\BaiTapLon\\BTL_Java\\th.jfif"));
		setAlwaysOnTop(true);
		setResizable(false);
		setBackground(new Color(0, 255, 0));
		setForeground(new Color(0, 255, 128));
		setTitle("Đăng nhập quản trị");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 236);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(29, 21, 135, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setForeground(new Color(0, 0, 0));
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMtKhu.setBounds(29, 69, 135, 25);
		contentPane.add(lblMtKhu);
		
		txt_user = new JTextField();
		txt_user.setBounds(174, 25, 187, 25);
		contentPane.add(txt_user);
		txt_user.setColumns(10);
		
		JButton btn_dangnhap = new JButton("Đăng nhập");
		btn_dangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txt_user.getText();
				String password = new String(txt_pass.getPassword());
				ArrayList<Account> lsAccount = new ArrayList<>();
				lsAccount = ps.getListAccount();
				for (Account a : lsAccount)
				{
					if(user.equals(a.getTK()) && password.equals(a.getMK()))
					{
						dispose();
						GUI_QUANLY quanly = new GUI_QUANLY();
						quanly.setVisible(true);
						return;
					}
				}
				JOptionPane.showConfirmDialog(null,"Tài khoản hoặc mật khẩu sai, xin vui lòng nhập lại","Thông Báo", JOptionPane.OK_CANCEL_OPTION);
				txt_user.setText(null);
				txt_pass.setText(null);
			}
		});
		btn_dangnhap.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_dangnhap.setBounds(133, 121, 187, 42);
		contentPane.add(btn_dangnhap);
		txt_pass = new JPasswordField();
		txt_pass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					btn_dangnhap.doClick();
				}
			}
		});
		txt_pass.setBounds(174, 73, 187, 25);
		contentPane.add(txt_pass);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setIcon(new ImageIcon("E:\\BaiTapLon\\BTL_Java\\bg.jfif"));
		lblNewLabel_1.setBounds(0, 0, 424, 199);
		contentPane.add(lblNewLabel_1);
	}
}