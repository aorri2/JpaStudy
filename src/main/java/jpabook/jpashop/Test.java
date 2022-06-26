package jpabook.jpashop;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter @Setter
@Slf4j
public class Test {
    private String name;

    public static void main(String[] args) {
        Test test = new Test();
        test.setName("aa");
        log.info("test = {}",test.getName());
    }
}

