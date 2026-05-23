package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.umeng.analytics.pro.bc;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2508 {

    public static final List f8005 = Collections.EMPTY_LIST;

    public final View f8006;

    public WeakReference f8007;

    public int f8015;

    public RecyclerView f8023;

    public AbstractC2482 f8024;

    public int f8008 = -1;

    public int f8009 = -1;

    public long f8010 = -1;

    public int f8011 = -1;

    public int f8012 = -1;

    public AbstractC2508 f8013 = null;

    public AbstractC2508 f8014 = null;

    public ArrayList f8016 = null;

    public List f8017 = null;

    public int f8018 = 0;

    public C2498 f8019 = null;

    public boolean f8020 = false;

    public int f8021 = 0;

    public int f8022 = -1;

    public AbstractC2508(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f8006 = view;
    }

    public final String toString() {
        StringBuilder sbM2788 = AbstractC1194.m2788(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM2788.append(Integer.toHexString(hashCode()));
        sbM2788.append(" position=");
        sbM2788.append(this.f8008);
        sbM2788.append(" id=");
        sbM2788.append(this.f8010);
        sbM2788.append(", oldPos=");
        sbM2788.append(this.f8009);
        sbM2788.append(", pLpos:");
        sbM2788.append(this.f8012);
        StringBuilder sb = new StringBuilder(sbM2788.toString());
        if (m4519()) {
            sb.append(" scrap ");
            sb.append(this.f8020 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m4516()) {
            sb.append(" invalid");
        }
        if (!m4515()) {
            sb.append(" unbound");
        }
        if ((this.f8015 & 2) != 0) {
            sb.append(" update");
        }
        if (m4518()) {
            sb.append(" removed");
        }
        if (m4525()) {
            sb.append(" ignored");
        }
        if (m4520()) {
            sb.append(" tmpDetached");
        }
        if (!m4517()) {
            sb.append(" not recyclable(" + this.f8018 + ")");
        }
        if ((this.f8015 & 512) != 0 || m4516()) {
            sb.append(" undefined adapter position");
        }
        if (this.f8006.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void m4509(int i) {
        this.f8015 = i | this.f8015;
    }

    public final int m4510() {
        RecyclerView recyclerView = this.f8023;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m230(this);
    }

    public final int m4511() {
        RecyclerView recyclerView;
        AbstractC2482 adapter;
        int iM230;
        if (this.f8024 == null || (recyclerView = this.f8023) == null || (adapter = recyclerView.getAdapter()) == null || (iM230 = this.f8023.m230(this)) == -1 || this.f8024 != adapter) {
            return -1;
        }
        return iM230;
    }

    public final int m4512() {
        int i = this.f8012;
        return i == -1 ? this.f8008 : i;
    }

    public final List m4513() {
        ArrayList arrayList;
        return ((this.f8015 & 1024) != 0 || (arrayList = this.f8016) == null || arrayList.size() == 0) ? f8005 : this.f8017;
    }

    public final boolean m4514() {
        View view = this.f8006;
        return (view.getParent() == null || view.getParent() == this.f8023) ? false : true;
    }

    public final boolean m4515() {
        return (this.f8015 & 1) != 0;
    }

    public final boolean m4516() {
        return (this.f8015 & 4) != 0;
    }

    public final boolean m4517() {
        if ((this.f8015 & 16) != 0) {
            return false;
        }
        Field field = AbstractC3578.f11184;
        return !this.f8006.hasTransientState();
    }

    public final boolean m4518() {
        return (this.f8015 & 8) != 0;
    }

    public final boolean m4519() {
        return this.f8019 != null;
    }

    public final boolean m4520() {
        return (this.f8015 & 256) != 0;
    }

    public final boolean m4521() {
        return (this.f8015 & 2) != 0;
    }

    public final void m4522(int i, boolean z) {
        if (this.f8009 == -1) {
            this.f8009 = this.f8008;
        }
        if (this.f8012 == -1) {
            this.f8012 = this.f8008;
        }
        if (z) {
            this.f8012 += i;
        }
        this.f8008 += i;
        View view = this.f8006;
        if (view.getLayoutParams() != null) {
            ((C2492) view.getLayoutParams()).f7958 = true;
        }
    }

    public final void m4523() {
        if (RecyclerView.f347 && m4520()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f8015 = 0;
        this.f8008 = -1;
        this.f8009 = -1;
        this.f8010 = -1L;
        this.f8012 = -1;
        this.f8018 = 0;
        this.f8013 = null;
        this.f8014 = null;
        ArrayList arrayList = this.f8016;
        if (arrayList != null) {
            arrayList.clear();
        }
        0 &= -1025;
        this.f8021 = 0;
        this.f8022 = -1;
        RecyclerView.m201(this);
    }

    public final void m4524(boolean z) {
        int i = this.f8018;
        int i2 = z ? i - 1 : i + 1;
        this.f8018 = i2;
        if (i2 < 0) {
            this.f8018 = 0;
            if (RecyclerView.f347) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.f8015 |= 16;
        } else if (z && i2 == 0) {
            this.f8015 &= -17;
        }
        if (RecyclerView.f348) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean m4525() {
        return (this.f8015 & 128) != 0;
    }

    public final boolean m4526() {
        return (this.f8015 & 32) != 0;
    }
}
