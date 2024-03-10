package com.example.Buoi10.Buoi10.repository;

import com.example.Buoi10.Buoi10.Util.HibernateUtil;
import com.example.Buoi10.Buoi10.entity.SinhVien;
import org.hibernate.Session;
import jakarta.persistence.Query;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class SinhVienRepository {
    public List<SinhVien> GetAll(){
        List<SinhVien> lists = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM SinhVien", SinhVien.class);
            lists = query.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lists;
    }
    public SinhVien GetOne(String ma) {
        SinhVien sinhVien = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            org.hibernate.query.Query query = session.createQuery("FROM SinhVien WHERE ma=: ma1", SinhVien.class);
            query.setParameter("ma1", ma);
            sinhVien = (SinhVien) query.getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sinhVien;
    }

    public Boolean ADD(SinhVien sinhVien){
        Transaction transaction= null;
        try (Session session = HibernateUtil.getFACTORY().openSession())  {
            transaction = session.beginTransaction();
            session.persist(sinhVien);
            transaction.commit();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean remove(SinhVien sinhVien){
        Transaction transaction= null;
        try (Session session = HibernateUtil.getFACTORY().openSession())  {
            transaction = session.beginTransaction();
            session.delete(sinhVien);
            transaction.commit();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean update(SinhVien sinhVien){
        Transaction transaction= null;
        try (Session session = HibernateUtil.getFACTORY().openSession())  {
            transaction = session.beginTransaction();
            session.merge(sinhVien);
            transaction.commit();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        new SinhVienRepository().GetAll().forEach(sinhVien -> System.out.println(sinhVien.toString()));

    }
}
