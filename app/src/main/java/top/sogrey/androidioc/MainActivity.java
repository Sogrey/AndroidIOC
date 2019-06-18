package top.sogrey.androidioc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import top.sogrey.ioc.ContentViewInject;
import top.sogrey.ioc.InjectUtils;
import top.sogrey.ioc.OnClickInject;
import top.sogrey.ioc.ViewInject;

//布局文件注入
@ContentViewInject(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    //属性控件注入
    @ViewInject(R.id.tv_title)
    private TextView tv_title;
    @ViewInject(R.id.bt_pop)
    private Button bt_pop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //注入工具绑定
        InjectUtils.inject(this);
    }

    //点击事件注入
    @OnClickInject(R.id.bt_pop)
    public void change(){
        tv_title.setText("hello IOC");
        Toast.makeText(this,"Hello IOC",Toast.LENGTH_SHORT).show();
    }
}