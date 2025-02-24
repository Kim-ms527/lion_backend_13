package com.example.restexam.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api2/memos")
public class MemoRest2Controller {
    private final Map<Long, String> memos = new HashMap<>();  //왜 만드는지 이해안되시면 질문..
    private final AtomicLong counter = new AtomicLong();

    //curl -X POST -H "Content-type: text/plain" -d "첫번째 메모"  http://localhost:8080/api2/memos
    //http://localhost:8080/api2/memos      --  POST     저장 (C)
    @PostMapping
    public Long createMemo(@RequestBody String content){
        Long id = counter.incrementAndGet();
        memos.put(id,content);
        return id;
    }
    //curl -X GET http://localhost:8080/api2/memos
    //http://localhost:8080/api2/memos      --  GET
    @GetMapping
    public Map<Long, String> getMemos(){
        return memos;
    }

    //curl -X GET http://localhost:8080/api2/memos
    //http://localhost:8080/api2/memos/1    --  GET
    @GetMapping("/{id}")
    public String getMemo(@PathVariable("id") Long id){
        return memos.getOrDefault(id,"해당 메모를 찾을수가 없어요 ㅠㅠ");
    }

    //curl -X PUT -H "Content-type: text/plain" -d "수정된 메모" http://localhost:8080/api2/memos/1
    //http://localhost:8080/api2/memos/1    --  put
    @PutMapping("/{id}")
    public String updateMemo(@PathVariable("id")Long id, @RequestBody String content){
        if(!memos.containsKey(id)){
            return "해당 메모를 찾을 수 없어요. ㅠㅠ";
        }
        memos.put(id,content);
        return "메모 수정 성공";
    }
    //curl -X DELETE http://localhost:8080/api2/memos/1
    //http://localhost:8080/api2/memos/1    --  DELETE
    @DeleteMapping("/{id}")
    public String deleteMemo(@PathVariable("id")Long id){
        if(memos.remove(id) == null){
            return "해당 메모를 찾을 수 없어요 ㅠㅠ";
        }

        return "메모 삭제 성공^^";
    }
}
