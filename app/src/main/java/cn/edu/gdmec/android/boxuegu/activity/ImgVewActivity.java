package cn.edu.gdmec.android.boxuegu.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import cn.edu.gdmec.android.boxuegu.R;

/**
 * Created by student on 18/1/4.
 */

public class ImgVewActivity extends AppCompatActivity {
    private TextView tv_main_title;
    private ImageView iv_delete;
    private RelativeLayout rl_title_bar;
    private static final int CHANGE_NICKNAME = 1;

    public ImageView ex_img;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.img_iew );
        //设置此界面为竖屏
        setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT );
        init();
    }
    private void init(){
        //从个人资料界面传递过来的标题和内容

        tv_main_title=(TextView)findViewById(R.id.tv_main_title) ;
        tv_main_title.setText ("头像");
        rl_title_bar = (RelativeLayout) findViewById ( R.id.title_bar );
        rl_title_bar.setBackgroundColor ( Color.parseColor ( "#30B4FF" ) );

        iv_delete = (ImageView) findViewById ( R.id.iv_head_icon1 );
        //iv_delete.setImageResource(R.drawable.app_icon);

        UserInfoActivity ui= new UserInfoActivity();
       // ui.iv_img=(ImageView)findViewById(R.id.iv_head_icon);
       // ui.iv_img.setImageResource(R.drawable.app_icon);
       // ui.setImgView();

        Intent intent = new Intent(ImgVewActivity.this,MainActivity.class);
        startActivity(intent);

        //ImgVewActivity.this.finish();




    }






}

