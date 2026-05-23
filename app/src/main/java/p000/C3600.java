package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3600 extends AbstractC1460 {

    public static boolean f11233 = true;

    public static boolean f11234 = true;

    public static boolean f11235 = true;

    public static boolean f11236 = true;

    @Override // p000.AbstractC1460
    public void mo3228(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo3228(view, i);
        } else if (f11236) {
            try {
                AbstractC3599.m5212(view, i);
            } catch (NoSuchMethodError unused) {
                f11236 = false;
            }
        }
    }

    public void mo5213(View view, int i, int i2, int i3, int i4) {
        if (f11235) {
            try {
                AbstractC3598.m5211(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f11235 = false;
            }
        }
    }

    public void mo5214(View view, Matrix matrix) {
        if (f11233) {
            try {
                AbstractC3597.m5209(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11233 = false;
            }
        }
    }

    public void mo5215(View view, Matrix matrix) {
        if (f11234) {
            try {
                AbstractC3597.m5210(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11234 = false;
            }
        }
    }
}
