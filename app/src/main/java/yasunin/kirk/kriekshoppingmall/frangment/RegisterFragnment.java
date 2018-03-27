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
import android.widget.EditText;
import android.widget.RadioGroup;

import yasunin.kirk.kriekshoppingmall.MainActivity;
import yasunin.kirk.kriekshoppingmall.R;
import yasunin.kirk.kriekshoppingmall.utility.MyAlert;

/**
 * Created by fany on 3/6/2018.
 */

public class RegisterFragnment  extends Fragment {

//    Explict

    private String nameString, userString, passString, modeString;
    private  boolean aBoolean = true;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Cred toobar
        credToobar();

//        Radio conterler

        radioConterler();

    }  // Main method

    private void radioConterler() {
        RadioGroup radioGroup = getView().findViewById(R.id.ragMode);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aBoolean = false;
                switch (i) {
                    case R.id.radowershop:
                        modeString = "OwerShop";
                    break;
                    case  R.id.radCustomer:
                        modeString = "Customer";
                    break;
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemuplond) {
            uplondToSever();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    private void uplondToSever() {

//        Get Value Frome Edittext

        EditText nameEditText = getView().findViewById(R.id.edtName);
        EditText userEditText = getView().findViewById(R.id.edtUser);
        EditText passEditText = getView().findViewById(R.id.edtPass);

        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passString = passEditText.getText().toString().trim();

//        Check Space
        if (nameString.isEmpty() || userString.isEmpty() || passString.isEmpty()) {
//                    Have space
            MyAlert myAlert = new MyAlert(getActivity());
            myAlert.myDialog(getString(R.string.titel_have_spce),
                    getString(R.string.message_have_space));

        } else if (aBoolean) {
//            Non Choose
            MyAlert myAlert = new MyAlert(getActivity());
            myAlert.myDialog("Non Choose Mode","Pless Choose Mode");



        } else {
//            Choose Mode ok

        }


    }  //uplondtosever

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_register, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    private void credToobar() {

        setHasOptionsMenu(true);

        Toolbar toolbar = getView().findViewById(R.id.ToolbarRegister);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle(getString(R.string.register));
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle(getString(R.string.message_have_space));

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
        View view = inflater.inflate(R.layout.frangmaim_register, container, false);
        return view;
    }
}
