package hello.demo.discount;

import hello.demo.member.Member;

public interface DiscountPolicy {

    /**
     *
     *  @return 할일 대상 금액
     */
    int discount(Member member, int price);

}
