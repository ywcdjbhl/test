package com.you.test;

import java.lang.reflect.Method;

public class $Proxy1 implements com.you.test.Test114_2 {
   public $Proxy1(InvocationService invo) {
       this.invo = invo;
   }
   com.you.test.InvocationService invo;
   @Override
   public void drink() {
       try {
           Method md = com.you.test.Test114_2.class.getMethod("drink");
           invo.invoke(this,md);
       } catch(Exception e) {
           e.printStackTrace();
       }
   }

   @Override
   public void eat() {
       try {
           Method md = com.you.test.Test114_2.class.getMethod("eat");
           invo.invoke(this,md);
       } catch(Exception e) {
           e.printStackTrace();
       }
   }


}