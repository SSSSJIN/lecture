package kr.ac.kopo.test;
/*
14. 다음 코드가 컴파일 시 오류가 발생되는 라인을 모두 찾으시오.

package com.java.util;

public class CommonUtil {
    int am() { return 1; }
    public int bm() { return 1; }
    protected int cm() { return 1; }
    private int dm() { return 1; }
}

package com.java;
import com.java.util.CommonUtil;

public class CallTest extends CommonUtil {
    int i = 1;
    CallTest() {
        this.i = 2;
    }

    public static void main(String[] args) {
        CommonUtil o = new CommonUtil();
         CallTest ct = new CallTest();
         ct.i += o.am();        // 오류 발생
         ct.i += o.bm();
         ct.i += o.cm();        // 오류 발생
         ct.i += o.dm();        // 오류 발생
         System.out.println(ct.i);
     }
}

*/