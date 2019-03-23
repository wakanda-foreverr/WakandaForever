package com.wakandaforever.wakandaforever.services.data;

import java.util.List;

import com.wakandaforever.wakandaforever.dtos.DataDto;
import com.wakandaforever.wakandaforever.models.Data;

public interface DataService {
	Data save(DataDto dataDto);
	List<Data> findAll();
	Data findById(Long id);
}
