package com.wooeky.lecture.manager.controller;

import com.wooeky.lecture.manager.dto.ManagerRequest;
import com.wooeky.lecture.manager.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ManagerController {
    private final ManagerService managerService;

    @PostMapping("/api/v1/managers")
    public void saveManager(
            @RequestParam long todoId,
            @RequestBody ManagerRequest managerRequest
    ) {
        managerService.saveManager(todoId, managerRequest);
    }
}
