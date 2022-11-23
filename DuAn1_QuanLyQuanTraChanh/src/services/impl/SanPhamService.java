package services.impl;

import domainmodels.SanPham;
import java.util.ArrayList;
import repositories.ISanPhamRepository;
import repositories.impl.SanPhamRepository;
import services.ISanPhamService;

public class SanPhamService implements ISanPhamService {

    private final ISanPhamRepository sanPhamRepository;

    public SanPhamService() {
        this.sanPhamRepository = new SanPhamRepository();
    }

    @Override
    public ArrayList<SanPham> read() {
        return this.sanPhamRepository.read();
    }

}
