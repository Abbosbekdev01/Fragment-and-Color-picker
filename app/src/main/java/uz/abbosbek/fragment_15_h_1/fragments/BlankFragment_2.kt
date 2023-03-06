package uz.abbosbek.fragment_15_h_1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.abbosbek.fragment_15_h_1.R
import uz.abbosbek.fragment_15_h_1.databinding.FragmentBlank2Binding
import uz.abbosbek.fragment_15_h_1.utils.MyColor

private const val ARG_PARAM1 = "param1"

class BlankFragment_2 : Fragment() {
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    private val binding by lazy { FragmentBlank2Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.btn1.setOnClickListener {
            MyColor.color = "#EF3B3B"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn2.setOnClickListener {
            MyColor.color = "#5DE4CC"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn3.setOnClickListener {
            MyColor.color = "#BF5FE0"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn4.setOnClickListener {
            MyColor.color = "#BFA050"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn5.setOnClickListener {
            MyColor.color = "#EAD72F"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn6.setOnClickListener {
            MyColor.color = "#2C7DB8"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn7.setOnClickListener {
            MyColor.color = "#D43294"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn8.setOnClickListener {
            MyColor.color = "#351A63"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn9.setOnClickListener {
            MyColor.color = "#78DA2B"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn10.setOnClickListener {
            MyColor.color = "#4B35CE"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn11.setOnClickListener {
            MyColor.color = "#864343"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }
        binding.btn12.setOnClickListener {
            MyColor.color = "#781189"
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
//                    R.anim.animation_right,
//                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, BlankFragment_1())
                .commit()
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            BlankFragment_2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}