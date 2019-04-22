package patterns.chapter04simplefactory.test;

import patterns.chapter04simplefactory.JavaVideo;
import patterns.chapter04simplefactory.Video;
import patterns.chapter04simplefactory.VideoFactory;
import org.junit.Test;

/**
 * Video Tester.
 *
 * @author liangshanguang
 * @date 04/22/2019
 * @description test
 */
public class VideoTest {

    @Test
    public void testMain() {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
} 