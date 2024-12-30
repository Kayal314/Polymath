package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link combinations#newInstance} factory method to
 * create an instance of this fragment.
 */
public class combinations extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public combinations() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment combinations.
     */
    // TODO: Rename and change types and number of parameters
    public static combinations newInstance(String param1, String param2) {
        combinations fragment = new combinations();
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
        return inflater.inflate(R.layout.fragment_combinations, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("Fundamental Principles of Counting: If an event A can occur in m ways and another event B can occur in n ways then: (a) Simultaneous occurence of both events in a definite order can occur in many ways. This holds true for any number of events by induction. (b) Exactly one event occurring can be done in m + n ways. $$$$ Permutations: The total number of arrangements of 'r' arbitrarily chosen objects from a total of 'n' objects equipped with a well-defined ordering gives us the permutations of r objects chosen from a set of n objects. It is denoted by P(n,r). $$P(n,r)=\\frac{n!}{(n-r)}!$$ Combinations: The total number of ways of choosing 'r' objects from a set of 'n' objects. Denoted by C(n,r). $$C(n,r)=\\frac{n!}{r!.(n-r)}!$$ Note: $$P(n,r)=r!C(n,r)$$ $$0!=1$$ Some Useful Properties: The number of permutations of n different objects taken r at a time,when p particular objects are always to be included is $$r!.P(n-p,r-p).(p \\leq r \\leq n)$$ The number of permutations of n different objects taken r at a time with repetition allowed is \\(n^r\\) $$ C(n,r)=C(n,n-r)$$ $$C(n,0)=C(n,n)=1$$ $$ C(n,r)+C(n,r-1)=C(n+1,r)$$ $$ \\sum_{r=0}^{n} C(n,r)=2^n$$ $$ C(n,r)= C(n,j)$$ $$ \\implies (r=j)\\vee(r+j=n)$$For a given value of n, if n is even: $$max(C(n,r))= C(n,n/2) $$ If n is odd: $$max(C(n,r))=C(n,(n-1)/2)$$ Number of combinations of choose r objects from n objects when p particular things always have to be excluded: $$C(n-p,r)$$ Number of combinations of r objects from n objects when p particular objects always have to be excluded and q objects always have to be included: $$C(n-p-q,r-q)$$ Formation of Groups: The number of ways in which  $$k_1+k_2+k_3...k_n$$  different objects where each \\(k_j\\)represents a unique type of object can be divided into two groups such that one group contains m objects and the other contains n objects is: $$\\frac{(\\sum_{j=1}^{n} k_j)!}{\\prod_{j=1}^{n} (k_j!)}$$ In general, the number of ways of dividing n distinct objects into l groups of p objects each and m groups containing q objects each is equal to $$\\frac{n!(l+m)!}{(p!)^l(q!)^ml!m!}$$ where $$lp+qm=n$$ Inclusion and Exclusion: If A and B are sets and n(A) denotes the cardinality of A, $$n(A \\cup B)=n(A)+n(B)-n(A \\cap B)$$ In general, $$ n(A_1 \\cup A_2 \\cup A_3...A_n)$$ $$ =\\sum_{i=1}^{n}(A_i)-\\sum_{i \\neq j} n(A_i \\cap A_j)$$ $$...+(-1)^n \\sum n(A_1 \\cap A_2 \\cap A_3...A_n)$$ Circular Permutations: If there are n different objects seated around a circular table the total number of circular arrangements is $$(n-1)!$$ If clockwise and anti-clockwise circular permutations are considered same then no. of circular arrangements $$\\frac{(n-1)!}{2}$$ The number of circular permutations of n different things taken r at a time with clockwise and anticlockwise arrangements distinguished is $$ P(n,r)/r$$ Given n different objects, number of ways selecting atleast one of them is $$\\sum_{k=1}^{n} C(n,k)=2^n-1$$ The total number of ways in which it is possible to make a selection by taking some or all of p + q + r...,where p are alike of one kind, q are alike of one kind, etc. is given by: $$(p+1)(q+1)(r+1)...-1$$ The total number of ways selecting one or more things from p identical things of one kind, q identical things of second kind, r identical things of third kind is  $$(p+1)(q+1)(r+1).2^n-1$$ Distribution of distinct objects: Number of ways in which n distinct objects can be distributed to p persons if there are no restrictions: $$\\text{#ways}=p^n$$ Suppose there are n objects and n bins and a bijection exists between them which gives us the correct bin for each object then the number of distributions such that none of the objects are in their correct bins is: $$n! \\left( 1-\\frac{1}{1!}+\\frac{1}{2!}...+\\frac{(-1)^n}{n!} \\right)$$ $$...$$");
    }
}