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

    public Friend addFriend(Friend friend){
        //Spring Data에는 save (반드시 insert만 실행되는 것은 아니다. )
        //id값이 이미 존재하고 있다라면..  수정해주고(update 쿼리자동생성),  id가 없다면(insert쿼리) 생성해준다.

        //친구가 추가될때 조건이 있다라고 가정해봅시다.
//        if(friend.getName())


        return friendRepository.save(friend);
    }

    public Friend updateFriend(Friend friend){
        //Spring Data에는 save (반드시 insert만 실행되는 것은 아니다. )
        //id값이 이미 존재하고 있다라면..  수정해주고(update 쿼리자동생성),  id가 없다면(insert쿼리) 생성해준다.
        return friendRepository.save(friend);
    }
    @Transactional(readOnly = true)
    public Friend findFriendById(Long id){
        return friendRepository.findById(id).orElse(null);
    }

    @Transactional
    public void deleteFriendById(Long id){
        friendRepository.deleteById(id);
    }
}
