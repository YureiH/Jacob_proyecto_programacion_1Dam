/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author M.J.H
 */
public class deslizador extends javax.swing.JFrame implements ActionListener {
    //definiendo los variables para luego
    ImageIcon s[];
    JLabel l;
    JButton b1, b2;
    int i, l1;
    JPanel p;

    public deslizador() {
        initComponents();
        setLayout(new BorderLayout());
        setSize(800, 700);//creando el los parametros del tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//como se va ha cerrar
        setVisible(true);
        JPanel p = new JPanel(new FlowLayout());
        b1 = new JButton("<<");//como se van a ver los botones de la ventana
        b2 = new JButton(">>");
        p.add(b1);
        p.add(b2);
        add(p, BorderLayout.SOUTH);//donde se situan los botones en el interfaz
        b1.addActionListener(this);
        b2.addActionListener(this);
        s = new ImageIcon[10]; //crea un array de los imagenes del url donde se encuentran
        s[0] = new ImageIcon("src\\main\\java\\expo\\imagenes\\artic_wolf.PNG");
        s[1] = new ImageIcon("src\\main\\java\\expo\\imagenes\\elk.PNG");
        s[2] = new ImageIcon("src\\main\\java\\expo\\imagenes\\herd.PNG");
        s[3] = new ImageIcon("src\\main\\java\\expo\\imagenes\\migration1.PNG");
        s[4] = new ImageIcon("src\\main\\java\\expo\\imagenes\\migration2.PNG");
        s[5] = new ImageIcon("src\\main\\java\\expo\\imagenes\\migration3.PNG");
        s[6] = new ImageIcon("src\\main\\java\\expo\\imagenes\\migration4.PNG");
        s[7] = new ImageIcon("src\\main\\java\\expo\\imagenes\\migration5.PNG");
        s[8] = new ImageIcon("src\\main\\java\\expo\\imagenes\\rhinocerous.PNG");
        s[9] = new ImageIcon("src\\main\\java\\expo\\imagenes\\siberian_tigers.PNG");
        l = new JLabel("", JLabel.CENTER);//es para que el imagen siempre se posicione en el centro
        add(l, BorderLayout.CENTER);
        l.setIcon(s[0]);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (i == 0) {//esto es por si al apretar el boton de la izquierda y 
                //yas estas en la primera foto que te avise con un mensajillo
                JOptionPane.showMessageDialog(null, "Esto es el primer imagen");
            } else {
                i = i - 1;//si aprietas el boton y no estas en el primer icono(imagen) 
                //del array simplemente te mandara hacia atras, como del 4 al 3.
                l.setIcon(s[i]);
            }
        }
        if (e.getSource() == b2) {
            if (i == s.length - 1) {//esto es por si al apretar el boton de la derecha y 
                //yas estas en el ultimo foto que te avise con un mensajillo
                JOptionPane.showMessageDialog(null, "Este es el ultimo imagen");
                JOptionPane.showMessageDialog(null, "Espero que les haya gustado");
            } else {//si aprietas el boton y no estas en el ultimo icono(imagen) 
                //del array simplemente te mandara hacia delante, como del 4 al 5. 
                i = i + 1;
                l.setIcon(s[i]);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")//CODIGO PREDETERMINADO DEL initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deslizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deslizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deslizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deslizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {//que se vea la ventana al ejecutarlo
                new deslizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
