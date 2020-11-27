package kr.co.munjanara.exammenunavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveParentActivity(View view) {
        startActivity(new Intent(this, ParentActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_menu1:
                Toast.makeText(this, "1번째 선택", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.action_menu2:
                Toast.makeText(this, "2번째 선택", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.action_menu3:
                Toast.makeText(this, "3번째 선택", Toast.LENGTH_SHORT).show();
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}