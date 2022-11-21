package services.impl;

import domainmodels.KhuyenMai;
import java.util.ArrayList;
import repositories.IKhuyenMaiRepository;
import repositories.impl.KhuyenMaiRepository;
import services.IKhuyenMaiService;

public class KhuyenMaiService implements IKhuyenMaiService {

    private IKhuyenMaiRepository khuyenMaiRepository;

    public KhuyenMaiService() {
        this.khuyenMaiRepository = new KhuyenMaiRepository();
    }

    @Override
    public ArrayList<KhuyenMai> read() {
        return this.khuyenMaiRepository.read();
    }

    @Override
    public void create(KhuyenMai km) {
        this.khuyenMaiRepository.create(km);
    }

    @Override
    public void update(KhuyenMai km, String id) {
        this.khuyenMaiRepository.update(km, id);
    }

}
