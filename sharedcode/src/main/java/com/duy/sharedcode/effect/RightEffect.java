/*
 * Copyright (c) 2017 by Tran Le Duy
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

package com.duy.sharedcode.effect;


import android.support.annotation.NonNull;

import com.duy.sharedcode.codec.Encoder;

/**
 * Created by Duy on 13-Jul-17.
 */

class RightEffect implements Encoder {

    private String text;

    public RightEffect(String text) {
        this.text = text;
    }

    @NonNull
    @Override
    public String encode(@NonNull String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                result.append(" ");
            } else {
                result.append(text.charAt(i)).append(text);
            }
        }
        return result.toString();
    }
}
