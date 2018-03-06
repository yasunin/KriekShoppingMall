package yasunin.kirk.kriekshoppingmall.frangment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yasunin.kirk.kriekshoppingmall.R;

/**
 * Created by fany on 3/6/2018.
 */

public class RegisterFragnment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangmaim_register,container,false);
        return view;
    }
}
