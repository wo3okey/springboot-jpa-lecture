package com.wooeky.lecture.manager.entity;

import com.wooeky.lecture.manager.dto.ManagerRequest;
import com.wooeky.lecture.todo.entity.Todo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "todo_id")
    private Todo todo;

    public Manager(Todo todo, ManagerRequest managerRequest) {
        this.todo = todo;
        this.name = managerRequest.getName();
    }
}
