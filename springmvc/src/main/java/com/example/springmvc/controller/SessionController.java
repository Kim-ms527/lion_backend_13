package com.example.springmvc.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/session")
@SessionAttributes("visitCount")
public class SessionController {
    @ModelAttribute("visitCount")
    public Integer initVisitCount(){
        System.out.println("initVisitCount");
        return 0;
    }
//    @GetMapping("/visit")
@RequestMapping(value = "/visit", method = RequestMethod.GET)
    public String visit(@ModelAttribute("visitCount") Integer visitCount, Model model){
        //HttpSession 을 직접 접근하지 않고, 스프링을 이용하는 방식.
        visitCount++;
        model.addAttribute("visitCount", visitCount);
        return "visitSession";
    }

    @GetMapping("/resetVisit")
    public String resetVisit(SessionStatus status,Model model){
        status.setComplete();   // @SessionAttributes("visitCount") 이렇게 등록된 값들만 삭제.
//        model.asMap().remove("visitCount");
        return "redirect:/session/visit";
    }

    @PostMapping("/resetVisit")
    public String resetPost(){
        //이렇게 썼다고해서 자동으로 해줄까요?
        //
        return null;
    }

    @PutMapping("/resetVisit")
    public String resetPut(){
        //이렇게 썼다고해서 자동으로 해줄까요?
        //우리가 알맞게 구현해야해요~~~

        return null;
    }


//    @GetMapping("/resetVisit")
//    public String resetVisit(HttpSession session){
//       session.invalidate();  //세션객체삭제.
////        session.removeAttribute("visitCount");   //
//
//        return "redirect:/session/visit";
//    }




//HttpSession에 직접접근하는 방법.
//    @GetMapping("/visit")
//    public String visit(HttpSession session, Model model){
//        //HttpSession 은 HttpServletRequest의 getSession() 메서드로 얻어올 수 있는데,
//        //getSession() 이라는 메서드는 세션이 이미 존재하면 있는것을 리턴해주고,
//        // 없다면 새로 생성해서 리턴 (세션객체를 생성하고, sessionId 를 발급받아서 쿠키로만들어
//        // response에 넣는 작업까지 실행된다.
//        Integer visitCount =  (Integer)session.getAttribute("visitCount");
//        if(visitCount == null){
//            visitCount = 0;
//        }
//
//        visitCount++;
//        session.setAttribute("visitCount", visitCount);
//        model.addAttribute("visitCount",visitCount);
//        return "visitSession";
//    }
}
