/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableFrame;

import Component.DoubleSpinner;
import ConnectionDB.operationDataBase;
import applicationmaster.Tools;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

import org.bson.types.ObjectId;

/**
 * @author benso
 */
public class tableOperationMongoDB extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton BtnCalc;
    private rojeru_san.RSButton BtnClose;
    private rojeru_san.RSButton BtnDistCalc;
    private rojeru_san.RSButton BtnElimin;
    private rojeru_san.RSButton BtnElimin1;
    private rojeru_san.RSButton BtnPCount;
    private rojeru_san.RSButton BtnPassCount;
    private rojeru_san.RSButton BtnRef;
    private rojeru_san.RSButton BtnSave1;
    private rojeru_san.RSButton BtnSave2;
    private rojeru_san.RSButton BtnSave3;
    private rojeru_san.RSButton BtnTAmount;
    private rojeru_san.RSButton BtnTotAmount;
    private rojeru_san.RSButton BtnTotAmount1;
    private rojeru_san.RSButton BtnTripDist;
    private rojeru_san.RSButton BtnTripTime1;
    private rojeru_san.RSButton BtnTrpDist;
    private javax.swing.JSpinner SpnPassCOUNTMax;
    private javax.swing.JSpinner SpnPassCOUNTMin;
    private javax.swing.JSpinner SpnTotAmountMax;
    private javax.swing.JSpinner SpnTotAmountMin;
    private javax.swing.JSpinner SpnTripDistMax;
    private javax.swing.JSpinner SpnTripDistMin;
    private javax.swing.JSpinner SpnTripTimeMax1;
    private javax.swing.JSpinner SpnTripTimeMin1;
    private javax.swing.JLabel TxtMaxPassCount;
    private javax.swing.JLabel TxtMaxTAmount;
    private javax.swing.JLabel TxtMaxTripTime1;
    private javax.swing.JLabel TxtMaxtripDistance;
    private javax.swing.JLabel TxtMinTamount;
    private javax.swing.JLabel TxtMinTripDist;
    private javax.swing.JLabel TxtMinTripTime1;
    private javax.swing.JLabel TxtResPCount;
    private javax.swing.JLabel TxtResTamount1;
    private javax.swing.JLabel TxtResTripDist;
    private javax.swing.JLabel TxtResTripTime;
    private javax.swing.JLabel TxxtMinPasCount;
    private javax.swing.JSpinner dmin;
    private javax.swing.JSpinner extra;
    private javax.swing.ButtonGroup groupButton;
    private javax.swing.JSpinner improvement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner mta;
    private javax.swing.JPanel panelRegle;
    private javax.swing.JPanel panelTabel;
    private javax.swing.JSpinner pmin;
    private javax.swing.JSpinner psmin;
    private javax.swing.JSpinner pymax;
    private javax.swing.JSpinner pymin;
    private javax.swing.JRadioButton radioDistPassCount;
    private javax.swing.JRadioButton radioDistTotAmount;
    private javax.swing.JRadioButton radioDistTripdist;
    private javax.swing.JRadioButton radioDoloc;
    private javax.swing.JRadioButton radioExtra;
    private javax.swing.JRadioButton radioImpro;
    private javax.swing.JRadioButton radioMta;
    private javax.swing.JRadioButton radioP;
    private javax.swing.JRadioButton radioPaymment;
    private javax.swing.JRadioButton radioPuloc;
    private javax.swing.JRadioButton radioTotal;
    private javax.swing.JRadioButton radioTrip;
    private javax.swing.JRadioButton radioTripTime1;
    private javax.swing.JRadioButton radiovendor;
    private javax.swing.JTable tabMatrix;
    private javax.swing.JTable tableData;
    private javax.swing.JTable tableDelete;
    private javax.swing.JTable tableDistrDelete;
    private javax.swing.JTable tableExtra;
    private javax.swing.JTable tableImprovementSurcharge;
    private javax.swing.JTable tableMtaTax;
    private javax.swing.JTable tablePassangerCount;
    private javax.swing.JTable tableTotalAmount;
    private javax.swing.JTable tableTripDistance;
    private javax.swing.JTable tablevndid;
    private javax.swing.JSpinner totalmax;
    private javax.swing.JSpinner totalmin;
    private javax.swing.JSpinner tr;
    private javax.swing.JSpinner vimin;

    /**
     * Creates new form tableOperationMongoDB
     */
    public tableOperationMongoDB() {
        initComponents();

        tableData.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableData.getTableHeader().setOpaque(false);
        tableData.getTableHeader().setBackground(new Color(32, 136, 203));
        tableData.getTableHeader().setForeground(new Color(255, 255, 255));
        tableData.setRowHeight(25);
        tableDelete.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableDelete.getTableHeader().setOpaque(false);
        tableDelete.getTableHeader().setBackground(new Color(32, 136, 203));
        tableDelete.getTableHeader().setForeground(new Color(255, 255, 255));
        tableDelete.setRowHeight(25);
        tableDistrDelete.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableDistrDelete.getTableHeader().setOpaque(false);
        tableDistrDelete.getTableHeader().setBackground(new Color(32, 136, 203));
        tableDistrDelete.getTableHeader().setForeground(new Color(255, 255, 255));
        tableDistrDelete.setRowHeight(25);
        tablevndid.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tablevndid.getTableHeader().setOpaque(false);
        tablevndid.getTableHeader().setBackground(new Color(32, 136, 203));
        tablevndid.getTableHeader().setForeground(new Color(255, 255, 255));
        tablevndid.setRowHeight(25);
        tableExtra.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableExtra.getTableHeader().setOpaque(false);
        tableExtra.getTableHeader().setBackground(new Color(32, 136, 203));
        tableExtra.getTableHeader().setForeground(new Color(255, 255, 255));
        tableExtra.setRowHeight(25);
        tableImprovementSurcharge.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableImprovementSurcharge.getTableHeader().setOpaque(false);
        tableImprovementSurcharge.getTableHeader().setBackground(new Color(32, 136, 203));
        tableImprovementSurcharge.getTableHeader().setForeground(new Color(255, 255, 255));
        tableImprovementSurcharge.setRowHeight(25);
        tableMtaTax.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableMtaTax.getTableHeader().setOpaque(false);
        tableMtaTax.getTableHeader().setBackground(new Color(32, 136, 203));
        tableMtaTax.getTableHeader().setForeground(new Color(255, 255, 255));
        tableMtaTax.setRowHeight(25);
        tablePassangerCount.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tablePassangerCount.getTableHeader().setOpaque(false);
        tablePassangerCount.getTableHeader().setBackground(new Color(32, 136, 203));
        tablePassangerCount.getTableHeader().setForeground(new Color(255, 255, 255));
        tablePassangerCount.setRowHeight(25);
        tableTotalAmount.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableTotalAmount.getTableHeader().setOpaque(false);
        tableTotalAmount.getTableHeader().setBackground(new Color(32, 136, 203));
        tableTotalAmount.getTableHeader().setForeground(new Color(255, 255, 255));
        tableTripDistance.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tableTripDistance.getTableHeader().setOpaque(false);
        tableTripDistance.getTableHeader().setBackground(new Color(32, 136, 203));
        tableTripDistance.getTableHeader().setForeground(new Color(255, 255, 255));
        tabMatrix.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tabMatrix.getTableHeader().setOpaque(false);
        tabMatrix.getTableHeader().setBackground(new Color(32, 136, 203));
        tabMatrix.getTableHeader().setForeground(new Color(255, 255, 255));
        tabMatrix.setRowHeight(25);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupButton = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelTabel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        BtnSave2 = new rojeru_san.RSButton();
        BtnSave1 = new rojeru_san.RSButton();
        BtnSave3 = new rojeru_san.RSButton();
        panelRegle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tr = new DoubleSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        extra = new DoubleSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mta = new DoubleSpinner();
        improvement = new DoubleSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        vimin = new javax.swing.JSpinner();
        psmin = new javax.swing.JSpinner();
        totalmin = new DoubleSpinner()
        ;
        pmin = new javax.swing.JSpinner();
        pymax = new DoubleSpinner();
        dmin = new javax.swing.JSpinner();
        pymin = new javax.swing.JSpinner();
        totalmax = new DoubleSpinner()
        ;
        BtnRef = new rojeru_san.RSButton();
        BtnClose = new rojeru_san.RSButton();
        BtnCalc = new rojeru_san.RSButton();
        radioP = new javax.swing.JRadioButton();
        radioTrip = new javax.swing.JRadioButton();
        radioPuloc = new javax.swing.JRadioButton();
        radioDoloc = new javax.swing.JRadioButton();
        radioPaymment = new javax.swing.JRadioButton();
        radioExtra = new javax.swing.JRadioButton();
        radioMta = new javax.swing.JRadioButton();
        radioImpro = new javax.swing.JRadioButton();
        radioTotal = new javax.swing.JRadioButton();
        radiovendor = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableExtra = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableTotalAmount = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableMtaTax = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableImprovementSurcharge = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableTripDistance = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablePassangerCount = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablevndid = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDelete = new javax.swing.JTable();
        BtnElimin = new rojeru_san.RSButton();
        BtnElimin1 = new rojeru_san.RSButton();
        jPanel3 = new javax.swing.JPanel();
        BtnPCount = new rojeru_san.RSButton();
        BtnTripDist = new rojeru_san.RSButton();
        BtnTAmount = new rojeru_san.RSButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtMaxtripDistance = new javax.swing.JLabel();
        TxtMinTripDist = new javax.swing.JLabel();
        TxtResTripDist = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TxtMaxTAmount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtMinTamount = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtResTripTime = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TxxtMinPasCount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtMaxPassCount = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtResPCount = new javax.swing.JLabel();
        SpnPassCOUNTMin = new javax.swing.JSpinner();
        SpnTripDistMin = new DoubleSpinner();
        SpnTotAmountMin = new DoubleSpinner()
        ;
        radioDistTotAmount = new javax.swing.JRadioButton();
        radioDistTripdist = new javax.swing.JRadioButton();
        radioDistPassCount = new javax.swing.JRadioButton();
        BtnPassCount = new rojeru_san.RSButton();
        BtnTrpDist = new rojeru_san.RSButton();
        BtnTotAmount = new rojeru_san.RSButton();
        BtnDistCalc = new rojeru_san.RSButton();
        SpnTotAmountMax = new DoubleSpinner()
        ;
        SpnPassCOUNTMax = new javax.swing.JSpinner();
        SpnTripDistMax = new DoubleSpinner();
        BtnTripTime1 = new rojeru_san.RSButton();
        jLabel25 = new javax.swing.JLabel();
        TxtMaxTripTime1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtMinTripTime1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtnTotAmount1 = new rojeru_san.RSButton();
        radioTripTime1 = new javax.swing.JRadioButton();
        SpnTripTimeMax1 = new javax.swing.JSpinner();
        SpnTripTimeMin1 = new javax.swing.JSpinner();
        TxtResTamount1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableDistrDelete = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabMatrix = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        panelTabel.setBackground(new java.awt.Color(0, 0, 0));
        panelTabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ObjectID", "VendorID", "pickup_Date", "dropof_Date", "Trip_Time", "intervalClass", "intervalClassCount", "Passenger_Count ", "Trip_Distance ", "RatecodeId ", "Stor_And_Fwd ", "PulocationId ", "DolocationId ", "Paymment_Type ", "Fare_Amount ", "Extra ", "Mta_Tax ", "Tip_Amount", "Tools_Amount ", "Improvement_Surcharge", "Total_Amount ", "Congestion_Surcharge"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableData.setFocusable(false);
        tableData.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableData.setRowHeight(25);
        tableData.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableData.setShowVerticalLines(false);
        tableData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableData);

        panelTabel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1740, 720));

        BtnSave2.setBackground(new java.awt.Color(102, 102, 102));
        BtnSave2.setText("Save2");
        BtnSave2.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSave2ActionPerformed(evt);
            }
        });
        panelTabel.add(BtnSave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 720, -1, -1));

        BtnSave1.setBackground(new java.awt.Color(102, 102, 102));
        BtnSave1.setText("Save");
        BtnSave1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSave1ActionPerformed(evt);
            }
        });
        panelTabel.add(BtnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 720, -1, 40));

        BtnSave3.setBackground(new java.awt.Color(102, 102, 102));
        BtnSave3.setText("Save3");
        BtnSave3.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnSave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSave3ActionPerformed(evt);
            }
        });
        panelTabel.add(BtnSave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 720, -1, -1));

        jTabbedPane1.addTab("Table Data", panelTabel);

        panelRegle.setBackground(new java.awt.Color(0, 0, 0));
        panelRegle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Passenger_Count :");
        panelRegle.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));

        tr.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tr.setAutoscrolls(true);
        panelRegle.add(tr, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 90, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Trip_Distance :");
        panelRegle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("PulocationId :");
        panelRegle.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("DolocationId :");
        panelRegle.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Paymment_Type :");
        panelRegle.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, 30));

        extra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        extra.setAutoscrolls(true);
        panelRegle.add(extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, 80, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Extra :");
        panelRegle.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, -1, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Mta_Tax :");
        panelRegle.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, -1, 30));

        mta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        mta.setAutoscrolls(true);
        panelRegle.add(mta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, 80, 40));

        improvement.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        improvement.setAutoscrolls(true);
        panelRegle.add(improvement, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, 70, 40));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("Improvement_Surcharge :");
        panelRegle.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 230, 30));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("Total_Amount :");
        panelRegle.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, 30));

        jLabel20.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("Commision rules : ");
        panelRegle.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 50));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText("VendorID : ");
        panelRegle.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 30));

        vimin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        vimin.setAutoscrolls(true);
        panelRegle.add(vimin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 60, 40));

        psmin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        psmin.setAutoscrolls(true);
        panelRegle.add(psmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 60, 40));

        totalmin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        totalmin.setAutoscrolls(true);
        panelRegle.add(totalmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 400, 60, 40));

        pmin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pmin.setAutoscrolls(true);
        panelRegle.add(pmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 60, 40));

        pymax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pymax.setAutoscrolls(true);
        panelRegle.add(pymax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 60, 40));

        dmin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dmin.setAutoscrolls(true);
        panelRegle.add(dmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 60, 40));

        pymin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pymin.setAutoscrolls(true);
        panelRegle.add(pymin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 60, 40));

        totalmax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        totalmax.setAutoscrolls(true);
        panelRegle.add(totalmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 140, 60, 40));

        BtnRef.setBackground(new java.awt.Color(102, 102, 102));
        BtnRef.setText("Refresh");
        BtnRef.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        panelRegle.add(BtnRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 690, 220, 50));

        BtnClose.setBackground(new java.awt.Color(102, 102, 102));
        BtnClose.setText("Close");
        BtnClose.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });
        panelRegle.add(BtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 690, 220, 50));

        BtnCalc.setBackground(new java.awt.Color(102, 102, 102));
        BtnCalc.setText("Calculate");
        BtnCalc.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcActionPerformed(evt);
            }
        });
        panelRegle.add(BtnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 220, 50));

        radioP.setBackground(new java.awt.Color(0, 0, 0));
        radioP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioP.setForeground(new java.awt.Color(255, 255, 255));
        radioP.setText("Search By Passenger_count");
        radioP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioPMouseClicked(evt);
            }
        });
        radioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPActionPerformed(evt);
            }
        });
        panelRegle.add(radioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        radioTrip.setBackground(new java.awt.Color(0, 0, 0));
        radioTrip.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioTrip.setForeground(new java.awt.Color(255, 255, 255));
        radioTrip.setText("Searche By Trip_Distance");
        radioTrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioTripMouseClicked(evt);
            }
        });
        panelRegle.add(radioTrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        radioPuloc.setBackground(new java.awt.Color(0, 0, 0));
        radioPuloc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioPuloc.setForeground(new java.awt.Color(255, 255, 255));
        radioPuloc.setText("Search By PulocationId");
        radioPuloc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioPulocMouseClicked(evt);
            }
        });
        radioPuloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPulocActionPerformed(evt);
            }
        });
        panelRegle.add(radioPuloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        radioDoloc.setBackground(new java.awt.Color(0, 0, 0));
        radioDoloc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioDoloc.setForeground(new java.awt.Color(255, 255, 255));
        radioDoloc.setText("Search By DolacationId");
        radioDoloc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDolocMouseClicked(evt);
            }
        });
        panelRegle.add(radioDoloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        radioPaymment.setBackground(new java.awt.Color(0, 0, 0));
        radioPaymment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioPaymment.setForeground(new java.awt.Color(255, 255, 255));
        radioPaymment.setText("Search By Paymment_Type");
        radioPaymment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioPaymmentMouseClicked(evt);
            }
        });
        panelRegle.add(radioPaymment, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        radioExtra.setBackground(new java.awt.Color(0, 0, 0));
        radioExtra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioExtra.setForeground(new java.awt.Color(255, 255, 255));
        radioExtra.setText("Search By Extra");
        radioExtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioExtraMouseClicked(evt);
            }
        });
        panelRegle.add(radioExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 190, -1, -1));

        radioMta.setBackground(new java.awt.Color(0, 0, 0));
        radioMta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioMta.setForeground(new java.awt.Color(255, 255, 255));
        radioMta.setText("Search By Mta_tax");
        radioMta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMtaMouseClicked(evt);
            }
        });
        panelRegle.add(radioMta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 250, -1, -1));

        radioImpro.setBackground(new java.awt.Color(0, 0, 0));
        radioImpro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioImpro.setForeground(new java.awt.Color(255, 255, 255));
        radioImpro.setText("Search By Improvement_Surcharge");
        radioImpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioImproMouseClicked(evt);
            }
        });
        panelRegle.add(radioImpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 340, -1, -1));

        radioTotal.setBackground(new java.awt.Color(0, 0, 0));
        radioTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioTotal.setForeground(new java.awt.Color(255, 255, 255));
        radioTotal.setText("Search By Total_Amount");
        radioTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioTotalMouseClicked(evt);
            }
        });
        radioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTotalActionPerformed(evt);
            }
        });
        panelRegle.add(radioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 400, -1, -1));

        radiovendor.setBackground(new java.awt.Color(0, 0, 0));
        radiovendor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radiovendor.setForeground(new java.awt.Color(255, 255, 255));
        radiovendor.setText("Search By VendorID");
        radiovendor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                radiovendorMouseMoved(evt);
            }
        });
        panelRegle.add(radiovendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jTabbedPane1.addTab("Rules", panelRegle);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableExtra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tableExtra.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "Rules3Extra"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableExtra.setFocusable(false);
        tableExtra.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableExtra.setRowHeight(25);
        tableExtra.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableExtra.setShowVerticalLines(false);
        tableExtra.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tableExtra);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 240, 720));

        tableTotalAmount.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tableTotalAmount.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "Rules8TotalAmount"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableTotalAmount.setFocusable(false);
        tableTotalAmount.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableTotalAmount.setRowHeight(25);
        tableTotalAmount.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableTotalAmount.setShowVerticalLines(false);
        tableTotalAmount.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tableTotalAmount);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 230, 720));

        tableMtaTax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tableMtaTax.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "Rules4MtaTax"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableMtaTax.setFocusable(false);
        tableMtaTax.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableMtaTax.setRowHeight(25);
        tableMtaTax.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableMtaTax.setShowVerticalLines(false);
        tableMtaTax.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tableMtaTax);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 250, 720));

        tableImprovementSurcharge.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tableImprovementSurcharge.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "Rules5ImprovementSurcharge"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableImprovementSurcharge.setFocusable(false);
        tableImprovementSurcharge.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableImprovementSurcharge.setRowHeight(25);
        tableImprovementSurcharge.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableImprovementSurcharge.setShowVerticalLines(false);
        tableImprovementSurcharge.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tableImprovementSurcharge);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 230, 720));

        tableTripDistance.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tableTripDistance.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "Rules6TripDistance"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableTripDistance.setFocusable(false);
        tableTripDistance.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableTripDistance.setRowHeight(25);
        tableTripDistance.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableTripDistance.setShowVerticalLines(false);
        tableTripDistance.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tableTripDistance);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 220, 720));

        tablePassangerCount.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tablePassangerCount.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "Rules7PassengerCount"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tablePassangerCount.setFocusable(false);
        tablePassangerCount.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablePassangerCount.setRowHeight(25);
        tablePassangerCount.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tablePassangerCount.setShowVerticalLines(false);
        tablePassangerCount.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tablePassangerCount);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 230, 720));

        tablevndid.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tablevndid.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "Rules1VendeurID"
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tablevndid.setFocusable(false);
        tablevndid.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablevndid.setRowHeight(25);
        tablevndid.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tablevndid.setShowVerticalLines(false);
        tablevndid.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tablevndid);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 720));

        jTabbedPane1.addTab("History", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tableDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ObjectID", "VendorID", "pickup_Date", "dropof_Date", "Passenger_Count ", "Trip_Distance ", "RatecodeId ", "Stor_And_Fwd ", "PulocationId ", "DolocationId ", "Paymment_Type ", "Fare_Amount ", "Extra ", "Mta_Tax ", "Tip_Amount", "Tools_Amount ", "Improvement_Surcharge", "Total_Amount ", "Congestion_Surcharge"
            }
        ));
        tableDelete.setFocusable(false);
        tableDelete.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableDelete.setRowHeight(25);
        tableDelete.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableDelete.setShowVerticalLines(false);
        tableDelete.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tableDelete);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1740, 720));

        BtnElimin.setBackground(new java.awt.Color(102, 102, 102));
        BtnElimin.setText("eliminate duplicates");
        BtnElimin.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnElimin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminActionPerformed(evt);
            }
        });
        jPanel2.add(BtnElimin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 720, 280, -1));

        BtnElimin1.setBackground(new java.awt.Color(102, 102, 102));
        BtnElimin1.setText("Calculate");
        BtnElimin1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnElimin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimin1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnElimin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 720, 280, -1));

        jTabbedPane1.addTab("Delete", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnPCount.setBackground(new java.awt.Color(102, 102, 102));
        BtnPCount.setText("Distrubition Of Passenger Count");
        BtnPCount.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnPCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPCountActionPerformed(evt);
            }
        });
        jPanel3.add(BtnPCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 480, 80));

        BtnTripDist.setBackground(new java.awt.Color(102, 102, 102));
        BtnTripDist.setText("Distrubition Of Trip Distance");
        BtnTripDist.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnTripDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTripDistActionPerformed(evt);
            }
        });
        jPanel3.add(BtnTripDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 480, 80));

        BtnTAmount.setBackground(new java.awt.Color(102, 102, 102));
        BtnTAmount.setText("Distrubition Of Total Amount");
        BtnTAmount.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnTAmount.setPreferredSize(null);
        BtnTAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTAmountActionPerformed(evt);
            }
        });
        jPanel3.add(BtnTAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 480, 80));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Min : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, 110, 70));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Average : ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 590, -1, 70));

        TxtMaxtripDistance.setBackground(new java.awt.Color(102, 102, 102));
        TxtMaxtripDistance.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtMaxtripDistance.setForeground(new java.awt.Color(255, 255, 255));
        TxtMaxtripDistance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtMaxtripDistance, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 180, 70));

        TxtMinTripDist.setBackground(new java.awt.Color(102, 102, 102));
        TxtMinTripDist.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtMinTripDist.setForeground(new java.awt.Color(255, 255, 255));
        TxtMinTripDist.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtMinTripDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 590, 180, 70));

        TxtResTripDist.setBackground(new java.awt.Color(102, 102, 102));
        TxtResTripDist.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtResTripDist.setForeground(new java.awt.Color(255, 255, 255));
        TxtResTripDist.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        TxtResTripDist.setPreferredSize(null);
        jPanel3.add(TxtResTripDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 590, 200, 70));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText("Max : ");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 110, 70));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("Max : ");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 110, 70));

        TxtMaxTAmount.setBackground(new java.awt.Color(102, 102, 102));
        TxtMaxTAmount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtMaxTAmount.setForeground(new java.awt.Color(255, 255, 255));
        TxtMaxTAmount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtMaxTAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 180, 70));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Min : ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 110, 70));

        TxtMinTamount.setBackground(new java.awt.Color(102, 102, 102));
        TxtMinTamount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtMinTamount.setForeground(new java.awt.Color(255, 255, 255));
        TxtMinTamount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtMinTamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 180, 70));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Average : ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 170, -1, 70));

        TxtResTripTime.setBackground(new java.awt.Color(102, 102, 102));
        TxtResTripTime.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtResTripTime.setForeground(new java.awt.Color(255, 255, 255));
        TxtResTripTime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtResTripTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 200, 70));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 0));
        jLabel28.setText("Max : ");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 110, 70));

        TxxtMinPasCount.setBackground(new java.awt.Color(102, 102, 102));
        TxxtMinPasCount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxxtMinPasCount.setForeground(new java.awt.Color(255, 255, 255));
        TxxtMinPasCount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxxtMinPasCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 180, 70));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Min : ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 110, 70));

        TxtMaxPassCount.setBackground(new java.awt.Color(102, 102, 102));
        TxtMaxPassCount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtMaxPassCount.setForeground(new java.awt.Color(255, 255, 255));
        TxtMaxPassCount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtMaxPassCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, 180, 70));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Average : ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 370, -1, 70));

        TxtResPCount.setBackground(new java.awt.Color(102, 102, 102));
        TxtResPCount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtResPCount.setForeground(new java.awt.Color(255, 255, 255));
        TxtResPCount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        TxtResPCount.setPreferredSize(null);
        jPanel3.add(TxtResPCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 370, 200, 70));

        SpnPassCOUNTMin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnPassCOUNTMin.setAutoscrolls(true);
        jPanel3.add(SpnPassCOUNTMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 130, 40));

        SpnTripDistMin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnTripDistMin.setAutoscrolls(true);
        jPanel3.add(SpnTripDistMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 130, 40));

        SpnTotAmountMin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnTotAmountMin.setAutoscrolls(true);
        jPanel3.add(SpnTotAmountMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 130, 40));

        radioDistTotAmount.setBackground(new java.awt.Color(0, 0, 0));
        radioDistTotAmount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioDistTotAmount.setForeground(new java.awt.Color(255, 255, 255));
        radioDistTotAmount.setText("Search By Total_Amount");
        radioDistTotAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDistTotAmountMouseClicked(evt);
            }
        });
        radioDistTotAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDistTotAmountActionPerformed(evt);
            }
        });
        jPanel3.add(radioDistTotAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        radioDistTripdist.setBackground(new java.awt.Color(0, 0, 0));
        radioDistTripdist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioDistTripdist.setForeground(new java.awt.Color(255, 255, 255));
        radioDistTripdist.setText("Searche By Trip_Distance");
        radioDistTripdist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDistTripdistMouseClicked(evt);
            }
        });
        jPanel3.add(radioDistTripdist, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, -1, -1));

        radioDistPassCount.setBackground(new java.awt.Color(0, 0, 0));
        radioDistPassCount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioDistPassCount.setForeground(new java.awt.Color(255, 255, 255));
        radioDistPassCount.setText("Search By Passenger_count");
        radioDistPassCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDistPassCountMouseClicked(evt);
            }
        });
        radioDistPassCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDistPassCountActionPerformed(evt);
            }
        });
        jPanel3.add(radioDistPassCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        BtnPassCount.setBackground(new java.awt.Color(102, 102, 102));
        BtnPassCount.setText("See Graphics Passenger Count");
        BtnPassCount.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnPassCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPassCountActionPerformed(evt);
            }
        });
        jPanel3.add(BtnPassCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 410, 50));

        BtnTrpDist.setBackground(new java.awt.Color(102, 102, 102));
        BtnTrpDist.setText("See Graphics Trip Distance");
        BtnTrpDist.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        jPanel3.add(BtnTrpDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 690, 350, 50));

        BtnTotAmount.setBackground(new java.awt.Color(102, 102, 102));
        BtnTotAmount.setText("See Graphics Total Amount");
        BtnTotAmount.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnTotAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotAmountActionPerformed(evt);
            }
        });
        jPanel3.add(BtnTotAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 350, 50));

        BtnDistCalc.setText("Calculate");
        BtnDistCalc.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnDistCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDistCalcActionPerformed(evt);
            }
        });
        jPanel3.add(BtnDistCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 740, 230, 50));

        SpnTotAmountMax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnTotAmountMax.setAutoscrolls(true);
        jPanel3.add(SpnTotAmountMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 130, 40));

        SpnPassCOUNTMax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnPassCOUNTMax.setAutoscrolls(true);
        jPanel3.add(SpnPassCOUNTMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 130, 40));

        SpnTripDistMax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnTripDistMax.setAutoscrolls(true);
        jPanel3.add(SpnTripDistMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 130, 40));

        BtnTripTime1.setBackground(new java.awt.Color(102, 102, 102));
        BtnTripTime1.setText("Distrubition Of Trip Time");
        BtnTripTime1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnTripTime1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTripTime1MouseClicked(evt);
            }
        });
        BtnTripTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTripTime1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnTripTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 480, 80));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 0));
        jLabel25.setText("Max : ");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 110, 70));

        TxtMaxTripTime1.setBackground(new java.awt.Color(102, 102, 102));
        TxtMaxTripTime1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtMaxTripTime1.setForeground(new java.awt.Color(255, 255, 255));
        TxtMaxTripTime1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtMaxTripTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 180, 70));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("Min : ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 110, 70));

        TxtMinTripTime1.setBackground(new java.awt.Color(102, 102, 102));
        TxtMinTripTime1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtMinTripTime1.setForeground(new java.awt.Color(255, 255, 255));
        TxtMinTripTime1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtMinTripTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 180, 70));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Average : ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, -1, 70));

        BtnTotAmount1.setBackground(new java.awt.Color(102, 102, 102));
        BtnTotAmount1.setText("See Graphics Trip Time");
        BtnTotAmount1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BtnTotAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotAmount1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnTotAmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 350, 50));

        radioTripTime1.setBackground(new java.awt.Color(0, 0, 0));
        radioTripTime1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        radioTripTime1.setForeground(new java.awt.Color(255, 255, 255));
        radioTripTime1.setText("Search By Trip Time");
        radioTripTime1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioTripTime1MouseClicked(evt);
            }
        });
        radioTripTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTripTime1ActionPerformed(evt);
            }
        });
        jPanel3.add(radioTripTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        SpnTripTimeMax1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnTripTimeMax1.setAutoscrolls(true);
        jPanel3.add(SpnTripTimeMax1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 130, 40));

        SpnTripTimeMin1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SpnTripTimeMin1.setAutoscrolls(true);
        jPanel3.add(SpnTripTimeMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, 40));

        TxtResTamount1.setBackground(new java.awt.Color(102, 102, 102));
        TxtResTamount1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TxtResTamount1.setForeground(new java.awt.Color(255, 255, 255));
        TxtResTamount1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.add(TxtResTamount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 170, 200, 70));

        jTabbedPane1.addTab("Distrubition", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDistrDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tableDistrDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ObjectID", "VendorID", "pickup_Date", "dropof_Date", "Trip_time", "Passenger_Count ", "Trip_Distance ", "RatecodeId ", "Stor_And_Fwd ", "PulocationId ", "DolocationId ", "Paymment_Type ", "Fare_Amount ", "Extra ", "Mta_Tax ", "Tip_Amount", "Tools_Amount ", "Improvement_Surcharge", "Total_Amount ", "Congestion_Surcharge"
            }
        ));
        tableDistrDelete.setFocusable(false);
        tableDistrDelete.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableDistrDelete.setRowHeight(25);
        tableDistrDelete.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tableDistrDelete.setShowVerticalLines(false);
        tableDistrDelete.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tableDistrDelete);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1740, 720));

        jTabbedPane1.addTab("Delete Distrubition", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabMatrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ObjectID", "col1", "col2", "col3", "col4", "col5", "col6  ", "col7", "col8 "
            }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabMatrix);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1700, 740));

        jTabbedPane1.addTab("Matrix", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1759, Short.MAX_VALUE)
                    .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void radioButton() {
        if (radiovendor.isSelected()) {
            vimin.setEnabled(true);


            psmin.setEnabled(false);

            tr.setEnabled(false);

            pmin.setEnabled(false);

            dmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(false);

            extra.setEnabled(false);
            mta.setEnabled(false);

            totalmin.setEnabled(false);
            totalmax.setEnabled(false);

            improvement.setEnabled(false);
        } else if (radioTrip.isSelected()) {
            tr.setEnabled(true);
            vimin.setEnabled(false);


            psmin.setEnabled(false);

            pmin.setEnabled(false);

            dmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(false);

            extra.setEnabled(false);
            mta.setEnabled(false);

            totalmin.setEnabled(false);
            totalmax.setEnabled(false);

            improvement.setEnabled(false);
        } else if (radioTotal.isSelected()) {
            totalmin.setEnabled(true);
            totalmax.setEnabled(true);
            tr.setEnabled(false);
            vimin.setEnabled(false);

            psmin.setEnabled(false);

            pmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(false);
            extra.setEnabled(false);
            mta.setEnabled(false);

            dmin.setEnabled(false);

            improvement.setEnabled(false);

        } else if (radioPuloc.isSelected()) {
            pmin.setEnabled(true);
            dmin.setEnabled(false);

            totalmin.setEnabled(false);
            totalmax.setEnabled(false);
            tr.setEnabled(false);
            vimin.setEnabled(false);


            psmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(false);
            extra.setEnabled(false);
            mta.setEnabled(false);
            improvement.setEnabled(false);

        } else if (radioPaymment.isSelected()) {
            pymin.setEnabled(true);
            pymax.setEnabled(true);

            totalmin.setEnabled(false);
            totalmax.setEnabled(false);
            tr.setEnabled(false);
            vimin.setEnabled(false);
            psmin.setEnabled(false);

            pmin.setEnabled(false);

            extra.setEnabled(false);
            mta.setEnabled(false);
            improvement.setEnabled(false);
            dmin.setEnabled(false);

        } else if (radioP.isSelected()) {
            psmin.setEnabled(true);

            totalmin.setEnabled(false);
            totalmax.setEnabled(false);
            tr.setEnabled(false);
            vimin.setEnabled(false);
            pmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(false);

            extra.setEnabled(false);
            mta.setEnabled(false);
            improvement.setEnabled(false);
            dmin.setEnabled(false);

        } else if (radioMta.isSelected()) {
            mta.setEnabled(true);

            totalmin.setEnabled(false);
            totalmax.setEnabled(false);
            tr.setEnabled(false);
            vimin.setEnabled(false);


            psmin.setEnabled(false);

            pmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(false);

            extra.setEnabled(false);
            dmin.setEnabled(false);

            improvement.setEnabled(false);

        } else if (radioImpro.isSelected()) {
            improvement.setEnabled(true);
            totalmin.setEnabled(false);
            totalmax.setEnabled(false);
            tr.setEnabled(false);
            vimin.setEnabled(false);
            psmin.setEnabled(false);

            pmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(false);

            extra.setEnabled(false);
            mta.setEnabled(false);
            dmin.setEnabled(false);


        } else if (radioExtra.isSelected()) {
            extra.setEnabled(true);
            improvement.setEnabled(false);

            totalmin.setEnabled(false);
            totalmax.setEnabled(true);
            tr.setEnabled(false);
            vimin.setEnabled(false);


            psmin.setEnabled(false);

            pmin.setEnabled(false);

            pymin.setEnabled(false);
            pymax.setEnabled(true);
            mta.setEnabled(false);

            dmin.setEnabled(false);
        } else if (radioDoloc.isSelected()) {
            dmin.setEnabled(true);
            improvement.setEnabled(false);
            totalmin.setEnabled(false);
            totalmax.setEnabled(false);
            tr.setEnabled(false);
            vimin.setEnabled(false);
            psmin.setEnabled(false);
            pmin.setEnabled(false);
            pymin.setEnabled(false);
            pymax.setEnabled(false);
            extra.setEnabled(false);
            mta.setEnabled(false);


        }


    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ConnectionDB.operationDataBase.FillTo_TableView(tableData);
        setResizable(false);
        setDefaultCloseOperation(tableOperationMongoDB.DO_NOTHING_ON_CLOSE);
        //radioButton();
        groupButton.add(radioDistPassCount);
        groupButton.add(radioDistTotAmount);
        groupButton.add(radioDistTripdist);

        groupButton.add(radioDoloc);
        groupButton.add(radioExtra);
        groupButton.add(radioImpro);
        groupButton.add(radioP);
        groupButton.add(radioMta);
        groupButton.add(radiovendor);
        groupButton.add(radioTrip);
        groupButton.add(radioTotal);

        groupButton.add(radioPaymment);

        groupButton.add(radioPuloc);

        radiovendor.setSelected(true);
    }//GEN-LAST:event_formWindowOpened

    private void radiovendorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radiovendorMouseMoved
        radioButton();
    }//GEN-LAST:event_radiovendorMouseMoved

    private void radioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTotalActionPerformed

    private void radioTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTotalMouseClicked
        radioButton();
    }//GEN-LAST:event_radioTotalMouseClicked

    private void radioImproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioImproMouseClicked
        radioButton();        // TODO add your handling code here:
    }//GEN-LAST:event_radioImproMouseClicked

    private void radioMtaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMtaMouseClicked
        radioButton();
    }//GEN-LAST:event_radioMtaMouseClicked

    private void radioExtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioExtraMouseClicked
        radioButton();

    }//GEN-LAST:event_radioExtraMouseClicked

    private void radioPaymmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioPaymmentMouseClicked
        radioButton();

    }//GEN-LAST:event_radioPaymmentMouseClicked

    private void radioDolocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDolocMouseClicked
        radioButton();

    }//GEN-LAST:event_radioDolocMouseClicked

    private void radioPulocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPulocActionPerformed

    }//GEN-LAST:event_radioPulocActionPerformed

    private void radioPulocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioPulocMouseClicked
        radioButton();
    }//GEN-LAST:event_radioPulocMouseClicked

    private void radioTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTripMouseClicked
        radioButton();
    }//GEN-LAST:event_radioTripMouseClicked

    private void radioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPActionPerformed

    private void radioPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioPMouseClicked
        radioButton();
    }//GEN-LAST:event_radioPMouseClicked

    private void BtnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcActionPerformed

        if (radiovendor.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData2(tableData, "VendorID", (int) vimin.getValue());
        } else if (radioP.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData2(tableData, "passenger_count", (int) psmin.getValue());
        } else if (radioPuloc.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData(tableData, "pulocationId", (int) pmin.getValue());
        } else if (radioDoloc.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData(tableData, "dolocationid", (int) dmin.getValue());
        } else if (radioPaymment.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData2(tableData, "paymment_type", (int) pymin.getValue());
        } else if (radioMta.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData3(tableData, "mtaa_tax", (double) mta.getValue());
        } else if (radioImpro.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData3(tableData, "improvement_surcharge", (double) improvement.getValue());
        } else if (radioTrip.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData4(tableData, "trip_distance", (double) tr.getValue());
        } else if (radioTotal.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData4(tableData, "total_amount", (double) totalmin.getValue());
        } else if (radioExtra.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0);
            ConnectionDB.operationDataBase.searchData6(tableData, "extra", (double) extra.getValue(), (double) pymax.getValue(), (double) totalmax.getValue());
        }

    }//GEN-LAST:event_BtnCalcActionPerformed

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCloseActionPerformed

    private void BtnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSave1ActionPerformed
/*         ///String[] list=new String[500000];
         Vector<ObjectId> list=new Vector<ObjectId>();
        if(radiovendor.isSelected())
        {
            for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
           
        }
        else if(radioP.isSelected())
        {
           for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioPuloc.isSelected())
        {
            for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioDoloc.isSelected())
        {
            for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            }

        else if(radioPaymment.isSelected())
        {
            for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioMta.isSelected())
        {
            for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioImpro.isSelected())
        {
             for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioTrip.isSelected())
        {
             for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioTotal.isSelected())
        {
             for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioExtra.isSelected())
        {
             for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioDistPassCount.isSelected())
        {
             for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioDistTotAmount.isSelected())
        {
             for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        else if(radioDistTripdist.isSelected())
        {
             for(int i=0;i<tableData.getModel().getRowCount();i++)
            {
                list.add((ObjectId) tableData.getModel().getValueAt(i,0));
            }
            
        }
        new operationDataBase().fillFautSearch(tableHistory, list);
       */
        if (radiovendor.isSelected()) {
            operationDataBase.getObjectID(tableData, tablevndid);
        }
        // else if(radioDistPassCount.isSelected())
        else if (radioP.isSelected()) {
            operationDataBase.getObjectID(tableData, tablePassangerCount);
        }
        //else if(radioDistTotAmount.isSelected())
        else if (radioTotal.isSelected()) {
            operationDataBase.getObjectID(tableData, tableTotalAmount);
        }
        //else if(radioDistTripdist.isSelected())
        else if (radioTrip.isSelected()) {
            operationDataBase.getObjectID(tableData, tableTripDistance);
        } else if (radioExtra.isSelected()) {
            operationDataBase.getObjectID(tableData, tableExtra);
        } else if (radioImpro.isSelected()) {
            operationDataBase.getObjectID(tableData, tableImprovementSurcharge);
        } else if (radioMta.isSelected()) {
            operationDataBase.getObjectID(tableData, tableMtaTax);
        }
    }//GEN-LAST:event_BtnSave1ActionPerformed

    private void BtnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSave2ActionPerformed
        test = true;
        Vector<ObjectId> list = new Vector<ObjectId>();
        if (radiovendor.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioP.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioPuloc.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioDoloc.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioPaymment.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioMta.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioImpro.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioTrip.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioTotal.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        } else if (radioExtra.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }
            new operationDataBase().fillFautSearch(tableDelete, list);
        }

    }

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        String[] list = new String[500000];
        if (radiovendor.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioP.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioPuloc.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioDoloc.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioPaymment.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioMta.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioImpro.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioTrip.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioTotal.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();
                System.out.println(list[i]);
            }
        } else if (radioExtra.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                list[i] = tableData.getModel().getValueAt(i, 0).toString();

            }
        }

    }//GEN-LAST:event_BtnSave2ActionPerformed

    static boolean test;

    private void BtnEliminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableDelete.getModel();

        if (test) {
            for (int i = 0; i < tableDelete.getModel().getRowCount(); i++) {
                ObjectId a = (ObjectId) tableDelete.getModel().getValueAt(i, 0);
                for (int j = 1; j < tableDelete.getModel().getRowCount(); j++) {
                    if (a.equals(tableDelete.getModel().getValueAt(j, 0))) {
                        model.removeRow(j);
                    }

                }
            }
        }
        test = false;
        Tools.showMessage(tableDelete.getModel().getRowCount() + "");


    }//GEN-LAST:event_BtnEliminActionPerformed

    private void BtnTAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTAmountActionPerformed
        TxtResTamount1.setText(operationDataBase.getAver(tableData, 18) + "");
        TxtMaxTAmount.setText("31107.91");
        TxtMinTamount.setText("-300.3");
    }//GEN-LAST:event_BtnTAmountActionPerformed

    private void BtnPCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPCountActionPerformed
        TxtResPCount.setText(operationDataBase.getAver(tableData, 5) + "");
        TxxtMinPasCount.setText("9");
        TxtMaxPassCount.setText("0");
    }//GEN-LAST:event_BtnPCountActionPerformed

    //hna than bdlte pcq nrml tab tbdel ki wdna 1
    private void BtnTripDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTripDistActionPerformed
        TxtResTripDist.setText(operationDataBase.getAver(tableData, 6) + "");
        TxtMinTripDist.setText("0");
        TxtMaxtripDistance.setText("128.73");
    }//GEN-LAST:event_BtnTripDistActionPerformed

    public void DistrRadio() {
        if (radioDistPassCount.isSelected()) {
            SpnTripDistMin.setEnabled(false);
            SpnTripDistMax.setEnabled(false);
            SpnPassCOUNTMin.setEnabled(true);
            SpnPassCOUNTMax.setEnabled(true);
            SpnTotAmountMin.setEnabled(false);
            SpnTotAmountMax.setEnabled(false);
            SpnTripTimeMax1.setEnabled(false);
            SpnTripTimeMin1.setEnabled(false);
        } else if (radioDistTotAmount.isSelected()) {
            SpnTripDistMin.setEnabled(false);
            SpnTripDistMax.setEnabled(false);
            SpnPassCOUNTMin.setEnabled(false);
            SpnPassCOUNTMax.setEnabled(false);
            SpnTotAmountMin.setEnabled(true);
            SpnTotAmountMax.setEnabled(true);
            SpnTripTimeMax1.setEnabled(false);
            SpnTripTimeMin1.setEnabled(false);
        } else if (radioTripTime1.isSelected()) {
            SpnTripTimeMax1.setEnabled(true);
            SpnTripTimeMin1.setEnabled(true);
            SpnTripDistMin.setEnabled(false);
            SpnTripDistMax.setEnabled(false);
            SpnPassCOUNTMin.setEnabled(false);
            SpnPassCOUNTMax.setEnabled(false);
            SpnTotAmountMin.setEnabled(false);
            SpnTotAmountMax.setEnabled(false);
        } else {
            SpnTripDistMin.setEnabled(true);
            SpnTripDistMax.setEnabled(true);
            SpnPassCOUNTMin.setEnabled(false);
            SpnPassCOUNTMax.setEnabled(false);
            SpnTotAmountMin.setEnabled(false);
            SpnTotAmountMax.setEnabled(false);
            SpnTripTimeMax1.setEnabled(false);
            SpnTripTimeMin1.setEnabled(false);
        }
    }

    private void radioDistTotAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDistTotAmountMouseClicked
        DistrRadio();
    }//GEN-LAST:event_radioDistTotAmountMouseClicked

    private void radioDistTotAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDistTotAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDistTotAmountActionPerformed

    private void radioDistTripdistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDistTripdistMouseClicked
        DistrRadio();
    }//GEN-LAST:event_radioDistTripdistMouseClicked

    private void radioDistPassCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDistPassCountMouseClicked
        DistrRadio();
    }//GEN-LAST:event_radioDistPassCountMouseClicked

    private void radioDistPassCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDistPassCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDistPassCountActionPerformed

    private void BtnTotAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTotAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTotAmountActionPerformed

    private void BtnPassCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPassCountActionPerformed
        double[] num = {14645, 721734, 163900, 49019, 24627, 2859, 5, 6, 1};
        new Tools().createFrameBarChart_PassengerCount(num, "Passenger Count Graphics", 9);
    }//GEN-LAST:event_BtnPassCountActionPerformed

    private void BtnDistCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDistCalcActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableDistrDelete.getModel();
        model.setRowCount(0);
        if (radioDistPassCount.isSelected()) {
            operationDataBase.istogrameDist((int) SpnPassCOUNTMin.getValue(), (int) SpnPassCOUNTMax.getValue(), "passenger_count", tableDistrDelete);  //tableData);
        } else if (radioDistTotAmount.isSelected()) {
            operationDataBase.istogrameDistDB((double) SpnTotAmountMin.getValue(), (double) SpnTotAmountMax.getValue(), "total_amount", tableDistrDelete);
        }
     /* else if(radioTripTime1.isSelected())
        {
           
        operationDataBase.searchTime(tableData, tableDelete , SpnTripTimeMin1.getValue(), SpnTripTimeMax1.getValue());
        }*/
        else {
            operationDataBase.istogrameDistDB((double) SpnTripDistMin.getValue(), (double) SpnTripDistMax.getValue(), "trip_distance", tableDistrDelete);
        }

    }//GEN-LAST:event_BtnDistCalcActionPerformed

    private void BtnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSave3ActionPerformed
        Vector<ObjectId> vec = new Vector<ObjectId>();
        if (radioDistPassCount.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                vec.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }

        } else if (radioDistTotAmount.isSelected()) {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                vec.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }

        } else {
            for (int i = 0; i < tableData.getModel().getRowCount(); i++) {
                vec.add((ObjectId) tableData.getModel().getValueAt(i, 0));
            }

        }
        new operationDataBase().fillFautSearch(tableDistrDelete, vec);
    }//GEN-LAST:event_BtnSave3ActionPerformed

    private void BtnElimin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimin1ActionPerformed
        operationDataBase.loadMatrix(tablevndid, tableExtra, tableImprovementSurcharge, tableMtaTax, tablePassangerCount, tableTotalAmount, tableTripDistance, tabMatrix);
    }//GEN-LAST:event_BtnElimin1ActionPerformed

    //hadi ana dertha mn rassi hhh
    private void BtnTripTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTripTime1ActionPerformed
        TxtResTripTime.setText(operationDataBase.getAver(tableData, 4) + "");
        TxtMaxTripTime1.setText("10000");
        TxtMinTripTime1.setText("-422");        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTripTime1ActionPerformed

    private void BtnTotAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTotAmount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTotAmount1ActionPerformed

    private void radioTripTime1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTripTime1MouseClicked
        DistrRadio();        // TODO add your handling code here:
    }//GEN-LAST:event_radioTripTime1MouseClicked

    private void radioTripTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTripTime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTripTime1ActionPerformed

    private void BtnTripTime1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTripTime1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTripTime1MouseClicked

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
            java.util.logging.Logger.getLogger(tableOperationMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableOperationMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableOperationMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableOperationMongoDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableOperationMongoDB().setVisible(true);
            }
        });
    }


    // End of variables declaration//GEN-END:variables
}
