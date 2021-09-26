package dev.luischang.s5dpafragmentsrecyclerview.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import dev.luischang.s5dpafragmentsrecyclerview.R

class RegistroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_registro, container, false)
        // Inflate the layout for this fragment
        val spnCountry: Spinner = view.findViewById(R.id.spnCountry)
        val etFullName: EditText = view.findViewById(R.id.etFullName)
        val etEmail: EditText = view.findViewById(R.id.etEmail)
        val btnSave: Button = view.findViewById(R.id.btnSave)
        val rgGender: RadioGroup = view.findViewById(R.id.rgGender)
        val chkLicense: CheckBox = view.findViewById(R.id.chkLicense)
        val chkCar: CheckBox = view.findViewById(R.id.chkCar)

        ArrayAdapter.createFromResource(requireContext(),
            R.array.country_array,
            android.R.layout.simple_spinner_item).also {
                adapter->adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spnCountry.adapter = adapter
        }

        var spnCountryValue=""
        spnCountry.onItemSelectedListener= object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                spnCountryValue = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        btnSave.setOnClickListener {

        }




        return view
    }
}