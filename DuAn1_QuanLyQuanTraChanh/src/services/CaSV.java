/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodels.ca;
import java.util.ArrayList;

/**
 *
 * @author Phuong
 */
public interface CaSV {
    ArrayList<ca> getlist();
    String insert(ca c);
    String Update(String MaCa ,ca c);
    String delete(String MaCa);

}
