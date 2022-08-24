package com.example.proyectoG8.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class MakeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;


    private String name;

    private List<VehicleDTO> vehicleDTOS;


}