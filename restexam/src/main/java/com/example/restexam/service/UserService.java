package com.example.restexam.service;

import com.example.restexam.domain.User;
import com.example.restexam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository repository;

    public User findById(Long id){
        return repository.findById(id).orElseThrow();
    }

    @Transactional(readOnly = true)
    public List<User> getUsers(){
        log.info("+++++++++++test++++++++++++");
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public User getUser(Long id){

        return repository.findById(id)
                .orElseThrow(() ->new RuntimeException("id에 해당하는 사용자를 찾을 수 없어요. id::"+id));
    }

    @Transactional
    public User addUser(User user){
        try {
            return repository.save(user);
        } catch (Exception e) {
            throw new RuntimeException("사용자 추가 실패 :: "+e.getMessage(), e);
        }
    }

    @Transactional
    public User updateUser(User user){
        if(user.getId() == null){
            throw new IllegalArgumentException("사용자 ID는 필수입니다.");
        }

        User findUser = repository.findById(user.getId()).orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없어요." + user.getId()));

        //user의 필드가 null이 아닌 것만 update
        if(user.getName() != null) findUser.setName(user.getName());
        if(user.getEmail() != null) findUser.setEmail(user.getEmail());
        return findUser;    //커밋될때..  findUser의 변경감지로 자동 업데이트 진행될 것임.
        // save() 를 호출하는것보다는 변경감지해서 수정하도록 하는것이 좋다.
    }

    @Transactional
    public void deleteUser(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("ID에 맞는 사용자를 찾을 수 없어요. ID :: "+id);
        }
        repository.deleteById(id);
    }
}
