package com.meituan.robust;

/**
 * Created by kiddo on 17-7-19.
 */

public interface ChangeQuickRedirect {
    Object accessDispatch(String methodName, Object[] paramArrayOfObject);

    boolean isSupport(String methodName, Object[] paramArrayOfObject);
}
