package com.phuket.tour.video_recorder_pro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.socks.library.KLog;


public class MainActivity extends Activity {
	static {
        System.loadLibrary("SONGStudio");
	}

	private Button forward_video_recorder;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        KLog.i("zhangbin","main activity");
        super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		forward_video_recorder = (Button) findViewById(R.id.forward_video_recorder);
		forward_video_recorder.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, CommonRecordPublisherActivity.class);
				startActivity(intent);
			}
		});
        /*https://github.com/elvishew/XLog/blob/master/sample/src/main/java/com/elvishew/xlogsample/XLogSampleApplication.java*/
        //XLog.init(LogLevel.ALL);

    }
}
