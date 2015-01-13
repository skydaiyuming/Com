package com.commport.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WelcomeUI extends JFrame {

	static final int WIDTH = 300 ;
	static final int HEIGHT = 150 ;
	public JFrame welcomeUI ;
	public JPanel welcomePanel ;
	
	public void add(Component c , GridBagConstraints constraints , int  x , int y , int w , int h )
	{
		constraints.gridx = x ;
		constraints.gridy = y ;
		constraints.gridheight = h ;
		constraints.gridwidth = w ;
		add( c , constraints ) ;
	}
 	
	WelcomeUI()
	{
		welcomeUI = new JFrame("欢迎界面") ;
		welcomeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout();
		setLayout(layout);

//		welcomeUI.add( this , BorderLayout.WEST ) ;
		welcomeUI.setSize( WIDTH , HEIGHT ) ;
		welcomePanel = new JPanel() ;
		welcomeUI.setContentPane( welcomePanel ) ;
		Toolkit kit = Toolkit.getDefaultToolkit() ;
		Dimension screenSize = kit.getScreenSize() ;
		
		int width = screenSize.width ;
		int height = screenSize.height ;
		
		int x = ( width - WIDTH ) / 2 ;
		int y = ( height - HEIGHT ) / 2 ;
		
		welcomeUI.setLocation( x , y ) ;
		JButton ok = new JButton( "登录" ) ;
		JButton cancel = new JButton( "退出" ) ;
		ok.setVisible( true ) ;
		JLabel title = new JLabel( "欢迎登录系统..." ) ;
		JLabel name = new JLabel( "用户名" ) ;
		JLabel password = new JLabel( "密码" ) ;
		
		welcomePanel.add(name);
		final JTextField nameInput = new JTextField( 15 ) ;
		final JTextField passwordInput = new JTextField( 15 ) ;
		
		GridBagConstraints constraints = new GridBagConstraints() ;
		constraints.fill = GridBagConstraints.NONE ;
		constraints.anchor = GridBagConstraints.EAST ;
		constraints.weightx = 3 ;
		constraints.weighty = 4 ;
		
		add( title , constraints , 0 , 0 , 4 , 1 ) ;
		add( name , constraints , 0 , 1 , 1 , 1 ) ;
		add( password , constraints , 0 , 2 , 1 , 1 ) ;
		add( nameInput , constraints , 2 , 1 , 1 , 1 ) ;
		add( passwordInput , constraints , 2 , 2 , 1 , 1 ) ;
		add( ok , constraints , 0 , 3 , 1 , 1 ) ;
		add( cancel , constraints , 2 , 3 , 1 , 1 ) ;
		
		welcomeUI.setResizable( false ) ;
		System.out.println("hello!");
		welcomeUI.setVisible( true ) ;
	}
	
	public void WelcomeUIShow()
	{
	}
	
	public static void main(String args[])
	{
		WelcomeUI welcome = new WelcomeUI() ;
		welcome.WelcomeUIShow() ;
//		jf.setSize(witch, witch);
//		jf.setVisible(true);
//		System.out.println("hello!");
	}
}