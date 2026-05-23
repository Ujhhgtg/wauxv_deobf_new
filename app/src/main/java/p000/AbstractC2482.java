package p000;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2482 {

    public final C2483 f7926 = new C2483();

    public boolean f7927 = false;

    public final int f7928 = 1;

    public abstract int mo2040();

    public long mo2352(int i) {
        return -1L;
    }

    public int mo2353(int i) {
        return 0;
    }

    public final void m4441() {
        this.f7926.m4443();
    }

    public abstract void mo2041(AbstractC2508 abstractC2508, int i);

    public void mo2355(AbstractC2508 abstractC2508, int i, List list) {
        mo2041(abstractC2508, i);
    }

    public abstract AbstractC2508 mo2042(ViewGroup viewGroup, int i);

    public void mo2356() {
    }

    public void mo2354(RecyclerView recyclerView) {
    }

    public void mo2357(AbstractC2508 abstractC2508) {
    }
}
