/*
 *  Copyright 2017 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.teavm.javac.protocol;

import org.teavm.jso.JSBody;

public final class Drawing {
    private Drawing() {
    }

    @JSBody(params = { "message" }, script = "console.log(message)")
    public static native void log(String message);

    @JSBody(params = { "x", "y", "w", "h" }, script = "window.processing.rect(x, y, w, h)")
    public static native void rect(int x, int y, int w, int h);

}
