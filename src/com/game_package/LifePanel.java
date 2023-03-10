package com.game_package;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LifePanel extends JPanel{

    private final int WORLDSIZE = 1000;
    private final int CELLSIZE = 5;
    private final int NUMBEROFCELLS = WORLDSIZE/CELLSIZE;
    private boolean[][] isAliveArray;

    public LifePanel(){
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(WORLDSIZE,WORLDSIZE));
        isAliveArray = new boolean[NUMBEROFCELLS][NUMBEROFCELLS];
        fillArray();
    }

    @Override
    public void paintComponent(Graphics pen){
        super.paintComponent(pen);
        pen.setColor(Color.GREEN);
        for(int i = 0; i < NUMBEROFCELLS; i++){
            for(int j = 0; j < NUMBEROFCELLS; j++){
                if(isAliveArray[i][j]){
                    pen.fillRect(i * CELLSIZE, j * CELLSIZE, CELLSIZE, CELLSIZE);
                }
            }
        } 
    }
    
    public void fillArray(){
        Random random = new Random();
        for(int i = 0; i < NUMBEROFCELLS; i++){
            for(int j = 0; j < NUMBEROFCELLS; j++){
                isAliveArray[i][j] = random.nextBoolean();
            }
        } 
    }
    
}
