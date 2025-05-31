/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otopark;

/**
 *
 * @author asus
 */
import javax.swing.*;
import java.util.Stack;

public class NavigationManager {
    private static final Stack<JFrame> backStack = new Stack<>();
    private static final Stack<JFrame> forwardStack = new Stack<>();

    public static void navigateTo(JFrame current, JFrame next) {
        backStack.push(current);
    forwardStack.clear();
    current.setVisible(false);
    current.dispose();  
    next.setVisible(true);
    }

    public static void goBack(JFrame current) {
        if (!backStack.isEmpty()) {
            JFrame previous = backStack.pop();
            forwardStack.push(current);
            current.setVisible(false);
            previous.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Geri gidilecek sayfa yok.");
        }
    }

    public static void goForward(JFrame current) {
        if (!forwardStack.isEmpty()) {
            JFrame next = forwardStack.pop();
            backStack.push(current);
            current.setVisible(false);
            next.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "İleri gidilecek sayfa yok.");
        }
    }
}
