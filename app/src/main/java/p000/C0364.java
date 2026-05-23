package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0364 implements Parcelable {
    public static final Parcelable.Creator<C0364> CREATOR = new C0134(1);

    public int f1699;

    public Integer f1700;

    public Integer f1701;

    public Integer f1702;

    public Integer f1703;

    public Integer f1704;

    public Integer f1705;

    public Integer f1706;

    public String f1708;

    public Locale f1712;

    public CharSequence f1713;

    public CharSequence f1714;

    public int f1715;

    public int f1716;

    public Integer f1717;

    public Integer f1719;

    public Integer f1720;

    public Integer f1721;

    public Integer f1722;

    public Integer f1723;

    public Integer f1724;

    public Integer f1725;

    public Integer f1726;

    public Integer f1727;

    public Boolean f1728;

    public int f1707 = 255;

    public int f1709 = -2;

    public int f1710 = -2;

    public int f1711 = -2;

    public Boolean f1718 = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1699);
        parcel.writeSerializable(this.f1700);
        parcel.writeSerializable(this.f1701);
        parcel.writeSerializable(this.f1702);
        parcel.writeSerializable(this.f1703);
        parcel.writeSerializable(this.f1704);
        parcel.writeSerializable(this.f1705);
        parcel.writeSerializable(this.f1706);
        parcel.writeInt(this.f1707);
        parcel.writeString(this.f1708);
        parcel.writeInt(this.f1709);
        parcel.writeInt(this.f1710);
        parcel.writeInt(this.f1711);
        CharSequence charSequence = this.f1713;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f1714;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f1715);
        parcel.writeSerializable(this.f1717);
        parcel.writeSerializable(this.f1719);
        parcel.writeSerializable(this.f1720);
        parcel.writeSerializable(this.f1721);
        parcel.writeSerializable(this.f1722);
        parcel.writeSerializable(this.f1723);
        parcel.writeSerializable(this.f1724);
        parcel.writeSerializable(this.f1727);
        parcel.writeSerializable(this.f1725);
        parcel.writeSerializable(this.f1726);
        parcel.writeSerializable(this.f1718);
        parcel.writeSerializable(this.f1712);
        parcel.writeSerializable(this.f1728);
    }
}
