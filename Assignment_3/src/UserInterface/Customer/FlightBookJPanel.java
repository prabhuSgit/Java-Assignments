/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.TravelAgency.Airline;
import Business.TravelAgency.AirlineDirectory;
import Business.TravelAgency.Flight;
import Business.TravelAgency.UserDirectory;
import UserInterface.TravelAgency.ViewAirlineJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prabhu Surbamanian
 */
public class FlightBookJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookJPanel
     */
    private JPanel rightJPanel;
    private AirlineDirectory airlineDirectory;
    private Airline airline;
    private Flight flight;
    private int seatNo = 1;
    private DefaultTableModel dtm;
    private UserDirectory userDirectory;
    private ArrayList<Customer> custArray;
    private Customer customer;
    
    FlightBookJPanel(JPanel rightJPanel, Airline airline, Flight flight) {
        initComponents();
        this.rightJPanel=rightJPanel;
        this.airlineDirectory=airlineDirectory;
        this.airline=airline;
        this.flight=flight;
        this.dtm=dtm;
        
        fromLocationTxtField.setText(flight.getFromLocation());
        toLocationTxtField.setText(flight.getToLocation());
        flightCodeTxtField.setText(flight.getFlightCode());
        airlinesNameTxtField.setText(airline.getName());
        //seatAvailabilityTxtField.setText(String.valueOf(flight.getSeats()));
        
        dtm = (DefaultTableModel)passengerTbl.getModel();
        dtm.setRowCount(0);
        custArray = new ArrayList<Customer>();
        populate();
    }
    public void populate(){
        
        String array[][] = flight.getSeat();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(array[i][j] == "0"){
                    flightSeatTbl.setCellSelectionEnabled(false);
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

        fromLocationTxtField = new javax.swing.JTextField();
        toLocationTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        flightCodeTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        airlinesNameTxtField = new javax.swing.JTextField();
        addPassengerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengerTbl = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstNameTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastNameTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        seatBookingDropDown = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        flightSeatTbl = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        fromLocationTxtField.setEditable(false);
        fromLocationTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fromLocationTxtField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        toLocationTxtField.setEditable(false);
        toLocationTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toLocationTxtField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("From Location:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To Location:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Flight Booking");

        flightCodeTxtField.setEditable(false);
        flightCodeTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightCodeTxtField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Flight:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Airlines:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        airlinesNameTxtField.setEditable(false);
        airlinesNameTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        airlinesNameTxtField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addPassengerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addPassengerBtn.setText("Add Passenger");
        addPassengerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPassengerBtnActionPerformed(evt);
            }
        });

        passengerTbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passengerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Age", "Seat No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(passengerTbl);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Passenger Details:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("First Name:");

        firstNameTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Last Name:");

        lastNameTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Age:");

        ageTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setText("Book");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        seatBookingDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seatBookingDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select a Seat>", "W1", "M2", "A3", "W4", "M5", "A6", "W7", "M8", "A9" }));
        seatBookingDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatBookingDropDownActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Seat No:");

        flightSeatTbl.setAutoCreateRowSorter(true);
        flightSeatTbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        flightSeatTbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightSeatTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Seat 1", "Seat 2", "Seat 3"},
                {"Seat 4", "Seat 5", "Seat 6"},
                {"Seat 7", "Seat 8", "Seat 9"}
            },
            new String [] {
                "Window", "Middle", "Aisle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightSeatTbl.setCellSelectionEnabled(true);
        flightSeatTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flightSeatTbl.setDropMode(javax.swing.DropMode.ON);
        flightSeatTbl.setSelectionBackground(new java.awt.Color(0, 204, 0));
        flightSeatTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightSeatTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(flightSeatTbl);
        flightSeatTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Flight Seats");

        jLabel13.setText("W: Window");

        jLabel14.setText("M: Middle");

        jLabel15.setText("A: Aisle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(seatBookingDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(76, 76, 76))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(addPassengerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel12))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(submitBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(flightCodeTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(fromLocationTxtField))
                                    .addGap(139, 139, 139)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(toLocationTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(airlinesNameTxtField)))))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fromLocationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(flightCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(airlinesNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(toLocationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(addPassengerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seatBookingDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(submitBtn)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPassengerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPassengerBtnActionPerformed
        // TODO add your handling code here:
        
        int count = 0;
        if(seatBookingDropDown.getSelectedItem().equals("<Select a Seat>")){
                count++;
                JOptionPane.showMessageDialog(null, "Kindly select a seat!");
                
        }else{
            int k = flight.checkReserve((String)seatBookingDropDown.getSelectedItem());

            if(seatNo<=9){
                if(firstNameTxtField.getText().isEmpty() || 
                   lastNameTxtField.getText().isEmpty() ||
                   ageTxtField.getText().isEmpty()){

                    JOptionPane.showMessageDialog(null, "Please add all the details!", "Error", JOptionPane.ERROR_MESSAGE);

                }else{
                    try{
                        Integer.parseInt(ageTxtField.getText());
                        count++;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, "Age: Only numbers are allowed", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }

                if(k==0){
                    if(count == 1){
                        Object[] row = new Object[dtm.getColumnCount()];
                        row[0]=firstNameTxtField.getText();
                        row[1]=lastNameTxtField.getText();
                        row[2]=ageTxtField.getText();;
                        row[3]=seatBookingDropDown.getSelectedItem();
                        dtm.addRow(row);

                        customer = new Customer(); 
                        customer.setCustomerFirstName(firstNameTxtField.getText());
                        customer.setCustomerLastName(lastNameTxtField.getText());
                        customer.setCustomerAge(Integer.parseInt(ageTxtField.getText()));
                        customer.setAirline(flight.getAirline());
                        customer.setFlightCode(flight.getFlightCode());
                        customer.setFromLocation(flight.getFromLocation());
                        customer.setToLocation(flight.getToLocation());
                        customer.setSeat((String)seatBookingDropDown.getSelectedItem());
                        seatNo++;
                        custArray.add(customer);
                    }
                }

            }else{
                JOptionPane.showMessageDialog(null, "Sorry, the flight is full!");
            }
        }
        
        firstNameTxtField.setText("");
        lastNameTxtField.setText("");
        ageTxtField.setText("");
        seatBookingDropDown.setSelectedIndex(0);
    }//GEN-LAST:event_addPassengerBtnActionPerformed

    public void book(){
        flight.setCustomerDirectory(custArray);
        flight.setSeats((String)seatBookingDropDown.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Flight booked!");
        FinalJPanel finalPanel  = new FinalJPanel();
        rightJPanel.add("ScheduleManageJPanel", finalPanel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        /*Customer*/
        book();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void seatBookingDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatBookingDropDownActionPerformed
        // TODO add your handling code here:
        /*flight.checkReserve((String)seatBookingDropDown.getSelectedItem());*/
        
    }//GEN-LAST:event_seatBookingDropDownActionPerformed

    private void flightSeatTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightSeatTblMouseClicked
        // TODO add your handling code here:
        String array[][] = flight.getSeat();
        if(array[flightSeatTbl.getSelectedRow()][flightSeatTbl.getSelectedColumn()]=="0"){
            JOptionPane.showMessageDialog(null, "Sorry, the seat has already been taken", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            seatBookingDropDown.setSelectedItem(array[flightSeatTbl.getSelectedRow()][flightSeatTbl.getSelectedColumn()]);
        }
        
    }//GEN-LAST:event_flightSeatTblMouseClicked
    
    /*private void backAction() {
        rightJPanel.remove(this);
        Component[] componentArray = rightJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerLoginJPanel customerLoginJPanel = (CustomerLoginJPanel) component;
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPassengerBtn;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JTextField airlinesNameTxtField;
    private javax.swing.JTextField firstNameTxtField;
    private javax.swing.JTextField flightCodeTxtField;
    private javax.swing.JTable flightSeatTbl;
    private javax.swing.JTextField fromLocationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameTxtField;
    private javax.swing.JTable passengerTbl;
    private javax.swing.JComboBox seatBookingDropDown;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField toLocationTxtField;
    // End of variables declaration//GEN-END:variables
}
