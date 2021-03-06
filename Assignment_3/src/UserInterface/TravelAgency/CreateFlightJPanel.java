/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.TravelAgency.Airline;
import Business.TravelAgency.AirlineDirectory;
import Business.TravelAgency.Flight;
import Business.TravelAgency.FlightDirectory;
import java.awt.CardLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Prabhu Surbamanian
 */
public class CreateFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightManager
     */
    private AirlineDirectory airlinerDirectory;
    private Airline airline;
    private JPanel rightJPanel;
    
    CreateFlightJPanel(JPanel rightJPanel, Airline airline, AirlineDirectory airlinerDirectory) {
        initComponents();
        this.airline=airline;
        this.rightJPanel=rightJPanel;
        this.airlinerDirectory=airlinerDirectory;
        airlineNameTxtField.setText(airline.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        flightNameTxtField = new javax.swing.JTextField();
        airlineNameTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        airlineNameLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fromDropDown = new javax.swing.JComboBox();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        toDropDown = new javax.swing.JComboBox();
        scheduleDropDown = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(255, 255, 255));

        flightNameTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        airlineNameTxtField.setEditable(false);
        airlineNameTxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Flight Code:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("From Location:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("To Location:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Schedule:");

        airlineNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        airlineNameLabel.setText("Airline:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Adding Flight");

        fromDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select a City>", "Boston", "New York", "Washingtone" }));

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        toDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select a City>", "Boston", "New York", "Washingtone" }));

        scheduleDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scheduleDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select Schedule>", "Morning", "Afternoon", "Evening" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(airlineNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(flightNameTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(airlineNameTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(scheduleDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fromDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel4)
                                        .addGap(20, 20, 20)
                                        .addComponent(toDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel8)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlineNameLabel)
                    .addComponent(airlineNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(fromDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(scheduleDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(addBtn))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String errorMsg = "";
        int count = 0;
        if(flightNameTxtField.getText().isEmpty()){
            errorMsg = errorMsg.concat("Please add all the details!\n");
        }
            /*flightNameTxtField.getText();
            
            try{
            Integer.parseInt(seatsTxtField.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Only numbers are allowed for Seats");
                return;
            }*/
        if(fromDropDown.getSelectedItem().equals("<Select a City>")){
            count++;
            errorMsg=errorMsg.concat("Please select From city\n");
        }
        if(toDropDown.getSelectedItem().equals("<Select a City>")){
            count++;
            errorMsg=errorMsg.concat("Please select To city\n");
        }
        if(scheduleDropDown.getSelectedItem().equals("<Select Schedule>")){
            count++;
            errorMsg=errorMsg.concat("Please select Flight Schedule\n");
        }if(fromDropDown.getSelectedItem() == toDropDown.getSelectedItem()){
            count++;
            errorMsg=errorMsg.concat("From and To location cant be same");
        }
        if(count != 0){
            JOptionPane.showMessageDialog(null, errorMsg,"Incomplete entry!",JOptionPane.ERROR_MESSAGE);
        }else{
            Flight newFlight = airline.addFlight();
            newFlight.setFlightCode(flightNameTxtField.getText());
            newFlight.setFromLocation((String)fromDropDown.getSelectedItem());
            newFlight.setToLocation((String)toDropDown.getSelectedItem());
                /*newFlight.setSeats(Integer.parseInt(seatsTxtField.getText()));*/
            newFlight.setSchedule((String)scheduleDropDown.getSelectedItem());
            newFlight.setAirline(airline.getName());
            newFlight.setStatus("Available");
            
                /*JOptionPane.showMessageDialog(null, fromDropDown.getSelectedItem());*/
            JOptionPane.showMessageDialog(null, "Airline added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            rightJPanel.remove(this);
            CardLayout layout = (CardLayout)rightJPanel.getLayout();
            layout.previous(rightJPanel);
        }
            
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel airlineNameLabel;
    private javax.swing.JTextField airlineNameTxtField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField flightNameTxtField;
    private javax.swing.JComboBox fromDropDown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox scheduleDropDown;
    private javax.swing.JComboBox toDropDown;
    // End of variables declaration//GEN-END:variables
}
