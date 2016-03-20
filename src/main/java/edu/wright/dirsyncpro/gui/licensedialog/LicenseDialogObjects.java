/*
 * GuiObjects.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2006 F. Gerbig
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 /*
 * Created on 2 februari 2008, 18:40
 */
package edu.wright.dirsyncpro.gui.licensedialog;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.tools.GuiTools;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Font;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class LicenseDialogObjects extends javax.swing.JDialog {

    protected javax.swing.JTextPane licenceTextArea;

    /**
     * Creates new form GuiObjects
     */
//    public GuiObjects() {
//       initComponents();
//    }
    protected javax.swing.JButton licenseCancelButton;
    protected javax.swing.JButton licenseOkButton;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LicenseLabel1;
    private javax.swing.JLabel LicenseLabel2;
    private javax.swing.JPanel settingsButtonsPanel;
    public LicenseDialogObjects(JFrame frame) {
        super(frame);
        GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        LicenseLabel1 = new javax.swing.JLabel();
        LicenseLabel2 = new javax.swing.JLabel();
        javax.swing.JScrollPane licenseScrollPane = new javax.swing.JScrollPane();
        licenceTextArea = new javax.swing.JTextPane();
        settingsButtonsPanel = new javax.swing.JPanel();
        licenseOkButton = new javax.swing.JButton();
        licenseCancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DirSync Pro License Agreement");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(606, 314));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        LicenseLabel1.setFont(new Font("Lucida Grande", Font.BOLD, 14)); // NOI18N
        LicenseLabel1.setText("Disclaimers and License");
        LicenseLabel1.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(LicenseLabel1, gridBagConstraints);

        LicenseLabel2.setText("<html>This message is showed only once upon starting this version of the program for the very first time.<br>Please read the the disclaimers and the license carefully!<br>By using DirSync Pro you confirm that you have read and accepted the disclaimers and the license terms.<html>");
        LicenseLabel2.setMinimumSize(null);
        LicenseLabel2.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(LicenseLabel2, gridBagConstraints);

        licenseScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        licenseScrollPane.setMinimumSize(new java.awt.Dimension(600, 200));

        licenceTextArea.setBorder(null);
        licenceTextArea.setEditable(false);
        licenceTextArea.setBorder(null);
        licenceTextArea.setFont(new java.awt.Font("Courier", 0, 12)); // NOI18N
        licenceTextArea.setMinimumSize(new java.awt.Dimension(600, 200));
        licenceTextArea.setPreferredSize(new java.awt.Dimension(600, 200));
        licenseScrollPane.setViewportView(licenceTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(licenseScrollPane, gridBagConstraints);

        settingsButtonsPanel.setLayout(new javax.swing.BoxLayout(settingsButtonsPanel, javax.swing.BoxLayout.LINE_AXIS));

        licenseOkButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        licenseOkButton.setText("I Accept");
        licenseOkButton.setAlignmentX(0.5F);
        licenseOkButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseOkButtonActionPerformed(evt);
            }
        });
        settingsButtonsPanel.add(licenseOkButton);

        licenseCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        licenseCancelButton.setText("I Don't Accept");
        licenseCancelButton.setAlignmentX(0.5F);
        licenseCancelButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseCancelButtoncancelActionPerformed(evt);
            }
        });
        settingsButtonsPanel.add(licenseCancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(settingsButtonsPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void licenseOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseOkButtonActionPerformed
        licenseAccepted();
        setVisible(false);
    }//GEN-LAST:event_licenseOkButtonActionPerformed

    private void licenseCancelButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseCancelButtoncancelActionPerformed
        licenseNotAccepted();
    }//GEN-LAST:event_licenseCancelButtoncancelActionPerformed
    // End of variables declaration//GEN-END:variables

    abstract protected void licenseAccepted();

    abstract protected void licenseNotAccepted();
}
