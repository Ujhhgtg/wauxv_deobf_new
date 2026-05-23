package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᲇᤞᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2687 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public float f8671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public float f8672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public float f8673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f8674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f8675;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f8676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f8677 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f8678 = new ArrayList();

    public C2687() {
        m4700(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4697(float f) {
        float f2 = this.f8675;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f8673;
        float f5 = this.f8674;
        C2683 c2683 = new C2683(f4, f5, f4, f5);
        c2683.f8664 = this.f8675;
        c2683.f8665 = f3;
        this.f8678.add(new C2681(c2683));
        this.f8675 = f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4698(Matrix matrix, Path path) {
        ArrayList arrayList = this.f8677;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2685) arrayList.get(i)).mo4696(matrix, path);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4699(float f, float f2) {
        C2684 c2684 = new C2684();
        c2684.f8666 = f;
        c2684.f8667 = f2;
        this.f8677.add(c2684);
        C2682 c2682 = new C2682(c2684, this.f8673, this.f8674);
        float fM4695 = c2682.m4695() + 270.0f;
        float fM4696 = c2682.m4695() + 270.0f;
        m4697(fM4695);
        this.f8678.add(c2682);
        this.f8675 = fM4696;
        this.f8673 = f;
        this.f8674 = f2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4700(float f, float f2, float f3, float f4) {
        this.f8671 = f;
        this.f8672 = f2;
        this.f8673 = f;
        this.f8674 = f2;
        this.f8675 = f3;
        this.f8676 = (f3 + f4) % 360.0f;
        this.f8677.clear();
        this.f8678.clear();
    }
}
