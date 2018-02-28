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

package org.khanacademy.cs;

import org.teavm.jso.JSBody;

public final class Drawing {
    private Drawing() {
    }

    @JSBody(
        params = { "message" },
        script = "console.log(message)"
    )
    public static native void log(String message);

    @JSBody(
        params = { "x", "y", "w", "h" },
        script = "window.processing.rect(x, y, w, h)"
    )
    public static native void rect(int x, int y, int w, int h);

    @JSBody(
        params = { "x", "y", "w", "h" },
        script = "window.processing.ellipse(x, y, w, h)"
    )
    public static native void ellipse(int x, int y, int w, int h);

    @JSBody(
        params = { "x1", "y1", "x2", "y2", "x3", "y3" },
        script = "window.processing.triangle(x1, y1, x2, y2, x3, y3)"
    )
    public static native void triangle(
        int x1, int y1,
        int x2, int y2,
        int x3, int y3);

    @JSBody(
        params = { "x1", "y1", "x2", "y2" },
        script = "window.processing.line(x1, y1, x2, y2)"
    )
    public static native void line(int x1, int y1, int x2, int y2);

    @JSBody(
        params = { "x", "y" },
        script = "window.processing.point(x, y)"
    )
    public static native void point(int x, int y);

    @JSBody(
        params = { "x", "y", "w", "h", "start", "stop" },
        script = "window.processing.arc(x, y, w, h, start, stop)"
    )
    public static native void arc(int x, int y, int w, int h,
        int start, int stop);

    @JSBody(
        params = { "x1", "y1", "cx1", "cy1", "cx2", "cy2", "x2", "y2" },
        script = "window.processing.bezier(x1, y1, cx1, cy1, cx2, cy2, x2, y2)"
    )
    public static native void bezier(
        int x1, int y1,
        int cx1, int cy1,
        int cx2, int cy2,
        int x2, int y2);

    @JSBody(
        params = { "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4" },
        script = "window.processing.quad(x1, y1, x2, y2, x3, y3, x4, y4)"
    )
    public static native void quad(
        int x1, int y1,
        int x2, int y2,
        int x3, int y3,
        int x4, int y4);

    @JSBody(
        params = { "image", "x", "y", "w", "h" },
        script = "window.processing.image(image, x, y, w, h)"
    )
    public static native void image(String image, int x, int y, int w, int h);



    @JSBody(
        params = { "r", "g", "b" },
        script = "window.processing.background(r, g, b)"
    )
    public static native void background(int r, int g, int b);

    @JSBody(
        params = { "r", "g", "b" },
        script = "window.processing.fill(r, g, b)"
    )
    public static native void fill(int r, int g, int b);

    @JSBody(
        script = "window.processing.noFill()"
    )
    public static native void noFill();

    @JSBody(
        params = { "r", "g", "b" },
        script = "window.processing.stroke(r, g, b)"
    )
    public static native void stroke(int r, int g, int b);

    @JSBody(
        params = { "thickness" },
        script = "window.processing.strokeWeight(thickness)"
    )
    public static native void stroke(int thickness);

    @JSBody(
        script = "window.processing.noStroke()"
    )
    public static native void noStroke();

    @JSBody(
        params = { "r", "g", "b" },
        script = "window.processing.color(r, g, b)"
    )
    public static native void color(int r, int g, int b);

    @JSBody(
        params = { "c1", "c2", "mode" },
        script = "window.processing.blendColor(c1, c2, mode)"
    )
    public static native void blendColor(int c1, int c2, int mode);

    @JSBody(
        params = { "c1", "c2", "amount" },
        script = "window.processing.lerpColor(c1, c2, amount)"
    )
    public static native void lerpColor(int c1, int c2, int amount);



    @JSBody(
        params = { "text", "x", "y" },
        script = "window.processing.text(text, x, y)"
    )
    public static native void text(String text, int x, int y);

    @JSBody(
        params = { "font", "size" },
        script = "window.processing.textFont(font, size)"
    )
    public static native void textFont(String font, int size);

    @JSBody(
        params = { "size" },
        script = "window.processing.textSize(size)"
    )
    public static native void textSize(int size);


    @JSBody(
        params = { "angle" },
        script = "window.processing.rotate(angle)"
    )
    public static native void rotate(int angle);

    @JSBody(
        params = { "amount" },
        script = "window.processing.scale(amount)"
    )
    public static native void scale(int amount);

    @JSBody(
        params = { "x", "y" },
        script = "window.processing.translate(x, y)"
    )
    public static native void translate(int x, int y);
}
