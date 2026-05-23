package p000;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3591 {

    public static Integer f11224;

    public final ImageView f11225;

    public final ArrayList f11226 = new ArrayList();

    public ViewTreeObserverOnPreDrawListenerC0865 f11227;

    public C3591(ImageView imageView) {
        this.f11225 = imageView;
    }

    public final int m5203(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        ImageView imageView = this.f11225;
        if (imageView.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (f11224 == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC1460.m3210(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f11224 = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f11224.intValue();
    }
}
