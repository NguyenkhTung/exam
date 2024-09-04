package com.fpoly.exam.Controller;

import com.fpoly.exam.Enty.NhanVien;
import com.fpoly.exam.Repo.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NhanVienCOntroller {
    @Autowired
    NhanVienRepo repo;

    @GetMapping("nhanvien/danhsach")
    public List<NhanVien> getDanhSach() {
        return repo.findAll();
    }

    @GetMapping("nhanvien/phantrang")
    public List<NhanVien> phantrang(@RequestParam(defaultValue = "0") int p) {
        Pageable pageable = PageRequest.of(p, 5);
        Page<NhanVien> page = repo.findAll(pageable);
        return page.getContent();
    }

    @PostMapping("nhanvien/add")
    public NhanVien add(@RequestBody NhanVien nv) {
        repo.save(nv);
        return nv;
    }

    @GetMapping("nhanvien/detail/{id}")
    public NhanVien detail(@PathVariable Integer id) {
        return repo.findById(id).orElse(null);
    }
}
