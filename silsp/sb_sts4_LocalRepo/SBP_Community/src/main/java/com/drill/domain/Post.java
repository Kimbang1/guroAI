package com.drill.domain;

import java.sql.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "POST")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;

	@Column(nullable = false, insertable = false, updatable = false)
	private String userid;

	@Column(nullable = false, length = 50)
	private String title;

	@Column(length = 200)
	private String content;

	@ColumnDefault("0")
	private int readcnt;

	@CreationTimestamp
	private Timestamp regTM;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userid")
	private User user;
}
