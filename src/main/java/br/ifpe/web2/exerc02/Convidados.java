package br.ifpe.web2.exerc02;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
