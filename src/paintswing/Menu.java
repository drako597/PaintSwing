/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import paintswing.figure.Figure;

/**
 * 
 * @author drako597
 * @version 1.0
 * 
 */
public class Menu {
	private JMenuBar bar = new JMenuBar();
	/**
	 * 
	 * @param drawManager
	 * @param paint
	 * @param settings
	 * @param area
	 */
	public Menu(final DrawManager drawManager, final Paint paint,
			final Settings settings, final Area area) {
		JMenu file = new JMenu("Plik");
		JMenuItem open, save, exit;
		file.add(open = new JMenuItem("Otwórz"));
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					try {
						FileInputStream file = new FileInputStream(fc
								.getSelectedFile());
						ObjectInputStream o = new ObjectInputStream(file);
						boolean przeczytane = false;
						while (!przeczytane) {
							Figure p = (Figure) o.readObject();
							if (p == null)
								przeczytane = true;
							else
								area.getCollectionFigure().add(p);
							area.repaint();
						}
						o.close();
						file.close();

					} catch (FileNotFoundException e1) {
						System.out.println(e1.getMessage());
					} catch (IOException e2) {
						System.out.println(e2.getMessage());
					} catch (ClassNotFoundException e1) {

					}

				}
			}
		});
		file.add(save = new JMenuItem("Zapisz"));
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					try {
						FileOutputStream file = new FileOutputStream(fc
								.getSelectedFile());
						ObjectOutputStream o = new ObjectOutputStream(file);
						for (Figure f : area.getCollectionFigure()) {
							o.writeObject(f);
						}
						o.close();
						file.close();

					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});

		file.add(exit = new JMenuItem("Zakończ"));
		bar.add(file);

		// Zdarzenia Menu Plik
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JMenu edit = new JMenu("Edycja");
		JMenuItem clear, preferences;
		edit.add(clear = new JMenuItem("Czyść"));
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawManager.clear();
			}
		});
		edit.add(preferences = new JMenuItem("Ustawiania"));
		preferences.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				settings.setBackgraundCollor(Color.BLUE);

			}
		});

		bar.add(edit);
		// Menu draw
		JMenu draw = new JMenu("Rysuj");
		JMenuItem line, circle, rectangle;
		draw.add(line = new JMenuItem("Linia"));
		line.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawManager.setStringFigle("LINE");
			}
		});
		draw.add(circle = new JMenuItem("Koło"));
		circle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawManager.setStringFigle("CIRCLE");
			}
		});
		draw.add(rectangle = new JMenuItem("Prostokont"));
		rectangle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawManager.setStringFigle("RECTANGLE");
			}
		});
		bar.add(draw);
		// Menu Edycja

		JMenu colorEdit = new JMenu("Kolor");
		JMenuItem black, white, red;
		colorEdit.add(black = new JMenuItem("Czarny"));
		black.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawManager.setStringColor(Color.BLACK);
			}
		});
		colorEdit.add(white = new JMenuItem("Biały"));
		white.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawManager.setStringColor(Color.WHITE);
				area.repaint();
			}
		});
		colorEdit.add(red = new JMenuItem("Czerwony"));
		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawManager.setStringColor(Color.red);
			}
		});
		bar.add(colorEdit);

	}

	public JMenuBar getMenuBar() {
		return bar;
	}
	/*
	 * public void dialogWindowOpen() { dialogWindow = new FileDialog(paint,
	 * "Otwóż", FileDialog.LOAD);
	 * 
	 * dialogWindow.setAlwaysOnTop(true);
	 * 
	 * dialogWindow.setVisible(true);
	 * 
	 * }
	 * 
	 * public void dialogWindowSave() { dialogWindow = new FileDialog(paint,
	 * "Otwóż", FileDialog.SAVE); dialogWindow.setVisible(true);
	 * 
	 * }
	 */
}