import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class Apply {
	static JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		frame = new JFrame();
		frame.setSize(500, 800);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exitapp();
			}

			
		});
		
		
		JLabel title = new JLabel("Application Form........");
		title.setFont(new Font("Arial Black", Font.ITALIC,25));
		title.setBounds(40, 0, 300, 50);
		title.setBorder(new BevelBorder(BevelBorder.RAISED));
		frame.add(title);

		
		
		JTextField firstN = new JTextField("Enter First-Name/Press Enter Once Done");
		firstN.setBounds(40, 60, 400, 30);
		frame.add(firstN);

		JTextField lastN = new JTextField("Enter Last-Name/Press Enter Once Done");
		lastN.setBounds(40, 100, 400, 30);
		frame.add(lastN);

		JTextField email = new JTextField("Enter Email/Press Enter Once Done");
		email.setBounds(40, 140, 400, 30);
		frame.add(email);

		JTextField phoneN = new JTextField("Enter Phone-Number/Press Enter Once Done");
		phoneN.setBounds(40, 180, 400, 30);
		frame.add(phoneN);

		
		Font font = new Font("Cambria",Font.ITALIC,20);
		JTextField[] text = new JTextField[4];
		text[0] = firstN;
		text[1] = lastN;
		text[2] = email;
		text[3] = phoneN;
		
		for(int i = 0; i < text.length; i++) {
			text[i].setFont(font);
			final int index = i;
			text[i].addActionListener(new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					text[index].setText(text[index].getText());
					text[index].setEditable(false);
					
				}
				
			});
		}
		
		
		
		
		JTextArea coverL = new JTextArea("Detail why you're fit for this role:");
		coverL.setFont(font);
		coverL.setBounds(40, 250, 400, 300); 
		coverL.setLineWrap(true); 
		coverL.setWrapStyleWord(true); 
		frame.add(coverL);


		
		
		JButton button = new JButton("Choose CV");
		button.setBounds(40,600,150,50);
		
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();

                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Selected file: " + selectedFile.getAbsolutePath());
                } else {
                    JOptionPane.showMessageDialog(null, "No file selected");
                }
            }
        });
		frame.add(button);        
        
		
		JButton Apply = new JButton("Apply");
		Apply.setFont(new Font("SansSerif",Font.BOLD,15));
		Apply.setToolTipText("Final Submit");
		Apply.setBounds(300,600,150,50);
		Apply.setFocusable(false);
		Apply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.dispose();
				Applied a = new Applied();
			}
			
		});
		frame.add(Apply);
        
		
		frame.setVisible(true);
	}

	
	
	
	public static void exitapp() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
		
	}
}
