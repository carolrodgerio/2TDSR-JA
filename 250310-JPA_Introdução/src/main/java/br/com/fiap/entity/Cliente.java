package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.
import javax.persistence.
import javax.persistence.
import javax.persistence.
import javax.persistence.

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TDS_TB_CLIENTE")
// name: nome igual ao generator, sequenceName: nome no banco, allocationSize: incremento
@SequenceGenerator(name="cliente", sequenceName = "SQ_TDS_TB_CLIENTE", allocationSize = 1)

public class Cliente {
	
	@Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private Integer id;
	
	@Column(name="nm_cliente", nullable = false, length = 100)
	private String nome;

}
