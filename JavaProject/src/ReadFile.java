import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame{

	private JTextField addressBar;
	private JEditorPane display;
	
	//this is the constructor
	public ReadFile(){
		super("CooperFox Browser");
		
		addressBar = new JTextField("Enter the URL: ");
		//for when the user submits the URL
		addressBar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						loadURL(event.getActionCommand());
					}
				}
				);
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		display.setEditable(false);
		//grabs the link
		display.addHyperlinkListener(
				new HyperlinkListener(){
					public void hyperlinkUpdate(HyperlinkEvent event){
						if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
							loadURL(event.getURL().toString());
						}
				}
			}
		);
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(500,300);
		setVisible(true);
	}

		//loadURL method, reads an html file, displays on the screen
	private void loadURL(String userText){
		try{
			display.setPage(userText);
			addressBar.setText(userText);
		}catch(Exception e){
			Component frame = null;
			JOptionPane.showMessageDialog(frame, "Please enter a valid URL");
			System.out.println("error!");
		}
	}
	
}


