package src;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Atm extends JFrame implements ActionListener, MouseListener {
    JPanel enquiry;
    JPanel options;
    JPanel fastpanel;
    JPanel withdrawal;
    JPanel withdrawal1;
    JPanel depositpanel;
    JPanel transferpanel;
    JPanel transferpanel1;
    JPanel ministatement;
    JPanel exit;
    static int z = 1;
    String k = "";
    String q = "";
    static int wd = 0;
    static int keystate = 0;
    static int cnt1 = 0;
    static int cnt2 = 0;
    static int cnt3 = 0;
    static int cnt4 = 0;
    static int cnt5 = 0;
    static int cnt6 = 0;
    String user;
    int usr;
    int pass;
    int cnt = 2;
    int accno;
    int tacc;
    int tamt;
    int deposi;
    JLabel msg1;
    JLabel fast;
    JLabel balance;
    JLabel cash;
    JLabel deposit;
    JLabel mini;
    JLabel transfer;
    JPanel pan1;
    JPanel pan0;
    JPanel pantop;
    JPanel panmiddle;
    JPanel loginpanel;
    JPanel mainpanel;
    JPanel accountpanel;
    JPanel adpanel;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b0;
    JButton bclear;
    JButton bcancel;
    JButton bok;
    JButton but1;
    JButton but2;
    JButton but3;
    JButton but4;
    JButton but5;
    JButton but6;
    JButton but7;
    JButton but8;
    JButton but9;
    JTextField loginfield;
    JTextField textamt;
    JTextField textamt1;
    JTextArea textarea;
    private JPasswordField pwordfield;
    CardLayout cardlay;
    CardLayout cardlay1;
    Container c;
    JLabel labb;
    JLabel label;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label4a;
    JLabel label5;
    JLabel label6;
    JLabel label6a;
    JLabel label7;
    BorderLayout blo;
    Color c1;
    Color c2;
    Atm.OptionButtonHandler handler = new Atm.OptionButtonHandler();

    Atm() {
    }

    public void Atmmain() {
        Container var1 = this.getContentPane();
        var1 = this.getContentPane();
        var1.setLayout((LayoutManager)null);
        this.but1 = new JButton(">>>");
        this.but1.setPreferredSize(new Dimension(100, 30));
        this.but1.setSize(this.but1.getPreferredSize());
        this.but1.setLocation(50, 50);
        var1.add(this.but1);
        this.but2 = new JButton(">>>");
        this.but2.setPreferredSize(new Dimension(100, 30));
        this.but2.setSize(this.but2.getPreferredSize());
        this.but2.setLocation(50, 100);
        var1.add(this.but2);
        this.but3 = new JButton(">>>");
        this.but3.setPreferredSize(new Dimension(100, 30));
        this.but3.setSize(this.but3.getPreferredSize());
        this.but3.setLocation(50, 150);
        var1.add(this.but3);
        this.but4 = new JButton("<<<");
        this.but4.setPreferredSize(new Dimension(100, 30));
        this.but4.setSize(this.but4.getPreferredSize());
        this.but4.setLocation(575, 50);
        var1.add(this.but4);
        this.but5 = new JButton("<<<");
        this.but5.setPreferredSize(new Dimension(100, 30));
        this.but5.setSize(this.but5.getPreferredSize());
        this.but5.setLocation(575, 100);
        var1.add(this.but5);
        this.but6 = new JButton("<<<");
        this.but6.setPreferredSize(new Dimension(100, 30));
        this.but6.setSize(this.but6.getPreferredSize());
        this.but6.setLocation(575, 150);
        var1.add(this.but6);
        this.b1 = new JButton("1");
        this.b2 = new JButton("2");
        this.b3 = new JButton("3");
        this.b4 = new JButton("4");
        this.b5 = new JButton("5");
        this.b6 = new JButton("6");
        this.b7 = new JButton("7");
        this.b8 = new JButton("8");
        this.b9 = new JButton("9");
        this.b0 = new JButton("0");
        this.bclear = new JButton("CLEAR");
        this.bcancel = new JButton("CANCEL");
        this.bok = new JButton("OK");
        this.pan1 = new JPanel();
        this.pan1.setLayout(new GridLayout(4, 2, 10, 10));
        this.pan1.setSize(260, 150);
        this.pan1.add(this.b1);
        this.pan1.add(this.b2);
        this.pan1.add(this.b3);
        this.pan1.add(this.b4);
        this.pan1.add(this.b5);
        this.pan1.add(this.b6);
        this.pan1.add(this.b7);
        this.pan1.add(this.b8);
        this.pan1.add(this.b9);
        this.pan1.add(this.b0);
        this.pan1.add(this.bclear);
        this.pan1.add(this.bcancel);
        this.pan1.setLocation(225, 300);
        this.pan1.setBackground(Color.ORANGE);
        var1.add(this.pan1);
        this.cardlay = new CardLayout();
        this.blo = new BorderLayout();
        this.panmiddle = new JPanel();
        this.panmiddle.setSize(402, 250);
        this.panmiddle.setLocation(160, 30);
        this.panmiddle.setLayout(this.cardlay);
        this.panmiddle.setBackground(Color.WHITE);
        this.adpanel = new JPanel();
        this.loginpanel = new JPanel();
        this.mainpanel = new JPanel();
        this.accountpanel = new JPanel();
        this.mainpanel.setBackground(Color.WHITE);
        this.panmiddle.add(this.adpanel, "ad");
        this.panmiddle.add(this.loginpanel, "login");
        this.panmiddle.add(this.mainpanel, "main");
        this.panmiddle.add(this.accountpanel, "account");
        this.adpanel.setBackground(Color.PINK);
        this.startanimation();
        var1.add(this.panmiddle);
        this.setTitle("Main Atm");
        this.setSize(730, 520);
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public void Password() {
        this.loginpanel.setSize(200, 200);
        this.c1 = new Color(255, 100, 100);
        this.c2 = new Color(255, 50, 50);
        this.loginpanel.setBackground(this.c1);
        this.loginpanel.setLayout(this.blo);
        JPanel var1 = new JPanel();
        var1.setLayout(new GridLayout(3, 2, 10, 10));
        var1.setSize(100, 50);
        var1.setBackground(this.c2);
        String var2 = "                     \tW E L C O M E!   \n              \tPlease write your login and password:\n         \t -------------------------------------------\n";
        JTextArea var3 = new JTextArea(var2);
        var3.setBackground(this.c1);
        var3.setEditable(false);
        BorderLayout var10002 = this.blo;
        this.loginpanel.add(var3, "North");
        JLabel var4 = new JLabel("CUSTOMER ID");
        JLabel var5 = new JLabel("PIN CODE");
        this.loginfield = new JTextField(4);
        var1.add(var4);
        var1.add(this.loginfield);
        var1.add(var5);
        this.pwordfield = new JPasswordField(4);
        var1.add(this.pwordfield);
        this.but8 = new JButton("OK");
        this.but8.setPreferredSize(new Dimension(90, 25));
        this.but8.setSize(this.but8.getPreferredSize());
        var1.add(this.but8);
        this.but9 = new JButton("CANCEL");
        this.but9.setPreferredSize(new Dimension(90, 25));
        this.but9.setSize(this.but9.getPreferredSize());
        var1.add(this.but9);
        String var6 = "\t----------------------------------------------\n            \tThis product is a\n       \tguarenteed trade mark of\n \t'SYMBIOSIS COMPUTER SYSTEMS INC.\n\t----------------------------------------------\n       \tProducer:  Parthav & Priyanka";
        this.textarea = new JTextArea(var6);
        var10002 = this.blo;
        this.loginpanel.add(this.textarea, "South");
        this.textarea.setBackground(this.c1);
        this.textarea.setEditable(false);
        var10002 = this.blo;
        this.loginpanel.add(var1, "East");
        this.loginfield.requestFocus();
        this.but8.addActionListener(this);
        this.but9.addActionListener(this);
    }

    public void startanimation() {
        LogoAnimatorJPanel var1 = new LogoAnimatorJPanel();
        this.adpanel.add(var1);
        this.adpanel.setVisible(true);
        var1.startAnimation();
        var1.addMouseListener(this);
    }

    public void getchoice() {
        JPanel var1 = new JPanel();
        var1.setLayout(this.blo);
        String var2 = "                     W E L C O M E   " + this.user + " \n " + "             \tPlease select your account \n" + "         \t -------------------------------------------\n";
        JTextArea var3 = new JTextArea(var2);
        var3.setBackground(this.c1);
        var3.setEditable(false);
        BorderLayout var10002 = this.blo;
        var1.add(var3, "North");
        JPanel var4 = new JPanel();
        var4.setLayout(new GridLayout(2, 1, 30, 40));
        JLabel var5 = new JLabel("SAVING");
        JLabel var6 = new JLabel("CURRENT");
        var4.add(var5);
        var4.add(var6);
        var10002 = this.blo;
        var1.add(var4, "East");
        this.mainpanel.add(var1);
        this.but5.addActionListener(this);
        this.but6.addActionListener(this);
    }

    public void getaccountscreen() {
        this.cardlay1 = new CardLayout();
        this.accountpanel.setBackground(this.c1);
        this.accountpanel.setLayout(this.cardlay1);
        this.options = new JPanel();
        this.enquiry = new JPanel();
        this.fastpanel = new JPanel();
        this.withdrawal = new JPanel();
        this.withdrawal1 = new JPanel();
        this.ministatement = new JPanel();
        this.depositpanel = new JPanel();
        this.transferpanel = new JPanel();
        this.transferpanel1 = new JPanel();
        this.exit = new JPanel();
        String var1 = "  \n \nFAST CASH\t\t\tBALANCE ENQUIRY \n                                 \n  \nCASH WITHDRAWAL\t\tDEPOSIT \n \t\t\t\t\t\t\n\t\n MINI STATEMENT\t\tTRANSFER ";
        JTextArea var2 = new JTextArea(var1);
        var2.setBackground(this.c1);
        var2.setEditable(false);
        this.options.add(var2);
        String var3 = "\n\n\n  Dear " + this.user + "\n Select your choice " + "\n   on your Account NO " + this.accno;
        JTextArea var4 = new JTextArea(var3);
        var4.setBackground(this.c1);
        var4.setEditable(false);
        this.options.add(var4);
        this.accountpanel.add(this.options, "options");
        this.accountpanel.add(this.enquiry, "enquiry");
        this.accountpanel.add(this.fastpanel, "fast");
        this.accountpanel.add(this.withdrawal, "withdrawal");
        this.accountpanel.add(this.withdrawal1, "withdrawal1");
        this.accountpanel.add(this.ministatement, "ministatement");
        this.accountpanel.add(this.depositpanel, "deposit");
        this.accountpanel.add(this.transferpanel, "transfer");
        this.accountpanel.add(this.transferpanel1, "transfer1");
        this.accountpanel.add(this.exit, "exit");
        this.options.setBackground(this.c1);
        this.cardlay1.show(this.accountpanel, "options");
        System.out.println("start ");
        System.out.println(cnt6);
        this.but1.addActionListener(this.handler);
        this.but2.addActionListener(this.handler);
        this.but3.addActionListener(this.handler);
        this.but4.addActionListener(this.handler);
        this.but5.addActionListener(this.handler);
        this.but6.addActionListener(this.handler);
    }

    public void gettransfer() {
        JLabel var1 = new JLabel("\t\tOK\t");
        JLabel var2 = new JLabel(" \tEnter the account no   ");
        JLabel var3 = new JLabel(" \tEnter the amount     ");
        this.textamt = new JTextField(4);
        this.textamt1 = new JTextField(4);
        JPanel var4 = new JPanel();
        var4.setLayout(new FlowLayout(50));
        var4.setBackground(this.c2);
        var4.add(var2);
        var4.add(this.textamt);
        var4.add(var3);
        var4.add(this.textamt1);
        var4.add(var1);
        BorderLayout var10002 = this.blo;
        this.transferpanel.add(var4, "East");
        this.textamt.requestFocus();
        keystate = 1;
        this.initkeypad();
    }

    public void printmini() {
        Query var1 = new Query();
        String[] var2 = new String[10];
        var2 = var1.ministatement(this.accno);
        JOptionPane.showMessageDialog((Component)null, var2);
    }

    public void getfastpanel() {
        this.fastpanel.setBackground(this.c1);
        String var1 = "  \n \nINR 100\t\t    \tINR 500 \n                                 \n  \nINR 1000\t\t    \tINR 5000 \n \t\t\t\t\t\t\n\t\n INR 10000\t     \t\tINR 15000 ";
        JTextArea var2 = new JTextArea(var1);
        var2.setBackground(this.c1);
        var2.setEditable(false);
        this.fastpanel.add(var2);
        String var3 = "\n\n\n  Dear " + this.user + "\n Select your option ";
        JTextArea var4 = new JTextArea(var3);
        var4.setBackground(this.c1);
        var4.setEditable(false);
        this.fastpanel.add(var4);
    }

    public void showWithrawalOptions() {
        JLabel var1 = new JLabel("\t\tOK\t");
        JLabel var2 = new JLabel(" \tEnter the amount     ");
        this.textamt = new JTextField(4);
        JPanel var3 = new JPanel();
        var3.setLayout(new FlowLayout(50));
        var3.setBackground(this.c2);
        var3.add(var2);
        var3.add(this.textamt);
        var3.add(var1);
        BorderLayout var10002 = this.blo;
        this.withdrawal.add(var3, "East");
        this.textamt.requestFocus();
        this.initkeypad();
    }

    public void initkeypad() {
        Atm.KeyActionHandler var1 = new Atm.KeyActionHandler();
        this.b1.addActionListener(var1);
        this.b2.addActionListener(var1);
        this.b3.addActionListener(var1);
        this.b4.addActionListener(var1);
        this.b5.addActionListener(var1);
        this.b6.addActionListener(var1);
        this.b7.addActionListener(var1);
        this.b8.addActionListener(var1);
        this.b9.addActionListener(var1);
        this.b0.addActionListener(var1);
        this.bclear.addActionListener(var1);
        this.bcancel.addActionListener(var1);
    }

    public void showprintoptions() {
        BalanceEnquiry var1 = new BalanceEnquiry(this.accno);
        BorderLayout var2 = new BorderLayout();
        this.enquiry.setLayout(var2);
        String var3 = "\n\n\n\n\n  \t    ACCOUNT BALANCE  \n\t    Available balance :" + var1.abal + "\n\t    Ledger    balance :" + var1.lbal + "\n\n \t      Print statement";
        JTextArea var4 = new JTextArea(var3);
        var4.setBackground(this.c1);
        var4.setEditable(false);
        this.enquiry.add(var4, "Center");
        JPanel var5 = new JPanel();
        var5.setLayout(new GridLayout(4, 1, 10, 14));
        var5.setBackground(this.c1);
        JLabel var6 = new JLabel("\nYES      ");
        JLabel var7 = new JLabel("NO        ");
        var5.add(var6);
        var5.add(var7);
        this.enquiry.add(var5, "East");
    }

    public void exitpanel() {
        BorderLayout var1 = new BorderLayout();
        this.exit.setLayout(var1);
        String var2 = "\n\n\n\n\n \tDear User  \n\t    Thank You!!  \n\t    Symbiosis Computers Inc Ltd:\n\n \t      @ copywrites Parthav,Priyanka";
        JTextArea var3 = new JTextArea(var2);
        var3.setBackground(this.c1);
        var3.setEditable(false);
        this.exit.add(var3, "Center");
        JPanel var4 = new JPanel();
        var4.setLayout(new GridLayout(4, 1, 10, 14));
        var4.setBackground(this.c1);
        JLabel var5 = new JLabel("\nEXIT      ");
        JLabel var6 = new JLabel("   ");
        var4.add(var5);
        var4.add(var6);
        this.exit.add(var4, "East");
    }

    public void printslip() {
        BalanceEnquiry var1 = new BalanceEnquiry(this.accno);
        Date var2 = new Date();
        SimpleDateFormat var3 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa ");
        String var4 = var3.format(var2);
        String var5 = "\t\t  A/C NO : " + var1.accno + "\n    Card no: " + this.usr + "\n\n     " + var4 + "\n\n  Withdrawal :" + wd + "\n\n  Available Balance: " + var1.abal + "\n   Ledger Balance   : " + var1.lbal + "\n\n  Thank you \n" + "-------------------------------\n";
        JOptionPane.showMessageDialog((Component)null, var5);
    }

    public void printslipdeposit() {
        BalanceEnquiry var1 = new BalanceEnquiry(this.accno);
        Date var2 = new Date();
        SimpleDateFormat var3 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa ");
        String var4 = var3.format(var2);
        String var5 = "\t\t  A/C NO : " + var1.accno + "\n    Card no: " + this.usr + "\n\n     " + var4 + "\n\n  Deposit :" + this.deposi + "\n\n  Available Balance: " + var1.abal + "\n   Ledger Balance   : " + var1.lbal + "\n\n  Thank you \n" + "-------------------------------\n";
        JOptionPane.showMessageDialog((Component)null, var5);
    }

    public void mouseClicked(MouseEvent var1) {
        this.cardlay.show(this.panmiddle, "login");
        this.Password();
    }

    public void mouseExited(MouseEvent var1) {
    }

    public void mousePressed(MouseEvent var1) {
    }

    public void mouseEntered(MouseEvent var1) {
    }

    public void mouseReleased(MouseEvent var1) {
    }

    public void actionPerformed(ActionEvent var1) {
        Query var2;
        if (var1.getSource() == this.but8) {
            var2 = new Query();
            this.usr = Integer.parseInt(this.loginfield.getText());
            this.pass = Integer.parseInt(this.pwordfield.getText());
            this.user = var2.val_password(this.usr, this.pass);
            if (this.user == null) {
                --this.cnt;
                if (this.cnt >= 0) {
                    int var3 = this.cnt + 1;
                    JOptionPane.showMessageDialog((Component)null, "LOGIN ERROR!!\n You hav " + var3 + " chances left");
                    this.cardlay.show(this.panmiddle, "login");
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println(this.user);
                this.cardlay.show(this.panmiddle, "main");
                this.getchoice();
            }
        }

        if (var1.getSource() == this.but9) {
            this.cardlay.show(this.panmiddle, "ad");
            this.getchoice();
        }

        if (var1.getSource() == this.but5) {
            this.cardlay.show(this.panmiddle, "account");
            var2 = new Query();
            this.accno = var2.getacc(this.usr, "s");
            this.getaccountscreen();
        }

        if (var1.getSource() == this.but6) {
            this.cardlay.show(this.panmiddle, "account");
            var2 = new Query();
            this.accno = var2.getacc(this.usr, "c");
            this.getaccountscreen();
        }

    }

    public static void main(String[] var0) {
        Atm var1 = new Atm();
        var1.Atmmain();
    }

    private class KeyActionHandler implements ActionListener {
        private KeyActionHandler() {
        }

        public void actionPerformed(ActionEvent var1) {
            if (((JButton)var1.getSource()).getText() == "CLEAR") {
                Atm.this.textamt.setText("");
                Atm.this.k = "";
            } else if (((JButton)var1.getSource()).getText() == "CANCEL") {
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
                Atm.this.k = "";
                Atm.this.q = "";
                Atm.this.cardlay1.show(Atm.this.accountpanel, "options");
            } else {
                String var2 = ((JButton)var1.getSource()).getText();
                if (Atm.this.textamt.isFocusable()) {
                    Atm.this.k = Atm.this.k + var2;
                    Atm.this.textamt.setText(Atm.this.k);
                    Atm.this.textamt.setFocusable(true);
                }

                if (Atm.this.textamt1.isFocusable()) {
                    Atm.this.q = Atm.this.q + var2;
                    Atm.this.textamt1.setText(Atm.this.q);
                    Atm.this.textamt1.setFocusable(true);
                    System.out.println(" else ");
                }
            }

        }
    }

    private class OptionButtonHandler implements ActionListener {
        private OptionButtonHandler() {
        }

        public void actionPerformed(ActionEvent var1) {
            boolean var2 = false;
            if (var1.getSource() == Atm.this.but1 && Atm.cnt1 == 0 && !var2) {
                Atm.cnt1 = 1;
                var2 = true;
                Atm.cnt4 = -1;
                Atm.cnt2 = -1;
                Atm.cnt3 = -1;
                Atm.cnt5 = -1;
                Atm.cnt6 = -1;
                var2 = true;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "fast");
                Atm.this.getfastpanel();
            } else if (var1.getSource() == Atm.this.but1 && Atm.cnt1 == 1 && !var2) {
                Atm.cnt1 = 2;
                var2 = true;
                Atm.wd = 100;
                new Withdrawal(Atm.this.accno, Atm.wd);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but2 && Atm.this.cnt == 1 && !var2) {
                Atm.cnt1 = 2;
                var2 = true;
                Atm.wd = 1000;
                new Withdrawal(Atm.this.accno, Atm.wd);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but3 && Atm.cnt1 == 1 && !var2) {
                Atm.cnt1 = 2;
                var2 = true;
                Atm.wd = 10000;
                new Withdrawal(Atm.this.accno, Atm.wd);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt1 == 1 && !var2) {
                Atm.cnt1 = 2;
                var2 = true;
                Atm.wd = 500;
                new Withdrawal(Atm.this.accno, Atm.wd);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt1 == 1 && !var2) {
                Atm.cnt1 = 2;
                var2 = true;
                Atm.wd = 5000;
                new Withdrawal(Atm.this.accno, Atm.wd);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but6 && Atm.cnt1 == 1 && !var2) {
                Atm.cnt1 = 2;
                var2 = true;
                Atm.wd = 15000;
                new Withdrawal(Atm.this.accno, Atm.wd);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt1 == 2 && !var2) {
                Atm.cnt1 = 3;
                var2 = true;
                Atm.this.printslip();
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt1 == 2 && !var2) {
                Atm.cnt1 = 3;
                var2 = true;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt1 == 3 && !var2) {
                var2 = true;
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "options");
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt1 == 3 && !var2) {
                var2 = true;
                System.exit(0);
            } else if (var1.getSource() == Atm.this.but2 && Atm.cnt2 == 0 && !var2) {
                Atm.cnt2 = 1;
                var2 = true;
                Atm.cnt4 = -1;
                Atm.cnt1 = -1;
                Atm.cnt3 = -1;
                Atm.cnt5 = -1;
                Atm.cnt6 = -1;
                Atm.this.withdrawal.setBackground(Atm.this.c1);
                Atm.this.withdrawal.setLayout(Atm.this.blo);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "withdrawal");
                Atm.this.showWithrawalOptions();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt2 == 1 && !var2) {
                Atm.cnt2 = 2;
                var2 = true;
                Atm.this.k = "";
                Atm.wd = Integer.parseInt(Atm.this.textamt.getText());
                Withdrawal var5 = new Withdrawal(Atm.this.accno, Atm.wd);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                System.out.println(var5.current_abal);
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt2 == 2 && !var2) {
                Atm.cnt2 = 3;
                var2 = true;
                Atm.this.printslip();
                Atm.wd = 0;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt2 == 2 && !var2) {
                Atm.cnt2 = 3;
                var2 = true;
                Atm.wd = 0;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt2 == 3 && !var2) {
                var2 = true;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "options");
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt2 == 3 && !var2) {
                var2 = true;
                System.exit(0);
            } else if (var1.getSource() == Atm.this.but3 && Atm.cnt3 == 0 && !var2) {
                Atm.cnt3 = 1;
                var2 = true;
                Atm.cnt1 = -1;
                Atm.cnt2 = -1;
                Atm.cnt4 = -1;
                Atm.cnt5 = -1;
                Atm.cnt6 = -1;
                var2 = true;
                Atm.this.printmini();
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt3 == 1 && !var2) {
                var2 = true;
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "options");
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt3 == 1 && !var2) {
                var2 = true;
                System.exit(0);
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt4 == 0 && !var2) {
                Atm.cnt4 = 1;
                Atm.cnt1 = -1;
                Atm.cnt2 = -1;
                Atm.cnt3 = -1;
                Atm.cnt5 = -1;
                Atm.cnt6 = -1;
                var2 = true;
                BalanceEnquiry var3 = new BalanceEnquiry(Atm.this.accno);
                Atm.this.enquiry.setBackground(Atm.this.c1);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                System.out.println(var3.abal);
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt4 == 1 && !var2) {
                Atm.cnt4 = 2;
                var2 = true;
                Atm.this.printslip();
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt4 == 1 && !var2) {
                Atm.cnt4 = 2;
                var2 = true;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt4 == 2 && !var2) {
                var2 = true;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "options");
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt4 == 2 && !var2) {
                var2 = true;
                System.exit(0);
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt5 == 0 && !var2) {
                Atm.cnt5 = 1;
                var2 = true;
                Atm.cnt1 = -1;
                Atm.cnt2 = -1;
                Atm.cnt3 = -1;
                Atm.cnt4 = -1;
                Atm.cnt6 = -1;
                var2 = true;
                Atm.this.withdrawal.setBackground(Atm.this.c1);
                Atm.this.withdrawal.setLayout(Atm.this.blo);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "withdrawal");
                Atm.this.showWithrawalOptions();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt5 == 1 && !var2) {
                Atm.cnt5 = 2;
                var2 = true;
                Atm.this.deposi = Integer.parseInt(Atm.this.textamt.getText());
                new Deposit(Atm.this.accno, Atm.this.deposi);
                Atm.this.k = "";
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt5 == 2 && !var2) {
                Atm.cnt5 = 3;
                var2 = true;
                Atm.this.printslipdeposit();
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt5 == 2 && !var2) {
                Atm.cnt5 = 3;
                var2 = true;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "exit");
                Atm.this.exitpanel();
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt5 == 3 && !var2) {
                var2 = true;
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
                Atm.this.cardlay1.show(Atm.this.accountpanel, "options");
                Atm.cnt1 = 0;
                Atm.cnt2 = 0;
                Atm.cnt3 = 0;
                Atm.cnt4 = 0;
                Atm.cnt5 = 0;
                Atm.cnt6 = 0;
            } else if (var1.getSource() == Atm.this.but4 && Atm.cnt5 == 3 && !var2) {
                var2 = true;
                Atm.this.printslipdeposit();
                System.exit(0);
            } else if (var1.getSource() == Atm.this.but6 && Atm.cnt6 == 0 && !var2) {
                Atm.cnt6 = 1;
                var2 = true;
                Atm.cnt1 = -1;
                Atm.cnt2 = -1;
                Atm.cnt3 = -1;
                Atm.cnt4 = -1;
                Atm.cnt5 = -1;
                var2 = true;
                Atm.this.transferpanel.setBackground(Atm.this.c1);
                Atm.this.transferpanel.setLayout(Atm.this.blo);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "transfer");
                Atm.this.gettransfer();
                System.out.println("transfer");
            } else if (var1.getSource() == Atm.this.but5 && Atm.cnt6 == 1 && !var2) {
                Atm.cnt6 = 2;
                var2 = true;
                Atm.keystate = 2;
                Atm.this.tacc = Integer.parseInt(Atm.this.textamt.getText());
                Atm.this.textamt1.requestFocus();
                Atm.this.k = "";
                System.out.println(Atm.this.tacc);
            } else if (var1.getSource() == Atm.this.but5 && Atm.keystate == 2 && Atm.cnt6 == 2 && !var2) {
                Atm.cnt6 = 3;
                var2 = true;
                Atm.keystate = -1;
                Atm.this.tamt = Integer.parseInt(Atm.this.textamt1.getText());
                System.out.println(" cnt is three obj created ");
                new Withdrawal(Atm.this.accno, Atm.this.tamt);
                new Deposit(Atm.this.tacc, Atm.this.tamt);
                Atm.this.cardlay1.show(Atm.this.accountpanel, "enquiry");
                Atm.this.showprintoptions();
            }

        }
    }
}
