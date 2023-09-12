package com.treinadev.api.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.treinadev.api.models.SeriesModel;

public interface SeriesRepository extends CrudRepository<SeriesModel, Long>  {
    
}
