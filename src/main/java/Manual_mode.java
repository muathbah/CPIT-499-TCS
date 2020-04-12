
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igold
 */
public class Manual_mode extends javax.swing.JFrame {

    static Account temp_account;
    private DatabaseReference mDatabase;
    static Roundabout[] temp = new Roundabout[10];
    static Object o;
    int j = 0;
    static Roundabout tempr, update_roundabout;
    static String[] roundaboutid;
    static Roundabout ttemp;

    /**
     * Creates new form Manual_mode
     */
    public Manual_mode() {
        initComponents();

    }

    public Manual_mode(Account temp_account , Roundabout ttemp) throws InterruptedException {
        initComponents();

        Manual_mode.temp_account = temp_account;
        Manual_mode.ttemp = ttemp;
        
        jLabel1.setText("User ID: " + temp_account.getAccount_ID());

        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();

        jComboBox3.addItem("Green");
        jComboBox3.addItem("Red");
        
        
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + ttemp.Roundabout_ID + "/policy/flag");

            mDatabase.setValue(false, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {

                }
            });
            ttemp.setFlag(false);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/");

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot ds) {
                // Get Post object and use the values to update the UI

                //ds.getChildren();
                //System.out.println(ds.getChildren().iterator().next());
                o = ds.getValue();

                // temp_userID = ds.getChildren().toString();
                //temp.setRoundabout_ID(ds.getValue(String.class));
                // ...
            }

            @Override
            public void onCancelled(DatabaseError de) {

            }
        });
        Thread.sleep(6000);
        String temp_to_string = o.toString();
        String[] array_of_IDs = temp_to_string.split("roundabout_ID=");

        String[] IDs = new String[10];
        int counter = 1;
        for (int i = 0; i < array_of_IDs.length; i++) {

            try {

                IDs[i] = array_of_IDs[counter];
                counter++;
                
            } catch (Exception e) {
                break;
            }
        }

        String[] street_name = new String[10];
        for (int i = 0; i < IDs.length; i++) {
            try {

                String[] test = IDs[i].split("}");

                street_name[i] = test[0];
            } catch (Exception e) {

            }

        }
        temp = new Roundabout[10];
        
        for (j = 0; j < street_name.length; j++) {
            if (street_name[j] != null) {
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + street_name[j]+"/roundabout_name");
                temp[j] = new Roundabout();
                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot ds) {
                        // Get Post object and use the values to update the UI

                        //ds.getChildren();
                        //System.out.println(ds.getChildren().iterator().next());
                        temp[j].setRoundabout_name(ds.getValue(String.class));
                        // temp_userID = ds.getChildren().toString();
                        //temp.setRoundabout_ID(ds.getValue(String.class));
                        // ...
                    }

                    @Override
                    public void onCancelled(DatabaseError de) {

                    }
                });
                
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + street_name[j]+"/roundabout_ID");
                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot ds) {
                        // Get Post object and use the values to update the UI

                        //ds.getChildren();
                        //System.out.println(ds.getChildren().iterator().next());
                        temp[j].setRoundabout_ID(ds.getValue(String.class));
                        // temp_userID = ds.getChildren().toString();
                        //temp.setRoundabout_ID(ds.getValue(String.class));
                        // ...
                    }

                    @Override
                    public void onCancelled(DatabaseError de) {

                    }
                });
                
                
                Thread.sleep(6000);
            } else {
                break;
            }

        }

        for (int i = 0; i < 10; i++) {
            
            if (temp[i] != null) {
                jComboBox1.addItem(temp[i].getRoundabout_name() + " / " + temp[i].getRoundabout_ID());
                
            }

        }

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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 310, 140, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 320, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(390, 130, 217, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(390, 170, 217, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(390, 210, 217, 20);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Load the streets");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(620, 160, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Select roundabout to control :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 130, 263, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Select street to change the traffic light :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 170, 320, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Select the status of the traffic light :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 210, 300, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 30, 150, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\downloads from chrome\\Traffic_Control_System_CPIT-499\\Photos\\1.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 850, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            update_roundabout = new Roundabout();

            update_roundabout = tempr;
            String selected2 = (String) jComboBox2.getSelectedItem();
            String selected3 = (String) jComboBox3.getSelectedItem();
            if (update_roundabout.getNorth_street().Dir_name.equals(selected2)) {
                update_roundabout.North_street.traffic_light_status = selected3;
            } else if (update_roundabout.getEast_street().Dir_name.equals(selected2)) {
                update_roundabout.East_street.traffic_light_status = selected3;
            } else if (update_roundabout.getSouth_street().Dir_name.equals(selected2)) {
                update_roundabout.South_street.traffic_light_status = selected3;
            } else if (update_roundabout.getWest_street().Dir_name.equals(selected2)) {
                update_roundabout.West_street.traffic_light_status = selected3;
            }

            if (update_roundabout.North_street.Dir_name.equals((String)jComboBox2.getSelectedItem())){
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/north_street/traffic_light_status");

            mDatabase.setValue(update_roundabout.North_street.traffic_light_status, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {

                }
            });
            }else if (update_roundabout.East_street.Dir_name.equals((String)jComboBox2.getSelectedItem())){
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/east_street/traffic_light_status");

            mDatabase.setValue(update_roundabout.East_street.traffic_light_status, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {

                }
            });
            }else if (update_roundabout.South_street.Dir_name.equals((String)jComboBox2.getSelectedItem())){
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/south_street/traffic_light_status");

            mDatabase.setValue(update_roundabout.South_street.traffic_light_status, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {

                }
            });
            }else if (update_roundabout.West_street.Dir_name.equals((String)jComboBox2.getSelectedItem())){
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/west_street/traffic_light_status");

            mDatabase.setValue(update_roundabout.West_street.traffic_light_status, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {

                }
            });
            }
            

            Thread.sleep(6000);
        } catch (InterruptedException ex) {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (temp_account.getPriv().equals("1111")) {
//            Main_menu_admin menu = new Main_menu_admin(temp_account);
//            menu.setVisible(true);
            this.setVisible(false);
            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
        } else if (temp_account.getPriv().charAt(2) == '1' || temp_account.getPriv().charAt(3) == '1') {
//            Main_menu_operator menu = new Main_menu_operator(temp_account);
//            menu.setVisible(true);
            this.setVisible(false);
            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jComboBox2.removeAllItems();

        try {
            String t = (String) jComboBox1.getSelectedItem();
            roundaboutid = t.split(" / ");
            Direction North_street = new Direction("","", 0);
            Direction East_street = new Direction("","", 0);
            Direction South_street = new Direction("", "", 0);
            Direction West_street = new Direction("", "", 0);
            tempr = new Roundabout("", "", North_street, East_street, South_street, West_street);
            
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/roundabout_ID");
            
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot ds) {
                    // Get Post object and use the values to update the UI

                    //ds.getChildren();
                    //System.out.println(ds.getChildren().iterator().next());
                    tempr.Roundabout_ID= ds.getValue(String.class);

                    // temp_userID = ds.getChildren().toString();
                    //temp.setRoundabout_ID(ds.getValue(String.class));
                    // ...
                }

                @Override
                public void onCancelled(DatabaseError de) {

                }
            });
            
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"roundabout_name");
            
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot ds) {
                    // Get Post object and use the values to update the UI

                    //ds.getChildren();
                    //System.out.println(ds.getChildren().iterator().next());
                    tempr.Roundabout_name= ds.getValue(String.class);

                    // temp_userID = ds.getChildren().toString();
                    //temp.setRoundabout_ID(ds.getValue(String.class));
                    // ...
                }

                @Override
                public void onCancelled(DatabaseError de) {

                }
            });
            
            
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/north_street/dir_name");
            
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot ds) {
                    // Get Post object and use the values to update the UI

                    //ds.getChildren();
                    //System.out.println(ds.getChildren().iterator().next());
                    tempr.North_street.Dir_name= ds.getValue(String.class);

                    // temp_userID = ds.getChildren().toString();
                    //temp.setRoundabout_ID(ds.getValue(String.class));
                    // ...
                }

                @Override
                public void onCancelled(DatabaseError de) {

                }
            });
            
            
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/east_street/dir_name");
            
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot ds) {
                    // Get Post object and use the values to update the UI

                    //ds.getChildren();
                    //System.out.println(ds.getChildren().iterator().next());
                    tempr.East_street.Dir_name= ds.getValue(String.class);

                    // temp_userID = ds.getChildren().toString();
                    //temp.setRoundabout_ID(ds.getValue(String.class));
                    // ...
                }

                @Override
                public void onCancelled(DatabaseError de) {

                }
            });
            
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/south_street/dir_name");
            
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot ds) {
                    // Get Post object and use the values to update the UI

                    //ds.getChildren();
                    //System.out.println(ds.getChildren().iterator().next());
                    tempr.South_street.Dir_name= ds.getValue(String.class);

                    // temp_userID = ds.getChildren().toString();
                    //temp.setRoundabout_ID(ds.getValue(String.class));
                    // ...
                }

                @Override
                public void onCancelled(DatabaseError de) {

                }
            });
            
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Database/Roundabouts/" + roundaboutid[1]+"/west_street/dir_name");
            
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot ds) {
                    // Get Post object and use the values to update the UI

                    //ds.getChildren();
                    //System.out.println(ds.getChildren().iterator().next());
                    tempr.West_street.Dir_name= ds.getValue(String.class);

                    // temp_userID = ds.getChildren().toString();
                    //temp.setRoundabout_ID(ds.getValue(String.class));
                    // ...
                }

                @Override
                public void onCancelled(DatabaseError de) {

                }
            });
            
            
            Thread.sleep(6000);
            
            System.out.println("north street: "+tempr.getNorth_street().Dir_name);
            System.out.println("east street: "+tempr.getEast_street().Dir_name);
            System.out.println("south street: "+tempr.getSouth_street().Dir_name);
            System.out.println("west street: "+tempr.getWest_street().Dir_name);
        } catch (InterruptedException ex) {

        }

        jComboBox2.addItem(tempr.getNorth_street().Dir_name);
        jComboBox2.addItem(tempr.getEast_street().Dir_name);
        jComboBox2.addItem(tempr.getSouth_street().Dir_name);
        jComboBox2.addItem(tempr.getWest_street().Dir_name);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Manual_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manual_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manual_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manual_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manual_mode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
