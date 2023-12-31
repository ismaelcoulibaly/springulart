package ca.ghostteam.springulart.service.haircut;


import ca.ghostteam.springulart.dto.HaircutDTO;

import java.util.List;
import java.util.Optional;

/**
 * @author     
 * @version 1.0
 * @since 2022-03-25
 */
public interface HaircutService {
    List<HaircutDTO> findAllHaircuts();
    Optional<HaircutDTO> findHaircutById(String id);
    Optional<HaircutDTO> saveHaircut(HaircutDTO haircutDTO);
    Optional<HaircutDTO> updateHaircut(String id, HaircutDTO haircutDTO);
    void deleteHaircut(String id);
    boolean existsHaircutById(String id);
}
