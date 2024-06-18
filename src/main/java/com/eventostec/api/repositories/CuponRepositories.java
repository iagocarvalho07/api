package com.eventostec.api.repositories;

import com.eventostec.api.domain.cupom.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuponRepositories extends JpaRepository<Cupon, UUID> {
}
