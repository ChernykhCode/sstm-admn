/*
 Code by Alexander Chernykh - vk.com/chernykh.code
 */
package my.numberaddition;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Александр
 */
public class sstmadmnUI extends javax.swing.JFrame {

    /**
     * Creates new form sstmadmnUI
     */
    public sstmadmnUI() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
        AboutCode.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AboutCode = new javax.swing.JFrame();
        mainPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        fucnPanel = new javax.swing.JPanel();
        chkSysFiles = new javax.swing.JButton();
        IPv4Fix = new javax.swing.JButton();
        chkDisk = new javax.swing.JButton();
        AutorunFix = new javax.swing.JButton();
        regedit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        socPanel = new javax.swing.JPanel();
        Vkontakte = new javax.swing.JButton();
        donate = new javax.swing.JButton();
        labelSSTM = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        AboutCode.setTitle("О программе");
        AboutCode.setBounds(new java.awt.Rectangle(0, 0, 505, 400));
        AboutCode.setResizable(false);

        mainPanel2.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "О программе", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Версия", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alpha 0.0.1 - Full Version (JP)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Описание", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Альфа версия программы с полным функционалом,");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("выполненная на языке Java 8.1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Создатель", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Александр Черных");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AboutCodeLayout = new javax.swing.GroupLayout(AboutCode.getContentPane());
        AboutCode.getContentPane().setLayout(AboutCodeLayout);
        AboutCodeLayout.setHorizontalGroup(
            AboutCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutCodeLayout.createSequentialGroup()
                .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        AboutCodeLayout.setVerticalGroup(
            AboutCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sstm.Admn");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "by chernykh.code", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        fucnPanel.setBackground(new java.awt.Color(51, 51, 51));
        fucnPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Functions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        chkSysFiles.setBackground(new java.awt.Color(51, 51, 51));
        chkSysFiles.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        chkSysFiles.setForeground(new java.awt.Color(255, 255, 255));
        chkSysFiles.setText("Проверка системных файлов");
        chkSysFiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkSysFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkSysFilesMouseClicked(evt);
            }
        });

        IPv4Fix.setBackground(new java.awt.Color(51, 51, 51));
        IPv4Fix.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        IPv4Fix.setForeground(new java.awt.Color(255, 255, 255));
        IPv4Fix.setText("Настройка интернет соединения");
        IPv4Fix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IPv4Fix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IPv4FixMouseClicked(evt);
            }
        });

        chkDisk.setBackground(new java.awt.Color(51, 51, 51));
        chkDisk.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        chkDisk.setForeground(new java.awt.Color(255, 255, 255));
        chkDisk.setText("Проверка секторов диска");
        chkDisk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkDisk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkDiskMouseClicked(evt);
            }
        });

        AutorunFix.setBackground(new java.awt.Color(51, 51, 51));
        AutorunFix.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        AutorunFix.setForeground(new java.awt.Color(255, 255, 255));
        AutorunFix.setText("Автозапуск");
        AutorunFix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AutorunFix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AutorunFixMouseClicked(evt);
            }
        });

        regedit.setBackground(new java.awt.Color(51, 51, 51));
        regedit.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        regedit.setForeground(new java.awt.Color(255, 255, 255));
        regedit.setText("Редактор реестра");
        regedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regeditMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("О программе");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fucnPanelLayout = new javax.swing.GroupLayout(fucnPanel);
        fucnPanel.setLayout(fucnPanelLayout);
        fucnPanelLayout.setHorizontalGroup(
            fucnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fucnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fucnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkSysFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fucnPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(IPv4Fix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkDisk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AutorunFix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fucnPanelLayout.setVerticalGroup(
            fucnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fucnPanelLayout.createSequentialGroup()
                .addComponent(chkSysFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IPv4Fix, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AutorunFix, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regedit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fucnPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AutorunFix, IPv4Fix, chkDisk, chkSysFiles, regedit});

        socPanel.setBackground(new java.awt.Color(51, 51, 51));
        socPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Social", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        Vkontakte.setBackground(new java.awt.Color(102, 153, 255));
        Vkontakte.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Vkontakte.setForeground(new java.awt.Color(255, 255, 255));
        Vkontakte.setText("VK");
        Vkontakte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vkontakte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VkontakteMouseClicked(evt);
            }
        });

        donate.setBackground(new java.awt.Color(51, 51, 51));
        donate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        donate.setForeground(new java.awt.Color(255, 255, 255));
        donate.setText("Поддержка");
        donate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout socPanelLayout = new javax.swing.GroupLayout(socPanel);
        socPanel.setLayout(socPanelLayout);
        socPanelLayout.setHorizontalGroup(
            socPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(socPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Vkontakte, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(donate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        socPanelLayout.setVerticalGroup(
            socPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, socPanelLayout.createSequentialGroup()
                .addGroup(socPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Vkontakte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        labelSSTM.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelSSTM.setForeground(new java.awt.Color(255, 255, 255));
        labelSSTM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSSTM.setText("sstmadmn");

        jProgressBar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fucnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(labelSSTM, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(socPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(socPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSSTM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fucnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VkontakteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VkontakteMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://vk.com/chernykh.code"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(sstmadmnUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VkontakteMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        /*
        JOptionPane.showMessageDialog(null, "Версия: Beta 0.0.1\nОписание: Программа предназначеня для быстрого анализа компьютерных ошибок\n\n\nАвтор: Александр Черных", "sstmnadmn", JOptionPane.INFORMATION_MESSAGE);
        */
        AboutCode.setVisible(true);

    }//GEN-LAST:event_jButton1MouseClicked

    private void regeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regeditMouseClicked
        try {
            Process p = Runtime.getRuntime().exec("cmd /c regedit.exe");
        } catch (IOException ex) {
            Logger.getLogger(sstmadmnUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regeditMouseClicked

    private void AutorunFixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AutorunFixMouseClicked
        try {
            Process p = Runtime.getRuntime().exec("cmd /c msconfig.exe");
        } catch (IOException ex) {
            Logger.getLogger(sstmadmnUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AutorunFixMouseClicked

    private void chkDiskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkDiskMouseClicked
        Process chkdsk;
        try {
            JOptionPane.showMessageDialog(null, "Перезагрузите ваш компьютер", "Проверка диска", JOptionPane.INFORMATION_MESSAGE);
            chkdsk = Runtime.getRuntime().exec("chkdsk");
        } catch (IOException ex) {
            Logger.getLogger(sstmadmnUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chkDiskMouseClicked

    private void IPv4FixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IPv4FixMouseClicked

        try {
            Process ip4v, ip4v2;
            ip4v = Runtime.getRuntime().exec("ipconfig /flushdns");
            ip4v.waitFor();
            ip4v2 = Runtime.getRuntime().exec("netsh interface ip set dns \"Подключение по локальной сети\" static 8.8.8.8");
            ip4v2.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(sstmadmnUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IPv4FixMouseClicked

    private void chkSysFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkSysFilesMouseClicked

        try {

            jProgressBar1.setIndeterminate(true);
            JOptionPane.showMessageDialog(null, "Проверка системный файлов начата.\nНайдите процесс \"sfc / scannow\" в Диспетечере задач.\nЕсли вы не видите этот процесс, откройте программу от имени администратора.", "Проверка системных файлов", JOptionPane.INFORMATION_MESSAGE);
            Process proc;
            proc = Runtime.getRuntime().exec("sfc /scannow");
            proc.waitFor();

            JOptionPane.showMessageDialog(null, "Выполнено!", "Проверка системных файлов", JOptionPane.INFORMATION_MESSAGE);
            jProgressBar1.setIndeterminate(false);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(sstmadmnUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ошибка ;(\nВидимо что-то пошло не так!\nПопробуйте запустить программу от имени администратора.\nЕсли не помогло, напиши разработчику", "Проверка системных файлов", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_chkSysFilesMouseClicked

    private void donateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donateMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://qiwi.me/sstmadmn"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(sstmadmnUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_donateMouseClicked

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
            java.util.logging.Logger.getLogger(sstmadmnUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sstmadmnUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sstmadmnUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sstmadmnUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sstmadmnUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AboutCode;
    private javax.swing.JButton AutorunFix;
    private javax.swing.JButton IPv4Fix;
    private javax.swing.JButton Vkontakte;
    private javax.swing.JButton chkDisk;
    private javax.swing.JButton chkSysFiles;
    private javax.swing.JButton donate;
    private javax.swing.JPanel fucnPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelSSTM;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainPanel2;
    private javax.swing.JButton regedit;
    private javax.swing.JPanel socPanel;
    // End of variables declaration//GEN-END:variables
}
