package tr.com.ekolsan.test;

import javax.swing.SwingUtilities;

import tr.com.ekolsan.frEnd.AnaPencereFrEnd;

public class Run {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new AnaPencereFrEnd();

			}
		});

	}

}
