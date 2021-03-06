package typ21;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FullscreenFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -56581405579835432L;

//	private Haupt haupt;
	private JPanel panelOfContent;

	public FullscreenFrame(Haupt haupt) {
//		this.haupt = haupt;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setExtendedState(MAXIMIZED_BOTH);

		panelOfContent = new JPanel();
//		panelOfContent.setLayout(null);
		panelOfContent.setBackground(Color.BLACK);
		setContentPane(panelOfContent);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				switch (arg0.getExtendedKeyCode()) {
				case 27:
					haupt.disposeFFrame();
					break;

				case 81:
//					System.out.println("q");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 87:
//					System.out.println("w");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 69:
//					System.out.println("e");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 82:
//					System.out.println("r");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 84:
//					System.out.println("t");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 90:
//					System.out.println("z");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 85:
//					System.out.println("u");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 73:
//					System.out.println("i");
					panelOfContent.setBackground(Color.BLACK);
					break;
				case 79:
//					System.out.println("o");
					panelOfContent.setBackground(Color.BLACK);
					break;
					
				default:
					break;
				}
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
//				System.out.println(arg0.getKeyCode()+"|"+arg0.getExtendedKeyCode());

				switch (arg0.getExtendedKeyCode()) { // German keyboard layout
				case 81:
//					System.out.println("q");
					panelOfContent.setBackground(Color.RED);
//					waitBlack();
					break;
				case 87:
//					System.out.println("w");
					panelOfContent.setBackground(Color.ORANGE);
//					waitBlack();
					break;
				case 69:
//					System.out.println("e");
					panelOfContent.setBackground(Color.YELLOW);
//					waitBlack();
					break;
				case 82:
//					System.out.println("r");
					panelOfContent.setBackground(Color.GREEN);
//					waitBlack();
					break;
				case 84:
//					System.out.println("t");
					panelOfContent.setBackground(Color.BLUE);
//					waitBlack();
					break;
				case 90:
//					System.out.println("z");
					panelOfContent.setBackground(Color.MAGENTA);
//					waitBlack();
					break;
				case 85:
//					System.out.println("u");
					panelOfContent.setBackground(Color.PINK);
//					waitBlack();
					break;
				case 73:
//					System.out.println("i");
					panelOfContent.setBackground(Color.WHITE);
//					waitBlack();
					break;
				case 79:
//					System.out.println("o");
					panelOfContent.setBackground(Color.GRAY);
//					waitBlack();
					break;
				case 80:
//					System.out.println("p");
					panelOfContent.setBackground(Color.BLACK);
					break;

				case 65:
//					System.out.println("a");
					panelOfContent.setBackground(Color.RED);
					break;
				case 83:
//					System.out.println("s");
					panelOfContent.setBackground(Color.ORANGE);
					break;
				case 68:
//					System.out.println("d");
					panelOfContent.setBackground(Color.YELLOW);
					break;
				case 70:
//					System.out.println("f");
					panelOfContent.setBackground(Color.GREEN);
					break;
				case 71:
//					System.out.println("g");
					panelOfContent.setBackground(Color.BLUE);
					break;
				case 72:
//					System.out.println("h");
					panelOfContent.setBackground(Color.MAGENTA);
					break;
				case 74:
//					System.out.println("j");
					panelOfContent.setBackground(Color.PINK);
					break;
				case 75:
//					System.out.println("k");
					panelOfContent.setBackground(Color.WHITE);
					break;
				case 76:
//					System.out.println("l");
					panelOfContent.setBackground(Color.GRAY);
					break;
				case 16777430:
//					System.out.println("�");
					panelOfContent.setBackground(Color.BLACK);
					break;

				default:
					break;
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				/*
				 * switch (arg0.getKeyCode()) { case 27: haupt.disposeFFrame(); break;
				 * 
				 * default: break; }
				 */
			}
		});
	}

	private void waitBlack(long millis) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(millis);
					panelOfContent.setBackground(Color.BLACK);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		thread.start();
	}

	private void waitBlack() {
		waitBlack(100);
	}

}
