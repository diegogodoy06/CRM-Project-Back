package org.example.crm_projeto.services;

import org.example.crm_projeto.modal.USU_Usuario_Modal;
import org.example.crm_projeto.repositories.USU_Usuario_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USU_Usuario_Service
{
    @Autowired
    private USU_Usuario_Repository repo;

    public List<USU_Usuario_Modal> getAllUsuarios() {
        return this.repo.findAll();
    }
}
