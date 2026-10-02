package com.authify.repository;

import com.authify.entities.User;
import com.authify.enums.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    // @Query("select u from User u where u.accountStatus= :status and u.deletionRequestedAt < :threshold")
    List<User> findAllByAccountStatusAndDeletionRequestedAtBefore(AccountStatus status, Instant threshold);
}
