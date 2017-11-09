package seokjong.arduinobt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by seokjong_2 on 2017-11-09.
 */

public class SplashActivity extends Activity{
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(4000);                    // 4초간 정지화면
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this, MainActivity.class));      // 메인엑티비티 실행
        finish();
    }




}
