
package codex.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela CARRO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CARRO\"", schema="\"C##CODEX\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("codex.entity.Carro")
public class Carro implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private java.lang.Double id;


    /**
    * @generated
    */
    @Column(name = "ANO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double ano;


    /**
    * @generated
    */
    @Column(name = "MARCA", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String marca;


    /**
    * @generated
    */
    @Column(name = "MODELO", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String modelo;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="FK_PESSOA", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "SYS_C0014978", foreignKeyDefinition = "FOREIGN KEY (FK_PESSOA) REFERENCES PESSOA (ID)"))
        
        private Pessoa pessoa;


    /**
    * Construtor
    * @generated
    */
    public Carro(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.Double getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Carro setId(java.lang.Double id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém ano
    * return ano
    * @generated
    */
    public java.lang.Double getAno() {
        return this.ano;
    }

    /**
    * Define ano
    * @param ano ano
    * @generated
    */
    public Carro setAno(java.lang.Double ano) {
        this.ano = ano;
        return this;
    }
    /**
    * Obtém marca
    * return marca
    * @generated
    */
    public java.lang.String getMarca() {
        return this.marca;
    }

    /**
    * Define marca
    * @param marca marca
    * @generated
    */
    public Carro setMarca(java.lang.String marca) {
        this.marca = marca;
        return this;
    }
    /**
    * Obtém modelo
    * return modelo
    * @generated
    */
    public java.lang.String getModelo() {
        return this.modelo;
    }

    /**
    * Define modelo
    * @param modelo modelo
    * @generated
    */
    public Carro setModelo(java.lang.String modelo) {
        this.modelo = modelo;
        return this;
    }
    /**
    * Obtém pessoa
    * return pessoa
    * @generated
    */
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    /**
    * Define pessoa
    * @param pessoa pessoa
    * @generated
    */
    public Carro setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Carro object = (Carro)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}