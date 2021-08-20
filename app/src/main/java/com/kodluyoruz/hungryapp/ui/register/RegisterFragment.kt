package com.kodluyoruz.hungryapp.ui.register

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto
import com.kodluyoruz.hungryapp.databinding.FragmentRegisterBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : BaseFragment() {

    private val viewModel: RegisterViewModel by viewModels()
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.buttonRegister.setOnClickListener {
            val email = binding.textInputEditTextEmail.text.toString()
            val password = binding.textInputEditTextPassword.text.toString()
            val name = binding.textInputEditTextName.text.toString()
            val surname = binding.textInputEditTextSurname.text.toString()
            val phoneNumber = binding.textInputEditTextPhoneNumber.text.toString()

            if (viewModel.registerControl(email, password, name, surname)) {
                viewModel.register(
                    UserDto(
                        arrayListOf(),
                        email,
                        name,
                        password,
                        phoneNumber,
                        "user.png",
                        surname
                    )
                ).observe(viewLifecycleOwner, {
                    when (it.status) {
                        Resource.Status.LOADING -> {
                            binding.progressBar.visibility = View.VISIBLE
                        }
                        Resource.Status.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE
                            findNavController().popBackStack()
                            Toast.makeText(
                                context,
                                "You successfully created an account!",
                                Toast.LENGTH_LONG).show()
                        }
                        Resource.Status.ERROR -> {
                            binding.progressBar.visibility = View.GONE
                            Toast.makeText(
                                context,
                                "Network Error: ${it.message}",
                                Toast.LENGTH_LONG
                            ).show()
                            Log.v("RegisterFragment", "${it.message}")
                        }
                    }
                })
            }
        }
    }
}