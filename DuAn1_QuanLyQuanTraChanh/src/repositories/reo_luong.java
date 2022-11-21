/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import domainmodels.luong;

/**
 *
 * @author Phuong
 */
public interface reo_luong {
    ArrayList<luong> getAll();

    boolean insert(luong lg);

    boolean Update(String MaLuong, luong lg);

    boolean delete(String MaLuong);
}
