package com.example.buoi11.MayTinh.repository;

import com.example.buoi11.MayTinh.Entity.MayTinh;
import com.example.buoi11.MayTinh.Util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MayTinhRepository {

    public List<MayTinh> getAll() {
        List<MayTinh> listmt = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM MayTinh ", MayTinh.class);
            listmt = query.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listmt;
    }

    public MayTinh getOne(String ma) {
        MayTinh mayTinh = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM MayTinh WHERE ma=: ma1 ", MayTinh.class);
            query.setParameter("ma1", ma);
            mayTinh = (MayTinh) query.getSingleResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mayTinh;
    }

    public Boolean ADD(MayTinh mayTinh) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.persist(mayTinh);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean delete(MayTinh mayTinh) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(mayTinh);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean upadate(MayTinh mayTinh) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.merge(mayTinh);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
