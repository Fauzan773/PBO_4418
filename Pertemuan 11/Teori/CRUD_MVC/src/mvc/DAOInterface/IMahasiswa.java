/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.Mahasiswa;
/**
 *
 * @author Fauzan Maulana Alfany
 */
public interface IMahasiswa {
    public boolean insert(Mahasiswa b);
    public void update(Mahasiswa b);
    public void delete(int id);
    public List<Mahasiswa> getAll();
    public List<Mahasiswa> getCariNama(String nama);
}
