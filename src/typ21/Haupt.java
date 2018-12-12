package typ21;

import java.awt.EventQueue;

public class Haupt {

	private FullscreenFrame frame;
	private Haupt haupt;

	public Haupt() {
		haupt = this;

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FullscreenFrame(haupt);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void disposeFFrame() {
		frame.dispose();
	}

}
