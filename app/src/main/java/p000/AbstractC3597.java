package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3597 {
    public static void m5208(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void m5209(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void m5210(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
