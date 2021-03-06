package com.leverx.payload.dto.response;

import java.time.LocalDate;
import java.util.Date;

import com.leverx.payload.dto.response.simple.SimpleUserResponseDto;
import com.leverx.model.entity.EPetType;

import lombok.Builder;
import lombok.Data;

/** @author Andrei Yahorau */
@Data
public class DogResponseDto extends PetResponseDto {

  private boolean guideDog;

  @Builder(builderMethodName = "dogResponseBuilder")
  public DogResponseDto(
          final long id,
          final EPetType petType,
          final String name,
          final LocalDate birthdate,
          final SimpleUserResponseDto owner,
          final boolean guideDog) {
    super(id, petType, name, birthdate, owner);
    this.guideDog = guideDog;
  }
}
