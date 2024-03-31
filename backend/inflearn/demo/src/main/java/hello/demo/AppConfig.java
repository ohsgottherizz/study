package hello.demo;

import hello.demo.discount.FixDiscountPolicy;
import hello.demo.member.MemberService;
import hello.demo.member.MemberServiceImpl;
import hello.demo.member.MemoryMemberRespository;
import hello.demo.order.OrderService;
import hello.demo.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRespository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRespository(), new FixDiscountPolicy());
    }
}
