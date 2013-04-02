package gui;

import DAO.HotelDAO;
import javax.swing.JOptionPane;

public class Guest extends javax.swing.JFrame {

    /** Creates new form Guest */
    public Guest() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGroup1 = new javax.swing.ButtonGroup();
        btnGroup2 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtEmail = new javax.swing.JTextField();
        jLabel9email = new javax.swing.JLabel();
        jLabel8contact = new javax.swing.JLabel();
        txtContacts = new javax.swing.JTextField();
        jButton2backhome = new javax.swing.JButton();
        jLabel10booking = new javax.swing.JLabel();
        jButton1book = new javax.swing.JButton();
        label1personal = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel1date = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel2name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3address = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5age = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15bookinginfo = new javax.swing.JLabel();
        jLabel13addresstop = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRoomNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOccupant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCheckIn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCheckOut = new javax.swing.JTextField();
        comboRoomType = new javax.swing.JComboBox();
        txtGender = new javax.swing.JTextField();
        jLabel8image = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setBounds(170, 390, 374, 26);
        jLayeredPane1.add(txtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9email.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9email.setText("E-mail Address");
        jLabel9email.setBounds(40, 390, 121, 21);
        jLayeredPane1.add(jLabel9email, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8contact.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8contact.setText("Contact Number");
        jLabel8contact.setBounds(40, 350, 123, 26);
        jLayeredPane1.add(jLabel8contact, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtContacts.setBounds(170, 350, 215, 27);
        jLayeredPane1.add(txtContacts, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2backhome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2backhome.setText("HOME");
        jButton2backhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2backhomeActionPerformed(evt);
            }
        });
        jButton2backhome.setBounds(730, 510, 100, 30);
        jLayeredPane1.add(jButton2backhome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10booking.setFont(new java.awt.Font("Calvin", 0, 36)); // NOI18N
        jLabel10booking.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10booking.setText("BOOKING RESERVATION");
        jLabel10booking.setBounds(110, 10, 480, 50);
        jLayeredPane1.add(jLabel10booking, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1book.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1book.setText("BOOK");
        jButton1book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1bookActionPerformed(evt);
            }
        });
        jButton1book.setBounds(730, 460, 100, 25);
        jLayeredPane1.add(jButton1book, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label1personal.setAlignment(java.awt.Label.CENTER);
        label1personal.setBackground(new java.awt.Color(0, 0, 0));
        label1personal.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        label1personal.setForeground(new java.awt.Color(51, 255, 204));
        label1personal.setText("Personal Information");
        label1personal.setBounds(30, 100, 220, 32);
        jLayeredPane1.add(label1personal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator2.setBounds(-10, 430, 826, 20);
        jLayeredPane1.add(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(-20, 90, 824, 10);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("Contact Number: +639205643442");
        jLabel12.setBounds(220, 50, 261, 19);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1date.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1date.setText("Date:");
        jLabel1date.setBounds(40, 140, 42, 23);
        jLayeredPane1.add(jLabel1date, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        txtDate.setBounds(170, 140, 96, 25);
        jLayeredPane1.add(txtDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2name.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2name.setText("Name");
        jLabel2name.setBounds(40, 180, 54, 24);
        jLayeredPane1.add(jLabel2name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtName.setBounds(170, 180, 288, 28);
        jLayeredPane1.add(txtName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3address.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3address.setText("Address");
        jLabel3address.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel3address.setBounds(40, 210, 70, 29);
        jLayeredPane1.add(jLabel3address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtAddress.setBounds(170, 220, 568, 27);
        jLayeredPane1.add(txtAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5age.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5age.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5age.setText("Age");
        jLabel5age.setToolTipText("");
        jLabel5age.setBounds(40, 310, 56, 25);
        jLayeredPane1.add(jLabel5age, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Gender");
        jLabel7.setBounds(40, 270, 61, 21);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtAge.setBounds(170, 310, 60, 30);
        jLayeredPane1.add(txtAge, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator3.setBounds(130, 660, 814, 10);
        jLayeredPane1.add(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15bookinginfo.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15bookinginfo.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel15bookinginfo.setForeground(new java.awt.Color(153, 153, 0));
        jLabel15bookinginfo.setText("Booking Information");
        jLabel15bookinginfo.setBounds(10, 440, 240, 30);
        jLayeredPane1.add(jLabel15bookinginfo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13addresstop.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13addresstop.setForeground(new java.awt.Color(255, 255, 102));
        jLabel13addresstop.setText("Address: Deluxe St. Near IT Park , Tacloban City");
        jLabel13addresstop.setBounds(190, 70, 315, 15);
        jLayeredPane1.add(jLabel13addresstop, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Room Type");
        jLabel1.setBounds(10, 480, 80, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Room Number");
        jLabel2.setBounds(10, 520, 110, 30);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtRoomNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRoomNum.setBounds(160, 520, 80, 30);
        jLayeredPane1.add(txtRoomNum, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Check-In");
        jLabel3.setBounds(300, 480, 70, 30);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtOccupant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOccupant.setBounds(570, 500, 120, 30);
        jLayeredPane1.add(txtOccupant, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Number of Occupants");
        jLabel5.setBounds(560, 470, 150, 30);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtCheckIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckInActionPerformed(evt);
            }
        });
        txtCheckIn.setBounds(390, 480, 120, 30);
        jLayeredPane1.add(txtCheckIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Check Out");
        jLabel8.setBounds(300, 530, 80, 20);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtCheckOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCheckOut.setBounds(390, 530, 120, 30);
        jLayeredPane1.add(txtCheckOut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        comboRoomType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Duplex", "Matrimonal", "Duplex", "Single", "Honeymoon", "5-Star" }));
        comboRoomType.setBounds(160, 480, 110, 30);
        jLayeredPane1.add(comboRoomType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        txtGender.setBounds(170, 260, 150, 30);
        jLayeredPane1.add(txtGender, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/21.jpg"))); // NOI18N
        jLabel8image.setBounds(0, 0, 850, 580);
        jLayeredPane1.add(jLabel8image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtDateActionPerformed

private void txtCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckInActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtCheckInActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void jButton1bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1bookActionPerformed
       HotelDAO perform = new HotelDAO();
        try{
            if(txtName.getText().equals("") || txtEmail.getText().equals("") || txtAddress.getText().equals("") || 
                    txtDate.getText().equals("") || txtAge.getText().equals("") || 
                    txtGender.getText().equals("") ||
            txtContacts.getText().equals("") || txtRoomNum.getText().equals("") || txtCheckIn.getText().equals("") || 
                    txtCheckOut.getText().equals("") || comboRoomType.getSelectedItem().toString().equals("") || 
                    txtOccupant.getText().equals("") ) { JOptionPane.showMessageDialog(this, "Please complete all fields.");
            } else {
          
                perform.SaveData("INSERT INTO guestlist (ID, Name, Address, Gender, Date, Age, Contacts, Email, RoomType, RoomNum, CheckIn, CheckOut, OccupyNum) VALUES (null, '"+txtName.getText().toUpperCase()+"','"+txtAddress.getText().toUpperCase()+"','"+txtGender.getText().toUpperCase()+"','"+txtDate.getText().toUpperCase()+"','"+txtAge.getText().toUpperCase()+"','"+txtContacts.getText().toUpperCase()+"','"+txtEmail.getText().toUpperCase()+"','"+comboRoomType.getSelectedItem()+"','"+txtRoomNum.getText().toUpperCase()+"','"+txtCheckIn.getText().toUpperCase()+"','"+txtCheckOut.getText().toUpperCase()+"','"+txtOccupant.getText().toUpperCase()+"')");
                JOptionPane.showMessageDialog(this, "Success! Reservation has been made.");
            }                
        }catch(Exception e){
                          e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1bookActionPerformed

    private void jButton2backhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2backhomeActionPerformed
        Home view3 = new Home(this, true);
        view3.setVisible(true);
    }//GEN-LAST:event_jButton2backhomeActionPerformed

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
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Guest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.ButtonGroup btnGroup2;
    private javax.swing.JComboBox comboRoomType;
    private javax.swing.JButton jButton1book;
    private javax.swing.JButton jButton2backhome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10booking;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13addresstop;
    private javax.swing.JLabel jLabel15bookinginfo;
    private javax.swing.JLabel jLabel1date;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2name;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3address;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5age;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8contact;
    private javax.swing.JLabel jLabel8image;
    private javax.swing.JLabel jLabel9email;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private java.awt.Label label1personal;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCheckIn;
    private javax.swing.JTextField txtCheckOut;
    private javax.swing.JTextField txtContacts;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOccupant;
    private javax.swing.JTextField txtRoomNum;
    // End of variables declaration//GEN-END:variables
}
