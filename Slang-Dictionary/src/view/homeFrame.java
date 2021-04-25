/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import slang.dictionary.SlangWord;

/**
 *
 * @author Admin
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    
    CardLayout mainCardLayout;
    SlangWord slHandler = null;
    public HomeFrame() {
        initComponents();
        slHandler = new SlangWord();
        this.setLocationRelativeTo(null);
        dlReset.setLocationRelativeTo(null);
        mainCardLayout = (CardLayout)(pnMainCard.getLayout());
        btnSearchBySlang.setBackground(Color.white);
        mainCardLayout.show(pnMainCard, "pnSearchBySlang");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        lbResult.setBorder(BorderFactory.createCompoundBorder(border, 
            BorderFactory.createEmptyBorder(20, 20, 10, 10)));
        lbResultDefinition.setBorder(BorderFactory.createCompoundBorder(border, 
            BorderFactory.createEmptyBorder(20, 20, 10, 10)));
        lbHistoryResult.setBorder(BorderFactory.createCompoundBorder(border, 
            BorderFactory.createEmptyBorder(20, 20, 10, 10)));
        lbResultRandom.setBorder(BorderFactory.createCompoundBorder(border, 
            BorderFactory.createEmptyBorder(20, 20, 10, 10)));
        lbResult.setEditable(false);
        lbResultDefinition.setEditable(false);
        lbHistoryResult.setEditable(false);
    }
    
    public void resetColorButton(){
        Color defaultColor = new Color(204, 204, 204);
        btnSearchBySlang.setBackground(defaultColor);
        btnSearchByDefinition.setBackground(defaultColor);
        btnHistory.setBackground(defaultColor);
        btnRandom.setBackground(defaultColor);
        btnaddNewSlangWord.setBackground(defaultColor);
        btnQuiz.setBackground(defaultColor);
    }
    
    public void resetData(){
        lbResultDefinition.setText("");
        lbResult.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlReset = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        btnOkeConfirmReset = new javax.swing.JButton();
        btnCloseConfirmReset = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        panelSidebar = new javax.swing.JPanel();
        btnSearchByDefinition = new javax.swing.JButton();
        btnSearchBySlang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        btnaddNewSlangWord = new javax.swing.JButton();
        btnModify1 = new javax.swing.JButton();
        btnRandom = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        pnMainCard = new javax.swing.JPanel();
        pnSearchBySlang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tbSlangWord = new javax.swing.JTextField();
        btnSearchKeySlang = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbResult = new javax.swing.JTextArea();
        pnHistory = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbHistoryResult = new javax.swing.JTextArea();
        pnRandom = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbResultRandom = new javax.swing.JTextArea();
        btnRandomAction = new javax.swing.JButton();
        pnSearchByDefinition = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbResultDefinition = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        tbDefinition = new javax.swing.JTextField();
        btnSearchKeyDefinition = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        dlReset.setMinimumSize(new java.awt.Dimension(350, 150));
        dlReset.setModal(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Are you sure to reset the slang words list?");

        btnOkeConfirmReset.setBackground(new java.awt.Color(255, 0, 0));
        btnOkeConfirmReset.setText("OKE");
        btnOkeConfirmReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkeConfirmResetActionPerformed(evt);
            }
        });

        btnCloseConfirmReset.setText("Close");
        btnCloseConfirmReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseConfirmResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlResetLayout = new javax.swing.GroupLayout(dlReset.getContentPane());
        dlReset.getContentPane().setLayout(dlResetLayout);
        dlResetLayout.setHorizontalGroup(
            dlResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlResetLayout.createSequentialGroup()
                .addGroup(dlResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlResetLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7))
                    .addGroup(dlResetLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnOkeConfirmReset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnCloseConfirmReset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        dlResetLayout.setVerticalGroup(
            dlResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlResetLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(dlResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOkeConfirmReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseConfirmReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerSize(1);

        panelSidebar.setBackground(new java.awt.Color(102, 153, 255));

        btnSearchByDefinition.setBackground(new java.awt.Color(204, 204, 204));
        btnSearchByDefinition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchByDefinition.setText("Tìm kiếm theo definition");
        btnSearchByDefinition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByDefinitionActionPerformed(evt);
            }
        });

        btnSearchBySlang.setBackground(new java.awt.Color(204, 204, 204));
        btnSearchBySlang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchBySlang.setText("Tìm kiếm theo slang word");
        btnSearchBySlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBySlangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Slang Dictionnary");

        btnHistory.setBackground(new java.awt.Color(204, 204, 204));
        btnHistory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHistory.setText("Xem lịch sử tìm kiếm");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnaddNewSlangWord.setBackground(new java.awt.Color(204, 204, 204));
        btnaddNewSlangWord.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnaddNewSlangWord.setText("Thêm slang word");
        btnaddNewSlangWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddNewSlangWordActionPerformed(evt);
            }
        });

        btnModify1.setBackground(new java.awt.Color(204, 204, 204));
        btnModify1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModify1.setText("Chỉnh sửa và xóa slang word");
        btnModify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModify1ActionPerformed(evt);
            }
        });

        btnRandom.setBackground(new java.awt.Color(204, 204, 204));
        btnRandom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRandom.setText("Random slang word");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        btnQuiz.setBackground(new java.awt.Color(204, 204, 204));
        btnQuiz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQuiz.setText("Đố vui");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("Reset danh sách slang words");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearchByDefinition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnaddNewSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnModify1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRandom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSearchBySlang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnSearchBySlang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchByDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaddNewSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModify1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(panelSidebar);

        pnMainCard.setLayout(new java.awt.CardLayout());

        pnSearchBySlang.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nhập từ khóa:");

        tbSlangWord.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnSearchKeySlang.setBackground(new java.awt.Color(102, 153, 255));
        btnSearchKeySlang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchKeySlang.setText("Search");
        btnSearchKeySlang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSearchKeySlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchKeySlangActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Kết quả tìm kiếm");

        lbResult.setBackground(new java.awt.Color(102, 153, 255));
        lbResult.setColumns(20);
        lbResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbResult.setLineWrap(true);
        lbResult.setRows(5);
        lbResult.setWrapStyleWord(true);
        lbResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(lbResult);

        javax.swing.GroupLayout pnSearchBySlangLayout = new javax.swing.GroupLayout(pnSearchBySlang);
        pnSearchBySlang.setLayout(pnSearchBySlangLayout);
        pnSearchBySlangLayout.setHorizontalGroup(
            pnSearchBySlangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSearchBySlangLayout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(pnSearchBySlangLayout.createSequentialGroup()
                .addGroup(pnSearchBySlangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSearchBySlangLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchKeySlang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnSearchBySlangLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSearchBySlangLayout.setVerticalGroup(
            pnSearchBySlangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSearchBySlangLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnSearchBySlangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchKeySlang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnMainCard.add(pnSearchBySlang, "pnSearchBySlang");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("The history of the slang words searched");

        lbHistoryResult.setBackground(new java.awt.Color(102, 153, 255));
        lbHistoryResult.setColumns(20);
        lbHistoryResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbHistoryResult.setLineWrap(true);
        lbHistoryResult.setRows(5);
        lbHistoryResult.setWrapStyleWord(true);
        lbHistoryResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(lbHistoryResult);

        javax.swing.GroupLayout pnHistoryLayout = new javax.swing.GroupLayout(pnHistory);
        pnHistory.setLayout(pnHistoryLayout);
        pnHistoryLayout.setHorizontalGroup(
            pnHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHistoryLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(pnHistoryLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnHistoryLayout.setVerticalGroup(
            pnHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHistoryLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnMainCard.add(pnHistory, "pnHistory");

        lbResultRandom.setBackground(new java.awt.Color(102, 153, 255));
        lbResultRandom.setColumns(20);
        lbResultRandom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbResultRandom.setLineWrap(true);
        lbResultRandom.setRows(5);
        lbResultRandom.setWrapStyleWord(true);
        lbResultRandom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(lbResultRandom);

        btnRandomAction.setBackground(new java.awt.Color(204, 204, 204));
        btnRandomAction.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRandomAction.setText("Click Here to random");
        btnRandomAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRandomLayout = new javax.swing.GroupLayout(pnRandom);
        pnRandom.setLayout(pnRandomLayout);
        pnRandomLayout.setHorizontalGroup(
            pnRandomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRandomLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(pnRandomLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnRandomAction, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRandomLayout.setVerticalGroup(
            pnRandomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRandomLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnRandomAction, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pnMainCard.add(pnRandom, "pnRandom");

        pnSearchByDefinition.setName(""); // NOI18N

        lbResultDefinition.setBackground(new java.awt.Color(102, 153, 255));
        lbResultDefinition.setColumns(20);
        lbResultDefinition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbResultDefinition.setLineWrap(true);
        lbResultDefinition.setRows(5);
        lbResultDefinition.setWrapStyleWord(true);
        lbResultDefinition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(lbResultDefinition);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nhập từ khóa:");

        tbDefinition.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnSearchKeyDefinition.setBackground(new java.awt.Color(102, 153, 255));
        btnSearchKeyDefinition.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchKeyDefinition.setText("Search");
        btnSearchKeyDefinition.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSearchKeyDefinition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchKeyDefinitionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kết quả tìm kiếm");

        javax.swing.GroupLayout pnSearchByDefinitionLayout = new javax.swing.GroupLayout(pnSearchByDefinition);
        pnSearchByDefinition.setLayout(pnSearchByDefinitionLayout);
        pnSearchByDefinitionLayout.setHorizontalGroup(
            pnSearchByDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSearchByDefinitionLayout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(pnSearchByDefinitionLayout.createSequentialGroup()
                .addGroup(pnSearchByDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSearchByDefinitionLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSearchKeyDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnSearchByDefinitionLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSearchByDefinitionLayout.setVerticalGroup(
            pnSearchByDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSearchByDefinitionLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnSearchByDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchKeyDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnMainCard.add(pnSearchByDefinition, "pnSearchByDefinition");

        jSplitPane1.setRightComponent(pnMainCard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchBySlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBySlangActionPerformed

        mainCardLayout.show(pnMainCard, "pnSearchBySlang");
        resetColorButton();
        resetData();
        btnSearchBySlang.setBackground(Color.white);
    }//GEN-LAST:event_btnSearchBySlangActionPerformed

    private void btnSearchByDefinitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByDefinitionActionPerformed

        mainCardLayout.show(pnMainCard, "pnSearchByDefinition");
        resetColorButton();
        resetData();
        btnSearchByDefinition.setBackground(Color.white);
    }//GEN-LAST:event_btnSearchByDefinitionActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        mainCardLayout.show(pnMainCard, "pnHistory");
        resetColorButton();
        btnHistory.setBackground(Color.white);
        String rs = "";
        List<String> listDataHistory = slHandler.initHistoryData();
        for (int i = 0; i < listDataHistory.size(); i++){
            rs += (i + 1) + ". " + listDataHistory.get(i) + "\n";
        }
        lbHistoryResult.setText(rs);
        
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnaddNewSlangWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddNewSlangWordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnaddNewSlangWordActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        // TODO add your handling code here:
        mainCardLayout.show(pnMainCard, "pnRandom");
        resetColorButton();
        btnRandom.setBackground(Color.white);
    }//GEN-LAST:event_btnRandomActionPerformed

    private void btnModify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModify1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModify1ActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        dlReset.setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchKeyDefinitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchKeyDefinitionActionPerformed
        // TODO add your handling code here:
         if (tbDefinition.getText().compareTo("") == 0){
            return;
        }
        lbResultDefinition.setText("");
        List<String> listSlangWord = slHandler.getDataByDefinition(tbDefinition.getText());
        if (listSlangWord.size() == 0){  
            lbResultDefinition.setText("Sorry, no slang words were found with the definition '" + 
                    tbDefinition.getText() + "' :((");
            lbResultDefinition.setForeground(Color.RED);
        }
        else{
            String result = "Slang words of definition '" + tbDefinition.getText() + "': ";
            for (int i = 0; i < listSlangWord.size(); i++){
                result += listSlangWord.get(i);
                if (i != listSlangWord.size() - 1){
                    result += ", ";
                }
            }
            lbResultDefinition.setText(result);
            lbResultDefinition.setForeground(Color.BLACK);
        }
        tbDefinition.setText("");
    }//GEN-LAST:event_btnSearchKeyDefinitionActionPerformed

    private void btnCloseConfirmResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseConfirmResetActionPerformed
        // TODO add your handling code here:
        dlReset.setVisible(false);
    }//GEN-LAST:event_btnCloseConfirmResetActionPerformed

    private void btnOkeConfirmResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkeConfirmResetActionPerformed
        // TODO add your handling code here:
        try {
            slHandler.resetData();
            dlReset.setVisible(false);
            slHandler = new SlangWord();
            JOptionPane.showMessageDialog(null, "Reset was successful!!!");  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOkeConfirmResetActionPerformed

    private void btnSearchKeySlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchKeySlangActionPerformed
        // TODO add your handling code here:
        if (tbSlangWord.getText().compareTo("") == 0){
            return;
        }
        lbResult.setText("");
        String[] listDefinition = slHandler.getDataBySlangWord(tbSlangWord.getText());
        if (listDefinition == null){
            lbResult.setText("Sorry, no slang words were found with key word '" +
                tbSlangWord.getText() + "' :((");
            lbResult.setForeground(Color.RED);
        }
        else{
            String result = "Definitons of '" + tbSlangWord.getText() + "': ";
            for (int i = 0; i < listDefinition.length; i++){
                result += listDefinition[i];
                if (i != listDefinition.length - 1){
                    result += ", ";
                }
            }
            lbResult.setText(result);
            lbResult.setForeground(Color.BLACK);
        }
        slHandler.saveHistoryData(tbSlangWord.getText());
        tbSlangWord.setText("");
    }//GEN-LAST:event_btnSearchKeySlangActionPerformed

    private void btnRandomActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionActionPerformed
        // TODO add your handling code here:
        List<String> resultData = slHandler.randomSlangWords();
        String rs = "Slang word: " + resultData.get(0) + "\n" + "Definitions: ";
        for (int i = 1; i < resultData.size(); i++){
            rs += resultData.get(i);
            if (i != resultData.size() - 1){
                rs += ", ";
            }
        }
        lbResultRandom.setText(rs);
    }//GEN-LAST:event_btnRandomActionActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseConfirmReset;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnModify1;
    private javax.swing.JButton btnOkeConfirmReset;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnRandomAction;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearchByDefinition;
    private javax.swing.JButton btnSearchBySlang;
    private javax.swing.JButton btnSearchKeyDefinition;
    private javax.swing.JButton btnSearchKeySlang;
    private javax.swing.JButton btnaddNewSlangWord;
    private javax.swing.JDialog dlReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea lbHistoryResult;
    private javax.swing.JTextArea lbResult;
    private javax.swing.JTextArea lbResultDefinition;
    private javax.swing.JTextArea lbResultRandom;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel pnHistory;
    private javax.swing.JPanel pnMainCard;
    private javax.swing.JPanel pnRandom;
    private javax.swing.JPanel pnSearchByDefinition;
    private javax.swing.JPanel pnSearchBySlang;
    private javax.swing.JTextField tbDefinition;
    private javax.swing.JTextField tbSlangWord;
    // End of variables declaration//GEN-END:variables
}
