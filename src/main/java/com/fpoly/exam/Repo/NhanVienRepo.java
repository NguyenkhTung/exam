package com.fpoly.exam.Repo;

import com.fpoly.exam.Enty.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien ,Integer> {
}
