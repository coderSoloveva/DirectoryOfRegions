package ru.controller;

import org.springframework.web.bind.annotation.*;
import ru.model.Region;
import ru.service.RegionService;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionController {
    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    public List<Region> getAllRegions() {
        return regionService.getAllRegions();
    }

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Long id) {
        return regionService.getRegionById(id);
    }

    @PostMapping
    public void insertRegion(@RequestBody Region region) {
        regionService.insertRegion(region);
    }

    @PutMapping("/{id}")
    public void updateRegion(@PathVariable Long id, @RequestBody Region region) {
        region.setId(id);
        regionService.updateRegion(region);
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable Long id) {
        regionService.deleteRegion(id);
    }
}
