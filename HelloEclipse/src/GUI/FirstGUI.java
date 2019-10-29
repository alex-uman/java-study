package GUI;

import javax.swing.*;

class MyFrame extends JFrame {

	public MyFrame() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocation(560, 360);
		setTitle("My Window");
		setSize(300, 200);
		setResizable(true);
		setVisible(true);

		JMenuBar mb = new JMenuBar();

		JMenu fileM = new JMenu();

		JMenuItem loadMI = new JMenuItem();

		loadMI.setName("Load");

		JMenuItem saveMI = new JMenuItem();

		saveMI.setName("Load");

		fileM.setName("File");
		fileM.add(saveMI);
		fileM.add(loadMI);

		mb.add(fileM);

		mb.setEnabled(true);
		mb.setVisible(true);

		setJMenuBar(mb);
		
		System.out.println(getJMenuBar());

	}

}

public class FirstGUI {

	public static void main(String[] args) {

		JFrame frame = new MyFrame();

	}

}
