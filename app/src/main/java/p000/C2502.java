package p000;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2502 {

    public int f7977;

    public int f7978;

    public int f7979;

    public int f7980;

    public Interpolator f7981;

    public boolean f7982;

    public int f7983;

    public final void m4503(RecyclerView recyclerView) {
        int i = this.f7980;
        if (i >= 0) {
            this.f7980 = -1;
            recyclerView.m236(i);
            this.f7982 = false;
            return;
        }
        if (!this.f7982) {
            this.f7983 = 0;
            return;
        }
        Interpolator interpolator = this.f7981;
        if (interpolator != null && this.f7979 < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f7979;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f408.m4508(this.f7977, this.f7978, i2, interpolator);
        int i3 = this.f7983 + 1;
        this.f7983 = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f7982 = false;
    }
}
