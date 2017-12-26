package cn.edu.gdmec.android.boxuegu.activity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


import cn.edu.gdmec.android.boxuegu.R;
import cn.edu.gdmec.android.boxuegu.adapter.ExercisesDetailAdapter;
import cn.edu.gdmec.android.boxuegu.bean.ExercisesBean;

/**
 * Created by student on 17/12/26.
 */

public class ExercisesDetailActivity extends AppCompatActivity{
    private TextView tv_main_title;
    private TextView tv_back;
    private RelativeLayout rl_title_bar;
    private ListView lv_list;
    private String title;
    private int id;
    private List<ExercisesBean> ebl;
    private ExercisesDetailAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_detail);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        id = getIntent().getIntExtra("id",0);
        title = getIntent().getStringExtra("title");
        ebl = new ArrayList<ExercisesBean>();
        initData();
        init();
    }

    private void initData() {
        try {
            InputStream is = getResources().getAssets().open(
            "chapter" + id + ".xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void init() {
        tv_main_title = (TextView) findViewById(R.id.tv_mian_title);
        tv_back = (TextView) findViewById(R.id.tv_back);
        rl_title_bar = (RelativeLayout) findViewById(R.id.title_bar);
        rl_title_bar.setBackgroundColor(Color.parseColor("#3084FF"));
        TextView tv = new TextView(this);
        tv.setTextColor(Color.parseColor("#000000"));


    }
}
