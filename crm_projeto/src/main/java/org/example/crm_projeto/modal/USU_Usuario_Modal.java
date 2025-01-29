package org.example.crm_projeto.modal;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "crmFourWeb", name = "USU_Usuario")

public class USU_Usuario_Modal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long USU_ID;

    @Column
    private String USO_Nome;
    @Column
    private String USO_Senha;
    @Column
    private boolean USO_Status;
    @Column
    private Date USO_DataModificacao;
    @Column
    private Date USO_DataCriacao;
    @Column
    private Date USO_DataUltimoLogin;
    @Column
    private Byte USO_foto;
    @Column
    private String USO_Email;
    @Column
    private boolean USU_Administrador;
    @Column
    private String TEC_ServiodrLDAPUser;

    public Long getUSU_ID() {
        return USU_ID;
    }

    public void setUSU_ID(Long USU_ID) {
        this.USU_ID = USU_ID;
    }

    public String getUSO_Nome() {
        return USO_Nome;
    }

    public void setUSO_Nome(String USO_Nome) {
        this.USO_Nome = USO_Nome;
    }

    public String getUSO_Senha() {
        return USO_Senha;
    }

    public void setUSO_Senha(String USO_Senha) {
        this.USO_Senha = USO_Senha;
    }

    public boolean isUSO_Status() {
        return USO_Status;
    }

    public void setUSO_Status(boolean USO_Status) {
        this.USO_Status = USO_Status;
    }

    public Date getUSO_DataModificacao() {
        return USO_DataModificacao;
    }

    public void setUSO_DataModificacao(Date USO_DataModificacao) {
        this.USO_DataModificacao = USO_DataModificacao;
    }

    public Date getUSO_DataCriacao() {
        return USO_DataCriacao;
    }

    public void setUSO_DataCriacao(Date USO_DataCriacao) {
        this.USO_DataCriacao = USO_DataCriacao;
    }

    public Date getUSO_DataUltimoLogin() {
        return USO_DataUltimoLogin;
    }

    public void setUSO_DataUltimoLogin(Date USO_DataUltimoLogin) {
        this.USO_DataUltimoLogin = USO_DataUltimoLogin;
    }

    public Byte getUSO_foto() {
        return USO_foto;
    }

    public void setUSO_foto(Byte USO_foto) {
        this.USO_foto = USO_foto;
    }

    public String getUSO_Email() {
        return USO_Email;
    }

    public void setUSO_Email(String USO_Email) {
        this.USO_Email = USO_Email;
    }

    public boolean isUSU_Administrador() {
        return USU_Administrador;
    }

    public void setUSU_Administrador(boolean USU_Administrador) {
        this.USU_Administrador = USU_Administrador;
    }

    public String getTEC_ServiodrLDAPUser() {
        return TEC_ServiodrLDAPUser;
    }

    public void setTEC_ServiodrLDAPUser(String TEC_ServiodrLDAPUser) {
        this.TEC_ServiodrLDAPUser = TEC_ServiodrLDAPUser;
    }
}
