package uz.tuit.census.auth.base;

import lombok.RequiredArgsConstructor;
import uz.tuit.census.mapper.base.BaseMapper;
import uz.tuit.census.repository.base.BaseRepository;

@RequiredArgsConstructor
public class AbstractService<M extends BaseMapper, R extends BaseRepository> implements BaseService {

    protected final M mapper;
    protected final R repository;

}
