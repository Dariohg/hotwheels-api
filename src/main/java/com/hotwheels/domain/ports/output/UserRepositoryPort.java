// domain/ports/output/UserRepositoryPort.java
package com.hotwheels.domain.ports.output;

import com.hotwheels.domain.model.User;
import java.util.Optional;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(String phoneNumber); // Nuevo método
}