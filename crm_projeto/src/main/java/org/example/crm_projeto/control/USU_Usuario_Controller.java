package org.example.crm_projeto.control;

import org.example.crm_projeto.modal.USU_Usuario_Modal;
import org.example.crm_projeto.services.USU_Usuario_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class USU_Usuario_Controller
{
    @Autowired
    private USU_Usuario_Service usuUsuarioService;

    @GetMapping("/all")
    public ResponseEntity<List<USU_Usuario_Modal>> getAllClientes() {
        List<USU_Usuario_Modal> usuario = usuUsuarioService.getAllUsuarios();
        return ResponseEntity.ok(usuario);
    }
}
