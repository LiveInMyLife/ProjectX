/*
 * Copyright (C) 2018 AlexMofer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.project.x.business.main.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import am.project.x.R;
import am.project.x.base.BaseFragment;

public class OthersFragment extends BaseFragment implements View.OnClickListener {

    public static OthersFragment newInstance() {
        return new OthersFragment();
    }

    @Override
    protected int getContentViewLayout(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        return R.layout.fragment_main_others;
    }

    @Override
    protected void initializeFragment(Activity activity, @Nullable Bundle savedInstanceState) {
        findViewById(R.id.other_btn_printer).setOnClickListener(this);
        findViewById(R.id.other_btn_encrypt).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.other_btn_printer:
                break;
            case R.id.other_btn_encrypt:
                break;
        }
    }
}
