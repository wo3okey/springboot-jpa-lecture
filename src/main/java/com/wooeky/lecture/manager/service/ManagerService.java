package com.wooeky.lecture.manager.service;

import com.wooeky.lecture.manager.dto.ManagerRequest;
import com.wooeky.lecture.manager.entity.Manager;
import com.wooeky.lecture.manager.repository.ManagerRepository;
import com.wooeky.lecture.todo.entity.Todo;
import com.wooeky.lecture.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ManagerService {
    private final ManagerRepository managerRepository;

    @Transactional
    public void saveManager(ManagerRequest managerRequest) {
        managerRepository.save(new Manager(managerRequest));
    }
}
