package com.example.config.mapper;

import org.mapstruct.Mapper;

import com.example.config.dto.OrderItemDto;
import com.example.config.entity.OrderItem;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    OrderItemDto toDto(OrderItem entity);

    OrderItem toEntity(OrderItemDto dto);
}
