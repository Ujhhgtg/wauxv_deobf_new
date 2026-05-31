package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᛸᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2748 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public float f8841;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public float f8842;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public float f8843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f8844;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f8845;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f8846;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f8847 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f8848 = new ArrayList();

    public C2748() {
        m4737(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4734(float f) {
        float f2 = this.f8845;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f8843;
        float f5 = this.f8844;
        C2744 c2744 = new C2744(f4, f5, f4, f5);
        c2744.f8834 = this.f8845;
        c2744.f8835 = f3;
        this.f8848.add(new C2742(c2744));
        this.f8845 = f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4735(Matrix matrix, Path path) {
        ArrayList arrayList = this.f8847;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2746) arrayList.get(i)).mo4733(matrix, path);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4736(float f, float f2) {
        C2745 c2745 = new C2745();
        c2745.f8836 = f;
        c2745.f8837 = f2;
        this.f8847.add(c2745);
        C2743 c2743 = new C2743(c2745, this.f8843, this.f8844);
        float fM4732 = c2743.m4732() + 270.0f;
        float fM4733 = c2743.m4732() + 270.0f;
        m4734(fM4732);
        this.f8848.add(c2743);
        this.f8845 = fM4733;
        this.f8843 = f;
        this.f8844 = f2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4737(float f, float f2, float f3, float f4) {
        this.f8841 = f;
        this.f8842 = f2;
        this.f8843 = f;
        this.f8844 = f2;
        this.f8845 = f3;
        this.f8846 = (f3 + f4) % 360.0f;
        this.f8847.clear();
        this.f8848.clear();
    }
}
