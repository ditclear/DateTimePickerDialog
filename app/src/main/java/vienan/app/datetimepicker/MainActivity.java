package vienan.app.datetimepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity{

    private TextView tvDateTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvDateTime= (TextView) findViewById(R.id.tv_datetime);
        tvDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateTimePickerDialog();
            }
        });
    }

    private void showDateTimePickerDialog() {
        DateTimePickDialogUtil dateTimePicker=new DateTimePickDialogUtil(
                MainActivity.this,"2016年1月1日 16:11");
        dateTimePicker.dateTimePickDialog(tvDateTime);
    }

}
