
import javax.swing.JFrame;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jPanel1 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblstdcount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblcrscount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menustudent = new javax.swing.JMenu();
        menuitemstudentadd = new javax.swing.JMenuItem();
        menuitemstudentmanage = new javax.swing.JMenuItem();
        menucourse = new javax.swing.JMenu();
        menuitemcourseadd = new javax.swing.JMenuItem();
        menuitemcoursemanage = new javax.swing.JMenuItem();
        menuscore = new javax.swing.JMenu();
        menuItemAddScore = new javax.swing.JMenuItem();
        menuItemEditdeletescore = new javax.swing.JMenuItem();
        menuitemshowscore = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        lblusername.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Welcome <#####>");

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        lblstdcount.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblstdcount.setForeground(new java.awt.Color(0, 0, 0));
        lblstdcount.setText("Students Count = ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(lblstdcount, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(lblstdcount)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        lblcrscount.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblcrscount.setForeground(new java.awt.Color(0, 0, 0));
        lblcrscount.setText("Courses Count = ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(lblcrscount, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(lblcrscount)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/petralogo(1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblusername)))
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        menustudent.setText("Student");

        menuitemstudentadd.setText("Add");
        menuitemstudentadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemstudentaddActionPerformed(evt);
            }
        });
        menustudent.add(menuitemstudentadd);

        menuitemstudentmanage.setText("Manage");
        menuitemstudentmanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemstudentmanageActionPerformed(evt);
            }
        });
        menustudent.add(menuitemstudentmanage);

        jMenuBar1.add(menustudent);

        menucourse.setText("Course");

        menuitemcourseadd.setText("Add");
        menuitemcourseadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemcourseaddActionPerformed(evt);
            }
        });
        menucourse.add(menuitemcourseadd);

        menuitemcoursemanage.setText("Manage");
        menuitemcoursemanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemcoursemanageActionPerformed(evt);
            }
        });
        menucourse.add(menuitemcoursemanage);

        jMenuBar1.add(menucourse);

        menuscore.setText("Score");
        menuscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuscoreActionPerformed(evt);
            }
        });

        menuItemAddScore.setText("Add");
        menuItemAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddScoreActionPerformed(evt);
            }
        });
        menuscore.add(menuItemAddScore);

        menuItemEditdeletescore.setText("Edit / Delete");
        menuItemEditdeletescore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditdeletescoreActionPerformed(evt);
            }
        });
        menuscore.add(menuItemEditdeletescore);

        menuitemshowscore.setText("Show Scores");
        menuitemshowscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemshowscoreActionPerformed(evt);
            }
        });
        menuscore.add(menuitemshowscore);

        jMenuBar1.add(menuscore);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemstudentaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemstudentaddActionPerformed
        // open add student form window on clicking the add menu item on the "student" menu
        AddStudent addstd = new AddStudent();
        addstd.setVisible(true);
        addstd.pack();// set the window to be sized to fit the preferred size and layouts of its subcomponents.
        addstd.setLocationRelativeTo(null);// set window location to center
        addstd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // dispose on clicking the x / closing instead of exiting
    }//GEN-LAST:event_menuitemstudentaddActionPerformed

    private void menuitemstudentmanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemstudentmanageActionPerformed
        // open manage student form window on clickling the manage menu item on the "Student" menu 
        ManageStudent managestd = new ManageStudent();
        managestd.setVisible(true);
        managestd.pack();// set the window to be sized to fit the preferred size and layouts of its subcomponents.
        managestd.setLocationRelativeTo(null);// set window location to center
        managestd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose on clicking the x / closing instead of exiting
    }//GEN-LAST:event_menuitemstudentmanageActionPerformed

    private void menuitemcourseaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemcourseaddActionPerformed
        // open add course form window on clickling the add menu item on the "Course" menu 
        AddCourse addcrs = new AddCourse();
        addcrs.setVisible(true);
        addcrs.pack();// set the window to be sized to fit the preferred size and layouts of its subcomponents.
        addcrs.setLocationRelativeTo(null);// set window location to center
        addcrs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose on clicking the x / closing instead of exiting
    }//GEN-LAST:event_menuitemcourseaddActionPerformed

    private void menuitemcoursemanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemcoursemanageActionPerformed
        // open manage course form window on clickling the manage menu item on the "Course" menu 
        ManageCourse managecrs = new ManageCourse();
        managecrs.setVisible(true);
        managecrs.pack();// set the window to be sized to fit the preferred size and layouts of its subcomponents.
        managecrs.setLocationRelativeTo(null);// set window location to center
        managecrs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose on clicking the x / closing instead of exiting
    }//GEN-LAST:event_menuitemcoursemanageActionPerformed

    private void menuItemAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddScoreActionPerformed
        // open add score form window on clickling the add menu item on the "Score" menu 
        AddScore addscore = new AddScore();
        addscore.setVisible(true);
        addscore.pack();// set the window to be sized to fit the preferred size and layouts of its subcomponents.
        addscore.setLocationRelativeTo(null);// set window location to center
        addscore.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose on clicking the x / closing instead of exiting
    }//GEN-LAST:event_menuItemAddScoreActionPerformed

    private void menuItemEditdeletescoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditdeletescoreActionPerformed
        // open editdelete course form window on clickling the edit/delete menu item on the "Score" menu 
        EditDeleteScore edtdltscr = new EditDeleteScore();
        edtdltscr.setVisible(true);
        edtdltscr.pack();// set the window to be sized to fit the preferred size and layouts of its subcomponents.
        edtdltscr.setLocationRelativeTo(null);// set window location to center
        edtdltscr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose on clicking the x / closing instead of exiting
    }//GEN-LAST:event_menuItemEditdeletescoreActionPerformed

    private void menuscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuscoreActionPerformed
       
    }//GEN-LAST:event_menuscoreActionPerformed

    private void menuitemshowscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemshowscoreActionPerformed
         // open showscores form window on clicking the menu item show scores on the score menu
        ShowScores sscore = new ShowScores();
        sscore.setVisible(true);
        sscore.pack();// set the window to be sized to fit the preferred size and layouts of its subcomponents.
        sscore.setLocationRelativeTo(null);// set window location to center
        sscore.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose on clicking the x / closing instead of exiting
    }//GEN-LAST:event_menuitemshowscoreActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel lblcrscount;
    public static javax.swing.JLabel lblstdcount;
    public static javax.swing.JLabel lblusername;
    private javax.swing.JMenuItem menuItemAddScore;
    private javax.swing.JMenuItem menuItemEditdeletescore;
    private javax.swing.JMenu menucourse;
    private javax.swing.JMenuItem menuitemcourseadd;
    private javax.swing.JMenuItem menuitemcoursemanage;
    private javax.swing.JMenuItem menuitemshowscore;
    private javax.swing.JMenuItem menuitemstudentadd;
    private javax.swing.JMenuItem menuitemstudentmanage;
    private javax.swing.JMenu menuscore;
    private javax.swing.JMenu menustudent;
    // End of variables declaration//GEN-END:variables
}
