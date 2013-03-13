package com.cappex.hq.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created with IntelliJ IDEA.
 * User: Devin
 * Date: 3/13/13
 * Time: 12:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class StudentsCollegeServiceAspect {

    @Pointcut("execution(* com.cappex.hq.service.StudentCollegeService.getStudents(..))")
    public void pointcut_getStudents(){}

    @Pointcut("execution(* com.cappex.hq.service.StudentCollegeService.getStudent(..))")
    public void pointcut_getStudent(){}

    @Before("pointcut_getStudents()")
    public void before_getStudents() {
        System.out.println("Before getStudents is run, this is");
    }

    @After("pointcut_getStudent()")
    public void after_getStudent() {
        System.out.println("After getStudent is run, this is");
    }

}
