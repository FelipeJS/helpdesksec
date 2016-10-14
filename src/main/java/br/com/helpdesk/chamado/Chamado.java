package br.com.helpdesk.chamado;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import br.com.helpdesk.user.User;

@Entity
public class Chamado implements Serializable {

	private static final long serialVersionUID = 7862163234067050131L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "chamadoid")
	private Long chamadoId;

	@ManyToOne
	@JoinColumn(name = "user_id_solicitante")
	private User solicitante;

	@ManyToOne
	@JoinColumn(name = "user_id_executante")
	private User executante;

	@Column(name = "empresa")
	private String empresa;

	@Column(name = "problema")
	private String problema;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "severidade")
	private String severidade;

	@Column(name = "status")
	private String status;

	@Column(name = "dt_aberto")
	private Calendar dataAberto;

	@Column(name = "dt_fechado")
	private Calendar dataFechado;

	@Column(name = "ramal")
	private String ramal;
	
	@Lob
	@Column(name = "anexo", columnDefinition = "mediumblob")
	private byte[] anexo;

	public Long getChamadoId() {
		return chamadoId;
	}

	public void setChamadoId(Long chamadoId) {
		this.chamadoId = chamadoId;
	}

	public User getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(User solicitante) {
		this.solicitante = solicitante;
	}

	public User getExecutante() {
		return executante;
	}

	public void setExecutante(User executante) {
		this.executante = executante;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSeveridade() {
		return severidade;
	}

	public void setSeveridade(String severidade) {
		this.severidade = severidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Calendar getDataAberto() {
		return dataAberto;
	}

	public void setDataAberto(Calendar dataAberto) {
		this.dataAberto = dataAberto;
	}

	public Calendar getDataFechado() {
		return dataFechado;
	}

	public void setDataFechado(Calendar dataFechado) {
		this.dataFechado = dataFechado;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public byte[] getAnexo() {
		return anexo;
	}

	public void setAnexo(byte[] anexo) {
		this.anexo = anexo;
	}

}
