package sala.xevi.fragmentsnavigationexample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import sala.xevi.fragmentsnavigationexample.R
import sala.xevi.fragmentsnavigationexample.databinding.Fragment2Binding


class Fragment2 : Fragment(R.layout.fragment2)  {
    private var _binding: Fragment2Binding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Binding.inflate(inflater, container, false)

        //When back button is pressed returns to fragment 1
        //Activity controls the back button. We've to ask for back button event at the activity with onbackPressedDispatcher
        //https://stackoverflow.com/questions/51043428/handling-back-button-in-android-navigation-component
        requireActivity().onBackPressedDispatcher
            .addCallback(viewLifecycleOwner, object: OnBackPressedCallback(true){
                override fun handleOnBackPressed() {
                    findNavController().navigate(R.id.fragment1)
                }
        })


        return binding.root

    }


}

