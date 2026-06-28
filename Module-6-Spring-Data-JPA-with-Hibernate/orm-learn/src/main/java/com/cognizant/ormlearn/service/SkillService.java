package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.entity.Skill;
import com.cognizant.ormlearn.repository.SkillRepository;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Skill getSkill(int id) {
        return skillRepository.findById(id).orElse(null);
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }
}