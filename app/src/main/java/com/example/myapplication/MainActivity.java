package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button jia, jian, cheng, chu, deng, baifen, dian;
    Button sin, cos, tan;
    Button help, clear, kuohao1, kuohao2;
    Button changdu1, changdu2, tiji1, tiji2;
    Button jinzhi102, jinzhi108, jinzhi1016, jinzhi210, jinzhi810, jinzhi1610, jinzhi28, jinzhi216;
    Button jinzhi82, jinzhi162, jinzhi816, jinzhi168;
    EditText result;
    boolean clear_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        jia = (Button) findViewById(R.id.jia);
        jian = (Button) findViewById(R.id.jian);
        cheng = (Button) findViewById(R.id.cheng);
        chu = (Button) findViewById(R.id.chu);
        deng = (Button) findViewById(R.id.deng);
        baifen = (Button) findViewById(R.id.baifen);
        dian = (Button) findViewById(R.id.dian);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        help = (Button) findViewById(R.id.help);
        clear = (Button) findViewById(R.id.clear);
        kuohao1 = (Button) findViewById(R.id.kuohao1);
        kuohao2 = (Button) findViewById(R.id.kuohao2);
        changdu1 = (Button) findViewById(R.id.lenght_mcm);
        changdu2 = (Button) findViewById(R.id.lenght_mmm);
        tiji1 = (Button) findViewById(R.id.tiji1);
        tiji2 = (Button) findViewById(R.id.tiji2);
        jinzhi102 = (Button) findViewById(R.id.jinzhi102);
        jinzhi108 = (Button) findViewById(R.id.jinzhi108);
        jinzhi1016 = (Button) findViewById(R.id.jinzhi1016);
        jinzhi210 = (Button) findViewById(R.id.jinzhi210);
        jinzhi810 = (Button) findViewById(R.id.jinzhi810);
        jinzhi1610 = (Button) findViewById(R.id.jinzhi1610);
        jinzhi28 = (Button) findViewById(R.id.jinzhi28);
        jinzhi216 = (Button) findViewById(R.id.jinzhi216);
        jinzhi82 = (Button) findViewById(R.id.jinzhi82);
        jinzhi162 = (Button) findViewById(R.id.jinzhi162);
        jinzhi816 = (Button) findViewById(R.id.jinzhi816);
        jinzhi168 = (Button) findViewById(R.id.jinzhi168);
        result = (EditText) findViewById(R.id.result);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        jia.setOnClickListener(this);
        jian.setOnClickListener(this);
        cheng.setOnClickListener(this);
        chu.setOnClickListener(this);
        baifen.setOnClickListener(this);
        dian.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        help.setOnClickListener(this);
        clear.setOnClickListener(this);
        kuohao1.setOnClickListener(this);
        kuohao2.setOnClickListener(this);
        changdu1.setOnClickListener(this);
        changdu2.setOnClickListener(this);
        tiji1.setOnClickListener(this);
        tiji2.setOnClickListener(this);
        jinzhi102.setOnClickListener(this);
        jinzhi108.setOnClickListener(this);
        jinzhi1016.setOnClickListener(this);
        jinzhi210.setOnClickListener(this);
        jinzhi810.setOnClickListener(this);
        jinzhi1610.setOnClickListener(this);
        jinzhi28.setOnClickListener(this);
        jinzhi216.setOnClickListener(this);
        jinzhi82.setOnClickListener(this);
        jinzhi162.setOnClickListener(this);
        jinzhi816.setOnClickListener(this);
        jinzhi168.setOnClickListener(this);
        deng.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String str = result.getText().toString();
        switch (v.getId()) {
            case R.id.dian:
            case R.id.button0:
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
                result.setText(str + ((Button) v).getText());
                break;
            case R.id.jia:
            case R.id.jian:
            case R.id.cheng:
            case R.id.chu:
            case R.id.baifen:
            case R.id.sin:
            case R.id.cos:
            case R.id.tan:
            case R.id.kuohao1:
            case R.id.kuohao2:
                result.setText(str +((Button) v).getText());
                break;
            case R.id.clear:
                Clear_();
                break;
            case R.id.deng:
                result.setText(Double.toString(getResult(str)));
                break;
            case R.id.jinzhi102:
                result.setText(Integer.toBinaryString(Integer.parseInt(str)));
                break;
            case R.id.jinzhi108:
                result.setText(Integer.toOctalString(Integer.parseInt(str)));
                break;
            case R.id.jinzhi1016:
                result.setText(Integer.toHexString(Integer.parseInt(str)));
                break;
            case R.id.jinzhi210:
                result.setText(Integer.valueOf(str,2));
                break;
            case R.id.jinzhi810:
                result.setText(Integer.valueOf(str,8));
                break;
            case R.id.jinzhi1610:
                result.setText(Integer.valueOf(str,16));
                break;
            case R.id.jinzhi28:
                result.setText(Integer.toOctalString(Integer.valueOf(str,2)));
                break;
            case R.id.jinzhi216:
                result.setText(Integer.toHexString(Integer.valueOf(str,2)));
                break;
            case R.id.jinzhi82:
                result.setText(Integer.toBinaryString(Integer.valueOf(str,8)));
                break;
            case R.id.jinzhi162:
                result.setText(Integer.toBinaryString(Integer.valueOf(str,16)));
                break;
            case R.id.jinzhi816:
                result.setText(Integer.toHexString(Integer.valueOf(str,8)));
                break;
            case R.id.jinzhi168:
                result.setText(Integer.toOctalString(Integer.valueOf(str,16)));
                break;
            case R.id.lenght_mcm:
                result.setText(Double.toString(Double.parseDouble(str)*100));
                break;
            case R.id.lenght_mmm:
                result.setText(Double.toString(Double.parseDouble(str)*1000));
                break;
            case R.id.tiji1:
                result.setText(Double.toString(Double.parseDouble(str)*1000));
                break;
            case R.id.tiji2:
                result.setText(Double.toString(Double.parseDouble(str)*1000000));
                break;
            case R.id.help:
                result.setText("这是一行帮助");
                break;
        }
    }
    private void Clear_() {
        String str = result.getText().toString();
        str = str.substring(0, str.length() - 1);
        result.setText(str);
    }
    private static boolean isNumber(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.' && str.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }
    public static Double getResult(String str) {

        if (str.isEmpty() || isNumber(str)) {
            return str.isEmpty() ? 0 : Double.parseDouble(str);
        }

        //递归体
        if (str.contains(")")) {
            // 最后一个左括号
            int lIndex = str.lastIndexOf("(");
            // 对于的右括号
            int rIndex = str.indexOf(")", lIndex);
            return getResult(str.substring(0, lIndex) + getResult(str.substring(lIndex + 1, rIndex)) + str.substring(rIndex + 1));
        }
        if (str.contains("+")) {
            int index = str.lastIndexOf("+");
            return getResult(str.substring(0, index)) + getResult(str.substring(index + 1));
        }
        if (str.contains("-")) {
            int index = str.lastIndexOf("-");
            return getResult(str.substring(0, index)) - getResult(str.substring(index + 1));
        }
        if (str.contains("×")) {
            int index = str.lastIndexOf("×");
            return getResult(str.substring(0, index)) * getResult(str.substring(index + 1));
        }
        if (str.contains("÷")) {
            int index = str.lastIndexOf("÷");
            return getResult(str.substring(0, index)) / getResult(str.substring(index + 1));
        }
        if (str.contains("sin")) {
            int index = str.lastIndexOf("s");
            return getResult(Double.toString(Math.sin(Double.parseDouble(str.substring(index+3)))));
        }
        if (str.contains("cos")) {
            int index = str.lastIndexOf("c");
            return getResult(Double.toString(Math.cos(Double.parseDouble(str.substring(index+3)))));
        }
        if (str.contains("tan")) {
            int index = str.lastIndexOf("t");
            return getResult(Double.toString(Math.tan(Double.parseDouble(str.substring(index+3)))));
        }
            // 出错
            return null;
        }

}