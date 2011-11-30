package ch.hszt.hs_2011.aud.exercise_10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task1Impl_Luethi extends JFrame implements ActionListener {

	private static final long serialVersionUID = 5406676622835103424L;

	// Name des Buttons und der Action
	private static final String sOrderedPic1 = "showOrderedPic1";
	private static final String sOrderedPic2 = "showOrderedPic2";

	// Buttons, welche die Suchaktion ausl�sen
	private JButton sortButton = new JButton(sOrderedPic1);
	private JButton sortColorButton = new JButton(sOrderedPic2);
	
	private Vector<ImageIcon> vector;

	// Layout mit den Fragmenten des Bildes
	private final GridLayout gridLayout = new GridLayout(9, 9);
	private final JPanel picPiecesPanel = new JPanel();

	public Task1Impl_Luethi(String name) {
		super(name);
		setResizable(false);

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		UIManager.put("swing.boldMetal", Boolean.FALSE);
	}

	/**
	 * Erstellt die GUI Komponenten und f�gt sie zusammen.
	 */
	public void createAndAddComponents(final Container pane) {
		picPiecesPanel.setLayout(gridLayout);
		JPanel controls = new JPanel();
		controls.setLayout(new GridLayout(0, 2));
		ImageIcon img = new ImageIcon("/home/florian/workspace/Algorithmen/src/images/1.png");
		picPiecesPanel.setPreferredSize(new Dimension(
				(int) (img.getIconWidth() * 9), (int) img.getIconHeight() * 9));
		controls.add(sortButton);
		controls.add(sortColorButton);

		sortButton.addActionListener(this);
		sortColorButton.addActionListener(this);

		pane.add(picPiecesPanel, BorderLayout.NORTH);
		pane.add(new JSeparator(), BorderLayout.CENTER);
		pane.add(controls, BorderLayout.SOUTH);
	}

	/**
	 * @return das JPanel mit den Buttons.
	 */
	public JPanel getPicPiecesPanel() {
		return picPiecesPanel;
	}

	/**
	 * @param v
	 *            Vector mit den Fragmenten
	 */
	public void setPics(Vector<ImageIcon> v) {
		vector = v;
	}

	
	/***
	 * 
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == sortButton) {
			selectionSort(vector);
		} else if (e.getSource() == sortColorButton) {
			insertionSort(vector);
		}
		
		for (ImageIcon i : vector) {
			System.out.println(i.getDescription());
		}

		Task1Samples.fillPanel(vector);
		pack();
		this.paintComponents(getGraphics());
		setVisible(true);

	}
	
	private static void selectionSort(Vector<ImageIcon> v) {
		
		for (int i = 0; i < v.size() - 1; i++) {
			int minPos = i;
			int minKey = getKey(v.get(minPos));
			for (int j = i + 1; j < v.size(); j++) {
				if (getKey(v.get(j)) < minKey) {
					minPos = j;
					minKey = getKey(v.get(minPos));
				}
			}
			ImageIcon swap = v.get(i);
			v.set(i, v.get(minPos));
			v.set(minPos, swap);
		}
		
	}
	
	private static void insertionSort(Vector<ImageIcon> v) {
		
		for (int i = 0; i < v.size() - 1; i++) {
			ImageIcon e = v.get(i + 1);
			int j = i;
			while (j >= 0 && getKey(e) < getKey(v.get(j))) {
				v.set(j + 1, v.get(j));
				j--;
			}
			v.set(j + 1, e);
		}
		
	}
	
	private static int getKey(ImageIcon icon) {
		String filename = new File(icon.getDescription()).getName();
		return Integer.parseInt(filename.split("\\.")[0]);
	}
	
}
