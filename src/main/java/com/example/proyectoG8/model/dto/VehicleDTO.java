package com.example.proyectoG8.model.dto;

import com.example.proyectoG8.model.Booking;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idVehicle;

    private MakeDTO make;

    private String rangeName;

    private String description;

    private Double price;

    private Double latitude;

    private Double longitude;

    private ModelDTO model;

    private CityDTO city;

    private CategoryDTO category;

    private List<CharacteristicDTO> characteristics;

    private List<ImageDTO> images = new ArrayList<>();

}