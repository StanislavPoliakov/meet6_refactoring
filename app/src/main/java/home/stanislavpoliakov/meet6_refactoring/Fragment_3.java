package home.stanislavpoliakov.meet6_refactoring;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_3 extends Fragment {
    private final String LOG_TAG = "meet6_logs";
   // private String message;

    public Fragment_3() {
        // Required empty public constructor
    }

    public static Fragment_3 newInstance(Bundle bundle) {
        Fragment_3 fragment = new Fragment_3();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG_TAG, "Fragment3: View Created");
        TextView textView = view.findViewById(R.id.textView);
        //textView.setText(savedInstanceState.getString("Message"));
        textView.setText(this.getArguments().getString("Message"));
    }
}
