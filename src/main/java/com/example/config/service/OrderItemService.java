package com.example.config.service;

import com.example.config.repository.OrderItemRepository;
import com.example.config.entity.OrderItem;
import com.example.config.dto.OrderItemDto;
import com.example.config.mapper.OrderItemMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemService {

    private OrderItemRepository repo;
    private OrderItemMapper mapper;

    public List<OrderItemDto> findAll() {
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    public OrderItemDto findById(Long id) {
        return mapper.toDto(repo.findById(id).orElseThrow());
    }

    public OrderItemDto create(OrderItemDto dto) {
        return mapper.toDto(repo.save(mapper.toEntity(dto)));
    }

    public OrderItemDto update(Long id, OrderItemDto dto) {
        OrderItem entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDto(repo.save(entity));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
