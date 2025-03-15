package edu.icet.service;

import edu.icet.dto.ExamDto;

import java.util.List;

public interface ExamService {
    void createExam(ExamDto exam);
    ExamDto getExamByCourseId(Integer id);
    List<ExamDto> getAll();
    void updateExam(ExamDto exam);
    void deleteExamById(Integer id);
    void deleteExamByCourseId(Integer id);
}
