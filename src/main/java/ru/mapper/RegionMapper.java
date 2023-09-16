package ru.mapper;

import org.apache.ibatis.annotations.Mapper;
import ru.model.Region;

import java.util.List;

@Mapper
public interface RegionMapper {
    List<Region> getAllRegions();
    Region getRegionById(Long id);
    void insertRegion(Region region);
    void updateRegion(Region region);
    void deleteRegion(Long id);
}
