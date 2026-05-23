package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᲇᤝᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3547 extends AbstractC3546 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final SparseIntArray f11140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Parcel f11141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f11142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f11143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f11144;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f11145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f11146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f11147;

    public C3547(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0264(0), new C0264(0), new C0264(0));
    }

    @Override // p000.AbstractC3546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C3547 mo5133() {
        Parcel parcel = this.f11141;
        int iDataPosition = parcel.dataPosition();
        int i = this.f11146;
        if (i == this.f11142) {
            i = this.f11143;
        }
        return new C3547(parcel, iDataPosition, i, AbstractC2784.m4752(new StringBuilder(), this.f11144, "  "), this.f11137, this.f11138, this.f11139);
    }

    @Override // p000.AbstractC3546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo5137(int i) {
        while (this.f11146 < this.f11143) {
            int i2 = this.f11147;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f11146;
            Parcel parcel = this.f11141;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f11147 = parcel.readInt();
            this.f11146 += i4;
        }
        return this.f11147 == i;
    }

    @Override // p000.AbstractC3546
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo5140(int i) {
        int i2 = this.f11145;
        SparseIntArray sparseIntArray = this.f11140;
        Parcel parcel = this.f11141;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f11145 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C3547(Parcel parcel, int i, int i2, String str, C0264 c0264, C0264 c0265, C0264 c0266) {
        super(c0264, c0265, c0266);
        this.f11140 = new SparseIntArray();
        this.f11145 = -1;
        this.f11147 = -1;
        this.f11141 = parcel;
        this.f11142 = i;
        this.f11143 = i2;
        this.f11146 = i;
        this.f11144 = str;
    }
}
