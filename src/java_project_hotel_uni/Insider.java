
package java_project_hotel_uni;

import javax.swing.JFrame;

public class Insider extends javax.swing.JFrame {

    public Insider() {
        initComponents();
    }
    
    String username_of_recept; 
    public String setThings(String recept_username) 
    {
        username_of_recept = recept_username;
        return username_of_recept;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuItem_Rooms = new javax.swing.JMenuItem();
        menuItem_Guests = new javax.swing.JMenuItem();
        menuItem_Reservations = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        jMenu3.setText("What do You want to do?");

        menuItem_Rooms.setText("Rooms");
        menuItem_Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_RoomsActionPerformed(evt);
            }
        });
        jMenu3.add(menuItem_Rooms);

        menuItem_Guests.setText("Guests");
        menuItem_Guests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_GuestsActionPerformed(evt);
            }
        });
        jMenu3.add(menuItem_Guests);

        menuItem_Reservations.setText("Reservations");
        menuItem_Reservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ReservationsActionPerformed(evt);
            }
        });
        jMenu3.add(menuItem_Reservations);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

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

    private void menuItem_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_RoomsActionPerformed
        roomsForm rF1 = new roomsForm();
        rF1.setVisible(true);
        rF1.pack();
        rF1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItem_RoomsActionPerformed

    private void menuItem_GuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_GuestsActionPerformed
        guestsForm gF1 = new guestsForm();
        gF1.setVisible(true);
        gF1.pack();
        gF1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_menuItem_GuestsActionPerformed

    private void menuItem_ReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ReservationsActionPerformed
        reservationsForm resF1 = new reservationsForm();
        resF1.setVisible(true);
             resF1.setThings(username_of_recept);
        resF1.pack();
        resF1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItem_ReservationsActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuItem_Guests;
    private javax.swing.JMenuItem menuItem_Reservations;
    private javax.swing.JMenuItem menuItem_Rooms;
    // End of variables declaration//GEN-END:variables
}
