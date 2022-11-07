
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
* Classe que representa a tabela PESSOA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PESSOA\"", schema="\"C##CODEX\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("codex.entity.Pessoa")
public class Pessoa implements Serializable {
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
    @Column(name = "EMAIL", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * @generated
    */
    @Column(name = "GENERO", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String genero;


    /**
    * @generated
    */
    @Column(name = "IMAGEM", nullable = true, unique = false, length=500, insertable=true, updatable=true)
        
        private java.lang.String imagem;


    /**
    * @generated
    */
    @Column(name = "NOME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @Column(name = "SOBRENOME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String sobrenome;


    /**
    * Construtor
    * @generated
    */
    public Pessoa(){
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
    public Pessoa setId(java.lang.Double id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public Pessoa setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }
    /**
    * Obtém genero
    * return genero
    * @generated
    */
    public java.lang.String getGenero() {
        return this.genero;
    }

    /**
    * Define genero
    * @param genero genero
    * @generated
    */
    public Pessoa setGenero(java.lang.String genero) {
        this.genero = genero;
        return this;
    }
    /**
    * Obtém imagem
    * return imagem
    * @generated
    */
    public java.lang.String getImagem() {
        return this.imagem;
    }

    /**
    * Define imagem
    * @param imagem imagem
    * @generated
    */
    public Pessoa setImagem(java.lang.String imagem) {
        this.imagem = imagem;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Pessoa setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém sobrenome
    * return sobrenome
    * @generated
    */
    public java.lang.String getSobrenome() {
        return this.sobrenome;
    }

    /**
    * Define sobrenome
    * @param sobrenome sobrenome
    * @generated
    */
    public Pessoa setSobrenome(java.lang.String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pessoa object = (Pessoa)obj;
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