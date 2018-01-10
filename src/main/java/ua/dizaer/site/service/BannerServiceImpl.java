package ua.dizaer.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dizaer.site.component.FileBrowserComponent;
import ua.dizaer.site.model.entity.Banner;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Service("bannerService")
public class BannerServiceImpl implements BannerService {
    @Autowired
    private FileBrowserComponent fileBrowserComponent;

    @Override
    public List<Banner> findAll() {
        return fileBrowserComponent.getBanners().keySet()
                .stream()
                .map(s->{
                    Banner banner = new Banner();
                    banner.setName(s.split("\\.")[0]);
                    banner.setFileName(s);
                    return banner;
                }).collect(Collectors.toList());
    }

    @Override
    public File getBanner(String banner) {
        return fileBrowserComponent.getBanners().get(banner);
    }
}
