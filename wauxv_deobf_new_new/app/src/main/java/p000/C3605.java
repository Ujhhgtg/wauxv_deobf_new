package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᲇᤝᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3605 extends AbstractC3604 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final SparseIntArray f11289;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Parcel f11290;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f11291;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f11292;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f11293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f11294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f11295;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f11296;

    public C3605(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0274(0), new C0274(0), new C0274(0));
    }

    @Override // p000.AbstractC3604
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final C3605 mo5139() {
        Parcel parcel = this.f11290;
        int iDataPosition = parcel.dataPosition();
        int i = this.f11295;
        if (i == this.f11291) {
            i = this.f11292;
        }
        return new C3605(parcel, iDataPosition, i, AbstractC2844.m4786(new StringBuilder(), this.f11293, "  "), this.f11286, this.f11287, this.f11288);
    }

    @Override // p000.AbstractC3604
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final boolean mo5143(int i) {
        while (this.f11295 < this.f11292) {
            int i2 = this.f11296;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f11295;
            Parcel parcel = this.f11290;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f11296 = parcel.readInt();
            this.f11295 += i4;
        }
        return this.f11296 == i;
    }

    @Override // p000.AbstractC3604
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo5146(int i) {
        int i2 = this.f11294;
        SparseIntArray sparseIntArray = this.f11289;
        Parcel parcel = this.f11290;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f11294 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C3605(Parcel parcel, int i, int i2, String str, C0274 c0274, C0274 c0275, C0274 c0276) {
        super(c0274, c0275, c0276);
        this.f11289 = new SparseIntArray();
        this.f11294 = -1;
        this.f11296 = -1;
        this.f11290 = parcel;
        this.f11291 = i;
        this.f11292 = i2;
        this.f11295 = i;
        this.f11293 = str;
    }
}
