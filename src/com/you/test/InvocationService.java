package com.you.test;

import java.lang.reflect.Method;

public interface InvocationService {
	public void invoke(Object obj, Method method);
	public void daili(Object obj, Method method,Object... params);
}
