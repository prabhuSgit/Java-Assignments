/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.Customer.Customer;
import Business.TravelAgency.Airline;
import Business.TravelAgency.AirlineDirectory;
import Business.TravelAgency.Flight;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prabhu Surbamanian
 */
public class UserDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserDirectory
     */
    private DefaultTableModel dtm;
    private AirlineDirectory airlineDirectory;
    
    UserDirectoryJPanel(JPanel rightJPanel, AirlineDirectory airlineDirectory) {
        initComponents();
        this.airlineDirectory=airlineDirectory;
        populate();
    }
    
    public void populate(){
        dtm = (DefaultTableModel)userDirectory.getModel();
        dtm.setRowCount(0);
        
        for(Airline airline : airlineDirectory.getAirlinerDiroctory()){
            for(Flight flight : airline.getFlightDirectory()){
                for(Customer customer : flight.getCustomerDirectory()){
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0]=customer;
                    /*row[1]=customer.getCustomerFirstName();*/
                    row[1]=customer.getCustomerLastName();
                    row[2]=customer.getCustomerAge();
                    row[3]=customer.getAirline();
                    dtm.addRow(row);
                
                }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userDirectory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        userDirectory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Flight Code", "Airline"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userDirectory);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable userDirectory;
    // End of variables declaration//GEN-END:variables
}