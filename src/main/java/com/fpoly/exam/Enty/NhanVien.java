package com.fpoly.exam.Enty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String ho;
    String ten_dem;
    String ten;
    String gioi_tinh;
    String dia_chi;

    @ManyToOne
    @JoinColumn(name = "id_cv")
    ChucVu cv;

    public String getHoTen() {
        return ho + " " + ten_dem + " " + ten;

    }


}
