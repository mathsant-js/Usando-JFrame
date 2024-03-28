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
public class JanelaMinimizada extends JFrame{
    public JanelaMinimizada() {
        super("Como exibr a janela minimizada");
        setSize(300, 150);
        setVisible(true);
        setExtendedState(ICONIFIED);
    }
    public static void main(String []args){
        JanelaMinimizada app = new JanelaMinimizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
