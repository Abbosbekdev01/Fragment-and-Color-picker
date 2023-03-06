package uz.abbosbek.fragment_15_h_1.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.abbosbek.fragment_15_h_1.R
import uz.abbosbek.fragment_15_h_1.databinding.FragmentBlank1Binding
import uz.abbosbek.fragment_15_h_1.utils.MyColor

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragment_1 : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private val binding by lazy { FragmentBlank1Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.imageColor.setBackgroundColor(Color.parseColor(MyColor.color))

        binding.btnNext.setOnClickListener {

            val blankfragment2 = BlankFragment_2.newInstance("")

            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
                    R.anim.animation_right,
                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_2())
                .addToBackStack(binding.toString())
                .commit()
        }
        return binding.root
    }

    companion object {
       @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment_1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}