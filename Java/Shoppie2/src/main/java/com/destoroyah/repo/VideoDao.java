package com.destoroyah.repo;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.destoroyah.model.Video;


@Transactional
@Repository
public class VideoDao{
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Autowired
	private DataSource dataSource;
	
	private SessionFactory sesFact;
	

	

	public Video findById(int id) {
		Session ses = sesFact.getCurrentSession();
		Video p = ses.load(Video.class, id);
        return p;
	}

	

	public void insert(Video t) {
		sesFact.getCurrentSession().save(t);
		
		
	}
	
	public void delete(int id) {
		sesFact.getCurrentSession().delete(id);
		
	}
	

	@Autowired
	public VideoDao(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}
	
	public List<Video> findAll() {
		Session ses = sesFact.getCurrentSession();
		return ses.createQuery("from Video", Video.class).list();

	}

}
