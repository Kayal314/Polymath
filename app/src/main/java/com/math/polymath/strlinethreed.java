package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link strlinethreed#newInstance} factory method to
 * create an instance of this fragment.
 */
public class strlinethreed extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public strlinethreed() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment strlinethreed.
     */
    // TODO: Rename and change types and number of parameters
    public static strlinethreed newInstance(String param1, String param2) {
        strlinethreed fragment = new strlinethreed();
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
        return inflater.inflate(R.layout.fragment_strlinethreed, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView = requireView().findViewById(R.id.formula_space);
        mathView.setText("The vector equation of a line passing through a point having position vector \\(\\vec{a}\\) and parallel to the vector \\(\\vec{b}\\) where \\(\\lambda\\) is a real valued scalar parameter is given by: $$\\vec{r}=\\vec{a}+\\lambda\\vec{b}$$ The Cartesian form of a line passing through the point \\((x_1,y_1,z_1)\\) having direction ratios a, b, c is given by: $$\\frac{x-x_1}{a}=\\frac{y-y_1}{b}=\\frac{z-z_1}{c}$$ The vector equation of a line passing through two points having position vectors \\(\\vec{a}\\) and \\(\\vec{b}\\) is given by: $$\\vec{r}=\\vec{a}+\\lambda(\\vec{b}-\\vec{a})$$ The Cartesian form of a line passing through points \\((x_1,y_1,z_1)\\) and \\((x_2,y_2,z_2)\\) is given by: $$\\frac{x-x_1}{x_2-x_1}=\\frac{y-y_1}{y_2-y_1}=\\frac{z-z_1}{z_2-z_1}$$ Three points \\((x_1,y_1,z_1)\\), \\((x_2,y_2,z_2)\\), and \\((x_3,y_3,z_3)\\) are collinear if: $$\\frac{x_2-x_1}{x_3-x_2}=\\frac{y_2-y_1}{y_3-y_2}=\\frac{z_2-z_1}{z_3-z_2}$$ Consider two lines $$\\vec{r}=\\vec{a_1}+\\lambda_1\\vec{b_1}$$ $$\\vec{r}=\\vec{a_2}+\\lambda_2\\vec{b_2}$$ If \\(\\theta\\) is the angle between the two lines then: $$\\cos{\\theta}=\\frac{\\vec{b_1}\\cdot\\vec{b_2}}{|\\vec{b_1}||\\vec{b_2}|}$$ Condition of perpendicularity: $$\\vec{b_1}\\cdot\\vec{b_2}=0$$ Condition for parallelism: $$\\vec{b_1}=k\\vec{b_2}$$ Consider two lines having direction cosines $$DC_1:\\text{  }l_1,m_1,n_1$$ and $$DC_2:\\text{  }l_2,m_2,n_2$$ The angle between them is given by: $$\\cos{\\theta}=l_1l_2+m_1m_2+n_1n_2$$ Consider two lines having direction ratios $$DR_1:\\text{  }a_1,b_1,c_1$$ and $$DR_2:\\text{  }a_2,b_2,c_2$$ The angle between them is given by: $$\\cos{\\theta}=\\frac{a_1a_2+b_1b_2+c_1c_2}{\\sqrt{a_1^2+b_1^2+c_1^2}\\sqrt{a_2^2+b_2^2+c_2^2}}$$ To find perpendicular distance of a line from a point: Consider a point P with position vector $$OP=\\vec{p}$$ and a line $$\\vec{r}=\\vec{a}+\\lambda\\vec{b}$$ Consider a point on the line L such that \\(PL\\) is perpendicular to the line. Let the position vector of L be $$\\overrightarrow{OL}=\\vec{a}+t\\vec{b}$$ By triangle law of addition of vectors: $$\\overrightarrow{PL}+\\overrightarrow{OP}=\\overrightarrow{OL}$$ Therefore, $$\\overrightarrow{PL}=\\vec{a}+t\\vec{b}-\\vec{p}$$ Since PL is perpendicular to the line, $$(\\vec{a}+t\\vec{b}-\\vec{p})\\cdot\\vec{b}=0$$ Therefore, $$(\\vec{a}-\\vec{p})\\cdot\\vec{b}=-t|\\vec{b}|^2$$ So, $$t=-\\frac{(\\vec{a}-\\vec{p})\\cdot\\vec{b}}{|\\vec{b}|^2}$$ Hence, substituting the value of t, we get $$\\overrightarrow{OL}=\\vec{a}-\\left(\\frac{(\\vec{a}-\\vec{p})\\cdot\\vec{b}}{|\\vec{b}|^2}\\right)\\cdot\\vec{b}$$ Therefore, $$\\overrightarrow{PL}=\\vec{a}-\\left(\\frac{(\\vec{a}-\\vec{p})\\cdot\\vec{b}}{|\\vec{b}|^2}\\right)\\cdot\\vec{b}-\\vec{p}$$ Hence, the perpendicular distance is: $$d=|\\overrightarrow{PL}|$$ To find the distance between two parallel lines $$l_1:\\text{  }\\vec{r}=\\vec{a_1}+\\lambda_1\\vec{b}$$ $$l_2:\\text{  }\\vec{r}=\\vec{a_2}+\\lambda_2\\vec{b}$$ Let \\(\\vec{a_1}\\) be the position vector of point X and \\(\\vec{a_2}\\) be the position vector of point Y. Let M be a point on \\(l_1\\) such that $$YM\\perp l_1$$ Let angle YXM be \\(\\theta\\). In triangle XYM, $$\\sin{\\theta}=\\frac{YM}{XY}$$ Hence, $$YM=|\\overrightarrow{XY}|\\sin{\\theta}$$ Now, $$|\\overrightarrow{XY}\\times\\vec{b}|=|\\overrightarrow{XY}||\\vec{b}|\\sin{\\theta}$$Therefore, $$|\\overrightarrow{XY}\\times\\vec{b}|=YM|\\vec{b}|$$ So $$YM=\\frac{|\\overrightarrow{XY}\\times\\vec{b}|}{|\\vec{b}|}$$ Hence, $$d=\\frac{|(\\vec{a_2}-\\vec{a_1})\\times\\vec{b}|}{|\\vec{b}|}$$ To find the shortest distance between two skew lines $$l_1:\\text{  }\\vec{r}=\\vec{a_1}+\\lambda_1\\vec{b_1}$$ $$l_2:\\text{  }\\vec{r}=\\vec{a_2}+\\lambda_2\\vec{b_2}$$ Let L be a point on \\(l_1\\) and M be a point on \\(l_2\\) such that LM is the shortest distance between the two lines. $$\\overrightarrow{LM}\\perp l_1\\text{ and }l_2$$ But, $$\\vec{b_1}\\times\\vec{b_2}\\perp l_1\\text{ and }l_2$$ So $$\\overrightarrow{LM}\\| \\vec{b_1}\\times\\vec{b_2}$$ Let $$\\hat{n}=\\pm\\frac{\\vec{b_1}\\times\\vec{b_2}}{|\\vec{b_1}\\times\\vec{b_2} |}$$ Since \\(\\overrightarrow{LM}\\) is the projection of \\(\\overrightarrow{XY}\\) on \\(\\overrightarrow{LM}\\) So, $$\\overrightarrow{LM}=(\\vec{a_2}-\\vec{a_2})\\cdot\\hat{n}$$ So the shortest distance is given by: $$d=\\frac{|(\\vec{a_1}-\\vec{a_2})\\cdot(\\vec{b_2}\\times\\vec{b_1})|}{|\\vec{b_2}\\times\\vec{b_1}|}$$ $$...$$");
    }
}