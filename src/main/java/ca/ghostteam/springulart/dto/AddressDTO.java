package ca.ghostteam.springulart.dto;

import lombok.Data;

/**
 * @author     
 * @version 1.0
 * @since 2022-03-29
 */
@Data
public class AddressDTO {
    private Long id;
    private String street;
    private String apartement;
    private String zip;
    private String city;
    private String state;
}
