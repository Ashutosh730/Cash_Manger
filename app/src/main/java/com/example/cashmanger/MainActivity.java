package com.example.cashmanger;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    private EditText twothou,fivehun,twohun,onehun,fifty,twenty,ten,five,two,one;
    private TextView res2000,res500,res200,res100,res50,res20,res10,res5,res2,res1,notes,total;
    private Button save;
    private  int count=0,grand=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        twothou=findViewById(R.id.twothou);
        fivehun=findViewById(R.id.fivehun);
        twohun=findViewById(R.id.twohun);
        onehun=findViewById(R.id.onehun);
        fifty=findViewById(R.id.fifty);
        twenty=findViewById(R.id.twenty);
        ten=findViewById(R.id.ten);
        five=findViewById(R.id.five);
        two=findViewById(R.id.two);
        one=findViewById(R.id.one);

        res2000=findViewById(R.id.result2000);
        res500=findViewById(R.id.result500);
        res100=findViewById(R.id.result100);
        res50=findViewById(R.id.result50);
        res200=findViewById(R.id.result200);
        res20=findViewById(R.id.result20);
        res10=findViewById(R.id.result10);
        res5=findViewById(R.id.result5);
        res2=findViewById(R.id.result2);
        res1=findViewById(R.id.result1);

        twothou=findViewById(R.id.twothou);
        twothou=findViewById(R.id.twothou);

        notes=findViewById(R.id.notes);
        total=findViewById(R.id.total);


        twothou.addTextChangedListener(new TextWatcher() {

            int value,lcount=0,lgrand=0;
            String sValue,sCount,sGrand;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res2000.setText("");
                notes.setText("");
                total.setText("");

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                try {

                    value=2000*Integer.parseInt(twothou.getText().toString());
                    sValue=Long.toString(value);
                    res2000.setText(sValue);
                    lcount=Integer.parseInt(twothou.getText().toString());
                    sCount=Long.toString(lcount);
                    notes.setText(sCount);
                    lgrand=value;
                    sGrand=Long.toString(lgrand);
                    total.setText(sGrand);


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

                count+=lcount;
                grand+=lgrand;
                try {

                    notes.setText(count);
                    total.setText(grand);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }


        });



        fivehun.addTextChangedListener(new TextWatcher() {

            int value,lcount=0,lgrand=0;
            String sValue,sCount,sGrand;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                res500.setText("");
                notes.setText("");
                total.setText("");

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                try {

                    value=500*Integer.parseInt(fivehun.getText().toString());
                    sValue=Long.toString(value);
                    res500.setText(sValue);
                    lcount=Integer.parseInt(fivehun.getText().toString());
                    sCount=Long.toString(lcount);
                    notes.setText(sCount);
                    lgrand=value;
                    sGrand=Long.toString(lgrand);
                    total.setText(sGrand);


                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

                count+=lcount;
                grand+=lgrand;

                try {

                    notes.setText(count);
                    total.setText(grand);

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });

//        twohun.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res200.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=200*Integer.parseInt(twohun.getText().toString());
//                    sValue=Long.toString(value);
//                    res200.setText(sValue);
//                    lcount=Integer.parseInt(twohun.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });
//
//        onehun.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res100.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=100*Integer.parseInt(onehun.getText().toString());
//                    sValue=Long.toString(value);
//                    res100.setText(sValue);
//                    lcount=Integer.parseInt(onehun.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });
//
//        fifty.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res50.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=50*Integer.parseInt(fifty.getText().toString());
//                    sValue=Long.toString(value);
//                    res50.setText(sValue);
//                    lcount=Integer.parseInt(fifty.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });
//
//        twenty.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res20.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=20*Integer.parseInt(twenty.getText().toString());
//                    sValue=Long.toString(value);
//                    res20.setText(sValue);
//                    lcount=Integer.parseInt(twenty.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });
//
//        ten.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res10.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=10*Integer.parseInt(ten.getText().toString());
//                    sValue=Long.toString(value);
//                    res10.setText(sValue);
//                    lcount=Integer.parseInt(ten.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });
//
//        five.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res5.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=5*Integer.parseInt(five.getText().toString());
//                    sValue=Long.toString(value);
//                    res5.setText(sValue);
//                    lcount=Integer.parseInt(five.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });
//
//
//        two.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res2.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=2*Integer.parseInt(two.getText().toString());
//                    sValue=Long.toString(value);
//                    res2.setText(sValue);
//                    lcount=Integer.parseInt(two.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });
//
//        one.addTextChangedListener(new TextWatcher() {
//
//            int value,lcount=0,lgrand=0;
//            String sValue,sCount,sGrand;
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                res1.setText("");
//                notes.setText("");
//                total.setText("");
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                try {
//
//                    value=Integer.parseInt(one.getText().toString());
//                    sValue=Long.toString(value);
//                    res1.setText(sValue);
//                    lcount=Integer.parseInt(one.getText().toString());
//                    sCount=Long.toString(lcount);
//                    notes.setText(sCount);
//                    lgrand=value;
//                    sGrand=Long.toString(lgrand);
//                    total.setText(sGrand);
//
//
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                count+=lcount;
//                grand+=lgrand;
//                try {
//
//                    notes.setText(count);
//                    total.setText(grand);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//
//        });


    }

}
