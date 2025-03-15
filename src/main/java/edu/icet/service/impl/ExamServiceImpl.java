package edu.icet.service.impl;

import edu.icet.dto.ExamDto;
import edu.icet.entity.ExamEntity;
import edu.icet.repository.ExamRepo;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor

public class ExamServiceImpl implements ExamService {

    final ExamRepo repository;
    final ModelMapper mapper;

    @Override
    public void createExam(ExamDto exam) {
        repository.save(mapper.map(exam, ExamEntity.class));
    }

    @Override
    public ExamDto getExamByCourseId(Integer id) {
        return mapper.map(repository.getByCourseId(id),ExamDto.class);
    }

    @Override
    public List<ExamDto> getAll() {
        return null;
    }

    @Override
    public void updateExam(ExamDto exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer integer) {

    }
}
