package p000;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2803 {

    public int f8936;

    public int f8937;

    public boolean f8938;

    public boolean f8939;

    public boolean f8940;

    public int[] f8941;

    public final /* synthetic */ StaggeredGridLayoutManager f8942;

    public C2803(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f8942 = staggeredGridLayoutManager;
        m4781();
    }

    public final void m4781() {
        this.f8936 = -1;
        this.f8937 = -2147483648;
        this.f8938 = false;
        this.f8939 = false;
        this.f8940 = false;
        int[] iArr = this.f8941;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
