package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᤞᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3660 extends AbstractC1586 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static boolean f11382 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static boolean f11383 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static boolean f11384 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static boolean f11385 = true;

    @Override // p000.AbstractC1586
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public void mo3497(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo3497(view, i);
        } else if (f11385) {
            try {
                AbstractC3659.m5218(view, i);
            } catch (NoSuchMethodError unused) {
                f11385 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public void mo5219(View view, int i, int i2, int i3, int i4) {
        if (f11384) {
            try {
                AbstractC3658.m5217(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f11384 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public void mo5220(View view, Matrix matrix) {
        if (f11382) {
            try {
                AbstractC3657.m5215(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11382 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public void mo5221(View view, Matrix matrix) {
        if (f11383) {
            try {
                AbstractC3657.m5216(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11383 = false;
            }
        }
    }
}
