package com.huangfw.crawler.repository;

import com.huangfw.crawler.model.Gtp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by huangfangwei on 2017/4/11.
 */
public interface GtpRepository extends JpaRepository<Gtp, String> {
    Page<Gtp> findAllByTitleLike(String title, Pageable page);
}
