package ru.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.model.Region;
import ru.mapper.RegionMapper;


import java.util.List;


@Service
public class RegionService {
    private final RegionMapper regionMapper;

    public RegionService(RegionMapper regionMapper) {
        this.regionMapper = regionMapper;
    }

    @Cacheable("regions")
    public List<Region> getAllRegions() {
        return regionMapper.getAllRegions();
    }

    @Cacheable("regions")
    public Region getRegionById(Long id) {
        return regionMapper.getRegionById(id);
    }

    @CacheEvict(cacheNames = "regions", allEntries = true)
    public void insertRegion(Region region) {
        regionMapper.insertRegion(region);
    }

    @CacheEvict(cacheNames = "regions", allEntries = true)
    public void updateRegion(Region region) {
        regionMapper.updateRegion(region);
    }

    @CacheEvict(cacheNames = "regions", allEntries = true)
    public void deleteRegion(Long id) {
        regionMapper.deleteRegion(id);
    }
}
