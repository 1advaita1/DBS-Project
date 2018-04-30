
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roshini Shetty
 */
public class playlist extends javax.swing.JFrame {

    /**
     * Creates new form playlist
     */
    public playlist() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Artists");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Albums");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Genres");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("My Songs");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Search By");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Song", "Album", "Artist", "Genre" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton4.setText("play");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Start");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("stop");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList2MouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jButton7.setText("Library");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("pause");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6)
                            .addComponent(jButton8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/songs","root","database");  
//here sonoo is database name, root is username and password  
a="b";
DefaultListModel d=new DefaultListModel();
    jList2.setModel(d);
    d.setSize(0);
     jScrollPane3.setVisible(false);
    jList3.setVisible(false);
    jScrollPane2.setVisible(true);
    jList2.setVisible(true);
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select album_name from albums");  
while(rs.next())
{  
    d.addElement(rs.getString(1));
}

con.close();  
}
   catch(Exception e){ System.out.println(e);}  
   
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
     try {
    Process process = Runtime.getRuntime().exec("cmd /c  start C:\\DBSproj\\play.bat");
    //System.out.println(process.getText());
} catch(Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jButton4MouseClicked
String a=null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/songs","root","database");  
//here sonoo is database name, root is username and password  
a="a"; 
DefaultListModel d=new DefaultListModel();
    jList2.setModel(d);
    d.setSize(0);
    jScrollPane3.setVisible(false);
    jList3.setVisible(false);
    jScrollPane2.setVisible(true);
    jList2.setVisible(true);
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select artist from artists");  
while(rs.next())
{  
    d.addElement(rs.getString(1));
}

con.close();  
}catch(Exception e){ System.out.println(e);}  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/songs","root","database");  
//here sonoo is database name, root is username and password  
a="c"; 
DefaultListModel d=new DefaultListModel();
    jList2.setModel(d);
    d.setSize(0);
     jScrollPane3.setVisible(false);
    jList3.setVisible(false);
    jScrollPane2.setVisible(true);
    jList2.setVisible(true);
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select genre from genres");  
while(rs.next())
{  
    d.addElement(rs.getString(1));
}

con.close();  
}
   catch(Exception e){ System.out.println(e);}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/songs","root","database");  
//here sonoo is database name, root is username and password  
 DefaultListModel d=new DefaultListModel();
    jList3.setModel(d);
    d.setSize(0);
    jScrollPane2.setVisible(false);
    jList2.setVisible(false);
    jScrollPane3.setVisible(true);
    jList3.setVisible(true);
Statement stmt=con.createStatement();
String s=(String)jList2.getSelectedValue();
if(a.equals("a"))
{
  ResultSet rs=stmt.executeQuery("select song_name from add_artist where artist='"+s+"';");  
while(rs.next())
{  
    d.addElement(rs.getString(1));
}
}
else if(a.equals("b"))
{
  ResultSet rs=stmt.executeQuery("select song_name from song where album_name='"+s+"';");  
while(rs.next())
{  
    d.addElement(rs.getString(1));
}
}
else if(a.equals("c"))
{
  ResultSet rs=stmt.executeQuery("select song_name from add_genre where genre='"+s+"';");  
while(rs.next())
{  
    d.addElement(rs.getString(1));
}
}

con.close();  
}
   catch(Exception e){ System.out.println(e);}         // TODO add your handling code here:
    }//GEN-LAST:event_jList2MouseClicked

    private void jList2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jList2MouseEntered

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/songs","root","database");  
//here sonoo is database name, root is username and password  
int i=jComboBox1.getSelectedIndex();
if(i==0)
{
   jScrollPane2.setVisible(false);
    jList2.setVisible(false);
    jScrollPane3.setVisible(true);
    jList3.setVisible(true);    
DefaultListModel d=new DefaultListModel();
    jList3.setModel(d);
    d.setSize(0);
    Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select song_name from song where song_name like '%"+jTextField2.getText()+"%'");
     while(rs.next())
     {
         d.addElement(rs.getString(1));
     }
}
else if(i==1)
{
   jScrollPane3.setVisible(false);
    jList3.setVisible(false);
    jScrollPane2.setVisible(true);
    jList2.setVisible(true);    
DefaultListModel d=new DefaultListModel();
    jList2.setModel(d);
    d.setSize(0);
    Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select album_name from albums where album_name like '%"+jTextField2.getText()+"%'");
     while(rs.next())
     {
         d.addElement(rs.getString(1));
     }
}
else if(i==2)
{
   jScrollPane3.setVisible(false);
    jList3.setVisible(false);
    jScrollPane2.setVisible(true);
    jList2.setVisible(true);    
DefaultListModel d=new DefaultListModel();
    jList2.setModel(d);
    d.setSize(0);
    Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select artist from artists where artist like '%"+jTextField2.getText()+"%'");
     while(rs.next())
     {
         d.addElement(rs.getString(1));
     }
}
else if(i==3)
{
   jScrollPane3.setVisible(false);
    jList3.setVisible(false);
    jScrollPane2.setVisible(true);
    jList2.setVisible(true);    
DefaultListModel d=new DefaultListModel();
    jList2.setModel(d);
    d.setSize(0);
    Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select genre from genres where genre like '%"+jTextField2.getText()+"%'");
     while(rs.next())
     {
         d.addElement(rs.getString(1));
     }
}

con.close();  
}
   catch(Exception e){ System.out.println(e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/songs","root","database");  
//here sonoo is database name, root is username and password  
DefaultListModel d=new DefaultListModel();
    jList3.setModel(d);
    d.setSize(0);
     jScrollPane2.setVisible(false);
    jList2.setVisible(false);
    jScrollPane3.setVisible(true);
    jList3.setVisible(true);
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select song_name from song;");  
while(rs.next())
{  
    d.addElement(rs.getString(1));
}

con.close();  
}
   catch(Exception e){ System.out.println(e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/songs","root","database");  
//here sonoo is database name, root is username and password  

     jScrollPane2.setVisible(false);
    jList2.setVisible(false);
    jScrollPane3.setVisible(true);
    jList3.setVisible(true);
    String song=(String)jList3.getSelectedValue();
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select path from song where song_name='"+song+"';"); 
rs.first();
File f=new File("C:\\DBSproj\\finalsong.txt");
if(f.exists())
{
    f.delete();
}
f.createNewFile();
FileWriter fw=new FileWriter(f,true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
pw.print("");
pw.println(rs.getString(1));
pw.close();
con.close();  
}
   catch(Exception e){ System.out.println(e);} 
// TODO add your handling code here:
    }//GEN-LAST:event_jList3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
        Process p =  Runtime.getRuntime().exec("cmd /c start C:\\DBSproj\\songplayer.ps1");} 
        catch (IOException ex) {
    }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
           try {
    Process process = Runtime.getRuntime().exec("cmd /c start C:\\DBSproj\\pause.bat");
    //System.out.println(process.getText());
} catch(Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
       try {
    Process process = Runtime.getRuntime().exec("cmd /c start C:\\DBSproj\\stop.bat");
    //System.out.println(process.getText());
} catch(Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jButton6MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(playlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
