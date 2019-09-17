package cn.gov.szpl.studyandroid.selfrefreshlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.gov.szpl.studyandroid.refresh.GodRefreshLayout;

public class MainActivity extends AppCompatActivity {
    GodRefreshLayout godRefresh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        godRefresh=findViewById(R.id.god_refresh);
        godRefresh.setRefreshManager();
        godRefresh.setRefreshListener(new GodRefreshLayout.RefreshingListener() {
            @Override
            public void onRefreshing() {
//                mPresenter.getNetData(20);
                godRefresh.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        godRefresh.refreshOver();
                    }
                }, 2000);
            }
        });
    }
}
