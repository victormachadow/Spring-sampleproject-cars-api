package com.machado.carapi.repositories;
import com.machado.carapi.models.Carro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
