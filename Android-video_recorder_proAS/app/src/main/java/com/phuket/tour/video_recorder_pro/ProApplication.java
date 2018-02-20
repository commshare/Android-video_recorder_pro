package com.phuket.tour.video_recorder_pro;

import android.app.Application;
import android.util.Log;


import com.socks.library.KLog;
/*https://github.com/ZhaoKaiQiang/KLog/blob/master/app/src/main/java/com/socks/sample/KLogApplication.java*/
public class ProApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("zhangbin","ProApplicaiton1");
        KLog.init(true);
        KLog.i(" init applicaiton ok");
        Log.d("zhangbin","ProApplicaiton2");

    }
}