package ua.dizaer.site.service;

import ua.dizaer.site.model.entity.Banner;

import java.io.File;
import java.util.List;

public interface BannerService {
    List<Banner> findAll();
    File getBanner(String bannerName);
}
