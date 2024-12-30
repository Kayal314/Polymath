package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link str_line#newInstance} factory method to
 * create an instance of this fragment.
 */
public class str_line extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public str_line() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment str_line.
     */
    // TODO: Rename and change types and number of parameters
    public static str_line newInstance(String param1, String param2) {
        str_line fragment = new str_line();
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
        return inflater.inflate(R.layout.fragment_str_line, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("The equation of a line having slope m and y-intercept c (slope-intercept form) is given by: $$y=mx+c$$ The equation of a line which passes through the point (a, b) and has slope m (point-slope form) is given by: $$y-b=m(x-a)$$ The equation of the line in symmetrical form (r is the distance between the point (x, y) and (a, b)) is $$\\frac{x-a}{\\cos{\\theta}}=\\frac{y-b}{\\sin{\\theta}}=r$$ The equation of the line passing through \\((x_1,y_1)\\) and \\((x_2,y_2)\\) (two-point form)is given by: $$\\frac{y-y_1}{x-x_1}=\\frac{y_1-y_2}{x_1-x_2}$$ The equation of a line having an x-intercept a and y-intercept b (intercept form) is given by $$\\frac{x}{a}+\\frac{y}{b}=1$$ The equation of a line where p is the length of the perpendicular drawn from the origin upon the line and \\(\\alpha\\) is the angle made by it with the positive direction of the X-axis (normal form) is given by: $$x\\cos{\\alpha}+y\\sin{\\alpha}=p$$ The general form of a straight line is given by: $$ax+by+c=0$$ Slope of the above line: $$m=-\\frac{a}{b}$$ y-intercept of the given line: $$y_i=-\\frac{c}{b}$$ x-intercept of the given line: $$x_i=-\\frac{c}{a}$$ The length of the perpendicular drawn from the origin upon the line is given as $$p=\\frac{c}{\\sqrt{a^2+b^2}}$$ If \\(\\alpha\\) is the angle made by it with the positive direction of the X-axis then: $$\\cos{\\alpha}=-\\frac{a}{\\sqrt{a^2+b^2}}$$ $$\\sin{\\alpha}=-\\frac{b}{\\sqrt{a^2+b^2}}$$ Consider two straight lines $$a_1x+b_1y+c_1=0$$ $$a_2x+b_2y+c_2=0$$ Their intersection point is given by: $$(\\frac{b_1c_2-b_2c_1}{a_1b_2-a_2b_1},\\frac{a_2c_1-a_1c_2}{a_1b_2-a_2b_1})$$ where $$a_1b_2-a_2b_1\\neq0$$ The equation of the line passing through the point of intersection of the lines defined above is given by: $$a_1x+b_1y+c_1$$ $$+k(a_2x+b_2y+c_2)=0$$ $$k\\neq 0\\text{ or}\\pm\\infty$$Consider another line $$ a_3x+b_3y+c_3=0$$ These three lines will be concurrent if and only if $$a_3(b_1c_2-b_2c_1)+b_3(a_2c_1-a_1c_2)$$ $$+c_3(a_1b_2-a_2b_1)=0$$ Again consider the two straight lines $$a_1x+b_1y+c_1=0$$ $$a_2x+b_2y+c_2=0$$ The angle between them is given by $$\\theta=\\tan^{-1}{(\\pm\\frac{a_2b_1-a_1b_2}{a_1a_2+b_1b_2})}$$ If the slopes of the first and second line are \\(m_1\\) and \\(m_2\\) respectively, then: $$\\theta=\\tan^{-1}{(\\pm\\frac{m_1-m_2}{1+m_1m_2})}$$ Let k be an arbitrary constant. If the equation of a line is $$ax+by+c=0$$ The equation of the line parallel to it is: $$ax+by+k=0$$ The equation of the line perpendicular to it is: $$bx-ay+k=0$$ The perpendicular distance of a point \\((x_1,y_1)\\) from the line ax + by + c = 0 is given by: $$|\\frac{ax_1+by_1+c}{\\sqrt{a^2+b^2}}|$$ Let \\(ax+by+c=0\\) and \\(ax+by+c’=0\\) be two parallel lines. The distance between them is given by: $$|\\frac{c’-c}{\\sqrt{a^2+b^2}}|$$ $$...$$");
    }
}