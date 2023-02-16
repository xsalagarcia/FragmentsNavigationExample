package sala.xevi.fragmentsnavigationexample.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import sala.xevi.fragmentsnavigationexample.R
import sala.xevi.fragmentsnavigationexample.databinding.Fragment1Binding

class Fragment1 : Fragment(R.layout.fragment1) {
    private var _binding: Fragment1Binding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*binding.goToFragment2Btn.setOnClickListener { view -> view.findNavController()
            .navigate(R.id.fragment2)}*/
        binding.goToFragment2Btn.setOnClickListener{view -> view.findNavController()
            .navigate(
                Fragment1Directions
                    .actionFragment1ToFragment2()
                    .setValueToSend(binding.value.text.toString()),
            )}

        binding.goToFragment3Btn.setOnClickListener { _ -> findNavController()
            .navigate(R.id.fragment3)}

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}