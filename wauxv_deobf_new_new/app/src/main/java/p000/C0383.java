package p000;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲁᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0383 implements InterfaceC2634, InterfaceC0110 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1893;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1894;

    public /* synthetic */ C0383(int i, int i2, Object obj) {
        this.f1892 = i2;
        this.f1894 = obj;
        this.f1893 = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Object m1707(C0383 c0383, C0981 c0981, AbstractC0345 abstractC0345) throws Throwable {
        C1758 c1758;
        LinkedHashMap linkedHashMap;
        C0981 c0982;
        byte bM1305;
        C0383 c0384;
        C0154 c0154;
        C0154 c0155 = (C0154) c0383.f1894;
        if (abstractC0345 instanceof C1758) {
            c1758 = (C1758) abstractC0345;
            int i = c1758.f5905;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1758.f5905 = i - Integer.MIN_VALUE;
            } else {
                c1758 = new C1758(c0383, abstractC0345);
            }
        } else {
            c1758 = new C1758(c0383, abstractC0345);
        }
        Object obj = c1758.f5903;
        int i2 = c1758.f5905;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c1758.f5902;
            String str = c1758.f5901;
            linkedHashMap = c1758.f5900;
            c0384 = c1758.f5899;
            c0982 = c1758.f5898;
            AbstractC1470.m3372(obj);
            linkedHashMap.put(str, (AbstractC1736) obj);
            bM1305 = ((C0154) c0384.f1894).m1305();
            if (bM1305 == 4) {
                i3 = i4;
                c0383 = c0384;
            } else if (bM1305 != 7) {
                C0154.m1298((C0154) c0384.f1894, "Expected end of the object or comma", 0, 6);
                throw null;
            }
            c0154 = (C0154) c0384.f1894;
            if (bM1305 == 6) {
                c0154.m1306((byte) 7);
            } else if (bM1305 == 4) {
                AbstractC2234.m4175(c0154);
                throw null;
            }
            return new C1750(linkedHashMap);
        }
        AbstractC1470.m3372(obj);
        byte bM1306 = c0155.m1306((byte) 6);
        if (c0155.m1326() == 4) {
            C0154.m1298(c0155, "Unexpected leading comma", 0, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        c0982 = c0981;
        bM1305 = bM1306;
        C0154 c0156 = (C0154) c0383.f1894;
        if (!c0156.m1301()) {
            c0384 = c0383;
            c0154 = (C0154) c0384.f1894;
            if (bM1305 == 6) {
                c0154.m1306((byte) 7);
            } else if (bM1305 == 4) {
                AbstractC2234.m4175(c0154);
                throw null;
            }
            return new C1750(linkedHashMap);
        }
        String strM1310 = c0156.m1310();
        c0156.m1306((byte) 5);
        c1758.f5898 = c0982;
        c1758.f5899 = c0383;
        c1758.f5900 = linkedHashMap;
        c1758.f5901 = strM1310;
        c1758.f5902 = i3;
        c1758.f5905 = 1;
        c0982.f3600 = c1758;
        return EnumC0883.f3332;
    }

    public String toString() {
        switch (this.f1892) {
            case 6:
                return AbstractC1095.m2794(this.f1893, "Args of index ");
            case 7:
                return new String((char[]) this.f1894, 0, this.f1893);
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0110
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public boolean mo1270(View view) {
        ((BottomSheetBehavior) this.f1894).m792(this.f1893);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m1708(int i, int i2, int i3) {
        C1676 c1676 = (C1676) this.f1894;
        int i4 = c1676.f5648;
        if (i >= i4) {
            for (int i5 = i - i4; i5 >= 0; i5--) {
                c1676.m3546(-1);
            }
        }
        c1676.m3550(i, i2);
        int i6 = i2 + i3;
        if (this.f1893 < i6) {
            this.f1893 = i6;
        }
    }

    @Override // p000.InterfaceC2634
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC2624 mo1460(InterfaceC2624 interfaceC2624, C2336 c2336) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC2624.get()).compress((Bitmap.CompressFormat) this.f1894, this.f1893, byteArrayOutputStream);
        interfaceC2624.mo1352();
        return new C0166(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void m1709(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f1894;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f1894 = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public AbstractC1736 m1710() throws Throwable {
        AbstractC1736 c1750;
        Object obj;
        C0154 c0154 = (C0154) this.f1894;
        byte bM1326 = c0154.m1326();
        if (bM1326 == 1) {
            return m1712(true);
        }
        if (bM1326 == 0) {
            return m1712(false);
        }
        if (bM1326 != 6) {
            if (bM1326 == 8) {
                return m1711();
            }
            C0154.m1298(c0154, "Cannot read Json element because of unexpected ".concat(AbstractC1467.m3293(bM1326)), 0, 6);
            throw null;
        }
        int i = this.f1893 + 1;
        this.f1893 = i;
        if (i == 200) {
            C1757 c1757 = new C1757(this, null);
            C0981 c0981 = new C0981();
            c0981.f3599 = c1757;
            c0981.f3600 = c0981;
            EnumC0883 enumC0883 = EnumC0883.f3332;
            c0981.f3601 = enumC0883;
            while (true) {
                obj = c0981.f3601;
                InterfaceC0841 interfaceC0841 = c0981.f3600;
                if (interfaceC0841 == null) {
                    break;
                }
                if (enumC0883.equals(obj)) {
                    try {
                        C1757 c1758 = c0981.f3599;
                        AbstractC2902.m4886(3, c1758);
                        C1757 c1759 = new C1757(c1758.f5897, interfaceC0841);
                        c1759.f5896 = c0981;
                        Object objMo1344 = c1759.mo1344(C3554.UNIT);
                        if (objMo1344 != enumC0883) {
                            interfaceC0841.mo1077(objMo1344);
                        }
                    } catch (Throwable th) {
                        interfaceC0841.mo1077(new C2641(th));
                    }
                } else {
                    c0981.f3601 = enumC0883;
                    interfaceC0841.mo1077(obj);
                }
            }
            AbstractC1470.m3372(obj);
            c1750 = (AbstractC1736) obj;
        } else {
            byte bM1306 = c0154.m1306((byte) 6);
            if (c0154.m1326() == 4) {
                C0154.m1298(c0154, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c0154.m1301()) {
                String strM1310 = c0154.m1310();
                c0154.m1306((byte) 5);
                linkedHashMap.put(strM1310, m1710());
                bM1306 = c0154.m1305();
                if (bM1306 != 4) {
                    if (bM1306 == 7) {
                        break;
                    }
                    C0154.m1298(c0154, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
            }
            if (bM1306 == 6) {
                c0154.m1306((byte) 7);
            } else if (bM1306 == 4) {
                AbstractC2234.m4175(c0154);
                throw null;
            }
            c1750 = new C1750(linkedHashMap);
        }
        this.f1893--;
        return c1750;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1727 m1711() {
        C0154 c0154 = (C0154) this.f1894;
        byte bM1305 = c0154.m1305();
        if (c0154.m1326() == 4) {
            C0154.m1298(c0154, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c0154.m1301()) {
            arrayList.add(m1710());
            bM1305 = c0154.m1305();
            if (bM1305 != 4) {
                boolean z = bM1305 == 9;
                int i = c0154.f1217;
                if (!z) {
                    C0154.m1298(c0154, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bM1305 == 8) {
            c0154.m1306((byte) 9);
        } else if (bM1305 == 4) {
            AbstractC2234.m4174(c0154, "array");
            throw null;
        }
        return new C1727(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public AbstractC1754 m1712(boolean z) {
        C0154 c0154 = (C0154) this.f1894;
        String strM1311 = !z ? c0154.m1311() : c0154.m1310();
        return (z || !AbstractC1469.m3322(strM1311, "null")) ? new C1744(strM1311, z) : C1747.INSTANCE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m1713() {
        C0572 c0572 = C0572.f2364;
        char[] cArr = (char[]) this.f1894;
        synchronized (c0572) {
            int i = c0572.f2365;
            if (cArr.length + i < AbstractC0275.f1535) {
                c0572.f2365 = i + cArr.length;
                ((C0266) c0572.f2366).addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m1714(Object obj) {
        C1574 c1574 = (C1574) this.f1894;
        int i = this.f1893;
        if (i < 0) {
            throw new IllegalStateException("HookParam Method args index must be >= 0");
        }
        if (c1574.m3447().length == 0) {
            throw new IllegalStateException("HookParam Method args is empty, mabe not has args");
        }
        if (i > c1574.m3447().length - 1) {
            throw new IllegalStateException(("HookParam Method args index out of bounds, max is " + (c1574.m3447().length - 1)).toString());
        }
        Object[] objArrM3881 = c1574.f5468.m3881();
        if (objArrM3881 != null) {
            objArrM3881[i] = obj;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m1715(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        m1709(this.f1893, length);
        str.getChars(0, str.length(), (char[]) this.f1894, this.f1893);
        this.f1893 += length;
    }

    public C0383(C1732 c1732, C0154 c0154) {
        this.f1892 = 8;
        this.f1894 = c0154;
    }

    public C0383(byte b, int i) {
        this.f1892 = i;
        switch (i) {
            case 2:
                this.f1893 = 0;
                this.f1894 = new StringBuilder();
                break;
            case 5:
                this.f1893 = 1;
                this.f1894 = Collections.singletonList(null);
                break;
            case 7:
                break;
            default:
                this.f1894 = Bitmap.CompressFormat.JPEG;
                this.f1893 = 100;
                break;
        }
    }

    public C0383(int i) {
        this.f1892 = 0;
        this.f1894 = new C1676(i);
    }

    public C0383(ArrayList arrayList) {
        this.f1892 = 5;
        this.f1893 = 0;
        this.f1894 = arrayList;
    }

    public C0383(int i, String str) {
        this.f1892 = 9;
        this.f1893 = i;
        this.f1894 = str;
    }
}
