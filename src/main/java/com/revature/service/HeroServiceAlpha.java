package com.revature.service;

import java.util.List;

import com.revature.model.Hero;
import com.revature.repository.HeroRepository;
import com.revature.repository.HeroRepositoryHibernate;

public class HeroServiceAlpha implements HeroService {

    //This is tight coupling, Spring is going to help us remove it
    private HeroRepository heroRepository = new HeroRepositoryHibernate();
    
    @Override
    public List<Hero> getAllHeros() {
	return heroRepository.findAll();
    }

}
