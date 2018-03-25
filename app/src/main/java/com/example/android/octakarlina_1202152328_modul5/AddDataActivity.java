package com.example.android.octakarlina_1202152328_modul5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Octa Karlina on 25/03/2018.
 */

public class AddDataActivity {
    //deklarasi variable
    String todo, desc, prior;

    //konstruktor
    public AddDataActivity(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}

