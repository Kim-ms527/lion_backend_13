package com.example.friendapp.service;

import com.example.friendapp.domain.Friend;
import com.example.friendapp.repository.FriendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    @Transactional(readOnly = true)
    public Iterable<Friend> findAllFriend(){
        return friendRepository.findAll();
    }
}
