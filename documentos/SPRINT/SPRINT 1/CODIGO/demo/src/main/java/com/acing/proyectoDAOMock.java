package com.acing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class proyectoDAOMock implements proyectoDAO {

	@Override
	public List<Proyecto> findAll() {
		return generarProyectos();
	}


	@Override
	public List<Proyecto> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Proyecto> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Proyecto> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Proyecto> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Proyecto getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Proyecto> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Proyecto> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Proyecto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Proyecto> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Proyecto> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Proyecto entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Proyecto> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Proyecto> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Proyecto> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Proyecto> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Proyecto> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	
	private List<Proyecto> generarProyectos() {
		String[] tipoCurso = {"NBQ", "GUERRA_E", "TELECOM"};
		ArrayList<Proyecto> proyectos=new ArrayList<>();
		Proyecto p;
		ProyectoDIM d;
		Curso c;
		TipoCurso t;
		Estado e = Estado.ABIERTO;
		for (int i=0; i<30; i++) {
			t = new TipoCurso(tipoCurso[i%3]);
			p = new Proyecto();
			c = new Curso(t,"4"+i%4, "2018");
			p.setCurso(c);
			p.setIdProyecto(i);
			p.setTitulo("Titulo "+i);
			p.setDescripcionCorta("Proyecto " + p.getCurso().getTipoCurso().getNombreCurso()+ " sobre... ");
			p.setEstado(e);
			e=(e==Estado.ABIERTO?Estado.CERRADO:Estado.ABIERTO);
			proyectos.add(p);
		}
		for (int i=30; i<40; i++) {
			t = new TipoCurso("DIM");
			d = new ProyectoDIM();
			c = new Curso(t,"4"+i%3, "2018");
			d.setCurso(c);
			d.setIdProyecto(i);
			d.setTitulo("Titulo "+i);
			d.setDescripcionCorta("Proyecto " + d.getCurso().getTipoCurso().getNombreCurso()+ " sobre... ");
			d.setEstado(e);
			d.setParadigma("Orientado a Objetos");
			d.setLenguajeDesarrollo("java");
			e=(e==Estado.ABIERTO?Estado.CERRADO:Estado.ABIERTO);
			proyectos.add(d);
		}
		return proyectos;
	}
}
