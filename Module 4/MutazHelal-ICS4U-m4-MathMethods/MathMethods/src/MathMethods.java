/*
  *Created by M.Helal
  *On Ocober 14, 2019
  *Math Methods
 */
public class MathMethods extends javax.swing.JFrame {

    /**
     * Creates new form MathMethods
     */
    public MathMethods() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        maxOut = new javax.swing.JLabel();
        minOut = new javax.swing.JLabel();
        diffOut = new javax.swing.JLabel();
        powerOut = new javax.swing.JLabel();
        roundedDiffOut = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();
        mathGFX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                num1KeyPressed(evt);
            }
        });
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 40, 40));

        num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                num2KeyPressed(evt);
            }
        });
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 40, 40));

        maxOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(maxOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        minOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(minOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        diffOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(diffOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        powerOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(powerOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, -1, -1));

        roundedDiffOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(roundedDiffOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        outputLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(outputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 280, -1));

        mathGFX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathMethodsGFX.png"))); // NOI18N
        getContentPane().add(mathGFX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        //initialize variables
        double x, y;

        //validate user input
        try {
            x = Double.parseDouble(num1.getText());
            y = Double.parseDouble(num2.getText());
        } catch (NumberFormatException e) {
            outputLabel.setText("Please enter valid numbers.");
            return;
        }

        //output max
        maxOut.setText(String.valueOf(Math.max(x, y)));
        //output min
        minOut.setText(String.valueOf(Math.min(x, y)));
        //output absolute difference
        diffOut.setText(String.valueOf(Math.abs(x - y)));
        //output smallest int<= absolute difference
        roundedDiffOut.setText(String.valueOf(Math.ceil((Math.abs(x - y)))));
        //output x^y
        powerOut.setText(String.valueOf(Math.pow(x, y)));
        
    }//GEN-LAST:event_enterButtonActionPerformed

    private void num1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num1KeyPressed
        clearOut();
    }//GEN-LAST:event_num1KeyPressed

    private void num2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num2KeyPressed
        clearOut();
    }//GEN-LAST:event_num2KeyPressed
    private void clearOut() {
        //clear all outputs
        outputLabel.setText("");
        maxOut.setText("");
        minOut.setText("");
        diffOut.setText("");
        roundedDiffOut.setText("");
        powerOut.setText("");
    }
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
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MathMethods().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel diffOut;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel mathGFX;
    private javax.swing.JLabel maxOut;
    private javax.swing.JLabel minOut;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel powerOut;
    private javax.swing.JLabel roundedDiffOut;
    // End of variables declaration//GEN-END:variables
}
