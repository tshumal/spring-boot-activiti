package io.linx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.linx.model.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}