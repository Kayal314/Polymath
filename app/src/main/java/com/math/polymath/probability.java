package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link probability#newInstance} factory method to
 * create an instance of this fragment.
 */
public class probability extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public probability() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment probability.
     */
    // TODO: Rename and change types and number of parameters
    public static probability newInstance(String param1, String param2) {
        probability fragment = new probability();
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
        return inflater.inflate(R.layout.fragment_probability, container, false);
    }
    @Override
    public void onResume() {
        super.onResume();
        MathView mathView = requireView().findViewById(R.id.formula_space);
        mathView.setText("If S is a set of all possible outcomes for an experiment, and A is the set of all those outcomes for which a statement holds true, the probability that the statement holds true for an arbitrary outcome that we get is defined as: $$P(\\text{favourable outcome})=\\frac{|A|}{|S|}$$ In the axiomatic approach the probability is a function $$P:Powerset(S) \\to [0,1]$$ where S is the sample space of an experiment. The function also satisfies: $$P(A) \\leq 1$$ if A is an outcome in the sample space, and $$\\sum_{k=1}^{|S|} P(A_k)=1$$ where we sum over all the probabilities that an outcome might occur. $$P(A)=\\sum P(\\phi _i),\\phi_i \\in A$$ We can treat events as sets of outcomes and thus they follow all classical set theory rules. $$P(A \\cup B)=P(A)+P(B)-P(A\\cap B)$$ $$P(A')=1-P(A)$$ where A' is the complement of set A. $$$$ Conditional Probability: Let A and B be two events such that P(A)>0. Then the probability that both A and B occur is the probability that A occurs multiplied by the probability that B occurs once A has already occurred. We denote $$P(B|A)$$ as the probability B occurs after A has already occurred. $$P(A \\cap B)=P(B|A).P(A)$$  Independent Events: Two events are said to be independent if the occurrence of one of them does not affect the occurrence of the other or $$P(B|A)=P(B)$$ then after a substitution we get: $$ P(A \\cap B)=P(B).P(A)$$ Total probability theorem: Let an event A occur with one of the n mutually exclusive and exhaustive events then: $$A=(A \\cap B_1) \\cup (A \\cap B_2)... $$ $$\\cup (A \\cap B_n)$$ $$P(A)=P(A \\cap B_1)+ P(A \\cap B_2)+…$$ $$P(A \\cap B_n)$$ (All the events are mutually exclusive.) $$P(A)=\\sum_{k=1}^{n} P(A| B_k).P(B_k)$$ Binomial probability distribution: The binomial distribution with parameters n and p is the discrete probability distribution of the number of successes in a sequence of n independent experiments, each asking a yes–no question, and each with its own Boolean-valued outcome: success (with probability p) or failure (with probability q = 1 − p). A single success/failure experiment is also called a Bernoulli trial or Bernoulli experiment, and the probability that the event will happen exactly x times in n trials is given by the probability function: $$P(X=x)=C(n,x).p^x.q^{n-x}$$ Bayes Theorem: If an event A can occur only with one of the n mutually exhaustive and exclusive events and each of their conditional probabilities are known then, $$P(B_i | A)=\\frac{P(B_i).P(A | B_i)}{\\sum_{i=1}^{n} P(B_i).P(A | B_i)}$$ $$...$$");
    }
}