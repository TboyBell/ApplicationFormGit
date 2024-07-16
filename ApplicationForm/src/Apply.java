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
		
		
		
		JButton Apply = new JButton("Apply");
		Apply.setFont(new Font("SansSerif",Font.BOLD,15));
		Apply.setToolTipText("Final Submit");
		Apply.setBounds(350, 0, 100, 50);
		Apply.setFocusable(false);
		Apply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.dispose();
				Applied a = new Applied();
			}
			
		});
			
		
		Font font = new Font("Cambria",Font.ITALIC,20);
				
		// Name, Email, Phone Email, COver Letter
		
	
		
		
		JTextField fnm = new JTextField("Enter First-Name/Press Enter Once Done");
		fnm.setFont(font);
		fnm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fnm.setText(fnm.getText());
				fnm.setEditable(false);
				
			}
			
		});
		fnm.setBounds(40, 60, 400, 30);
		
		JTextField lnm = new JTextField("Enter Last-Name/Press Enter Once Done");
		lnm.setFont(font);
		lnm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lnm.setText(lnm.getText());
				lnm.setEditable(false);
				
			}
			
		});
		lnm.setBounds(40, 100, 400, 30);
		
		JTextField em = new JTextField("Enter Email/Press Enter Once Done");
		em.setFont(font);
		em.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				em.setText(em.getText());
				em.setEditable(false);
			}
			
		});
		em.setBounds(40, 140, 400, 30);
		
		JTextField pn = new JTextField("Enter Phone-Number/Press Enter Once Done");
		pn.setFont(font);
		pn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pn.setText(pn.getText());				
				pn.setEditable(false);
			}
			
		});
		pn.setBounds(40, 180, 400, 30);
		
		JTextArea cl = new JTextArea("Describe why you're fit for this role:");
		cl.setFont(font);
		cl.setBounds(40, 250, 400, 300); 
		cl.setLineWrap(true); 
		cl.setWrapStyleWord(true); 
		
		
		// Read Here
		JButton button = new JButton("Choose CV");
		button.setBounds(40,600,150,50);
		
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();

                // Show open dialog; this method does not return until the dialog is closed.
                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Selected file: " + selectedFile.getAbsolutePath());
                } else {
                    JOptionPane.showMessageDialog(null, "No file selected");
                }
            }
        });

        // Too Here
        
        
        
        
		
		frame.add(title);
		frame.add(Apply);
		frame.add(fnm);
		frame.add(lnm);
		frame.add(em);
		frame.add(pn);
		frame.add(cl);
		frame.add(button);
		frame.setVisible(true);
	}

	public static void exitapp() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
		
	}
}
