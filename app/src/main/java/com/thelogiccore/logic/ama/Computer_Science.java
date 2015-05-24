package com.thelogiccore.logic.ama;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Shawn on 5/23/2015.
 */
public class Computer_Science extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.compsci_fragment,
                container, false);
        final QuestionBank qBank = new QuestionBank();
        Button button = (Button) view.findViewById(R.id.compsci_gen);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView question = (TextView) view.findViewById(R.id.question_compsci);
                question.setText(qBank.getRandomQuestion("Computer Science").getQuestion());
            }
        });
        return view;
    }
}
