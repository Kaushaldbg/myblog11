package com.myblog.myblog11.service;

import com.myblog.myblog11.payload.CommentDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CommentService {
 CommentDto createComment(CommentDto commentDto, long postId);

}
