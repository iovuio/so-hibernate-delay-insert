package com.example.service;

import com.example.model.Table;
import com.example.repository.DocRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocService {

	@Autowired
	private DocRepository docRepository;

	public Table save(Table entity) {
		return docRepository.save(entity);
	}
}
