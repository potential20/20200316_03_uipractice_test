package kr.co.tjoeun.a20200316_03_uipractice_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView findPwTxt = null;
    TextView signUpTxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        findPwTxt = findViewById(R.id.findPwTxt);
        signUpTxt = findViewById(R.id.signUpTxt);

//        로그인버튼의 글자를 => 회원가입으로 바꾸자.
        loginBtn.setText("회원가입");

//        비밀번호 찾기 텍스트뷰를 => JAVA에서 "비번 찾기" 로 변경.
//        findPwTxt 로 id를 부여하자.

        findPwTxt.setText("비번 찾기");

//        로그인 버튼이 눌리면 => 비번 찾기 버튼을 "AAA"로 변경

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findPwTxt.setText("AAA");
            }
        });

//        클릭은 버튼 뿐 아니라 모든 뷰가 다 늘릴 수 있다. => 텍스트뷰도 클릭.

        findPwTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwTxt.setText("비밀번호 찾기");
            }
        });

        loginBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                loginBtn.setText("로그인");
                return true; // 손을 뗐을때, onClick실행을 막을건지?
            }
        });


//        회원가입을 누르면 => "회원가입 화면으로 이동합니다." 안내문구 출력.
        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "회원가입 화면으로 이동합니다.", Toast.LENGTH_SHORT).show();
            }
        });

//        로그인버튼을 누르면 => 로그인 합니다. 토스트 출력.

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "로그인 합니다", Toast.LENGTH_SHORT).show();
            }
        });
        

    }
}

