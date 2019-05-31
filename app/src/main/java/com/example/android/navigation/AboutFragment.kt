/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.navigation.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    lateinit var binding: FragmentAboutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        //binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, false)
        binding = FragmentAboutBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_about, container, false)
        binding.aboutImage.setOnClickListener {
            findNavController().navigate(R.id.action_aboutFragment2_to_secondActivity)
        }


        return binding.root
    }
}
