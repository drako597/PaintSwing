/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintswing;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author drako597
 */
public class Menu {
	protected Paint paint;
	protected JMenuBar bar = new JMenuBar();
	protected FileDialog dialogWindow;
	protected DrawManager drawManager;

    public Menu(final DrawManager drawManager, Paint paint) {
        this.paint=paint;
        this.drawManager = drawManager;
        //Menu Plik
        JMenu file = new JMenu("Plik");
        JMenuItem open, save, saveAs, exit;
        file.add(open = new JMenuItem("Otwóż"));
        open.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               dialogWindowOpen();
            }
        });
        file.add(save = new JMenuItem("Zapisz"));
        save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             save();
            }
        });
        file.add(saveAs = new JMenuItem("Zapisz jako"));
        saveAs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dialogWindowSave();
            }
        });
        file.add(exit = new JMenuItem("Zakończ"));
        bar.add(file);

        //Zdarzenia Menu Plik
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu edit = new JMenu("Edycja");
        JMenuItem clear;
        edit.add(clear = new JMenuItem("Czyść"));
        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawManager.clear();
            }
        });
        bar.add(edit);
        //Menu Rysuj
        JMenu draw = new JMenu("Rysuj");
        JMenuItem line, circle, rectangle, triangle;
        draw.add(line = new JMenuItem("Linia"));
        line.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawManager.setStringFigle("Line");
            }
        });
        draw.add(circle = new JMenuItem("Koło"));
        circle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawManager.setStringFigle("Circle");
            }
        });
        draw.add(rectangle = new JMenuItem("Prostokont"));
        rectangle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawManager.setStringFigle("Rectangle");
            }
        });
        bar.add(draw);
        //Menu Edycja

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
    public void dialogWindowOpen(){
        dialogWindow = new FileDialog(paint, "Otwóż",FileDialog.LOAD);
        
        dialogWindow.setAlwaysOnTop(true);
        
        
        dialogWindow.setVisible(true);
        
    }
    public void dialogWindowSave(){
        dialogWindow = new FileDialog(paint, "Otwóż",FileDialog.SAVE);
        dialogWindow.setVisible(true);
        
    }
    public void save(){
        
    }
}