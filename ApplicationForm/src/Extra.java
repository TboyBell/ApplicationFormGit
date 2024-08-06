import java.awt.Color;
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
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Extra {

	
	static JFrame frame = new JFrame();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Extra Program,
		//Just a program that displays the path of a file.
		frame.setTitle("File_Chooser");
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitApp();
			}

			
		});
		frame.setResizable(false);
		frame.setLayout(null);
		
		Font font = new Font("Malgun Gothic Semilight", Font.BOLD,15);
		
		JLabel path = new JLabel("File-Path");
		path.setFont(font);
		path.setBorder(new LineBorder(Color.BLACK, 1));
		path.setBounds(5,25,65,35);
		frame.add(path);
		
		
		JTextField display = new JTextField(50);
		display.setFont(new Font("Arial Black",Font.BOLD,25));
		display.setEditable(false);
		display.setBounds(75, 15, 400, 50);
		frame.add(display);
		
		
		JButton button = new JButton("Choose-File");
		button.setFocusable(false);
		button.setToolTipText("Select-File-PC");
		button.setFont(new Font("Comic Sans Ms",Font.ITALIC,20));
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
			
				//Not Really Needed
				/*FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Files", "pdf");
				file.setFileFilter(filter);
				*/
				
				int userAction = file.showDialog(null, "Get-Path");
				File selectedFile = file.getSelectedFile();

				if(userAction == JFileChooser.APPROVE_OPTION) {
					display.setText(selectedFile.getAbsolutePath());
				}
				else {
					JOptionPane.showMessageDialog(null, "No File Selected");
					display.setText("No File Selected");
				}
				
				
			}
			
		});
		button.setBounds(75, 100, 150, 45);
		frame.add(button);
		
		
		
		frame.setVisible(true);
	}

	public static void exitApp() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
	}
	
	
	
}
