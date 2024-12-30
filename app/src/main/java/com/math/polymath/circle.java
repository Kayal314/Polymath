package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link circle#newInstance} factory method to
 * create an instance of this fragment.
 */
public class circle extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public circle() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment circle.
     */
    // TODO: Rename and change types and number of parameters
    public static circle newInstance(String param1, String param2) {
        circle fragment = new circle();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_circle, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("The general equation of a circle, having radius r unit(s) with its center at the origin, is given by: $$x^2+y^2=r^2$$ The parametric form of the above circle is given by: $$x=r\\cos{\\theta},y=r\\sin{\\theta}$$ The equation of a circle having center at (m, n) and radius r unit(s) is given by: $$(x-m)^2+(y-n)^2=r^2$$ The general form of the equation of a circle with center at C is: $$x^2+y^2+2gx+2fy+c=0$$ where the center and radius are given by $$C=(-g,-f)$$ $$r=\\sqrt{g^2+f^2-c}$$ The equation of the circle drawn on the line segment joining the points \\((x_1,y_1)\\) and \\((x_2,y_2)\\) as diameter is given by:  $$(x-x_1)(x-x_2)+(y-y_1)(y-y_2)$$ $$=0$$ Consider the two intersecting circles given below: $$x^2+y^2+2g_1x+2f_1y+c_1=0$$ $$x^2+y^2+2g_2x+2f_2y+c_2=0$$ The equation of the common chord of the circles is given by: $$2(g_1-g_2)x+2(f_1-f_2)y+c_1-c_2$$ $$=0$$ The equation of any circle through the points of intersection of the circles is given by: $$x^2+y^2+2g_1x+2f_1y+c_1$$ $$+k(x^2+y^2+2g_2x+2f_2y+c_2)=0$$ $$k\\neq -1,0,-\\infty$$ Consider a circle defined as $$x^2+y^2+2gx+2fy+c=0$$ The equation of the circle concentric to the above defined circle is given as $$x^2+y^2+2g_1x+2f_1y+c’=0$$ Consider the same circle again. A point \\((m, n)\\) lies on the circle if $$m^2+n^2+2gm+2fn+c=0$$ outside the circle if $$m^2+n^2+2gm+2fn+c>0$$ and inside the circle if $$m^2+n^2+2gm+2fn+c<0$$ Consider a circle defined as: $$x^2+y^2=r^2$$ The tangent to the circle at the point (a, b) is given as: $$xa+yb=r^2$$ The tangent to the circle, having a slope m, is given by: $$y=mx\\pm r\\sqrt{1+m^2}$$ $$...$$");
    }
}