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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲁᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2563 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final List f8156 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final View f8157;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public WeakReference f8158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f8166;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public RecyclerView f8174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public AbstractC2537 f8175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f8159 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f8160 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long f8161 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f8162 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f8163 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public AbstractC2563 f8164 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public AbstractC2563 f8165 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ArrayList f8167 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public List f8168 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f8169 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C2553 f8170 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f8171 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f8172 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f8173 = -1;

    public AbstractC2563(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f8157 = view;
    }

    public final String toString() {
        StringBuilder sbM2803 = AbstractC1095.m2803(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM2803.append(Integer.toHexString(hashCode()));
        sbM2803.append(" position=");
        sbM2803.append(this.f8159);
        sbM2803.append(" id=");
        sbM2803.append(this.f8161);
        sbM2803.append(", oldPos=");
        sbM2803.append(this.f8160);
        sbM2803.append(", pLpos:");
        sbM2803.append(this.f8163);
        StringBuilder sb = new StringBuilder(sbM2803.toString());
        if (m4541()) {
            sb.append(" scrap ");
            sb.append(this.f8171 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m4538()) {
            sb.append(" invalid");
        }
        if (!m4537()) {
            sb.append(" unbound");
        }
        if ((this.f8166 & 2) != 0) {
            sb.append(" update");
        }
        if (m4540()) {
            sb.append(" removed");
        }
        if (m4547()) {
            sb.append(" ignored");
        }
        if (m4542()) {
            sb.append(" tmpDetached");
        }
        if (!m4539()) {
            sb.append(" not recyclable(" + this.f8169 + ")");
        }
        if ((this.f8166 & 512) != 0 || m4538()) {
            sb.append(" undefined adapter position");
        }
        if (this.f8157.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4531(int i) {
        this.f8166 = i | this.f8166;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4532() {
        RecyclerView recyclerView = this.f8174;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m230(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m4533() {
        RecyclerView recyclerView;
        AbstractC2537 adapter;
        int iM230;
        if (this.f8175 == null || (recyclerView = this.f8174) == null || (adapter = recyclerView.getAdapter()) == null || (iM230 = this.f8174.m230(this)) == -1 || this.f8175 != adapter) {
            return -1;
        }
        return iM230;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m4534() {
        int i = this.f8163;
        return i == -1 ? this.f8159 : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List m4535() {
        ArrayList arrayList;
        return ((this.f8166 & 1024) != 0 || (arrayList = this.f8167) == null || arrayList.size() == 0) ? f8156 : this.f8168;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m4536() {
        View view = this.f8157;
        return (view.getParent() == null || view.getParent() == this.f8174) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m4537() {
        return (this.f8166 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m4538() {
        return (this.f8166 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m4539() {
        if ((this.f8166 & 16) != 0) {
            return false;
        }
        Field field = AbstractC3638.f11333;
        return !this.f8157.hasTransientState();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m4540() {
        return (this.f8166 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m4541() {
        return this.f8170 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean m4542() {
        return (this.f8166 & bc.e) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m4543() {
        return (this.f8166 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m4544(int i, boolean z) {
        if (this.f8160 == -1) {
            this.f8160 = this.f8159;
        }
        if (this.f8163 == -1) {
            this.f8163 = this.f8159;
        }
        if (z) {
            this.f8163 += i;
        }
        this.f8159 += i;
        View view = this.f8157;
        if (view.getLayoutParams() != null) {
            ((C2547) view.getLayoutParams()).f8109 = true;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m4545() {
        if (RecyclerView.f347 && m4542()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f8166 = 0;
        this.f8159 = -1;
        this.f8160 = -1;
        this.f8161 = -1L;
        this.f8163 = -1;
        this.f8169 = 0;
        this.f8164 = null;
        this.f8165 = null;
        ArrayList arrayList = this.f8167;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f8166 &= -1025;
        this.f8172 = 0;
        this.f8173 = -1;
        RecyclerView.m201(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m4546(boolean z) {
        int i = this.f8169;
        int i2 = z ? i - 1 : i + 1;
        this.f8169 = i2;
        if (i2 < 0) {
            this.f8169 = 0;
            if (RecyclerView.f347) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.f8166 |= 16;
        } else if (z && i2 == 0) {
            this.f8166 &= -17;
        }
        if (RecyclerView.f348) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean m4547() {
        return (this.f8166 & 128) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean m4548() {
        return (this.f8166 & 32) != 0;
    }
}
