package com.xiaozhao.util;

import java.util.LinkedList;
import java.util.List;

import android.app.Application;
import android.app.Activity;

public class MyApplication extends Application {

	private List<Activity> activityList = new LinkedList<Activity>(); 

	private static MyApplication instance;

    private MyApplication(){
    	
    }
	//单例模式中获取唯一的MyApplication实例 
	public static MyApplication getInstance(){
		if(null == instance){
			instance = new MyApplication();
		}
		return instance;             
	}
	//添加Activity到容器中
	public void addActivity(Activity activity){
		activityList.add(activity);
	}
	//遍历所有Activity并finish
	public void exit(){
		for(Activity activity:activityList){
			activity.finish();
		}
		System.exit(0);
	}
}