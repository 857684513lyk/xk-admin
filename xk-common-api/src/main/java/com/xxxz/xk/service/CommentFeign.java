package com.xxxz.xk.service;

import com.xxxz.xk.config.feign.FeignClientConfig;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Comment;
import com.xxxz.xk.pojo.query.CommentQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(value = "comment-rest", path = "comment", configuration = FeignClientConfig.class)
public interface CommentFeign {

    /**
     * 对评论进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listComment")
    PageDTO listComment(CommentQuery query);// 第二种：最喜欢 post里边body放的参数

    @RequestMapping("/addComment")
    ResponseDTO addComment(Comment comment);

    @RequestMapping("/deleteComment")
    ResponseDTO deleteComment(Comment comment);

    @RequestMapping("/updateComment")
    ResponseDTO updateComment(Comment comment);
}
