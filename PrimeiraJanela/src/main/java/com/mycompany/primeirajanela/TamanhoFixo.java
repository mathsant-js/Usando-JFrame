/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeirajanela;

import javax.swing.*;
/**
 *
 * @author Admin
 */
public class TamanhoFixo extends JFrame{
    public TamanhoFixo() {
        super("Uma janela não dimensionável");
        setResizable(false);
        setSize(300, 150);
        setVisible(true);
    }
    public static void main(String []args){
        TamanhoFixo app = new TamanhoFixo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
