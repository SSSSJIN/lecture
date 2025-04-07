package kr.ac.kopo.test;

/*
10. 다음 코드 중 NullPointerException 처리가 발생되었다면 어떤 결과가 출력되겠는가?

java.lang.Object  
  +- java.lang.Throwable  
    +- java.lang.Exception  
      +- java.lang.RuntimeException  
        +- java.lang.NullPointerException  

try {
    예외발생코드
} catch (NullPointerException e1) {
    return;
    System.out.print("a");
} catch (RuntimeException e2) {
    System.out.print("b");
} finally {
    System.out.print("c");
}

*/