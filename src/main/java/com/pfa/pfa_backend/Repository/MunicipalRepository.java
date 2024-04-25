package com.pfa.pfa_backend.Repository;

import com.pfa.pfa_backend.Entity.Municipal;
import com.pfa.pfa_backend.Entity.Role;
import com.pfa.pfa_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipalRepository extends JpaRepository<Municipal,Long> {
}
