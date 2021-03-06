/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Report.Person;
import Report.Demographic;
import Report.Address;
import Report.Bank;
import Report.DriverLicense;
import Report.MedicalRecord;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Prabhu Surbamanian
 */

public class ReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAddressJPanel
     */

    public ReportJPanel(Person person) 
    {
        initComponents();
        displayReport(person);
        /*
        displayReport(demographic,addres,savingBank,checkingBank,driverLicense,medicalRecord);
        */
    }

    private void displayReport(Person person)
    {
        String personFirstName = person.getDemographic().getFirstName();
        firstNameTextField.setText(personFirstName);
        
        String personLastName = person.getDemographic().getLastName();
        lastNameTextField.setText(personLastName);
        
        String personPhoneNbr = person.getDemographic().getPhoneNumber();
        phoneNumberTextField.setText(personPhoneNbr);
        
        String personDob = person.getDemographic().getDob();
        dobTextField.setText(personDob);
        
        String personAge = person.getDemographic().getAge();
        ageTextField.setText(personAge);
        
        String personHeight = person.getDemographic().getHeight();
        heightTextField.setText(personHeight);
        
        String personWeight = person.getDemographic().getWeight();
        weightTextField.setText(personWeight);
        
        String personSsn = person.getDemographic().getSsn();
        ssnTextFied.setText(personSsn);
        
        String personStreet = person.getAddress().getStreetAdd();
        streetAddressTextField.setText(personStreet);
        
        String personCity = person.getAddress().getCity();
        cityTextField.setText(personCity);
        
        String personState = person.getAddress().getState();
        stateTextField.setText(personState);
        
        String personZip = person.getAddress().getZipCode();
        zipTextField.setText(personZip);
        
        String personSavingBankName = person.getSavingsAccount().getBankName();
        banksavingNameTextField.setText(personSavingBankName);
        
        String personSavingRoutingNumber = person.getSavingsAccount().getBankRoutingNumber();
        bankRoutingNbrTextField.setText(personSavingRoutingNumber);
        
        String personSavingAccNbr = person.getSavingsAccount().getAccountNumber();
        bankAcctNbrTextField.setText(personSavingAccNbr);
        
        String personSavingAccBalance = person.getSavingsAccount().getAccountBalance();
        AccBalanceTextField.setText(personSavingAccBalance);
        
        String personCheckingBankName = person.getCheckingAccount().getBankName();
        bankcheckingNameTextField.setText(personCheckingBankName);
        
        String personCheckingRoutingNumber = person.getCheckingAccount().getBankRoutingNumber();
        routingNbrTextField.setText(personCheckingRoutingNumber);
        
        String personCheckingAccNbr = person.getCheckingAccount().getAccountNumber();
        checkingNbrTextField.setText(personCheckingAccNbr);
        
        String personCheckingAccBalance = person.getCheckingAccount().getAccountBalance();
        AcctBalanceTextField.setText(personCheckingAccBalance);
        
        String personLicenseNbr = person.getDriverLicense().getLicenseNumber();
        licenseNbrTextField.setText(personLicenseNbr);
        
        String personDoi = person.getDriverLicense().getDateIssued();
        doiTextField.setText(personDoi);
        
        String personDoe = person.getDriverLicense().getDateExpiry();
        doeTextField.setText(personDoe);
        
        String personBlood = person.getDriverLicense().getBloodType();
        bloodTextField.setText(personBlood);
        
        
        String picture = person.getDriverLicense().getPicture();
        ImageIcon displayReportImage = new ImageIcon(picture);
        imageBoxField.setBounds(200, 200, 200, 200);
        Image im1 = displayReportImage.getImage();
        Image im2 = im1.getScaledInstance(imageBoxField.getWidth(), imageBoxField.getHeight(), Image.SCALE_FAST);
        ImageIcon imgDsiplay = new ImageIcon(im2);       
        imageBoxField.setIcon(imgDsiplay);
        
        /*
        String personPicture = person.getDriverLicense().getPicture();
        ImageIcon displayReportImage = new ImageIcon(personPicture);
        imageBoxField.setIcon(displayReportImage);
        */
        
        
        String personMedicalNbr = person.getMedicalRecord().getMedicalRecordNbr();
        mrnNbrTextField.setText(personMedicalNbr);
        
        String personAlergy1 = person.getMedicalRecord().getAlergy1();
        alergy1TextField.setText(personAlergy1);
        
        String personAlergy2 = person.getMedicalRecord().getAlergy2();
        alergy2TextField.setText(personAlergy2);
        
        String personAlergy3 = person.getMedicalRecord().getAlergy3();
        alergy3TextField.setText(personAlergy3);
        
        /*
        String personFirstName = demographic.getFirstName();
        firstNameTextField.setText(personFirstName);
        
        String personLastName = demographic.getLastName();
        lastNameTextField.setText(personLastName);
        
        String personPhoneNbr = demographic.getPhoneNumber();
        phoneNumberTextField.setText(personPhoneNbr);
        
        String personDob = demographic.getDob();
        dobTextField.setText(personDob);
        
        String personAge = demographic.getAge();
        ageTextField.setText(personAge);
        
        String personHeight = demographic.getHeight();
        heightTextField.setText(personHeight);
        
        String personWeight = demographic.getWeight();
        weightTextField.setText(personWeight);
        
        String personSsn = demographic.getSsn();
        ssnTextFied.setText(personSsn);
        
        String personStreet = address.getStreetAdd();
        streetAddressTextField.setText(personStreet);
        
        String personCity = address.getCity();
        cityTextField.setText(personCity);
        
        String personState = address.getState();
        stateTextField.setText(personState);
        
        String personZip = address.getZipCode();
        zipTextField.setText(personZip);
        
        String personSavingBankName = savingBank.getBankName();
        banksavingNameTextField.setText(personSavingBankName);
        
        String personSavingRoutingNumber = savingBank.getBankRoutingNumber();
        bankRoutingNbrTextField.setText(personSavingRoutingNumber);
        
        String personSavingAccNbr = savingBank.getAccountNumber();
        bankAcctNbrTextField.setText(personSavingAccNbr);
        
        String personSavingAccBalance = savingBank.getAccountBalance();
        AccBalanceTextField.setText(personSavingAccBalance);
        
        String personCheckingBankName = checkingBank.getBankName();
        bankcheckingNameTextField.setText(personCheckingBankName);
        
        String personCheckingRoutingNumber = checkingBank.getBankRoutingNumber();
        routingNbrTextField.setText(personCheckingRoutingNumber);
        
        String personCheckingAccNbr = checkingBank.getAccountNumber();
        checkingNbrTextField.setText(personCheckingAccNbr);
        
        String personCheckingAccBalance = checkingBank.getAccountBalance();
        AcctBalanceTextField.setText(personCheckingAccBalance);
        
        String personLicenseNbr = driverLicense.getLicenseNumber();
        licenseNbrTextField.setText(personLicenseNbr);
        
        String personDoi = driverLicense.getDateIssued();
        doiTextField.setText(personDoi);
        
        String personDoe = driverLicense.getDateExpiry();
        doeTextField.setText(personDoe);
        
        String personBlood = driverLicense.getBloodType();
        bloodTextField.setText(personBlood);
        
        String personPicture = driverLicense.getPicture();
        ImageIcon displayReportImage = new ImageIcon(personPicture);
        imageBoxField.setIcon(displayReportImage);
        
        String personMedicalNbr = medicalRecord.getMedicalRecordNbr();
        mrnNbrTextField.setText(personMedicalNbr);
        
        String personAlergy1 = medicalRecord.getAlergy1();
        alergy1TextField.setText(personAlergy1);
        
        String personAlergy2 = medicalRecord.getAlergy2();
        alergy2TextField.setText(personAlergy2);
        
        String personAlergy3 = medicalRecord.getAlergy3();
        alergy3TextField.setText(personAlergy3);
        */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ssnTextFied = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cityTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        zipTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        streetAddressTextField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        banksavingNameTextField = new javax.swing.JTextField();
        AccBalanceTextField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        bankRoutingNbrTextField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        bankAcctNbrTextField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        AcctBalanceTextField = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        bankcheckingNameTextField = new javax.swing.JTextField();
        routingNbrTextField = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        checkingNbrTextField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        doiTextField = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        bloodTextField = new javax.swing.JTextField();
        licenseNbrTextField = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        doeTextField = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        alergy1TextField = new javax.swing.JTextField();
        alergy3TextField = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        mrnNbrTextField = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        alergy2TextField = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        imageBoxField = new javax.swing.JLabel();

        setAutoscrolls(true);
        setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("           Detailed Report     ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Weight :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("SSN :");

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("First name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Last name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ph. number :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date of birth :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Height :");

        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Age :");

        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("City :");

        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Zip :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Street address :");

        zipTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipTextFieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("State :");

        streetAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetAddressTextFieldActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Bank Name :");

        banksavingNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banksavingNameTextFieldActionPerformed(evt);
            }
        });

        AccBalanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccBalanceTextFieldActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Bank Account Number :");

        bankRoutingNbrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankRoutingNbrTextFieldActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Bank Routing Number :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Account Balance :");

        bankAcctNbrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankAcctNbrTextFieldActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Saving");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Account Type :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Bank Routing Number :");

        AcctBalanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcctBalanceTextFieldActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Bank Name :");

        bankcheckingNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankcheckingNameTextFieldActionPerformed(evt);
            }
        });

        routingNbrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routingNbrTextFieldActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Bank Account Number :");

        checkingNbrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingNbrTextFieldActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Checking");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Account Type :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Account Balance :");

        doiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doiTextFieldActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Date of Expiry :");

        bloodTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTextFieldActionPerformed(evt);
            }
        });

        licenseNbrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseNbrTextFieldActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("License Number :");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Picture :");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Blood Type :");

        doeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doeTextFieldActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Date Of Issue :");

        alergy1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy1TextFieldActionPerformed(evt);
            }
        });

        alergy3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy3TextFieldActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("Alergy2 :");

        mrnNbrTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrnNbrTextFieldActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("Medical Record Number :");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("Alergy3 :");

        alergy2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy2TextFieldActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Alergy1 :");

        imageBoxField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imageBoxField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alergy3TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                            .addComponent(alergy2TextField)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(42, 42, 42)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(doeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                .addComponent(mrnNbrTextField)
                                                .addComponent(bloodTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                .addComponent(alergy1TextField)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(41, 41, 41)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(doiTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(licenseNbrTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))))
                                .addGap(269, 269, 269))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                            .addGap(72, 72, 72))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(bankAcctNbrTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                .addComponent(bankRoutingNbrTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(banksavingNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(AccBalanceTextField))
                                            .addGap(71, 71, 71)))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel42))
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(routingNbrTextField)
                                                .addComponent(bankcheckingNameTextField)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel44)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(AcctBalanceTextField)
                                                .addComponent(checkingNbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ssnTextFied, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(16, 16, 16)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                                .addComponent(firstNameTextField)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(heightTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                .addComponent(dobTextField))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                .addComponent(weightTextField))))
                                    .addGap(86, 86, 86)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(zipTextField))
                                        .addComponent(stateTextField)
                                        .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dobTextField)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addComponent(ssnTextFied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(banksavingNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel38))
                            .addComponent(bankRoutingNbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(bankAcctNbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(AccBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(bankcheckingNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(routingNbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(checkingNbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(AcctBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel49)
                                    .addComponent(licenseNbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mrnNbrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alergy2TextField))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alergy3TextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(imageBoxField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void zipTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipTextFieldActionPerformed

    private void streetAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetAddressTextFieldActionPerformed

    private void banksavingNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banksavingNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banksavingNameTextFieldActionPerformed

    private void AccBalanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccBalanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccBalanceTextFieldActionPerformed

    private void bankRoutingNbrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankRoutingNbrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankRoutingNbrTextFieldActionPerformed

    private void bankAcctNbrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankAcctNbrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankAcctNbrTextFieldActionPerformed

    private void AcctBalanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcctBalanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcctBalanceTextFieldActionPerformed

    private void bankcheckingNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankcheckingNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankcheckingNameTextFieldActionPerformed

    private void routingNbrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routingNbrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routingNbrTextFieldActionPerformed

    private void checkingNbrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingNbrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkingNbrTextFieldActionPerformed

    private void doiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doiTextFieldActionPerformed

    private void bloodTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTextFieldActionPerformed

    private void licenseNbrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseNbrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseNbrTextFieldActionPerformed

    private void doeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doeTextFieldActionPerformed

    private void alergy1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy1TextFieldActionPerformed

    private void alergy3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy3TextFieldActionPerformed

    private void mrnNbrTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrnNbrTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrnNbrTextFieldActionPerformed

    private void alergy2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy2TextFieldActionPerformed

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccBalanceTextField;
    private javax.swing.JTextField AcctBalanceTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField alergy1TextField;
    private javax.swing.JTextField alergy2TextField;
    private javax.swing.JTextField alergy3TextField;
    private javax.swing.JTextField bankAcctNbrTextField;
    private javax.swing.JTextField bankRoutingNbrTextField;
    private javax.swing.JTextField bankcheckingNameTextField;
    private javax.swing.JTextField banksavingNameTextField;
    private javax.swing.JTextField bloodTextField;
    private javax.swing.JTextField checkingNbrTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField doeTextField;
    private javax.swing.JTextField doiTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel imageBoxField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField licenseNbrTextField;
    private javax.swing.JTextField mrnNbrTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField routingNbrTextField;
    private javax.swing.JTextField ssnTextFied;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetAddressTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
}
