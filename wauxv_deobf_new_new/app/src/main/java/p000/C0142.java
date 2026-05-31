package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0142 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1171;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1171) {
            case 0:
                C0143 c0143 = new C0143();
                c0143.f1172 = parcel.readInt();
                return c0143;
            case 1:
                C0339 c0339 = new C0339();
                c0339.f1678 = 255;
                c0339.f1680 = -2;
                c0339.f1681 = -2;
                c0339.f1682 = -2;
                c0339.f1689 = Boolean.TRUE;
                c0339.f1670 = parcel.readInt();
                c0339.f1671 = (Integer) parcel.readSerializable();
                c0339.f1672 = (Integer) parcel.readSerializable();
                c0339.f1673 = (Integer) parcel.readSerializable();
                c0339.f1674 = (Integer) parcel.readSerializable();
                c0339.f1675 = (Integer) parcel.readSerializable();
                c0339.f1676 = (Integer) parcel.readSerializable();
                c0339.f1677 = (Integer) parcel.readSerializable();
                c0339.f1678 = parcel.readInt();
                c0339.f1679 = parcel.readString();
                c0339.f1680 = parcel.readInt();
                c0339.f1681 = parcel.readInt();
                c0339.f1682 = parcel.readInt();
                c0339.f1684 = parcel.readString();
                c0339.f1685 = parcel.readString();
                c0339.f1686 = parcel.readInt();
                c0339.f1688 = (Integer) parcel.readSerializable();
                c0339.f1690 = (Integer) parcel.readSerializable();
                c0339.f1691 = (Integer) parcel.readSerializable();
                c0339.f1692 = (Integer) parcel.readSerializable();
                c0339.f1693 = (Integer) parcel.readSerializable();
                c0339.f1694 = (Integer) parcel.readSerializable();
                c0339.f1695 = (Integer) parcel.readSerializable();
                c0339.f1698 = (Integer) parcel.readSerializable();
                c0339.f1696 = (Integer) parcel.readSerializable();
                c0339.f1697 = (Integer) parcel.readSerializable();
                c0339.f1689 = (Boolean) parcel.readSerializable();
                c0339.f1683 = (Locale) parcel.readSerializable();
                c0339.f1699 = (Boolean) parcel.readSerializable();
                return c0339;
            case 2:
                C0363 c0363 = new C0363(parcel);
                c0363.f1765 = parcel.readFloat();
                c0363.f1766 = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                c0363.f1767 = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                c0363.f1768 = parcel.readFloat();
                c0363.f1769 = parcel.createBooleanArray()[0];
                return c0363;
            case 3:
                C1812 c1812 = new C1812();
                c1812.f6005 = parcel.readInt();
                c1812.f6006 = parcel.readInt();
                c1812.f6007 = parcel.readInt() == 1;
                return c1812;
            case 4:
                C1943 c1943 = new C1943(parcel);
                c1943.f6416 = ((Integer) parcel.readValue(C1943.class.getClassLoader())).intValue();
                return c1943;
            case 5:
                C2160 c2160 = new C2160();
                c2160.f7179 = parcel.readInt();
                c2160.f7180 = (C2369) parcel.readParcelable(C2160.class.getClassLoader());
                return c2160;
            case 6:
                C2169 c2169 = new C2169(parcel);
                c2169.f7194 = parcel.readInt();
                return c2169;
            case 7:
                return new ParcelImpl(parcel);
            case 8:
                C2864 c2864 = new C2864();
                c2864.f9106 = parcel.readInt();
                c2864.f9107 = parcel.readInt();
                c2864.f9109 = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    c2864.f9108 = iArr;
                    parcel.readIntArray(iArr);
                }
                return c2864;
            default:
                C2865 c2865 = new C2865();
                c2865.f9110 = parcel.readInt();
                c2865.f9111 = parcel.readInt();
                int i2 = parcel.readInt();
                c2865.f9112 = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    c2865.f9113 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                c2865.f9114 = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    c2865.f9115 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c2865.f9117 = parcel.readInt() == 1;
                c2865.f9118 = parcel.readInt() == 1;
                c2865.f9119 = parcel.readInt() == 1;
                c2865.f9116 = parcel.readArrayList(C2864.class.getClassLoader());
                return c2865;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1171) {
            case 0:
                return new C0143[i];
            case 1:
                return new C0339[i];
            case 2:
                return new C0363[i];
            case 3:
                return new C1812[i];
            case 4:
                return new C1943[i];
            case 5:
                return new C2160[i];
            case 6:
                return new C2169[i];
            case 7:
                return new ParcelImpl[i];
            case 8:
                return new C2864[i];
            default:
                return new C2865[i];
        }
    }
}
