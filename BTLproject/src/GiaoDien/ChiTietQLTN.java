package GiaoDien;

import java.awt.Color;
import javax.swing.JFrame;
import DuLieuHeThong.Lop;
import DuLieuHeThong.SinhVien;
import DuLieuHeThong.TrucNhat;
import java.util.ArrayList;
import GiaoDien.TrangChu;
import Source.ChiTiet.MultiLineTableCellRenderer;
import Source.ChiTiet.TableChiTiet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import GiaoDien.ChiTietQLTN;
import Source.ChiTiet.DataSingleton;
import Source.ChiTiet.TableTrangChu;
import hocswing_b1.DangNhap;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChiTietQLTN extends javax.swing.JFrame {

    public ChiTietQLTN() {

    }

    public ChiTietQLTN(String classID, int selectedRow, TrangChu This) {
        initComponents();
        ganlist(selectedRow);
        displaytable(classID,selectedRow);
    }
    //chia se du lieu
    DataSingleton dataSingleton = DataSingleton.getInstance();
    ArrayList<Lop> listLop = dataSingleton.getDanhSachLop();
    ArrayList<TrucNhat>[] allTrucNhatArrays = dataSingleton.getAllDanhSachTrucNhatArray();
    ArrayList<TrucNhat> listtrucnhat;
     TableChiTiet model;
    public void ganlist(int selectedRow) {
        listtrucnhat = dataSingleton.getDanhSachTN(selectedRow);
    }

    public Lop findClassByID(String classID) {
        // Tìm kiếm lớp trong danh sách dựa trên mã lớp
        for (Lop classInfo : listLop) {
            if (classInfo.getMaLop().equals(classID)) {
                return classInfo;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        LaBel_QLTN = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChiTiet = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtNgay = new javax.swing.JTextField();
        Reload = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtMaLop = new javax.swing.JLabel();
        labelMaLop = new javax.swing.JTextField();
        labelTenLop = new javax.swing.JTextField();
        txtTenLop = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btntrove = new javax.swing.JButton();
        suachitiet = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Chi Tiết QLTN");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        btnTrangChu.setBackground(new java.awt.Color(0, 102, 51));
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/logo-haui.png"))); // NOI18N
        btnTrangChu.setBorder(null);
        btnTrangChu.setFocusable(false);
        btnTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrangChu.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTrangChu.setMaximumSize(new java.awt.Dimension(40, 40));
        btnTrangChu.setMinimumSize(new java.awt.Dimension(40, 40));
        btnTrangChu.setRolloverEnabled(false);
        btnTrangChu.setVerifyInputWhenFocusTarget(false);
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        LaBel_QLTN.setBackground(new java.awt.Color(0, 135, 102));
        LaBel_QLTN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LaBel_QLTN.setForeground(new java.awt.Color(255, 255, 255));
        LaBel_QLTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LaBel_QLTN.setText("Quản lý trực nhật sinh viên HAUI");
        LaBel_QLTN.setToolTipText("");
        LaBel_QLTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LaBel_QLTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(LaBel_QLTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tableChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableChiTiet.setGridColor(new java.awt.Color(0, 153, 102));
        tableChiTiet.setRowHeight(150);
        tableChiTiet.setSelectionBackground(new java.awt.Color(0, 51, 153));
        jScrollPane1.setViewportView(tableChiTiet);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnTimKiem.setBackground(new java.awt.Color(255, 204, 0));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtNgay.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNgay.setToolTipText("");
        txtNgay.setActionCommand("<Not Set>");
        txtNgay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        txtNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayActionPerformed(evt);
            }
        });

        Reload.setText("Reload");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reload)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reload))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));

        labelMaLop.setEditable(false);
        labelMaLop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMaLop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelMaLop.setText("Mã lớp");
        labelMaLop.setAutoscrolls(false);
        labelMaLop.setBorder(null);
        labelMaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelMaLopActionPerformed(evt);
            }
        });

        labelTenLop.setEditable(false);
        labelTenLop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTenLop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelTenLop.setText("Tên lớp");
        labelTenLop.setBorder(null);
        labelTenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelTenLopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMaLop)
                    .addComponent(labelTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtTenLop, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labelMaLop.getAccessibleContext().setAccessibleName("");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnSua.setBackground(new java.awt.Color(0, 102, 0));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");

        btnXoa.setBackground(new java.awt.Color(204, 0, 0));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.setToolTipText("");

        btntrove.setBackground(new java.awt.Color(255, 204, 0));
        btntrove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntrove.setForeground(new java.awt.Color(255, 255, 255));
        btntrove.setText("Trở về");
        btntrove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntroveActionPerformed(evt);
            }
        });

        suachitiet.setBackground(new java.awt.Color(0, 102, 0));
        suachitiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        suachitiet.setForeground(new java.awt.Color(255, 255, 255));
        suachitiet.setText("Sửa chi tiết");
        suachitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suachitietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(suachitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btntrove, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(suachitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btntrove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnDangXuat.setBackground(new java.awt.Color(0, 153, 255));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setToolTipText("");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void displaytable(String classID,int selectedRow) {
//        tableChiTiet.setModel();

        try {
            txtMaLop.setText(findClassByID(classID).getMaLop());
            txtTenLop.setText(findClassByID(classID).getTenLop());
            if (listtrucnhat.isEmpty()) {
                chiatrucnhat(classID);
            }
        } catch (Exception e) {
            System.out.println("ko tim thay classId");
        }

        model = new TableChiTiet(listtrucnhat);
        tableChiTiet.setModel(model);
        tableChiTiet.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
tableChiTiet.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
        xoa(classID);
        SuaChiTiet(classID,selectedRow);
        Sua();
        clickback();
    }

    public void chiatrucnhat(String classID) {

        Date ngay = findClassByID(classID).getNgayBD();
        System.out.println(ngay);
        String luuy = "";
        ArrayList<SinhVien> listsv = findClassByID(classID).getListSV();

        int sosvtrucnhat1buoi = (int) listsv.size() / findClassByID(classID).getSoBuoiHoc();
        // Chia đều sinh viên vào các buổi
        int startIndex = 0;
        for (int i = 0; i < findClassByID(classID).getSoBuoiHoc(); i++) {
            int endIndex = Math.min(startIndex + sosvtrucnhat1buoi, listsv.size());

            // Lấy danh sách sinh viên cho buổi hiện tại
            ArrayList<SinhVien> list1buoi = new ArrayList<SinhVien>(listsv.subList(startIndex, endIndex));

            // Nếu số sinh viên trong buổi > 5, chỉ lấy 5 người đầu tiên
            if (list1buoi.size() > 5) {
                list1buoi = new ArrayList<>(list1buoi.subList(0, 5));
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(ngay);
            calendar.add(Calendar.DAY_OF_YEAR, 7);
            TrucNhat them;
            if (i == 0) {
                calendar.add(Calendar.DAY_OF_YEAR, -7);
                them = new TrucNhat(i + 1, ngay, list1buoi, luuy);
            } else {
                them = new TrucNhat(i + 1, calendar.getTime(), list1buoi, luuy);
            }

            // Thêm danh sách sinh viên trực nhật vào danh sách lịch
            listtrucnhat.add(them);
            ngay = calendar.getTime();
            startIndex = endIndex;

        }
    }

    public void btnTimKiem() {

    }

    public void clickback() {
        btntrove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Đóng JFrame chi tiết
                // Hiển thị lại JFrame danh sách lớp
                TrangChu trangchu = new TrangChu();
                trangchu.setVisible(true);

            }
        });
    }

    public void xoa(String classID) {
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableChiTiet.getSelectedRow();
                if (selectedRow != -1) {
                    int confirmResult = 0;

                    confirmResult = JOptionPane.showConfirmDialog(
                            ChiTietQLTN.this,
                            "Bạn có chắc chắn muốn xóa Buổi trực nhật này không?",
                            "Xác nhận Xóa",
                            JOptionPane.OK_CANCEL_OPTION);
                    TableChiTiet model = new TableChiTiet(listtrucnhat);
                    if (confirmResult == JOptionPane.OK_OPTION) {
                        model.removeStudentAt(selectedRow);
                        findClassByID(classID).setSoBuoiHoc(findClassByID(classID).getSoBuoiHoc() - 1);
                        System.out.println(findClassByID(classID).getSoBuoiHoc());
                    }
                } else {
                    JOptionPane.showMessageDialog(ChiTietQLTN.this, "Vui lòng chọn một buổi trực nhật để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
    private void Sua(){
        btnSua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy hàng được chọn
                int selectedRow = tableChiTiet.getSelectedRow();
  tableChiTiet.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
                // Kiểm tra xem có hàng được chọn hay không
                if (selectedRow != -1) {
                    // Lấy dữ liệu từ hàng được chọn và mở dialog sửa
                 TrucNhat tn = model.getStudentAt(selectedRow);
                     EditDialog(ChiTietQLTN.this, tn);
                } else {
                    // Nếu không có hàng nào được chọn, thông báo cho người dùng
                    JOptionPane.showMessageDialog(ChiTietQLTN.this, "Vui lòng chọn một hàng để sửa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
       private void EditDialog(JFrame parent, TrucNhat tn) {
        JPanel panel = new JPanel(new GridLayout(2,2));

        JTextField ngayField = new JTextField();
        JTextArea luuYField = new JTextArea();

        if (tn != null) {
            // Nếu có sinh viên, hiển thị thông tin cũ
            ngayField.setText(tn.display(tn.getNgayTN()));
            luuYField.setText(tn.getLuuY());
        }

        panel.add(new JLabel("Ngày:"));
        panel.add(ngayField);
        panel.add(new JLabel("Lưu Ý:"));
        panel.add(luuYField);
        ngayField.setColumns(4);  // Thay đổi số cột theo nhu cầu của bạn
       
  luuYField.setColumns(20);  // Thay đổi số cột theo nhu cầu của bạn
    luuYField.setRows(6);
       luuYField.setLineWrap(true);
    luuYField.setWrapStyleWord(true);
        int result = JOptionPane.showConfirmDialog(
                parent,
                panel,
                "Sửa Thông Tin Trực Nhật",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
//           
            // Nếu có sinh viên (sửa), cập nhật thông tin sinh viên
            try {
                    // Kiểm tra định dạng ngày
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date ngay = dateFormat.parse(ngayField.getText());
                    tn.setNgayTN(ngay);
            } catch(ParseException ex){
 JOptionPane.showMessageDialog(parent, "Ngày không hợp lệ! Vui lòng nhập theo định dạng dd/MM/yyyy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            
            tn.setLuuY(luuYField.getText());
            model.fireTableDataChanged(); // Cập nhật toàn bộ bảng
        }
    }

    public void SuaChiTiet(String classID,int selectedRowdetail) {
        suachitiet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy hàng được chọn
                int selectedRow = tableChiTiet.getSelectedRow();

                // Kiểm tra xem có hàng được chọn hay không
                if (selectedRow != -1) {
                    // Lấy giá trị MASV của hàng được chọn
                    int buoi = (int) tableChiTiet.getValueAt(selectedRow, 0);

                    // Mở trang sửa và gửi mã sinh viên đi
                    showEditPage(buoi, classID,selectedRowdetail);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(ChiTietQLTN.this, "Chọn một dòng để sửa.");
                }
            }
        });

    }

    public void showEditPage(int buoi, String classID,int selectedRow) {
        // Gọi lại interface để chuyển sang JFrame chi tiết
        Them_Sua_ChiTiet detailFrame = new Them_Sua_ChiTiet(classID, buoi,selectedRow, this);
        detailFrame.setVisible(true);
    }

    private void labelMaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelMaLopActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_labelMaLopActionPerformed

    private void labelTenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelTenLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTenLopActionPerformed

    private void txtNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String TimKiem = txtNgay.getText().toString().toLowerCase();
        if (TimKiem.isEmpty() == false) {
            String regex = ".*" + Pattern.quote(TimKiem) + ".*";
            ArrayList<TrucNhat> searchedngay = new ArrayList<>();
            for (TrucNhat tn : listtrucnhat) {
                if (tn.display(tn.getNgayTN()).contains(TimKiem)) {
                    searchedngay.add(tn);
                }

//                String malop = lop.getMaLop().toLowerCase();
//                    if(malop.length()>= TimKiem.length()){
//                        for(int i = 0; i <= TimKiem.length()- malop.length();i++){
//                           if(malop) 
//                        }
//                    }
//                if(malop.equals(TimKiem))
//                    searchedLop.add(lop);
//                if (lop.getTenLop().matches(regex)) 
//                searchedLop.add(lop);
//                if(lop.getMaLop().contains(regex));
//                    searchedLop.add(lop);
            }

            tableChiTiet.setModel(new TableChiTiet(searchedngay));
            tableChiTiet.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
            tableChiTiet.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhap a = new DangNhap();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        // TODO add your handling code here:
        DefaultTableModel newModel = new DefaultTableModel();
        tableChiTiet.setModel(newModel);
        tableChiTiet.setModel(new TableChiTiet(listtrucnhat));
        tableChiTiet.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());
        tableChiTiet.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer());
    }//GEN-LAST:event_ReloadActionPerformed

    private void suachitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suachitietActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suachitietActionPerformed

    private void btntroveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntroveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntroveActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietQLTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietQLTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietQLTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietQLTN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame jFrame = new ChiTietQLTN();
                jFrame.setVisible(true);
                jFrame.getContentPane().setBackground(Color.WHITE);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LaBel_QLTN;
    private javax.swing.JButton Reload;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btntrove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField labelMaLop;
    private javax.swing.JTextField labelTenLop;
    private javax.swing.JButton suachitiet;
    private javax.swing.JTable tableChiTiet;
    private javax.swing.JLabel txtMaLop;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JLabel txtTenLop;
    // End of variables declaration//GEN-END:variables
}
