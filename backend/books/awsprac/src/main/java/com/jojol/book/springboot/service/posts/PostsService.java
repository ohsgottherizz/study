package com.jojol.book.springboot.service.posts;

import com.jojol.book.springboot.domain.posts.PostsRepository;
import com.jojol.book.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
public class PostsService {
    private final PostsRepository postsRepository;
    
    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
