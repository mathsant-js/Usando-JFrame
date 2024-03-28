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
public class JanelaCentralizada extends JFrame{
    public JanelaCentralizada() {
        super("Janela Centralizada");
        setSize(300, 150);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String []args) {
        JanelaCentralizada app = new JanelaCentralizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
