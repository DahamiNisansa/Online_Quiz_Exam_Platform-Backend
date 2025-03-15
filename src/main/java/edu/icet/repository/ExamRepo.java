package edu.icet.repository;

import edu.icet.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepo extends JpaRepository<ExamEntity,Integer> {

    ExamEntity getByCourseId(Integer id);
}
