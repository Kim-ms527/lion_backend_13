package com.example.restexam.controller;

import com.example.restexam.domain.Memo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api4/memos")
public class MemoRest4Controller {
    private final Map<Long, Memo> memos = new HashMap<>();  //왜 만드는지 이해안되시면 질문..
    private final AtomicLong counter = new AtomicLong();

    //curl -X POST -H "Content-type: application/json" -d "{\"content\":\"첫번째 메모\"}"  http://localhost:8080/api4/memos
    //http://localhost:8080/api4/memos      --  POST     저장 (C)
    //  ^   --  윈도우     \ -- 맥
    // curl -X POST -H "Content-type: application/json" ^
    // -d "{\"content\":\"첫번째 메모\"}"  ^
    // http://localhost:8080/api4/memos


    @PostMapping
    public ResponseEntity<Long> createMemo(@RequestBody Memo memo){
        Long id = counter.incrementAndGet();
        memo.setId(id);
        memos.put(id,memo);
        return ResponseEntity.status(201).body(id);
    }
    //curl -i  -X GET http://localhost:8080/api4/memos
    //http://localhost:8080/api4/memos      --  GET
    @GetMapping
    public ResponseEntity<Map<Long, Memo>> getMemos(){
        return ResponseEntity.ok(memos);
    }

    //curl -i -X GET http://localhost:8080/api4/memos/1
    //http://localhost:8080/api4/memos/1    --  GET
    @GetMapping("/{id}")
    public ResponseEntity<Memo> getMemo(@PathVariable("id") Long id){
        Memo memo = memos.get(id);
        if(memo == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(memo);
    }

    //curl -i -X PUT -H "Content-type: application/json" -d "{\"content\":\"수정된 메모\"}" http://localhost:8080/api4/memos/1
    //http://localhost:8080/api4/memos/1    --  put
    @PutMapping("/{id}")
    public ResponseEntity<String> updateMemo(@PathVariable("id")Long id, @RequestBody Memo memo){
        if(!memos.containsKey(id)){
            return  ResponseEntity.status(404).body("해당 메모를 찾을 수 없어요. ㅠㅠ");
        }
        memo.setId(id);
        memos.put(id,memo);
        return ResponseEntity.ok("메모 수정 성공");
    }
    //curl -i -X DELETE http://localhost:8080/api4/memos/1
    //http://localhost:8080/api4/memos/1    --  DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMemo(@PathVariable("id")Long id){
        if(memos.remove(id) == null){
            return ResponseEntity.status(404).body("해당 메모를 찾을 수 없어요. ㅠㅠ");
        }
        return ResponseEntity.ok("메모 삭제 성공^^");
    }
}
