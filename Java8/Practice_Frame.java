package Java8;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice_Frame {

	public static void main(String[] args) {
		
		Frame f=new Frame("Sachin");
		Button b=new Button("Java Full Stack");
		b.setBounds(50,50,120,50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("FrontEnd+BackEnd");
			}
		});
		
		f.add(b);
		f.setSize(50,50);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
