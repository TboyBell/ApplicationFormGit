import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Applied implements ActionListener {
	
	  JFrame frame;
	  JButton button;

	Applied() {

		frame = new JFrame();
		frame.setSize(500, 800);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exitapp();
			}

			
		});
		
		JLabel l = new JLabel("Congrats You've Succesfully Applied");
		l.setFont(new Font("Coimic Sans",Font.BOLD,25));
		ImageIcon icon = new ImageIcon("image.png");
		l.setHorizontalTextPosition(JLabel.CENTER);
		l.setVerticalTextPosition(JLabel.BOTTOM);
		l.setIconTextGap(25);
		l.setIcon(icon);
		
		JPanel pane = new JPanel();
		pane.add(l);
		
		button = new JButton("Close");
		button.setFont(new Font("Coimic Sans",Font.ITALIC,25));
		button.setFocusable(false);
		button.addActionListener(this);
		frame.add(pane,BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public void exitapp() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();
		}
		
	}
}
