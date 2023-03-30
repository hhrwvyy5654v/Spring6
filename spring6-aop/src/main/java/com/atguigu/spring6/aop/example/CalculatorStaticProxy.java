package com.atguigu.spring6.aop.example;

public class CalculatorStaticProxy implements Calculator{
    //被代理目标对象传递过来
    private final Calculator calculator;
    public CalculatorStaticProxy(Calculator calculator){
        this.calculator=calculator;
    }

    @Override
    public int add(int i,int j){
        //输出日志
        System.out.println("[日志] add 方法开始了，参数是："+i+","+j);
        //调用目标对象的方法实现核心业务
        int addResult=calculator.add(i,j);
        System.out.println("[日志] add 方法结束了，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int sub(int i,int j){
        //输出日志
        System.out.println("[日志] sub 方法开始了，参数是："+i+","+j);
        //调用目标对象的方法实现核心业务
        int subResult=calculator.sub(i,j);
        System.out.println("[日志] sub 方法结束了，结果是：" + subResult);
        return subResult;
    }

    @Override
    public int mul(int i,int j){
        //输出日志
        System.out.println("[日志] mul 方法开始了，参数是："+i+","+j);
        //调用目标对象的方法实现核心业务
        int mulResult=calculator.mul(i,j);
        System.out.println("[日志] mul 方法结束了，结果是：" + mulResult);
        return mulResult;
    }

    @Override
    public int div(int i,int j){
        //输出日志
        System.out.println("[日志] div 方法开始了，参数是："+i+","+j);
        //调用目标对象的方法实现核心业务
        int divResult=calculator.div(i,j);
        System.out.println("[日志] div 方法结束了，结果是：" + divResult);
        return divResult;
    }
}
