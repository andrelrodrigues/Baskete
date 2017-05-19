package br.com.andrerodrigues.baskete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontuacaoTimeA = 0;
    private int pontuacaoTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoTresPontosTimeA = (Button) findViewById(R.id.tresPontosA);
        botaoTresPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosTimeA();
            }
        });

        Button botaoDoisPontosTimeA = (Button) findViewById(R.id.doisPontosA);
        botaoDoisPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosTimeA();
            }
        });

        Button botaoTiroLivreTimeA = (Button) findViewById(R.id.tiroLivreA);
        botaoTiroLivreTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontoTimeA();
            }
        });

        Button botaoTresPontosTimeB = (Button) findViewById(R.id.tresPontosB);
        botaoTresPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosTimeB();
            }
        });

        Button botaoDoisPontosTimeB = (Button) findViewById(R.id.doisPontosB);
        botaoDoisPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosTimeB();
            }
        });

        Button botaoTiroLivreTimeB = (Button) findViewById(R.id.tiroLivreB);
        botaoTiroLivreTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontoTimeB();
            }
        });

        Button botaoReinicarPartida = (Button) findViewById(R.id.reinicarPartida);
        botaoReinicarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reinicarPartida();
            }
        });
    }

    public void mostraPlacarTimeA(int pontuacaoTimeA){
        TextView placarTimeA = (TextView) findViewById(R.id.placarTimeA);
        placarTimeA.setText(String.valueOf(pontuacaoTimeA));
    }

    public void mostraPlacarTimeB(int pontuacaoTimeB){
        TextView placarTimeB = (TextView) findViewById(R.id.placarTimeB);
        placarTimeB.setText(String.valueOf(pontuacaoTimeB));
    }

    public void addTresPontosTimeA(){
        pontuacaoTimeA = pontuacaoTimeA + 3;
        mostraPlacarTimeA(pontuacaoTimeA);
    }

    public void addDoisPontosTimeA(){
        pontuacaoTimeA = pontuacaoTimeA + 2;
        mostraPlacarTimeA(pontuacaoTimeA);
    }

    public void addUmPontoTimeA(){
        pontuacaoTimeA = pontuacaoTimeA + 1;
        mostraPlacarTimeA(pontuacaoTimeA);
    }

    public void addTresPontosTimeB(){
        pontuacaoTimeB = pontuacaoTimeB + 3;
        mostraPlacarTimeB(pontuacaoTimeB);
    }

    public void addDoisPontosTimeB(){
        pontuacaoTimeB = pontuacaoTimeB+ 2;
        mostraPlacarTimeB(pontuacaoTimeB);
    }

    public void addUmPontoTimeB(){
        pontuacaoTimeB = pontuacaoTimeB + 1;
        mostraPlacarTimeB(pontuacaoTimeB);
    }
    public void reinicarPartida(){
        pontuacaoTimeA=0;
        pontuacaoTimeB=0;

        mostraPlacarTimeA(pontuacaoTimeA);
        mostraPlacarTimeB(pontuacaoTimeB);
    }
}
