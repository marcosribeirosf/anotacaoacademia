package pooa20171.iff.br.anotacaoacademia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.iff.pooa20171.financapessoal.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button anotacaoBT = (Button) findViewById(R.id.bt_anotacoes);

        anotacaoBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AnotacaoActivity.class);
                startActivity(intent);

            }
        });
    }
    private Context getContext(){
        return this;
    }
}
