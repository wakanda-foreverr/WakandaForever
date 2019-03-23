package com.wakandaforever.wakandaforever.services.data;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.wakandaforever.wakandaforever.dtos.DataDto;
import com.wakandaforever.wakandaforever.models.Data;
import com.wakandaforever.wakandaforever.repositories.DataDao;

@Service(value = "dataService")
public class DataServiceImpl implements DataService{
	
	@Autowired
	private DataDao dataDao;

	@Override
	public Data save(DataDto dataDto) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		Data newData = new Data();
		
		newData.setAirQuality(dataDto.getAirQuality());
		newData.setCreatedAt(currentTime);
		newData.setFire(dataDto.getFire());
		newData.setHumidity(dataDto.getHumidity());
		newData.setLight(dataDto.getLight());
		newData.setModifiedAt(currentTime);
		newData.setPressure(dataDto.getPressure());
		newData.setSoilMoisture(dataDto.getSoilMoisture());
		newData.setSound(dataDto.getSound());
		newData.setTemperature(dataDto.getTemperature());
		newData.setWaterLevel(dataDto.getWaterLevel());
		
		return dataDao.save(newData);
	}

	@Override
	public List<Data> findAll() {
		List<Data> dataList = new ArrayList<>();
		dataDao.findAllSortedByDate(PageRequest.of(0, 300)).iterator().forEachRemaining(dataList :: add);
//		dataDao.findAll().iterator().forEachRemaining(dataList :: add);
		return dataList;
	}

	@Override
	public Data findById(Long id) {		
		return dataDao.findById(id).orElse(null);
	}

}
