package uz.abbosbek.fragment_15_h_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.abbosbek.fragment_15_h_1.databinding.ActivityMainBinding
import uz.abbosbek.fragment_15_h_1.databinding.FragmentBlank1Binding
import uz.abbosbek.fragment_15_h_1.fragments.BlankFragment_1

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        supportFragmentManager.beginTransaction()
            .add(R.id.my_container, BlankFragment_1())
            .commit()
    }
}