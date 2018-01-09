package ua.dizaer.site.controller;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.io.IOUtils;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.scale.AWTUtil;
import org.jcodec.scale.ColorUtil;
import org.jcodec.scale.Transform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.dizaer.site.model.entity.Intro;
import ua.dizaer.site.service.IntroService;
import ua.dizaer.site.service.PosterService;
import ua.dizaer.site.service.VideoService;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

import static org.jcodec.scale.AWTUtil.toBufferedImage;

@Controller
@RequestMapping("/poster")
public class PosterController {
//    private static final int second = 3;
//    @Autowired
//    private VideoService videoService;

    @Autowired
    private PosterService posterService;

    @Autowired
    private IntroService introService;

    @RequestMapping(method = RequestMethod.GET, value ="/{posterName:.+}",produces = MediaType.IMAGE_PNG_VALUE)
     public @ResponseBody byte[] stream(@PathVariable String posterName) throws IOException, JCodecException {
        File posterFile = posterService.getPoster(posterName);
        InputStream posterFileStream = new FileInputStream(posterFile);
        return IOUtils.toByteArray(posterFileStream);
      }

//    @RequestMapping(method = RequestMethod.GET, value ="/{posterName:.+}",produces = MediaType.IMAGE_PNG_VALUE)
//     public @ResponseBody byte[] stream(@PathVariable String posterName) throws IOException, JCodecException {
//        Intro intro=introService.findByPosterName(posterName);
//        String video=intro.getVideoName();
//        Picture frameAtSec = FrameGrab.getFrameAtSec(videoService.getVideo(video), second);
//        Transform transform = ColorUtil.getTransform(frameAtSec.getColor(), ColorSpace.RGB);
//        Picture rgb = Picture.create(frameAtSec.getWidth(), frameAtSec.getHeight(), ColorSpace.RGB);
//        transform.transform(frameAtSec, rgb);
//        BufferedImage bi = toBufferedImage(rgb);
//        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
//        ImageIO.write(bi, "png", byteArrayOutputStream);
//        return IOUtils.toByteArray( new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
//
//      }
}
