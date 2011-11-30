
package ch.hszt.hs_2011.aud.exercise_10;

import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Task1Samples extends JFrame {

	private static final long serialVersionUID = 5406676622835103424L;
	
	// Anzahl Teile des Originalbildes
	private static final int anzahlPicFragment = 81;
	
	private static Task1Impl_Luethi frame;

	private static void start() {
		
		/* TEST
		 * 
		 */
		
		
		// END
		
		frame = new Task1Impl_Luethi("Mein Android");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.createAndAddComponents(frame.getContentPane());
		initialFillUpImageFragments();
		showCurrentPicture();
	}
	
	/**
	 * F�llt den Vektor mit den Fragmenten in zuf�lliger Reihenfolge ab.
	 */
	private static void initialFillUpImageFragments(){
		int[] intArraySorted = {
				 1, 2, 3, 4, 5, 6, 7, 8, 9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59,60,
				61,62,63,64,65,66,67,68,69,70,
				71,72,73,74,75,76,77,78,79,80,
				81};
		int[] intArrayUnsorted = unsortArray(intArraySorted);
		Vector<ImageIcon> v = new Vector<ImageIcon>(anzahlPicFragment);
		for (int i = 0; i < v.capacity(); i++) v.add(0, new ImageIcon( ClassLoader.getSystemResource("images/"+intArrayUnsorted[i] +".png")));
		fillPanel(v);
		frame.setPics(v);
	}
	
	protected static void fillPanel(Vector<ImageIcon> v) {
		frame.getPicPiecesPanel().removeAll();
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
				ImageIcon imgIcon = v.get(i * 9 + j);
				frame.getPicPiecesPanel().add(new JButton(imgIcon));
			}
		}
		//for (ImageIcon imgIcon : v) frame.getPicPiecesPanel().add(new JButton(imgIcon));	
	}

	/**
	 * @param intArraySorted: �bergibt sortiertes Array
	 * @return unsortiertes array
	 */
	private static int[] unsortArray(int[]intArraySorted){
		int[] intArrayUnsorted = new int[anzahlPicFragment];
		for (int i = 0; i < anzahlPicFragment; i++){
			int k = (int) (Math.random()*anzahlPicFragment);
			if (intArraySorted[k] != -1){
				intArrayUnsorted[i] = intArraySorted[k];
				intArraySorted[k] = -1;
			}
			else
				i--;
		}
		return intArrayUnsorted;
	}
	
	private static void showCurrentPicture(){
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				start();
			}
		});
	}
}
