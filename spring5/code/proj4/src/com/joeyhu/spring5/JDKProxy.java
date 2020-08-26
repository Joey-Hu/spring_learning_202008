package com.joeyhu.spring5;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author: huhao
 * @time: 2020/8/12 9:17
 * @desc: 测试 JDK 动态代理
 */
public class JDKProxy {

    public static void main(String[] args) {
        // 创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy
                (userDao));
        int result = dao.add(1, 1);
        System.out.println("result: " + result);
    }
}

class UserDaoProxy implements InvocationHandler {

    //1 把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递
    private Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前
        System.out.println("方法执行之前..." + method.getName() + " :传递的参数..." + Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(object, args);

        // 方法之后
        System.out.println("方法执行之后 ..." + object);

        return res;
    }
}
