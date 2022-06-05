package uz.tuit.census.auth.base;

import uz.tuit.census.response.DataDTO;
import uz.tuit.census.response.ResponseEntity;
import uz.unicorn.rentme.criteria.base.BaseCriteria;
import uz.unicorn.rentme.dto.base.GenericDTO;

import java.util.List;

/**
 * @param <D> -> dto
 * @param <C> -> create dto
 */
public interface GenericService<D extends GenericDTO, C extends BaseCriteria> {

    ResponseEntity<DataDTO<D>> get(Long id);

    ResponseEntity<DataDTO<List<D>>> getAll(C criteria);


}
