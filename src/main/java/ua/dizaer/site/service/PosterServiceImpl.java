package ua.dizaer.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dizaer.site.component.FileBrowserComponent;

import java.io.File;

@Service("posterService")
public class PosterServiceImpl implements PosterService {
    @Autowired
    private FileBrowserComponent fileBrowserComponent;

    @Override
    public File getPoster(String poster) {
        return fileBrowserComponent.getPosters().get(poster);
    }
}
