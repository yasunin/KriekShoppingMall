package yasunin.kirk.kriekshoppingmall.frangment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import yasunin.kirk.kriekshoppingmall.MainActivity;
import yasunin.kirk.kriekshoppingmall.R;

/**
 * Created by fany on 3/6/2018.
 */

public class RegisterFragnment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Cred toobar
        credToobar();


    }  // Main method

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.itemuplond){
            uplondToSever();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    private void uplondToSever() {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_register,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    private void credToobar() {

        setHasOptionsMenu(true);

        Toolbar toolbar = getView().findViewById(R.id.ToolbarRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle(getString(R.string.register));
        ((MainActivity)getActivity()).getSupportActionBar().setSubtitle(getString(R.string.message_have_space));

        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().popBackStack();
            }
        });


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangmaim_register,container,false);
        return view;
    }
}
