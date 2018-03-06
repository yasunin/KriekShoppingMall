package yasunin.kirk.kriekshoppingmall.frangment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import yasunin.kirk.kriekshoppingmall.R;

/**
 * Created by fany on 3/6/2018.
 */

public class MainFrangment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//    Register Contentler
        registerContentler();
    }   //Maim Method

    private void registerContentler() {
        TextView textView = getView().findViewById(R.id.txtNewRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Replace Fragmait

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMain,new RegisterFragnment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fraingment_main,container,false);
        return view;
    }
}
