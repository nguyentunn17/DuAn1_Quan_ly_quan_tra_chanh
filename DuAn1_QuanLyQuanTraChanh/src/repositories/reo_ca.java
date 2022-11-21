/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import domainmodels.ca;
import java.util.ArrayList;

/**
 *
 * @author Phuong
 */
public interface reo_ca {
    ArrayList<ca> getAll();

    boolean insert(ca c);

    boolean Update(String MaCa, ca c);

    boolean delete(String MaCa);
}
