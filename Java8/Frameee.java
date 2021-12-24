package Java8;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frameee {

	
	
	private static final ActionListener ActionListener = null;

	public static void main(String[] args) {
		
		Frame fram=new Frame("Sachin");
		Button btn=new Button("Click");
		btn.setBounds(100, 50, 100, 100);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello sachin");
			}
			
		});
		fram.add(btn);
		fram.setSize(200,200);
		fram.setLayout(null);
		fram.setVisible(true);	
		
		
	}

}
