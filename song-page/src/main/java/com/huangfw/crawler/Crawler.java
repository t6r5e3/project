package com.huangfw.crawler;

import java.util.List;

import com.huangfw.crawler.model.WebPage;
import com.huangfw.crawler.model.MusicComment;
import com.huangfw.crawler.model.Song;

public interface Crawler {
    
    /**
     * 初始化爬虫队列
     */
    void initCrawlerList();

    /**
     * 获取一个未爬取页面，并将其标记为已爬
     * @return
     */
    WebPage getUnCrawlPage();
    
    /**
     * 添加页面至爬虫列表 
     */
    List<WebPage> addToCrawlList(List<WebPage> webPages);

    /**
     * 添加歌曲至已爬歌曲列表
     */
    Song saveSong(Song song);

    /**
     * 获取所有已爬歌曲
     */
    List<Song> getSongs();

    /**
     * 保存歌曲的评论
     */
    MusicComment saveMusicComment(MusicComment musicComment);

    List<MusicComment> saveMusicComments(List<MusicComment> musicComments);

    /**
     * 获取未爬页面->获取html->解析html并对结果进行处理->标记页面
     * 即流程图右下角黑框部分
     */
    void doRun();

    /**
     * 运行爬虫整体流程
     */
    default void run() {
        initCrawlerList();
        doRun();
    }

}
