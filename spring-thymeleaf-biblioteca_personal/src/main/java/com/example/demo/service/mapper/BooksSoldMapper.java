package com.example.demo.service.mapper;


import com.example.demo.data.entity.BooksSold;
import com.example.demo.dto.BooksSoldDTO;
import org.springframework.stereotype.Service;

@Service
public class BooksSoldMapper extends  AbstractServiceMapper<BooksSold, BooksSoldDTO> {

    @Override
    public BooksSold toEntity(BooksSoldDTO dto) {
        final BooksSold entity = new BooksSold();
        entity.setId(dto.getId());
        entity.setPrecio(dto.getPrecio());
        entity.setDate(dto.getFechaVenta());
        return entity;
    }

    @Override
    public BooksSoldDTO toDto(BooksSold entity) {
        final BooksSoldDTO dto = new BooksSoldDTO();
        dto.setId(entity.getId());
        dto.setBooksId(entity.getBooks().getId());
        dto.setUserId(entity.getUser().getId());
        dto.setFechaVenta(entity.getDate());
        return dto;
    }
}