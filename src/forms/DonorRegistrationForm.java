/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Donorform.java
 *
 * Created on Jan 3, 2014, 11:56:43 PM
 */
package forms;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DonorRegistrationForm extends javax.swing.JFrame {

    private String submittedUsername;
    private String submittedPassword;
    private String submittedConfirmpassword;
    private String submittedFullName;
    private int submittedAge;
    private String submittedGender;
    private String submittedPhone;
    private String submittedCity;
    private String submittedState;
    boolean returnFromDonorBL;
    boolean returnFromDonorRegistrationBL;

    public String getSubmittedConfirmpassword() {
        return submittedConfirmpassword;
    }

    public void setSubmittedConfirmpassword(String submittedConfirmpassword) {
        this.submittedConfirmpassword = submittedConfirmpassword;
    }

    public String getSubmittedPassword() {
        return submittedPassword;
    }

    public void setSubmittedPassword(String submittedPassword) {
        this.submittedPassword = submittedPassword;
    }

    public String getSubmittedUsername() {
        return submittedUsername;
    }

    public void setSubmittedUsername(String submittedUsername) {
        this.submittedUsername = submittedUsername;
    }

    /**
     * Creates new form Donor form
     */
    public DonorRegistrationForm() {
        initComponents();
        lWarning.setText(null);
        sAge.setValue(20);
        rMale.setSelected(true);
        rMale.setActionCommand("Male");
        rFemale.setActionCommand("Female");
        setLocation(200, 100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pFieldPanel = new javax.swing.JPanel();
        lState = new javax.swing.JLabel();
        rFemale = new javax.swing.JRadioButton();
        sAge = new javax.swing.JSpinner();
        rMale = new javax.swing.JRadioButton();
        tCity = new javax.swing.JTextField();
        tPhone_no = new javax.swing.JTextField();
        lCity = new javax.swing.JLabel();
        lPhone_no = new javax.swing.JLabel();
        lSex = new javax.swing.JLabel();
        lAge = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        bSubmit = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        lUsername = new javax.swing.JLabel();
        tUsername = new javax.swing.JTextField();
        lPass = new javax.swing.JLabel();
        tPass = new javax.swing.JPasswordField();
        lConfirmpass = new javax.swing.JLabel();
        tConfirmpass = new javax.swing.JPasswordField();
        comboState = new javax.swing.JComboBox();
        bCancel = new javax.swing.JButton();
        lHeading = new javax.swing.JLabel();
        lWarning = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Quotes = new javax.swing.JLabel();
        Quotes2 = new javax.swing.JLabel();
        Quotes4 = new javax.swing.JLabel();
        Quotes3 = new javax.swing.JLabel();
        Quotes1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BloodBank-Donor Registration");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lState.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lState.setText("State");

        genderButtonGroup.add(rFemale);
        rFemale.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        rFemale.setText("Female");

        sAge.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        sAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 75, 1));

        genderButtonGroup.add(rMale);
        rMale.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        rMale.setText("Male");

        tCity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        tPhone_no.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        tPhone_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPhone_noKeyTyped(evt);
            }
        });

        lCity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lCity.setText("City");

        lPhone_no.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lPhone_no.setText("Phone_no");

        lSex.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lSex.setText("Gender");

        lAge.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lAge.setText("Age");

        lName.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lName.setText("Name");

        tName.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        tName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNameActionPerformed(evt);
            }
        });

        bSubmit.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bSubmit.setText("Submit");
        bSubmit.setBorder(null);
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        bReset.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bReset.setText("Reset");
        bReset.setBorder(null);
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        lUsername.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lUsername.setText("Username");

        tUsername.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        lPass.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lPass.setText("Password");

        tPass.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        lConfirmpass.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lConfirmpass.setText("Confirm Password");

        tConfirmpass.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        comboState.setEditable(true);
        comboState.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        comboState.setMaximumRowCount(28);
        comboState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Karnataka", "Kerala", "Tamil Nadu", "Maharashtra", "Other" }));

        bCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFieldPanelLayout = new javax.swing.GroupLayout(pFieldPanel);
        pFieldPanel.setLayout(pFieldPanelLayout);
        pFieldPanelLayout.setHorizontalGroup(
            pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFieldPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createSequentialGroup()
                            .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lPhone_no)
                                .addComponent(lSex))
                            .addGap(54, 54, 54))
                        .addComponent(lAge)
                        .addComponent(lName)
                        .addComponent(lConfirmpass)
                        .addComponent(lPass, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lUsername)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createSequentialGroup()
                            .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lCity)
                                .addComponent(lState))
                            .addGap(88, 88, 88))))
                .addGap(18, 18, 18)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFieldPanelLayout.createSequentialGroup()
                        .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tName, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(tConfirmpass)
                                .addComponent(tPass)
                                .addComponent(tUsername))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createSequentialGroup()
                                .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tPhone_no, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pFieldPanelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(rMale)
                                    .addGap(18, 18, 18)
                                    .addComponent(rFemale)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tCity)
                                .addComponent(comboState, 0, 222, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFieldPanelLayout.createSequentialGroup()
                        .addComponent(sAge, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );

        pFieldPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tCity, tConfirmpass, tName, tPass, tPhone_no, tUsername});

        pFieldPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancel, bReset, bSubmit});

        pFieldPanelLayout.setVerticalGroup(
            pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsername)
                    .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPass)
                    .addComponent(tPass, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lConfirmpass)
                    .addComponent(tConfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName)
                    .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAge)
                    .addComponent(sAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSex)
                    .addComponent(rMale)
                    .addComponent(rFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPhone_no)
                    .addComponent(tPhone_no, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCity, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lState)
                    .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bSubmit)
                    .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pFieldPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tCity, tConfirmpass, tName, tPass, tPhone_no, tUsername});

        pFieldPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bCancel, bReset, bSubmit});

        lHeading.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lHeading.setText("Blood Donor Registration Form");

        lWarning.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lWarning.setForeground(java.awt.Color.blue);
        lWarning.setText("Warning");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lWarning)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(pFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lWarning)
                .addGap(6, 6, 6))
        );

        Quotes.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        Quotes.setForeground(new java.awt.Color(204, 0, 0));
        Quotes.setText("If you donate money,");

        Quotes2.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        Quotes2.setForeground(new java.awt.Color(0, 102, 0));
        Quotes2.setText("But if you");

        Quotes4.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        Quotes4.setForeground(new java.awt.Color(0, 102, 0));
        Quotes4.setText("you give life!!");

        Quotes3.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        Quotes3.setForeground(new java.awt.Color(0, 102, 0));
        Quotes3.setText("donate blood");

        Quotes1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        Quotes1.setForeground(new java.awt.Color(204, 0, 0));
        Quotes1.setText("you give food!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Quotes)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Quotes2)))
                                .addGap(18, 18, 18))
                            .addComponent(Quotes1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Quotes4)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Quotes3)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Quotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Quotes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quotes2)
                .addGap(13, 13, 13)
                .addComponent(Quotes3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Quotes4)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        tUsername.setText(null);
        tPass.setText(null);
        tConfirmpass.setText(null);
        tName.setText(null);
        sAge.setValue(20);
        rMale.setSelected(true);
        // genderButtonGroup.setSelected();
        tPhone_no.setText(null);
        tCity.setText(null);
        comboState.setSelectedIndex(0);
        tUsername.requestFocus();
    }//GEN-LAST:event_bResetActionPerformed

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        lWarning.setText(null);
        setSubmittedUsername(tUsername.getText().toString());
        setSubmittedPassword(tPass.getText().toString());
        setSubmittedConfirmpassword(tConfirmpass.getText().toString());

        setSubmittedFullName(tName.getText().toString());
        setSubmittedAge(Integer.parseInt(sAge.getValue().toString()));
        setSubmittedGender(genderButtonGroup.getSelection().getActionCommand());
        setSubmittedPhone(tPhone_no.getText().toString());
        setSubmittedCity(tCity.getText().toString());
        setSubmittedState(comboState.getSelectedItem().toString());

        if (getSubmittedUsername().isEmpty()) {
            lWarning.setText("Username not entered");
            tUsername.requestFocus();
        } else if (getSubmittedPassword().isEmpty()) {
            lWarning.setText("Password not entered");
            tPass.requestFocus();
        } else if (getSubmittedConfirmpassword().isEmpty()) {
            lWarning.setText("Confirm Password not entered");
            tConfirmpass.requestFocus();
        } else if (!submittedPassword.equals(submittedConfirmpassword)) {
            lWarning.setText("Password Not Equal ");
            tPass.requestFocus();
        } else if (getSubmittedFullName().isEmpty()) {
            lWarning.setText("Please provide full Name");
            tName.requestFocus();
        } else if (getSubmittedAge() < 18) {
            lWarning.setText("We do not accept blood from kids!");
            sAge.requestFocus();
        } else if (!getSubmittedPhone().matches("^\\d+$") || getSubmittedPhone().length() != 10) {
            lWarning.setText("Phone Number is invalid... TRY AGAIN");
            tPhone_no.requestFocus();
        } else {

            lWarning.setText(null);
            BusinessLogic.UserRegistration register = new BusinessLogic.UserRegistration();
            register.setUsername(getSubmittedUsername());
            register.setPassword(getSubmittedPassword());

            returnFromDonorBL = register.fnToInsertUser();
            if (returnFromDonorBL) {
                lWarning.setText("User Created ");
            } else {
                lWarning.setText("Username exists. Please provide a different Username");

            }

            BusinessLogic.Donor donor = new BusinessLogic.Donor();
            donor.setName(getSubmittedFullName());
            donor.setAge(getSubmittedAge());
            donor.setGender(getSubmittedGender());
            donor.setPhone_no(getSubmittedPhone());
            donor.setAddress(getSubmittedCity() + " " + getSubmittedState());
            returnFromDonorRegistrationBL = donor.insertDonor();
            if (returnFromDonorRegistrationBL) {
                lWarning.setText("Insertion Successfull");
                JOptionPane.showConfirmDialog(this, "Account Created Successfully, Login to connect", "Success", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                lWarning.setText("Username exists. Please provide a different Username");
            }
        }
        System.out.println("username= " + getSubmittedUsername());
        System.out.println("password " + getSubmittedPassword());
        System.out.println("re password " + getSubmittedConfirmpassword());
        System.out.println("Name=" + getSubmittedFullName());
        System.out.println("Age=" + getSubmittedAge());
        System.out.println("Gender=" + getSubmittedGender());
        System.out.println("Phone_no=" + getSubmittedPhone());
        System.out.println("City=" + getSubmittedCity());
        System.out.println("State=" + getSubmittedState());
    }//GEN-LAST:event_bSubmitActionPerformed

    private void tPhone_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPhone_noKeyTyped
    }//GEN-LAST:event_tPhone_noKeyTyped

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void tNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quotes;
    private javax.swing.JLabel Quotes1;
    private javax.swing.JLabel Quotes2;
    private javax.swing.JLabel Quotes3;
    private javax.swing.JLabel Quotes4;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSubmit;
    private javax.swing.JComboBox comboState;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lAge;
    private javax.swing.JLabel lCity;
    private javax.swing.JLabel lConfirmpass;
    private javax.swing.JLabel lHeading;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPass;
    private javax.swing.JLabel lPhone_no;
    private javax.swing.JLabel lSex;
    private javax.swing.JLabel lState;
    private javax.swing.JLabel lUsername;
    private javax.swing.JLabel lWarning;
    private javax.swing.JPanel pFieldPanel;
    private javax.swing.JRadioButton rFemale;
    private javax.swing.JRadioButton rMale;
    private javax.swing.JSpinner sAge;
    private javax.swing.JTextField tCity;
    private javax.swing.JPasswordField tConfirmpass;
    private javax.swing.JTextField tName;
    private javax.swing.JPasswordField tPass;
    private javax.swing.JTextField tPhone_no;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the submittedFullName
     */
    public String getSubmittedFullName() {
        return submittedFullName;
    }

    /**
     * @param submittedFullName the submittedFullName to set
     */
    public void setSubmittedFullName(String submittedFullName) {
        this.submittedFullName = submittedFullName;
    }

    /**
     * @return the submittedAge
     */
    public int getSubmittedAge() {
        return submittedAge;
    }

    /**
     * @param submittedAge the submittedAge to set
     */
    public void setSubmittedAge(int submittedAge) {
        this.submittedAge = submittedAge;
    }

    /**
     * @return the submittedGender
     */
    public String getSubmittedGender() {
        return submittedGender;
    }

    /**
     * @param submittedGender the submittedGender to set
     */
    public void setSubmittedGender(String submittedGender) {
        this.submittedGender = submittedGender;
    }

    /**
     * @return the submittedPhone
     */
    public String getSubmittedPhone() {
        return submittedPhone;
    }

    /**
     * @param submittedPhone the submittedPhone to set
     */
    public void setSubmittedPhone(String submittedPhone) {
        this.submittedPhone = submittedPhone;
    }

    /**
     * @return the submittedCity
     */
    public String getSubmittedCity() {
        return submittedCity;
    }

    /**
     * @param submittedCity the submittedCity to set
     */
    public void setSubmittedCity(String submittedCity) {
        this.submittedCity = submittedCity;
    }

    /**
     * @return the submittedState
     */
    public String getSubmittedState() {
        return submittedState;
    }

    /**
     * @param submittedState the submittedState to set
     */
    public void setSubmittedState(String submittedState) {
        this.submittedState = submittedState;
    }
}
