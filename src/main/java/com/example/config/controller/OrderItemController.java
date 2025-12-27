package com.example.config.controller;

import com.example.config.dto.OrderItemDto;
import com.example.config.service.OrderItemService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class OrderItemController {

    private OrderItemService service;

    @GetMapping
    public List<OrderItemDto> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public OrderItemDto one(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public OrderItemDto create(@RequestBody OrderItemDto dto) { return service.create(dto); }

    @PutMapping("/{id}")
    public OrderItemDto update(@PathVariable Long id, @RequestBody OrderItemDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
