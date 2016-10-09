package com.kince.radiationview;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView iv = null;
	private RadiationView rv = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		iv = (ImageView) findViewById(R.id.iv_rotate);
		rv = (RadiationView) findViewById(R.id.rv);
		rv.setMinRadius(70);// 辐射半径
		rv.startRadiate();// 开始辐射
		Animation anim = AnimationUtils.loadAnimation(this,
				R.anim.rotate_circle_anim);
		iv.startAnimation(anim);// 开始动画
	}

}
