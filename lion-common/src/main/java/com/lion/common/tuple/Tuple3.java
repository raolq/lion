/**
 *   Copyright 2019 Yanzheng (https://github.com/micyo202). All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.lion.common.tuple;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Tuple3
 * 自定义元组
 *
 * @author Yanzheng (https://github.com/micyo202)
 * @date 2020/01/15
 */
@ToString
@AllArgsConstructor
public class Tuple3<T1, T2, T3> implements Serializable {

    final T1 _1;
    final T2 _2;
    final T3 _3;

    public static <T1, T2, T3> Tuple3 apply(T1 _1, T2 _2, T3 _3) {
        return new Tuple3(_1, _2, _3);
    }

}
