/*
 * MainFrameObjects.java
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
package edu.wright.dirsyncpro.gui.mainframe;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.gui.jobdialog.JobDialog;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobTree;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobsTreeCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobsTreeModel;
import edu.wright.dirsyncpro.gui.mainframe.jobtree.JobsTreeNodeEditor;
import edu.wright.dirsyncpro.gui.mainframe.messagetable.MessagesTableCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.messagetable.MessagesTableModel;
import edu.wright.dirsyncpro.gui.mainframe.scheduletable.ScheduleTableCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.scheduletable.ScheduleTableModel;
import edu.wright.dirsyncpro.gui.mainframe.syncqtable.SyncQTableCellRenderer;
import edu.wright.dirsyncpro.gui.mainframe.syncqtable.SyncQTableModel;
import edu.wright.dirsyncpro.tools.GuiTools;

import javax.swing.ImageIcon;

/**
 * The DirSyncPro Main GUI.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class MainFrameObjects extends javax.swing.JFrame {

    // Variables declaration - do not modify
    protected javax.swing.JButton analyzeButton;
    protected javax.swing.JMenuItem analyzeMenuItem;
    protected javax.swing.JMenuItem appendMenuItem;
    protected javax.swing.JMenuItem cmdMenuItem;
    protected javax.swing.JProgressBar currentProgress;
    protected javax.swing.JLabel jLabel;
    protected javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel13;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel15;
    protected javax.swing.JLabel jLabel21;
    protected javax.swing.JLabel jLabel22;
    protected javax.swing.JLabel jLabel23;
    protected javax.swing.JLabel jLabel25;
    protected javax.swing.JLabel jLabel34;
    protected javax.swing.JLabel jLabel35;
    protected javax.swing.JLabel jLabel46;
    protected javax.swing.JLabel jLabel70;
    protected javax.swing.JLabel jLabel71;
    protected javax.swing.JLabel jLabel72;
    protected javax.swing.JLabel jLabel73;
    protected javax.swing.JLabel jLabel77;
    protected javax.swing.JButton jobAddButton;
    protected javax.swing.JButton jobCollapseAllButton;
    protected javax.swing.JButton jobCopyButton;
    protected javax.swing.JButton jobDisableAllButton;
    protected javax.swing.JButton jobDownButton;
    protected javax.swing.JButton jobEditButton;
    protected javax.swing.JButton jobEnableAllButton;
    protected javax.swing.JButton jobExpandOneLevelButton;
    protected javax.swing.JButton jobRemoveButton;
    protected javax.swing.JButton jobUpButton;
    protected javax.swing.JTree jobsTree;
    protected javax.swing.JButton messagesCleanButton;
    protected javax.swing.JTable messagesTable;
    protected javax.swing.JScrollPane messagesTableScrollPane;
    protected javax.swing.JCheckBox messagesViewFilterErrorsCheckBox;
    protected javax.swing.JLabel messagesViewFilterErrorsLabel;
    protected javax.swing.JCheckBox messagesViewFilterFileOperationsCheckBox;
    protected javax.swing.JLabel messagesViewFilterFileOperationsLabel;
    protected javax.swing.JCheckBox messagesViewFilterInfosCheckBox;
    protected javax.swing.JLabel messagesViewFilterInfosLabel;
    protected javax.swing.JButton messagesViewFilterOKButton;
    protected javax.swing.JButton messagesViewFilterResetButton;
    protected javax.swing.JCheckBox messagesViewFilterWarningsCheckBox;
    protected javax.swing.JLabel messagesViewFilterWarningsLabel;
    protected javax.swing.JButton newButton;
    protected javax.swing.JMenuItem newMenuItem;
    protected javax.swing.JButton openButton;
    protected javax.swing.JMenuItem openMenuItem;
    protected javax.swing.JMenu openRecentMenu;
    protected javax.swing.JMenuItem optionsMenuItem;
    protected javax.swing.JToggleButton pauseButton;
    protected javax.swing.JButton saveAsButton;
    protected javax.swing.JMenuItem saveAsMenuItem;
    protected javax.swing.JButton saveButton;
    protected javax.swing.JMenuItem saveEnabledAsMenuItem;
    protected javax.swing.JMenuItem saveMenuItem;
    protected javax.swing.JLabel scheduleEngineStatusField;
    protected javax.swing.JButton scheduleStartButton;
    protected javax.swing.JButton scheduleStopButton;
    protected javax.swing.JTable scheduleTable;
    protected javax.swing.JButton shutDownButton;
    protected javax.swing.JMenuItem startScheduledTasksMenuItem;
    protected javax.swing.JMenuItem stopScheduledTasksMenuItem;
    protected javax.swing.JMenuItem swapSrcDstMenuItem;
    protected javax.swing.JLabel syncQBytesAllwaysFilesDirs;
    protected javax.swing.JLabel syncQBytesDeletedFilesDirs;
    protected javax.swing.JLabel syncQBytesFilesDirsToBeSynced;
    protected javax.swing.JLabel syncQBytesLargerAndModifiedFilesDirs;
    protected javax.swing.JLabel syncQBytesLargerFilesDirs;
    protected javax.swing.JLabel syncQBytesModifieldFilesDirs;
    protected javax.swing.JLabel syncQBytesNewFilesDirs;
    protected javax.swing.JLabel syncQNumberOfAllwaysDirs;
    protected javax.swing.JLabel syncQNumberOfAllwaysFiles;
    protected javax.swing.JLabel syncQNumberOfAllwaysFilesDirs;
    protected javax.swing.JLabel syncQNumberOfConflictFiles;
    protected javax.swing.JLabel syncQNumberOfConflictFilesDirs;
    protected javax.swing.JLabel syncQNumberOfDeletedDirs;
    protected javax.swing.JLabel syncQNumberOfDeletedFiles;
    protected javax.swing.JLabel syncQNumberOfDeletedFilesDirs;
    protected javax.swing.JLabel syncQNumberOfDirsToBeSynced;
    protected javax.swing.JLabel syncQNumberOfFilesDirsToBeSynced;
    protected javax.swing.JLabel syncQNumberOfFilesToBeSynced;
    protected javax.swing.JLabel syncQNumberOfLargerAndModifiedFiles;
    protected javax.swing.JLabel syncQNumberOfLargerAndModifiedFilesDirs;
    protected javax.swing.JLabel syncQNumberOfLargerFiles;
    protected javax.swing.JLabel syncQNumberOfLargerFilesDirs;
    protected javax.swing.JLabel syncQNumberOfModifieldDirs;
    protected javax.swing.JLabel syncQNumberOfModifieldFiles;
    protected javax.swing.JLabel syncQNumberOfModifieldFilesDirs;
    protected javax.swing.JLabel syncQNumberOfNewDirs;
    protected javax.swing.JLabel syncQNumberOfNewFiles;
    protected javax.swing.JLabel syncQNumberOfNewFilesDirs;
    protected javax.swing.JCheckBox syncQSyncFilterConflictFilesCheckBox;
    protected javax.swing.JLabel syncQSyncFilterConflictFilesLabel;
    protected javax.swing.JCheckBox syncQSyncFilterDeletedDirsCheckBox;
    protected javax.swing.JLabel syncQSyncFilterDeletedDirsLabel;
    protected javax.swing.JCheckBox syncQSyncFilterDeletedFilesCheckBox;
    protected javax.swing.JLabel syncQSyncFilterDeletedFilesLabel;
    protected javax.swing.JCheckBox syncQSyncFilterLargerAndModifiedFilesCheckBox;
    protected javax.swing.JLabel syncQSyncFilterLargerAndModifiedFilesLabel;
    protected javax.swing.JCheckBox syncQSyncFilterLargerFilesCheckBox;
    protected javax.swing.JLabel syncQSyncFilterLargerFilesLabel;
    protected javax.swing.JCheckBox syncQSyncFilterModifiedFilesCheckBox;
    protected javax.swing.JLabel syncQSyncFilterModifiedFilesLabel;
    protected javax.swing.JCheckBox syncQSyncFilterNewFilesCheckBox;
    protected javax.swing.JLabel syncQSyncFilterNewFilesLabel;
    protected javax.swing.JButton syncQSyncFilterOKButton;
    protected javax.swing.JButton syncQSyncFilterResetButton;
    protected javax.swing.JTable syncQTable;
    protected javax.swing.JLabel syncQTotalNumberOfAnalyzedDirs;
    protected javax.swing.JLabel syncQTotalNumberOfAnalyzedFiles;
    protected javax.swing.JLabel syncQTotalNumberOfFilesDirs;
    protected javax.swing.JCheckBox syncQViewFilterConflictFilesCheckBox;
    protected javax.swing.JLabel syncQViewFilterConflictFilesLabel;
    protected javax.swing.JCheckBox syncQViewFilterDeletedDirsCheckBox;
    protected javax.swing.JLabel syncQViewFilterDeletedDirsLabel;
    protected javax.swing.JCheckBox syncQViewFilterDeletedFilesCheckBox;
    protected javax.swing.JLabel syncQViewFilterDeletedFilesLabel;
    protected javax.swing.JCheckBox syncQViewFilterLargerAndModifiedFilesCheckBox;
    protected javax.swing.JLabel syncQViewFilterLargerAndModifiedFilesLabel;
    protected javax.swing.JCheckBox syncQViewFilterLargerFilesCheckBox;
    protected javax.swing.JLabel syncQViewFilterLargerFilesLabel;
    protected javax.swing.JCheckBox syncQViewFilterModifiedFilesCheckBox;
    protected javax.swing.JLabel syncQViewFilterModifiedFilesLabel;
    protected javax.swing.JCheckBox syncQViewFilterNewFilesCheckBox;
    protected javax.swing.JLabel syncQViewFilterNewFilesLabel;
    protected javax.swing.JButton syncQViewFilterOKButton;
    protected javax.swing.JButton syncQViewFilterResetButton;
    protected javax.swing.JButton synchronizeButton;
    protected javax.swing.JMenuItem synchronizeMenuItem;
    protected javax.swing.JTabbedPane tabbedPane;
    protected javax.swing.JProgressBar totalProgress;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem pauseMenuItem;
    private javax.swing.JPanel scheduleStatusJPanel;
    private javax.swing.JMenuItem shutDownMenuItem;
    private javax.swing.JPanel spacer3;
    private javax.swing.JPanel spacer6;
    private javax.swing.JPanel spacer7;
    private javax.swing.JButton stopButton;
    private javax.swing.JMenuItem stopMenuItem;
    private javax.swing.JPanel summaryJPanel;
    private javax.swing.JPanel syncJPanel;
    private javax.swing.JMenu toolsMenu;
    private javax.swing.JPanel viewJPanel;
    private javax.swing.JPanel viewJPanel1;
    private javax.swing.JPanel viewJPanel2;
    public MainFrameObjects() {
        super();
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

        javax.swing.JToolBar toolBar = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        saveAsButton = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        analyzeButton = new javax.swing.JButton();
        synchronizeButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JToggleButton();
        stopButton = new javax.swing.JButton();
        shutDownButton = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator3 = new javax.swing.JSeparator();
        scheduleStartButton = new javax.swing.JButton();
        scheduleStopButton = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator6 = new javax.swing.JSeparator();
        javax.swing.JButton aboutButton = new javax.swing.JButton();
        javax.swing.JButton contentsButton = new javax.swing.JButton();
        javax.swing.JButton donateButton = new javax.swing.JButton();
        javax.swing.JPanel mainPanel = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        javax.swing.JPanel jobsJPanel = new javax.swing.JPanel();
        viewJPanel2 = new javax.swing.JPanel();
        jobEnableAllButton = new javax.swing.JButton();
        jobDisableAllButton = new javax.swing.JButton();
        jobDownButton = new javax.swing.JButton();
        jobUpButton = new javax.swing.JButton();
        jobAddButton = new javax.swing.JButton();
        jobEditButton = new javax.swing.JButton();
        jobCopyButton = new javax.swing.JButton();
        jobRemoveButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jobExpandOneLevelButton = new javax.swing.JButton();
        jobCollapseAllButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jobsTree = new javax.swing.JTree();
        javax.swing.JPanel syncQPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        summaryJPanel = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        syncQNumberOfFilesToBeSynced = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        syncQNumberOfNewFiles = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        syncQNumberOfModifieldFiles = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        syncQNumberOfLargerFiles = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        syncQNumberOfLargerAndModifiedFiles = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        syncQNumberOfDeletedFiles = new javax.swing.JLabel();
        spacer6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        syncQNumberOfAllwaysFiles = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        syncQNumberOfDirsToBeSynced = new javax.swing.JLabel();
        syncQNumberOfAllwaysDirs = new javax.swing.JLabel();
        syncQNumberOfNewDirs = new javax.swing.JLabel();
        syncQNumberOfModifieldDirs = new javax.swing.JLabel();
        syncQNumberOfDeletedDirs = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        syncQTotalNumberOfFilesDirs = new javax.swing.JLabel();
        syncQNumberOfFilesDirsToBeSynced = new javax.swing.JLabel();
        syncQNumberOfAllwaysFilesDirs = new javax.swing.JLabel();
        syncQNumberOfNewFilesDirs = new javax.swing.JLabel();
        syncQNumberOfModifieldFilesDirs = new javax.swing.JLabel();
        syncQNumberOfLargerFilesDirs = new javax.swing.JLabel();
        syncQNumberOfLargerAndModifiedFilesDirs = new javax.swing.JLabel();
        syncQNumberOfDeletedFilesDirs = new javax.swing.JLabel();
        syncQTotalNumberOfAnalyzedFiles = new javax.swing.JLabel();
        syncQTotalNumberOfAnalyzedDirs = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        syncQNumberOfConflictFiles = new javax.swing.JLabel();
        syncQNumberOfConflictFilesDirs = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        syncQBytesFilesDirsToBeSynced = new javax.swing.JLabel();
        syncQBytesAllwaysFilesDirs = new javax.swing.JLabel();
        syncQBytesNewFilesDirs = new javax.swing.JLabel();
        syncQBytesModifieldFilesDirs = new javax.swing.JLabel();
        syncQBytesLargerFilesDirs = new javax.swing.JLabel();
        syncQBytesLargerAndModifiedFilesDirs = new javax.swing.JLabel();
        syncQBytesDeletedFilesDirs = new javax.swing.JLabel();
        viewJPanel = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        syncQViewFilterNewFilesCheckBox = new javax.swing.JCheckBox();
        syncQViewFilterNewFilesLabel = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        syncQViewFilterLargerFilesCheckBox = new javax.swing.JCheckBox();
        syncQViewFilterLargerFilesLabel = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        syncQViewFilterDeletedFilesCheckBox = new javax.swing.JCheckBox();
        syncQViewFilterDeletedFilesLabel = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        syncQViewFilterModifiedFilesCheckBox = new javax.swing.JCheckBox();
        syncQViewFilterModifiedFilesLabel = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        syncQViewFilterLargerAndModifiedFilesCheckBox = new javax.swing.JCheckBox();
        syncQViewFilterLargerAndModifiedFilesLabel = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        syncQViewFilterDeletedDirsCheckBox = new javax.swing.JCheckBox();
        syncQViewFilterDeletedDirsLabel = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        syncQViewFilterConflictFilesCheckBox = new javax.swing.JCheckBox();
        syncQViewFilterConflictFilesLabel = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        syncQViewFilterResetButton = new javax.swing.JButton();
        syncQViewFilterOKButton = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        syncJPanel = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        syncQSyncFilterNewFilesCheckBox = new javax.swing.JCheckBox();
        syncQSyncFilterNewFilesLabel = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        syncQSyncFilterLargerFilesCheckBox = new javax.swing.JCheckBox();
        syncQSyncFilterLargerFilesLabel = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        syncQSyncFilterDeletedFilesCheckBox = new javax.swing.JCheckBox();
        syncQSyncFilterDeletedFilesLabel = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        syncQSyncFilterModifiedFilesCheckBox = new javax.swing.JCheckBox();
        syncQSyncFilterModifiedFilesLabel = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        syncQSyncFilterLargerAndModifiedFilesCheckBox = new javax.swing.JCheckBox();
        syncQSyncFilterLargerAndModifiedFilesLabel = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        syncQSyncFilterDeletedDirsCheckBox = new javax.swing.JCheckBox();
        syncQSyncFilterDeletedDirsLabel = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        syncQSyncFilterConflictFilesCheckBox = new javax.swing.JCheckBox();
        syncQSyncFilterConflictFilesLabel = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        syncQSyncFilterResetButton = new javax.swing.JButton();
        syncQSyncFilterOKButton = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        syncQTable = new javax.swing.JTable();
        javax.swing.JPanel scheduleQJPanel = new javax.swing.JPanel();
        scheduleStatusJPanel = new javax.swing.JPanel();
        scheduleEngineStatusField = new javax.swing.JLabel();
        spacer3 = new javax.swing.JPanel();
        spacer7 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        javax.swing.JPanel messagesQJPanel = new javax.swing.JPanel();
        viewJPanel1 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        messagesViewFilterInfosCheckBox = new javax.swing.JCheckBox();
        messagesViewFilterInfosLabel = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        messagesViewFilterErrorsCheckBox = new javax.swing.JCheckBox();
        messagesViewFilterErrorsLabel = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        messagesViewFilterWarningsCheckBox = new javax.swing.JCheckBox();
        messagesViewFilterWarningsLabel = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        messagesViewFilterFileOperationsCheckBox = new javax.swing.JCheckBox();
        messagesViewFilterFileOperationsLabel = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        messagesViewFilterResetButton = new javax.swing.JButton();
        messagesViewFilterOKButton = new javax.swing.JButton();
        messagesCleanButton = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        messagesTableScrollPane = new javax.swing.JScrollPane();
        messagesTable = new javax.swing.JTable();
        javax.swing.JPanel progressPanel = new javax.swing.JPanel();
        javax.swing.JLabel currentProgressLabel = new javax.swing.JLabel();
        currentProgress = new javax.swing.JProgressBar();
        javax.swing.JLabel totalProgressLabel = new javax.swing.JLabel();
        totalProgress = new javax.swing.JProgressBar();
        javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        openRecentMenu = new javax.swing.JMenu();
        appendMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        saveEnabledAsMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        javax.swing.JMenuItem quitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu runMenu = new javax.swing.JMenu();
        analyzeMenuItem = new javax.swing.JMenuItem();
        synchronizeMenuItem = new javax.swing.JMenuItem();
        pauseMenuItem = new javax.swing.JMenuItem();
        stopMenuItem = new javax.swing.JMenuItem();
        shutDownMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        startScheduledTasksMenuItem = new javax.swing.JMenuItem();
        stopScheduledTasksMenuItem = new javax.swing.JMenuItem();
        toolsMenu = new javax.swing.JMenu();
        swapSrcDstMenuItem = new javax.swing.JMenuItem();
        cmdMenuItem = new javax.swing.JMenuItem();
        optionsMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem contentsMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem donateMenuItem = new javax.swing.JMenuItem();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JMenuItem updateMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DirSync Pro");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        setMinimumSize(new java.awt.Dimension(600, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            @Override
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        toolBar.setFloatable(false);

        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonFileNew.png"))); // NOI18N
        newButton.setToolTipText("New Job set");
        newButton.setBorderPainted(false);
        newButton.setMaximumSize(new java.awt.Dimension(30, 30));
        newButton.setMinimumSize(new java.awt.Dimension(30, 30));
        newButton.setOpaque(false);
        newButton.setPreferredSize(new java.awt.Dimension(30, 30));
        newButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonnewConfigActionPerformed(evt);
            }
        });
        toolBar.add(newButton);

        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonFileOpen.png"))); // NOI18N
        openButton.setToolTipText("Open Job set");
        openButton.setBorderPainted(false);
        openButton.setMaximumSize(new java.awt.Dimension(30, 30));
        openButton.setMinimumSize(new java.awt.Dimension(30, 30));
        openButton.setOpaque(false);
        openButton.setPreferredSize(new java.awt.Dimension(30, 30));
        openButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonopenConfigActionPerformed(evt);
            }
        });
        toolBar.add(openButton);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonFileSave.png"))); // NOI18N
        saveButton.setToolTipText("Save Job set");
        saveButton.setBorderPainted(false);
        saveButton.setMaximumSize(new java.awt.Dimension(30, 30));
        saveButton.setMinimumSize(new java.awt.Dimension(30, 30));
        saveButton.setOpaque(false);
        saveButton.setPreferredSize(new java.awt.Dimension(30, 30));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonsaveConfigActionPerformed(evt);
            }
        });
        toolBar.add(saveButton);

        saveAsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonFileSaveAs.png"))); // NOI18N
        saveAsButton.setToolTipText("Save Job set As");
        saveAsButton.setBorderPainted(false);
        saveAsButton.setFocusable(false);
        saveAsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveAsButton.setMaximumSize(new java.awt.Dimension(30, 30));
        saveAsButton.setMinimumSize(new java.awt.Dimension(30, 30));
        saveAsButton.setOpaque(false);
        saveAsButton.setPreferredSize(new java.awt.Dimension(30, 30));
        saveAsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveAsButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsButtonsaveConfigActionPerformed(evt);
            }
        });
        toolBar.add(saveAsButton);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMaximumSize(new java.awt.Dimension(16, 16));
        toolBar.add(jSeparator2);

        analyzeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonPreview.png"))); // NOI18N
        analyzeButton.setToolTipText("Analyze");
        analyzeButton.setBorderPainted(false);
        analyzeButton.setMaximumSize(new java.awt.Dimension(30, 30));
        analyzeButton.setMinimumSize(new java.awt.Dimension(30, 30));
        analyzeButton.setOpaque(false);
        analyzeButton.setPreferredSize(new java.awt.Dimension(30, 30));
        analyzeButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeButtonpreviewStartActionPerformed(evt);
            }
        });
        toolBar.add(analyzeButton);

        synchronizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonStart.png"))); // NOI18N
        synchronizeButton.setToolTipText("Synchronize");
        synchronizeButton.setBorderPainted(false);
        synchronizeButton.setMaximumSize(new java.awt.Dimension(30, 30));
        synchronizeButton.setMinimumSize(new java.awt.Dimension(30, 30));
        synchronizeButton.setOpaque(false);
        synchronizeButton.setPreferredSize(new java.awt.Dimension(30, 30));
        synchronizeButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                synchronizeButtonsynchronizationStartActionPerformed(evt);
            }
        });
        toolBar.add(synchronizeButton);

        pauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonPause.png"))); // NOI18N
        pauseButton.setToolTipText("Pause");
        pauseButton.setBorderPainted(false);
        pauseButton.setMaximumSize(new java.awt.Dimension(30, 30));
        pauseButton.setMinimumSize(new java.awt.Dimension(30, 30));
        pauseButton.setPreferredSize(new java.awt.Dimension(30, 30));
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonsynchronizationPauseActionPerformed(evt);
            }
        });
        toolBar.add(pauseButton);

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonStop.png"))); // NOI18N
        stopButton.setToolTipText("Stop");
        stopButton.setBorderPainted(false);
        stopButton.setMaximumSize(new java.awt.Dimension(30, 30));
        stopButton.setMinimumSize(new java.awt.Dimension(30, 30));
        stopButton.setOpaque(false);
        stopButton.setPreferredSize(new java.awt.Dimension(30, 30));
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonsynchronizationStopActionPerformed(evt);
            }
        });
        toolBar.add(stopButton);

        shutDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonExit.png"))); // NOI18N
        shutDownButton.setToolTipText("Shut down the system after the sync.");
        shutDownButton.setBorderPainted(false);
        shutDownButton.setFocusable(false);
        shutDownButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shutDownButton.setMaximumSize(new java.awt.Dimension(30, 30));
        shutDownButton.setMinimumSize(new java.awt.Dimension(30, 30));
        shutDownButton.setOpaque(false);
        shutDownButton.setPreferredSize(new java.awt.Dimension(30, 30));
        shutDownButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        shutDownButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutDownButtonsynchronizationStopActionPerformed(evt);
            }
        });
        toolBar.add(shutDownButton);

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setMaximumSize(new java.awt.Dimension(16, 16));
        toolBar.add(jSeparator3);

        scheduleStartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonStartSchedule.png"))); // NOI18N
        scheduleStartButton.setToolTipText("Start Schedule Engine");
        scheduleStartButton.setBorderPainted(false);
        scheduleStartButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scheduleStartButton.setMaximumSize(new java.awt.Dimension(30, 30));
        scheduleStartButton.setMinimumSize(new java.awt.Dimension(30, 30));
        scheduleStartButton.setOpaque(false);
        scheduleStartButton.setPreferredSize(new java.awt.Dimension(30, 30));
        scheduleStartButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        scheduleStartButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleStartButtonsynchronizationStartActionPerformed(evt);
            }
        });
        toolBar.add(scheduleStartButton);

        scheduleStopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonStopSchedule.png"))); // NOI18N
        scheduleStopButton.setToolTipText("Stop Schedule Engine");
        scheduleStopButton.setBorderPainted(false);
        scheduleStopButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scheduleStopButton.setMaximumSize(new java.awt.Dimension(30, 30));
        scheduleStopButton.setMinimumSize(new java.awt.Dimension(30, 30));
        scheduleStopButton.setOpaque(false);
        scheduleStopButton.setPreferredSize(new java.awt.Dimension(30, 30));
        scheduleStopButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        scheduleStopButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleStopButtonsynchronizationStartActionPerformed(evt);
            }
        });
        toolBar.add(scheduleStopButton);

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setMaximumSize(new java.awt.Dimension(16, 16));
        toolBar.add(jSeparator6);

        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonAbout.png"))); // NOI18N
        aboutButton.setToolTipText("About");
        aboutButton.setBorderPainted(false);
        aboutButton.setMaximumSize(new java.awt.Dimension(30, 30));
        aboutButton.setMinimumSize(new java.awt.Dimension(30, 30));
        aboutButton.setOpaque(false);
        aboutButton.setPreferredSize(new java.awt.Dimension(30, 30));
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonaboutActionPerformed(evt);
            }
        });
        toolBar.add(aboutButton);

        contentsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buttonContents.png"))); // NOI18N
        contentsButton.setToolTipText("Help contents");
        contentsButton.setBorderPainted(false);
        contentsButton.setMaximumSize(new java.awt.Dimension(30, 30));
        contentsButton.setMinimumSize(new java.awt.Dimension(30, 30));
        contentsButton.setOpaque(false);
        contentsButton.setPreferredSize(new java.awt.Dimension(30, 30));
        contentsButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsButtoncontentsActionPerformed(evt);
            }
        });
        toolBar.add(contentsButton);

        donateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/donate22x22.png"))); // NOI18N
        donateButton.setToolTipText("<html>If this program is good for your purpose please consider a donation, <br />any amount you would like, as a gesture to encourage us developing this program.<br />Click this button to go to the SourceForge donation page.<br /><br />Thank you!</html>");
        donateButton.setBorderPainted(false);
        donateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        donateButton.setMaximumSize(new java.awt.Dimension(30, 30));
        donateButton.setMinimumSize(new java.awt.Dimension(30, 30));
        donateButton.setOpaque(false);
        donateButton.setPreferredSize(new java.awt.Dimension(30, 30));
        donateButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        donateButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateButtoncontentsActionPerformed(evt);
            }
        });
        toolBar.add(donateButton);

        getContentPane().add(toolBar, java.awt.BorderLayout.NORTH);

        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jobsJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jobsJPanel.setLayout(new java.awt.GridBagLayout());

        viewJPanel2.setMinimumSize(new java.awt.Dimension(100, 29));
        viewJPanel2.setLayout(new java.awt.GridBagLayout());

        jobEnableAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobEnableAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/checkbox_checked.png"))); // NOI18N
        jobEnableAllButton.setText("all");
        jobEnableAllButton.setToolTipText("Enables all Jobs.");
        jobEnableAllButton.setActionCommand("Enable all");
        jobEnableAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobEnableAllButton.setMaximumSize(null);
        jobEnableAllButton.setMinimumSize(null);
        jobEnableAllButton.setPreferredSize(null);
        jobEnableAllButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobEnableAllButtonenableAllDirsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel2.add(jobEnableAllButton, gridBagConstraints);

        jobDisableAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobDisableAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/checkbox_unchecked.png"))); // NOI18N
        jobDisableAllButton.setText("none");
        jobDisableAllButton.setToolTipText("Disables all Jobs.");
        jobDisableAllButton.setActionCommand("Disable all");
        jobDisableAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobDisableAllButton.setMaximumSize(null);
        jobDisableAllButton.setMinimumSize(null);
        jobDisableAllButton.setPreferredSize(null);
        jobDisableAllButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobDisableAllButtondisableAllDirsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobDisableAllButton, gridBagConstraints);

        jobDownButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirDown.png"))); // NOI18N
        jobDownButton.setText("Down");
        jobDownButton.setToolTipText("Move the selected Job down.");
        jobDownButton.setIconTextGap(2);
        jobDownButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobDownButton.setMaximumSize(null);
        jobDownButton.setMinimumSize(null);
        jobDownButton.setPreferredSize(null);
        jobDownButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobDownButtonlistDownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 8);
        viewJPanel2.add(jobDownButton, gridBagConstraints);

        jobUpButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirUp.png"))); // NOI18N
        jobUpButton.setText("Up");
        jobUpButton.setToolTipText("Move the selected Job up.");
        jobUpButton.setIconTextGap(2);
        jobUpButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobUpButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobUpButtonlistUpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel2.add(jobUpButton, gridBagConstraints);

        jobAddButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirNew.png"))); // NOI18N
        jobAddButton.setText("New");
        jobAddButton.setToolTipText("Add a new Job.");
        jobAddButton.setIconTextGap(2);
        jobAddButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobAddButton.setMaximumSize(null);
        jobAddButton.setMinimumSize(null);
        jobAddButton.setPreferredSize(null);
        jobAddButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobAddButtonlistAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobAddButton, gridBagConstraints);

        jobEditButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        jobEditButton.setText("Edit");
        jobEditButton.setToolTipText("Edit the selected Job");
        jobEditButton.setIconTextGap(2);
        jobEditButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobEditButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobEditButtonlistAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobEditButton, gridBagConstraints);

        jobCopyButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobCopyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirCopy.png"))); // NOI18N
        jobCopyButton.setText("Copy");
        jobCopyButton.setToolTipText("Duplicate the selected Job.");
        jobCopyButton.setIconTextGap(2);
        jobCopyButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobCopyButton.setMaximumSize(null);
        jobCopyButton.setMinimumSize(null);
        jobCopyButton.setPreferredSize(null);
        jobCopyButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobCopyButtonlistCopyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobCopyButton, gridBagConstraints);

        jobRemoveButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobRemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dirRemove.png"))); // NOI18N
        jobRemoveButton.setText("Remove");
        jobRemoveButton.setToolTipText("Remove the selected Job.");
        jobRemoveButton.setIconTextGap(2);
        jobRemoveButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobRemoveButton.setMaximumSize(null);
        jobRemoveButton.setMinimumSize(null);
        jobRemoveButton.setPreferredSize(null);
        jobRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobRemoveButtonlistRemoveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jobRemoveButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        viewJPanel2.add(jPanel1, gridBagConstraints);

        jobExpandOneLevelButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobExpandOneLevelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expandAll.png"))); // NOI18N
        jobExpandOneLevelButton.setText("Expand");
        jobExpandOneLevelButton.setToolTipText("Expand all Jobs in the job tree.");
        jobExpandOneLevelButton.setActionCommand("Enable all");
        jobExpandOneLevelButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobExpandOneLevelButton.setMaximumSize(null);
        jobExpandOneLevelButton.setMinimumSize(null);
        jobExpandOneLevelButton.setPreferredSize(null);
        jobExpandOneLevelButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobExpandOneLevelButtonenableAllDirsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 0);
        viewJPanel2.add(jobExpandOneLevelButton, gridBagConstraints);

        jobCollapseAllButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jobCollapseAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/collapseAll.png"))); // NOI18N
        jobCollapseAllButton.setText("Collapse");
        jobCollapseAllButton.setToolTipText("Collapse all Jobs in the job tree.");
        jobCollapseAllButton.setActionCommand("Disable all");
        jobCollapseAllButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jobCollapseAllButton.setMaximumSize(null);
        jobCollapseAllButton.setMinimumSize(null);
        jobCollapseAllButton.setPreferredSize(null);
        jobCollapseAllButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobCollapseAllButtondisableAllDirsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 8);
        viewJPanel2.add(jobCollapseAllButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jobsJPanel.add(viewJPanel2, gridBagConstraints);

        jobsTree.setModel(new JobsTreeModel(getJobTree()));
        jobsTree.setCellEditor(new JobsTreeNodeEditor(jobsTree));
        jobsTree.setCellRenderer(new JobsTreeCellRenderer());
        jobsTree.setEditable(true);
        jobsTree.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobsTreeMouseClicked(evt);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jobsTreeMousePressed(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jobsTreeMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jobsTree);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jobsJPanel.add(jScrollPane5, gridBagConstraints);

        tabbedPane.addTab("Jobs", jobsJPanel);

        syncQPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        syncQPanel.setLayout(new java.awt.GridBagLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        summaryJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel.setText("New");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel, gridBagConstraints);

        jLabel11.setText("Analyzed");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel11, gridBagConstraints);

        syncQNumberOfFilesToBeSynced.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfFilesToBeSynced, gridBagConstraints);

        jLabel22.setText("Syncing");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel22, gridBagConstraints);

        syncQNumberOfNewFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfNewFiles, gridBagConstraints);

        jLabel15.setText("Modified");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel15, gridBagConstraints);

        syncQNumberOfModifieldFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfModifieldFiles, gridBagConstraints);

        jLabel21.setText(" Larger");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel21, gridBagConstraints);

        syncQNumberOfLargerFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerFiles, gridBagConstraints);

        jLabel14.setText("Larger&Modified");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel14, gridBagConstraints);

        syncQNumberOfLargerAndModifiedFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerAndModifiedFiles, gridBagConstraints);

        jLabel23.setText("To be deleted");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel23, gridBagConstraints);

        syncQNumberOfDeletedFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDeletedFiles, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        summaryJPanel.add(spacer6, gridBagConstraints);

        jLabel13.setText("Files:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel13, gridBagConstraints);

        jLabel25.setText("Forced");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel25, gridBagConstraints);

        syncQNumberOfAllwaysFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfAllwaysFiles, gridBagConstraints);

        jLabel70.setText("Dirs:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel70, gridBagConstraints);

        syncQNumberOfDirsToBeSynced.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDirsToBeSynced, gridBagConstraints);

        syncQNumberOfAllwaysDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfAllwaysDirs, gridBagConstraints);

        syncQNumberOfNewDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfNewDirs, gridBagConstraints);

        syncQNumberOfModifieldDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfModifieldDirs, gridBagConstraints);

        syncQNumberOfDeletedDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDeletedDirs, gridBagConstraints);

        jLabel71.setText("<html><b>Total:</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel71, gridBagConstraints);

        syncQTotalNumberOfFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQTotalNumberOfFilesDirs, gridBagConstraints);

        syncQNumberOfFilesDirsToBeSynced.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfFilesDirsToBeSynced, gridBagConstraints);

        syncQNumberOfAllwaysFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfAllwaysFilesDirs, gridBagConstraints);

        syncQNumberOfNewFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfNewFilesDirs, gridBagConstraints);

        syncQNumberOfModifieldFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfModifieldFilesDirs, gridBagConstraints);

        syncQNumberOfLargerFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerFilesDirs, gridBagConstraints);

        syncQNumberOfLargerAndModifiedFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfLargerAndModifiedFilesDirs, gridBagConstraints);

        syncQNumberOfDeletedFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfDeletedFilesDirs, gridBagConstraints);

        syncQTotalNumberOfAnalyzedFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQTotalNumberOfAnalyzedFiles, gridBagConstraints);

        syncQTotalNumberOfAnalyzedDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQTotalNumberOfAnalyzedDirs, gridBagConstraints);

        jLabel72.setText("Conflicts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel72, gridBagConstraints);

        syncQNumberOfConflictFiles.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfConflictFiles, gridBagConstraints);

        syncQNumberOfConflictFilesDirs.setText("<html><b>0</b></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQNumberOfConflictFilesDirs, gridBagConstraints);

        jLabel73.setText("Bytes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(jLabel73, gridBagConstraints);

        syncQBytesFilesDirsToBeSynced.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesFilesDirsToBeSynced, gridBagConstraints);

        syncQBytesAllwaysFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesAllwaysFilesDirs, gridBagConstraints);

        syncQBytesNewFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesNewFilesDirs, gridBagConstraints);

        syncQBytesModifieldFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesModifieldFilesDirs, gridBagConstraints);

        syncQBytesLargerFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesLargerFilesDirs, gridBagConstraints);

        syncQBytesLargerAndModifiedFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesLargerAndModifiedFilesDirs, gridBagConstraints);

        syncQBytesDeletedFilesDirs.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        summaryJPanel.add(syncQBytesDeletedFilesDirs, gridBagConstraints);

        jTabbedPane1.addTab("Summary", summaryJPanel);

        viewJPanel.setLayout(new java.awt.GridBagLayout());

        jPanel58.setLayout(new java.awt.GridBagLayout());

        jPanel53.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterNewFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        jPanel53.add(syncQViewFilterNewFilesCheckBox);

        syncQViewFilterNewFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyNew.png"))); // NOI18N
        syncQViewFilterNewFilesLabel.setText("New files/dirs");
        jPanel53.add(syncQViewFilterNewFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel53, gridBagConstraints);

        jPanel55.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterLargerFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterLargerFilesCheckBox.setMaximumSize(null);
        syncQViewFilterLargerFilesCheckBox.setMinimumSize(null);
        syncQViewFilterLargerFilesCheckBox.setPreferredSize(null);
        jPanel55.add(syncQViewFilterLargerFilesCheckBox);

        syncQViewFilterLargerFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        syncQViewFilterLargerFilesLabel.setText("Larger files");
        jPanel55.add(syncQViewFilterLargerFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel55, gridBagConstraints);

        jPanel57.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterDeletedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterDeletedFilesCheckBox.setMaximumSize(null);
        syncQViewFilterDeletedFilesCheckBox.setMinimumSize(null);
        syncQViewFilterDeletedFilesCheckBox.setPreferredSize(null);
        jPanel57.add(syncQViewFilterDeletedFilesCheckBox);

        syncQViewFilterDeletedFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        syncQViewFilterDeletedFilesLabel.setText("Files to be deleted");
        jPanel57.add(syncQViewFilterDeletedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel57, gridBagConstraints);

        jPanel54.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterModifiedFilesCheckBox.setMaximumSize(null);
        syncQViewFilterModifiedFilesCheckBox.setMinimumSize(null);
        syncQViewFilterModifiedFilesCheckBox.setPreferredSize(null);
        jPanel54.add(syncQViewFilterModifiedFilesCheckBox);

        syncQViewFilterModifiedFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        syncQViewFilterModifiedFilesLabel.setText("Modified files");
        jPanel54.add(syncQViewFilterModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel54, gridBagConstraints);

        jPanel56.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterLargerAndModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterLargerAndModifiedFilesCheckBox.setMaximumSize(null);
        syncQViewFilterLargerAndModifiedFilesCheckBox.setMinimumSize(null);
        syncQViewFilterLargerAndModifiedFilesCheckBox.setPreferredSize(null);
        jPanel56.add(syncQViewFilterLargerAndModifiedFilesCheckBox);

        syncQViewFilterLargerAndModifiedFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLargerModified.png"))); // NOI18N
        syncQViewFilterLargerAndModifiedFilesLabel.setText("Larger & Modified files");
        jPanel56.add(syncQViewFilterLargerAndModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel56, gridBagConstraints);

        jPanel71.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterDeletedDirsCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterDeletedDirsCheckBox.setMaximumSize(null);
        syncQViewFilterDeletedDirsCheckBox.setMinimumSize(null);
        syncQViewFilterDeletedDirsCheckBox.setPreferredSize(null);
        jPanel71.add(syncQViewFilterDeletedDirsCheckBox);

        syncQViewFilterDeletedDirsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        syncQViewFilterDeletedDirsLabel.setText("Dirs to be deleted");
        jPanel71.add(syncQViewFilterDeletedDirsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel71, gridBagConstraints);

        jPanel68.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQViewFilterConflictFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQViewFilterConflictFilesCheckBox.setMaximumSize(null);
        syncQViewFilterConflictFilesCheckBox.setMinimumSize(null);
        syncQViewFilterConflictFilesCheckBox.setPreferredSize(null);
        jPanel68.add(syncQViewFilterConflictFilesCheckBox);

        syncQViewFilterConflictFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/conflict_icon.png"))); // NOI18N
        syncQViewFilterConflictFilesLabel.setText("Conflicts");
        jPanel68.add(syncQViewFilterConflictFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel58.add(jPanel68, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        viewJPanel.add(jPanel58, gridBagConstraints);

        jPanel50.setLayout(new javax.swing.BoxLayout(jPanel50, javax.swing.BoxLayout.LINE_AXIS));

        syncQViewFilterResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        syncQViewFilterResetButton.setText("Reset");
        syncQViewFilterResetButton.setToolTipText("Reset the default options to their defaults.");
        syncQViewFilterResetButton.setAlignmentX(0.5F);
        syncQViewFilterResetButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQViewFilterResetButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncQViewFilterResetButtonActionPerformed(evt);
            }
        });
        jPanel50.add(syncQViewFilterResetButton);

        syncQViewFilterOKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        syncQViewFilterOKButton.setText("OK");
        syncQViewFilterOKButton.setToolTipText("Reset the default options to their defaults.");
        syncQViewFilterOKButton.setAlignmentX(0.5F);
        syncQViewFilterOKButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQViewFilterOKButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncQViewFilterOKButtonActionPerformed(evt);
            }
        });
        jPanel50.add(syncQViewFilterOKButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        viewJPanel.add(jPanel50, gridBagConstraints);

        jLabel34.setText("Show these files/dirs in the sync queue (does not affect synchronization queue):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        viewJPanel.add(jLabel34, gridBagConstraints);

        jTabbedPane1.addTab("View", viewJPanel);

        syncJPanel.setLayout(new java.awt.GridBagLayout());

        jPanel59.setLayout(new java.awt.GridBagLayout());

        jPanel60.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterNewFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        jPanel60.add(syncQSyncFilterNewFilesCheckBox);

        syncQSyncFilterNewFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyNew.png"))); // NOI18N
        syncQSyncFilterNewFilesLabel.setText("New files/dirs");
        jPanel60.add(syncQSyncFilterNewFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel60, gridBagConstraints);

        jPanel61.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterLargerFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterLargerFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterLargerFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterLargerFilesCheckBox.setPreferredSize(null);
        jPanel61.add(syncQSyncFilterLargerFilesCheckBox);

        syncQSyncFilterLargerFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLarger.png"))); // NOI18N
        syncQSyncFilterLargerFilesLabel.setText("Larger files");
        jPanel61.add(syncQSyncFilterLargerFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel61, gridBagConstraints);

        jPanel64.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterDeletedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterDeletedFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterDeletedFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterDeletedFilesCheckBox.setPreferredSize(null);
        jPanel64.add(syncQSyncFilterDeletedFilesCheckBox);

        syncQSyncFilterDeletedFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteFile.png"))); // NOI18N
        syncQSyncFilterDeletedFilesLabel.setText("Files to be deleted");
        jPanel64.add(syncQSyncFilterDeletedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel64, gridBagConstraints);

        jPanel62.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterModifiedFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterModifiedFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterModifiedFilesCheckBox.setPreferredSize(null);
        jPanel62.add(syncQSyncFilterModifiedFilesCheckBox);

        syncQSyncFilterModifiedFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyModified.png"))); // NOI18N
        syncQSyncFilterModifiedFilesLabel.setText("Modified files");
        jPanel62.add(syncQSyncFilterModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel62, gridBagConstraints);

        jPanel63.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterLargerAndModifiedFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterLargerAndModifiedFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterLargerAndModifiedFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterLargerAndModifiedFilesCheckBox.setPreferredSize(null);
        jPanel63.add(syncQSyncFilterLargerAndModifiedFilesCheckBox);

        syncQSyncFilterLargerAndModifiedFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLargerModified.png"))); // NOI18N
        syncQSyncFilterLargerAndModifiedFilesLabel.setText("Larger & Modified files");
        jPanel63.add(syncQSyncFilterLargerAndModifiedFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel63, gridBagConstraints);

        jPanel72.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterDeletedDirsCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterDeletedDirsCheckBox.setMaximumSize(null);
        syncQSyncFilterDeletedDirsCheckBox.setMinimumSize(null);
        syncQSyncFilterDeletedDirsCheckBox.setPreferredSize(null);
        jPanel72.add(syncQSyncFilterDeletedDirsCheckBox);

        syncQSyncFilterDeletedDirsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteDir.png"))); // NOI18N
        syncQSyncFilterDeletedDirsLabel.setText("Dirs to be deleted");
        jPanel72.add(syncQSyncFilterDeletedDirsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel72, gridBagConstraints);

        jPanel73.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        syncQSyncFilterConflictFilesCheckBox.setToolTipText("Synchronize all files and dirs.");
        syncQSyncFilterConflictFilesCheckBox.setMaximumSize(null);
        syncQSyncFilterConflictFilesCheckBox.setMinimumSize(null);
        syncQSyncFilterConflictFilesCheckBox.setPreferredSize(null);
        jPanel73.add(syncQSyncFilterConflictFilesCheckBox);

        syncQSyncFilterConflictFilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/conflict_icon.png"))); // NOI18N
        syncQSyncFilterConflictFilesLabel.setText("Conflicts");
        jPanel73.add(syncQSyncFilterConflictFilesLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel59.add(jPanel73, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        syncJPanel.add(jPanel59, gridBagConstraints);

        jPanel52.setLayout(new javax.swing.BoxLayout(jPanel52, javax.swing.BoxLayout.LINE_AXIS));

        syncQSyncFilterResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        syncQSyncFilterResetButton.setText("Reset");
        syncQSyncFilterResetButton.setToolTipText("Reset the default options to their defaults.");
        syncQSyncFilterResetButton.setAlignmentX(0.5F);
        syncQSyncFilterResetButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQSyncFilterResetButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncQSyncFilterResetButtonActionPerformed(evt);
            }
        });
        jPanel52.add(syncQSyncFilterResetButton);

        syncQSyncFilterOKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        syncQSyncFilterOKButton.setText("OK");
        syncQSyncFilterOKButton.setToolTipText("Reset the default options to their defaults.");
        syncQSyncFilterOKButton.setAlignmentX(0.5F);
        syncQSyncFilterOKButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        syncQSyncFilterOKButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncQSyncFilterOKButtonActionPerformed(evt);
            }
        });
        jPanel52.add(syncQSyncFilterOKButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        syncJPanel.add(jPanel52, gridBagConstraints);

        jLabel35.setText("If exist, keep these files in the sync queue (affects the synchronization queue):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        syncJPanel.add(jLabel35, gridBagConstraints);

        jTabbedPane1.addTab("Filter", syncJPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        syncQPanel.add(jTabbedPane1, gridBagConstraints);

        syncQTable.setModel(new SyncQTableModel());
        syncQTable.setDefaultRenderer(String.class, new SyncQTableCellRenderer());
        syncQTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        syncQTable.setIntercellSpacing(new java.awt.Dimension(3, 1));
        syncQTable.getTableHeader().setReorderingAllowed(false);
        syncQTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                syncQTableMouseClicked(evt);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                syncQTableMousePressed(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                syncQTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(syncQTable);
        syncQTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (syncQTable.getColumnModel().getColumnCount() > 0) {
            syncQTable.getColumnModel().getColumn(0).setMinWidth(100);
            syncQTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            syncQTable.getColumnModel().getColumn(1).setResizable(false);
            syncQTable.getColumnModel().getColumn(1).setMinWidth(80);
            syncQTable.getColumnModel().getColumn(1).setPreferredWidth(80);
            syncQTable.getColumnModel().getColumn(1).setMaxWidth(80);
            syncQTable.getColumnModel().getColumn(2).setResizable(false);
            syncQTable.getColumnModel().getColumn(2).setMinWidth(50);
            syncQTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            syncQTable.getColumnModel().getColumn(2).setMaxWidth(50);
            syncQTable.getColumnModel().getColumn(3).setResizable(false);
            syncQTable.getColumnModel().getColumn(3).setMinWidth(55);
            syncQTable.getColumnModel().getColumn(3).setPreferredWidth(55);
            syncQTable.getColumnModel().getColumn(3).setMaxWidth(55);
            syncQTable.getColumnModel().getColumn(4).setMinWidth(100);
            syncQTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            syncQTable.getColumnModel().getColumn(5).setResizable(false);
            syncQTable.getColumnModel().getColumn(5).setMinWidth(80);
            syncQTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            syncQTable.getColumnModel().getColumn(5).setMaxWidth(80);
            syncQTable.getColumnModel().getColumn(6).setResizable(false);
            syncQTable.getColumnModel().getColumn(6).setMinWidth(50);
            syncQTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            syncQTable.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        syncQPanel.add(jScrollPane1, gridBagConstraints);

        tabbedPane.addTab("Sync Queue", syncQPanel);

        scheduleQJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        scheduleQJPanel.setLayout(new java.awt.GridBagLayout());

        scheduleStatusJPanel.setLayout(new java.awt.GridBagLayout());

        scheduleEngineStatusField.setText("Not running!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        scheduleStatusJPanel.add(scheduleEngineStatusField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        scheduleStatusJPanel.add(spacer3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        scheduleStatusJPanel.add(spacer7, gridBagConstraints);

        jLabel77.setText("Schedule engine status:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        scheduleStatusJPanel.add(jLabel77, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        scheduleQJPanel.add(scheduleStatusJPanel, gridBagConstraints);

        scheduleTable.setModel(new ScheduleTableModel());
        scheduleTable.setDefaultRenderer(String.class, new ScheduleTableCellRenderer());
        scheduleTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        scheduleTable.setIntercellSpacing(new java.awt.Dimension(3, 1));
        scheduleTable.setRowSelectionAllowed(false);
        scheduleTable.getTableHeader().setResizingAllowed(false);
        scheduleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(scheduleTable);
        scheduleTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (scheduleTable.getColumnModel().getColumnCount() > 0) {
            scheduleTable.getColumnModel().getColumn(0).setResizable(false);
            scheduleTable.getColumnModel().getColumn(0).setMinWidth(70);
            scheduleTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            scheduleTable.getColumnModel().getColumn(0).setMaxWidth(130);
            scheduleTable.getColumnModel().getColumn(1).setResizable(false);
            scheduleTable.getColumnModel().getColumn(1).setMinWidth(130);
            scheduleTable.getColumnModel().getColumn(1).setPreferredWidth(130);
            scheduleTable.getColumnModel().getColumn(1).setMaxWidth(130);
            scheduleTable.getColumnModel().getColumn(2).setResizable(false);
            scheduleTable.getColumnModel().getColumn(2).setMinWidth(100);
            scheduleTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            scheduleTable.getColumnModel().getColumn(2).setMaxWidth(130);
            scheduleTable.getColumnModel().getColumn(3).setMinWidth(650);
            scheduleTable.getColumnModel().getColumn(3).setPreferredWidth(650);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        scheduleQJPanel.add(jScrollPane6, gridBagConstraints);

        tabbedPane.addTab("Schedules", scheduleQJPanel);

        messagesQJPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        messagesQJPanel.setLayout(new java.awt.GridBagLayout());

        viewJPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel65.setLayout(new java.awt.GridBagLayout());

        jPanel66.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterInfosCheckBox.setToolTipText("Synchronize all files and dirs.");
        jPanel66.add(messagesViewFilterInfosCheckBox);

        messagesViewFilterInfosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_info.png"))); // NOI18N
        messagesViewFilterInfosLabel.setText("Info's");
        jPanel66.add(messagesViewFilterInfosLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel66, gridBagConstraints);

        jPanel67.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterErrorsCheckBox.setToolTipText("Synchronize all files and dirs.");
        messagesViewFilterErrorsCheckBox.setMaximumSize(null);
        messagesViewFilterErrorsCheckBox.setMinimumSize(null);
        messagesViewFilterErrorsCheckBox.setPreferredSize(null);
        jPanel67.add(messagesViewFilterErrorsCheckBox);

        messagesViewFilterErrorsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_error.png"))); // NOI18N
        messagesViewFilterErrorsLabel.setText("Errors");
        jPanel67.add(messagesViewFilterErrorsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel67, gridBagConstraints);

        jPanel69.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterWarningsCheckBox.setToolTipText("Synchronize all files and dirs.");
        messagesViewFilterWarningsCheckBox.setMaximumSize(null);
        messagesViewFilterWarningsCheckBox.setMinimumSize(null);
        messagesViewFilterWarningsCheckBox.setPreferredSize(null);
        jPanel69.add(messagesViewFilterWarningsCheckBox);

        messagesViewFilterWarningsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_warning.png"))); // NOI18N
        messagesViewFilterWarningsLabel.setText("Warnings");
        jPanel69.add(messagesViewFilterWarningsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel69, gridBagConstraints);

        jPanel70.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        messagesViewFilterFileOperationsCheckBox.setToolTipText("Synchronize all files and dirs.");
        messagesViewFilterFileOperationsCheckBox.setMaximumSize(null);
        messagesViewFilterFileOperationsCheckBox.setMinimumSize(null);
        messagesViewFilterFileOperationsCheckBox.setPreferredSize(null);
        jPanel70.add(messagesViewFilterFileOperationsCheckBox);

        messagesViewFilterFileOperationsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copyLinks.png"))); // NOI18N
        messagesViewFilterFileOperationsLabel.setText("File operations");
        jPanel70.add(messagesViewFilterFileOperationsLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel65.add(jPanel70, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        viewJPanel1.add(jPanel65, gridBagConstraints);

        jPanel51.setLayout(new javax.swing.BoxLayout(jPanel51, javax.swing.BoxLayout.LINE_AXIS));

        messagesViewFilterResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/apply.png"))); // NOI18N
        messagesViewFilterResetButton.setText("Reset");
        messagesViewFilterResetButton.setToolTipText("Reset the message filter options.");
        messagesViewFilterResetButton.setAlignmentX(0.5F);
        messagesViewFilterResetButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        messagesViewFilterResetButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesViewFilterResetButtonActionPerformed(evt);
            }
        });
        jPanel51.add(messagesViewFilterResetButton);

        messagesViewFilterOKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        messagesViewFilterOKButton.setText("OK");
        messagesViewFilterOKButton.setToolTipText("Filter the messages according to the message filter options.");
        messagesViewFilterOKButton.setAlignmentX(0.5F);
        messagesViewFilterOKButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        messagesViewFilterOKButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesViewFilterOKButtonActionPerformed(evt);
            }
        });
        jPanel51.add(messagesViewFilterOKButton);

        messagesCleanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        messagesCleanButton.setText("Clean");
        messagesCleanButton.setToolTipText("Delete all messages.");
        messagesCleanButton.setAlignmentX(0.5F);
        messagesCleanButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        messagesCleanButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesCleanButtonActionPerformed(evt);
            }
        });
        jPanel51.add(messagesCleanButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        viewJPanel1.add(jPanel51, gridBagConstraints);

        jLabel46.setText("View these files/dirs in the messages queue:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        viewJPanel1.add(jLabel46, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        messagesQJPanel.add(viewJPanel1, gridBagConstraints);

        messagesTable.setModel(new MessagesTableModel());
        messagesTable.setDefaultRenderer(String.class, new MessagesTableCellRenderer());
        messagesTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        messagesTable.setIntercellSpacing(new java.awt.Dimension(3, 1));
        messagesTable.getTableHeader().setResizingAllowed(false);
        messagesTable.getTableHeader().setReorderingAllowed(false);
        messagesTableScrollPane.setViewportView(messagesTable);
        messagesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (messagesTable.getColumnModel().getColumnCount() > 0) {
            messagesTable.getColumnModel().getColumn(0).setResizable(false);
            messagesTable.getColumnModel().getColumn(0).setMinWidth(150);
            messagesTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            messagesTable.getColumnModel().getColumn(0).setMaxWidth(130);
            messagesTable.getColumnModel().getColumn(1).setMinWidth(650);
            messagesTable.getColumnModel().getColumn(1).setPreferredWidth(650);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        messagesQJPanel.add(messagesTableScrollPane, gridBagConstraints);

        tabbedPane.addTab("Messages", messagesQJPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(tabbedPane, gridBagConstraints);
        tabbedPane.getAccessibleContext().setAccessibleName("");

        progressPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Progress"));
        progressPanel.setLayout(new java.awt.GridBagLayout());

        currentProgressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_file.png"))); // NOI18N
        currentProgressLabel.setText("Current:");
        currentProgressLabel.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        progressPanel.add(currentProgressLabel, gridBagConstraints);

        currentProgress.setToolTipText("The progress of the synchronization of the current directory.");
        currentProgress.setFocusable(false);
        currentProgress.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        progressPanel.add(currentProgress, gridBagConstraints);

        totalProgressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DirSyncPro16x16.gif"))); // NOI18N
        totalProgressLabel.setText("Total:");
        totalProgressLabel.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        progressPanel.add(totalProgressLabel, gridBagConstraints);

        totalProgress.setToolTipText("The overall progress of the synchronization.");
        totalProgress.setFocusable(false);
        totalProgress.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        progressPanel.add(totalProgress, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        mainPanel.add(progressPanel, gridBagConstraints);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileNew.png"))); // NOI18N
        newMenuItem.setText("New");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemnewConfigActionPerformed(evt);
            }
        });
        fileMenu.add(newMenuItem);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileOpen.png"))); // NOI18N
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemopenConfigActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        openRecentMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileOpen.png"))); // NOI18N
        openRecentMenu.setText("Open Recent");
        fileMenu.add(openRecentMenu);

        appendMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileOpen.png"))); // NOI18N
        appendMenuItem.setText("Append");
        appendMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appendMenuItemopenConfigActionPerformed(evt);
            }
        });
        fileMenu.add(appendMenuItem);
        fileMenu.add(jSeparator7);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileSave.png"))); // NOI18N
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemsaveConfigActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileSaveAs.png"))); // NOI18N
        saveAsMenuItem.setText("Save As");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemsaveConfigActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        saveEnabledAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileSaveAs.png"))); // NOI18N
        saveEnabledAsMenuItem.setText("Save enabled jobs As");
        saveEnabledAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEnabledAsMenuItemsaveConfigActionPerformed(evt);
            }
        });
        fileMenu.add(saveEnabledAsMenuItem);
        fileMenu.add(jSeparator4);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        quitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quit.png"))); // NOI18N
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemquitActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        menuBar.add(fileMenu);

        runMenu.setText("Run");

        analyzeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preview.png"))); // NOI18N
        analyzeMenuItem.setText("Analyze");
        analyzeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeMenuItempreviewStartActionPerformed(evt);
            }
        });
        runMenu.add(analyzeMenuItem);

        synchronizeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/start.png"))); // NOI18N
        synchronizeMenuItem.setText("Synchronize");
        synchronizeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                synchronizeMenuItemsynchronizationStartActionPerformed(evt);
            }
        });
        runMenu.add(synchronizeMenuItem);

        pauseMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pause.png"))); // NOI18N
        pauseMenuItem.setText("Pause");
        pauseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseMenuItemsynchronizationStopActionPerformed(evt);
            }
        });
        runMenu.add(pauseMenuItem);

        stopMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stop.png"))); // NOI18N
        stopMenuItem.setText("Stop");
        stopMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopMenuItemsynchronizationStopActionPerformed(evt);
            }
        });
        runMenu.add(stopMenuItem);

        shutDownMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit16x16.png"))); // NOI18N
        shutDownMenuItem.setText("Shut down after sync");
        shutDownMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutDownMenuItemsynchronizationStopActionPerformed(evt);
            }
        });
        runMenu.add(shutDownMenuItem);
        runMenu.add(jSeparator5);

        startScheduledTasksMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/startSchedule.png"))); // NOI18N
        startScheduledTasksMenuItem.setText("Start Schedule Engine");
        startScheduledTasksMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startScheduledTasksMenuItemsynchronizationStartActionPerformed(evt);
            }
        });
        runMenu.add(startScheduledTasksMenuItem);

        stopScheduledTasksMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stopSchedule.png"))); // NOI18N
        stopScheduledTasksMenuItem.setText("Stop Schedule Engine");
        stopScheduledTasksMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopScheduledTasksMenuItemsynchronizationStartActionPerformed(evt);
            }
        });
        runMenu.add(stopScheduledTasksMenuItem);

        menuBar.add(runMenu);

        toolsMenu.setText("Tools");

        swapSrcDstMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/swapSrcDst.png"))); // NOI18N
        swapSrcDstMenuItem.setText("Swap all source and destination directories");
        swapSrcDstMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapSrcDstMenuItemtoolsSwapSrcDstActionPerformed(evt);
            }
        });
        toolsMenu.add(swapSrcDstMenuItem);

        cmdMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/terminal.png"))); // NOI18N
        cmdMenuItem.setText("Generate command line");
        cmdMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuItemOptionsActionPerformed(evt);
            }
        });
        toolsMenu.add(cmdMenuItem);

        optionsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_config.png"))); // NOI18N
        optionsMenuItem.setText("Options");
        optionsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsMenuItemOptionsActionPerformed(evt);
            }
        });
        toolsMenu.add(optionsMenuItem);

        menuBar.add(toolsMenu);

        helpMenu.setText("Help");

        contentsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        contentsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contents.png"))); // NOI18N
        contentsMenuItem.setText("Help contents");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsMenuItemcontentsActionPerformed(evt);
            }
        });
        helpMenu.add(contentsMenuItem);

        donateMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/donate16x16.png"))); // NOI18N
        donateMenuItem.setText("Make a donation!");
        donateMenuItem.setToolTipText("<html>If this program is good for your purpose please consider a donation <br />as less as you would like as a gesture to encourage us developing this program.<br />Click this menu item to go to the SourceForge donation page.<br /><br />Thank you!</html>");
        donateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateMenuItemcontentsActionPerformed(evt);
            }
        });
        helpMenu.add(donateMenuItem);
        helpMenu.add(jSeparator1);

        updateMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update16x16.png"))); // NOI18N
        updateMenuItem.setText("Check for updates");
        updateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuItemaboutActionPerformed(evt);
            }
        });
        helpMenu.add(updateMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about.png"))); // NOI18N
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemaboutActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMenuItemnewConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemnewConfigActionPerformed
        newConfig();
    }//GEN-LAST:event_newMenuItemnewConfigActionPerformed

    private void openMenuItemopenConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemopenConfigActionPerformed
        openConfig();
    }//GEN-LAST:event_openMenuItemopenConfigActionPerformed

    private void saveMenuItemsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemsaveConfigActionPerformed
        saveConfig();
    }//GEN-LAST:event_saveMenuItemsaveConfigActionPerformed

    private void quitMenuItemquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemquitActionPerformed
        quit();
    }//GEN-LAST:event_quitMenuItemquitActionPerformed

    private void analyzeMenuItempreviewStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeMenuItempreviewStartActionPerformed
        analyzeStart();
    }//GEN-LAST:event_analyzeMenuItempreviewStartActionPerformed

    private void synchronizeMenuItemsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_synchronizeMenuItemsynchronizationStartActionPerformed
        synchronizationStart();
    }//GEN-LAST:event_synchronizeMenuItemsynchronizationStartActionPerformed

    private void stopMenuItemsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopMenuItemsynchronizationStopActionPerformed
        stop();
    }//GEN-LAST:event_stopMenuItemsynchronizationStopActionPerformed

    private void swapSrcDstMenuItemtoolsSwapSrcDstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapSrcDstMenuItemtoolsSwapSrcDstActionPerformed
        toolsSwapSrcDst();
    }//GEN-LAST:event_swapSrcDstMenuItemtoolsSwapSrcDstActionPerformed

    private void optionsMenuItemOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsMenuItemOptionsActionPerformed
        optionsOptionsMenuItemClicked();
    }//GEN-LAST:event_optionsMenuItemOptionsActionPerformed

    private void contentsMenuItemcontentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsMenuItemcontentsActionPerformed
        contents();
    }//GEN-LAST:event_contentsMenuItemcontentsActionPerformed

    private void aboutMenuItemaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemaboutActionPerformed
        about();
    }//GEN-LAST:event_aboutMenuItemaboutActionPerformed

    private void newButtonnewConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonnewConfigActionPerformed
        newConfig();
    }//GEN-LAST:event_newButtonnewConfigActionPerformed

    private void openButtonopenConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonopenConfigActionPerformed
        openConfig();
    }//GEN-LAST:event_openButtonopenConfigActionPerformed

    private void saveButtonsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonsaveConfigActionPerformed
        saveConfig();
    }//GEN-LAST:event_saveButtonsaveConfigActionPerformed

    private void analyzeButtonpreviewStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonpreviewStartActionPerformed
        analyzeStart();
    }//GEN-LAST:event_analyzeButtonpreviewStartActionPerformed

    private void synchronizeButtonsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_synchronizeButtonsynchronizationStartActionPerformed
        synchronizationStart();
    }//GEN-LAST:event_synchronizeButtonsynchronizationStartActionPerformed

    private void pauseButtonsynchronizationPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonsynchronizationPauseActionPerformed
        pause();
    }//GEN-LAST:event_pauseButtonsynchronizationPauseActionPerformed

    private void stopButtonsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonsynchronizationStopActionPerformed
        stop();
    }//GEN-LAST:event_stopButtonsynchronizationStopActionPerformed

    private void aboutButtonaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonaboutActionPerformed
        about();
    }//GEN-LAST:event_aboutButtonaboutActionPerformed

    private void contentsButtoncontentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsButtoncontentsActionPerformed
        contents();
    }//GEN-LAST:event_contentsButtoncontentsActionPerformed

    private void jobAddButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobAddButtonlistAddActionPerformed
        GuiTools.collapseAll(jobsTree);
        getJobDialog().setToBasicOptions();
        addJob();
    }//GEN-LAST:event_jobAddButtonlistAddActionPerformed

    private void jobCopyButtonlistCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobCopyButtonlistCopyActionPerformed
        copyJob();
    }//GEN-LAST:event_jobCopyButtonlistCopyActionPerformed

    private void jobUpButtonlistUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobUpButtonlistUpActionPerformed
        upwardeJob();
    }//GEN-LAST:event_jobUpButtonlistUpActionPerformed

    private void jobDownButtonlistDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobDownButtonlistDownActionPerformed
        downwardJob();
    }//GEN-LAST:event_jobDownButtonlistDownActionPerformed

    private void jobRemoveButtonlistRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobRemoveButtonlistRemoveActionPerformed
        removeJob();
    }//GEN-LAST:event_jobRemoveButtonlistRemoveActionPerformed

    private void jobEnableAllButtonenableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobEnableAllButtonenableAllDirsActionPerformed
        enableAllDirs();
    }//GEN-LAST:event_jobEnableAllButtonenableAllDirsActionPerformed

    private void jobDisableAllButtondisableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobDisableAllButtondisableAllDirsActionPerformed
        disableAllDirs();
    }//GEN-LAST:event_jobDisableAllButtondisableAllDirsActionPerformed

    private void saveAsButtonsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsButtonsaveConfigActionPerformed
        saveAsConfig();
    }//GEN-LAST:event_saveAsButtonsaveConfigActionPerformed

    private void pauseMenuItemsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseMenuItemsynchronizationStopActionPerformed
        pause();
    }//GEN-LAST:event_pauseMenuItemsynchronizationStopActionPerformed

    private void saveAsMenuItemsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemsaveConfigActionPerformed
        saveAsConfig();
    }//GEN-LAST:event_saveAsMenuItemsaveConfigActionPerformed

    private void donateButtoncontentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateButtoncontentsActionPerformed
        donate();
    }//GEN-LAST:event_donateButtoncontentsActionPerformed

    private void donateMenuItemcontentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateMenuItemcontentsActionPerformed
        donate();
    }//GEN-LAST:event_donateMenuItemcontentsActionPerformed

    private void syncQViewFilterResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncQViewFilterResetButtonActionPerformed
        syncQViewFilterChanged(true);
    }//GEN-LAST:event_syncQViewFilterResetButtonActionPerformed

    private void syncQViewFilterOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncQViewFilterOKButtonActionPerformed
        syncQViewFilterChanged(false);
    }//GEN-LAST:event_syncQViewFilterOKButtonActionPerformed

    private void syncQSyncFilterResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncQSyncFilterResetButtonActionPerformed
        syncQSyncFilterChanged(true);
    }//GEN-LAST:event_syncQSyncFilterResetButtonActionPerformed

    private void syncQSyncFilterOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncQSyncFilterOKButtonActionPerformed
        syncQSyncFilterChanged(false);
    }//GEN-LAST:event_syncQSyncFilterOKButtonActionPerformed

    private void messagesViewFilterOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesViewFilterOKButtonActionPerformed
        messagesQViewFilterChanged(false);
    }//GEN-LAST:event_messagesViewFilterOKButtonActionPerformed

    private void messagesViewFilterResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesViewFilterResetButtonActionPerformed
        messagesQViewFilterChanged(true);
    }//GEN-LAST:event_messagesViewFilterResetButtonActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        syncQViewFilterChanged(true);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void messagesCleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesCleanButtonActionPerformed
        cleanLog();
    }//GEN-LAST:event_messagesCleanButtonActionPerformed

    private void jobEditButtonlistAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobEditButtonlistAddActionPerformed
        openEditJobDialog();
    }//GEN-LAST:event_jobEditButtonlistAddActionPerformed

    private void jobExpandOneLevelButtonenableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobExpandOneLevelButtonenableAllDirsActionPerformed
        GuiTools.expandOneLevel(jobsTree);
    }//GEN-LAST:event_jobExpandOneLevelButtonenableAllDirsActionPerformed

    private void jobCollapseAllButtondisableAllDirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobCollapseAllButtondisableAllDirsActionPerformed
        GuiTools.collapseAll(jobsTree);
    }//GEN-LAST:event_jobCollapseAllButtondisableAllDirsActionPerformed

    private void jobsTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobsTreeMouseClicked
        jobsTreeMouseHandler(evt);
    }//GEN-LAST:event_jobsTreeMouseClicked

    private void jobsTreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobsTreeMousePressed
        jobsTreeMouseHandler(evt);
    }//GEN-LAST:event_jobsTreeMousePressed

    private void jobsTreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobsTreeMouseReleased
        jobsTreeMouseHandler(evt);
    }//GEN-LAST:event_jobsTreeMouseReleased

    private void syncQTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncQTableMouseClicked
        syncQMouseHandler(evt);
    }//GEN-LAST:event_syncQTableMouseClicked

    private void syncQTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncQTableMousePressed
        syncQMouseHandler(evt);
    }//GEN-LAST:event_syncQTableMousePressed

    private void syncQTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncQTableMouseReleased
        syncQMouseHandler(evt);
    }//GEN-LAST:event_syncQTableMouseReleased

    private void startScheduledTasksMenuItemsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startScheduledTasksMenuItemsynchronizationStartActionPerformed
        schedulerStart();
    }//GEN-LAST:event_startScheduledTasksMenuItemsynchronizationStartActionPerformed

    private void stopScheduledTasksMenuItemsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopScheduledTasksMenuItemsynchronizationStartActionPerformed
        schedulerStop();
    }//GEN-LAST:event_stopScheduledTasksMenuItemsynchronizationStartActionPerformed

    private void scheduleStartButtonsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleStartButtonsynchronizationStartActionPerformed
        schedulerStart();
    }//GEN-LAST:event_scheduleStartButtonsynchronizationStartActionPerformed

    private void scheduleStopButtonsynchronizationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleStopButtonsynchronizationStartActionPerformed
        schedulerStop();
    }//GEN-LAST:event_scheduleStopButtonsynchronizationStartActionPerformed

    private void cmdMenuItemOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuItemOptionsActionPerformed
        cmdMenuItemClicked();
    }//GEN-LAST:event_cmdMenuItemOptionsActionPerformed

    private void updateMenuItemaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuItemaboutActionPerformed
        DirSyncPro.getGui().getUpdateDialog().checkForUpdate(false, this);
    }//GEN-LAST:event_updateMenuItemaboutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exitForm();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        iconifyForm();
    }//GEN-LAST:event_formWindowIconified

    private void appendMenuItemopenConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appendMenuItemopenConfigActionPerformed
        appendJobs();
    }//GEN-LAST:event_appendMenuItemopenConfigActionPerformed

    private void saveEnabledAsMenuItemsaveConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEnabledAsMenuItemsaveConfigActionPerformed
        saveEnabledJobs();
    }//GEN-LAST:event_saveEnabledAsMenuItemsaveConfigActionPerformed

    private void shutDownButtonsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutDownButtonsynchronizationStopActionPerformed
        shutDownButton.setSelected(!shutDownButton.isSelected());
    }//GEN-LAST:event_shutDownButtonsynchronizationStopActionPerformed

    private void shutDownMenuItemsynchronizationStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutDownMenuItemsynchronizationStopActionPerformed
        shutDownButton.setSelected(!shutDownButton.isSelected());
    }//GEN-LAST:event_shutDownMenuItemsynchronizationStopActionPerformed

    abstract protected void about();

    abstract protected void addJob();

    abstract protected void analyzeStart();

    abstract protected void appendJobs();

    abstract protected void cleanLog();

    abstract protected void cmdMenuItemClicked();

    abstract protected void contents();

    abstract protected void copyJob();

    abstract protected void disableAllDirs();

    abstract protected void donate();

    abstract protected void downwardJob();

    abstract protected void openEditJobDialog();

    abstract protected void enableAllDirs();

    abstract protected void exitForm();

    abstract protected JobDialog getJobDialog();

    abstract protected JobTree getJobTree();

    abstract protected void iconifyForm();

    abstract protected void jobsTreeMouseHandler(java.awt.event.MouseEvent evt);

    abstract protected void messagesQViewFilterChanged(boolean reset);

    abstract protected void newConfig();

    abstract protected void openConfig();

    abstract protected void optionsOptionsMenuItemClicked();

    abstract protected void pause();

    abstract protected void quit();

    abstract protected void removeJob();

    abstract protected void saveAsConfig();

    abstract protected void saveConfig();

    abstract protected void saveEnabledJobs();

    abstract protected void schedulerStart();

    abstract protected void schedulerStop();

    abstract protected void stop();

    abstract protected void synchronizationStart();

    abstract protected void syncQDirSelected();

    abstract protected void syncQMouseHandler(java.awt.event.MouseEvent evt);

    abstract protected void syncQSyncFilterChanged(boolean reset);

    abstract protected void syncQViewFilterChanged(boolean reset);

    abstract protected void toolsSwapSrcDst();

    abstract protected void upwardeJob();
}
