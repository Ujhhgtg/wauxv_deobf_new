package p000;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0408 implements InterfaceC2578, InterfaceC0102 {

    public final /* synthetic */ int f1920;

    public int f1921;

    public Object f1922;

    public /* synthetic */ C0408(int i, int i2, Object obj) {
        this.f1920 = i2;
        this.f1922 = obj;
        this.f1921 = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object m1601(C0408 c0408, C0977 c0977, AbstractC0370 abstractC0370) throws Throwable {
        C1734 c1734;
        LinkedHashMap linkedHashMap;
        C0977 c0978;
        byte bM1159;
        C0408 c0409;
        C0146 c0146;
        C0146 c0147 = (C0146) c0408.f1922;
        if (abstractC0370 instanceof C1734) {
            c1734 = (C1734) abstractC0370;
            int i = c1734.f5842;
            if ((i & -2147483648) != 0) {
                c1734.f5842 = i - -2147483648;
            } else {
                c1734 = new C1734(c0408, abstractC0370);
            }
        } else {
            c1734 = new C1734(c0408, abstractC0370);
        }
        Object obj = c1734.f5840;
        int i2 = c1734.f5842;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c1734.f5839;
            String str = c1734.f5838;
            linkedHashMap = c1734.f5837;
            c0409 = c1734.f5836;
            c0978 = c1734.f5835;
            AbstractC0743.m2188(obj);
            linkedHashMap.put(str, (AbstractC1715) obj);
            bM1159 = ((C0146) c0409.f1922).m1159();
            if (bM1159 == 4) {
                i3 = i4;
                c0408 = c0409;
            } else if (bM1159 != 7) {
                C0146.m1152((C0146) c0409.f1922, "Expected end of the object or comma", 0, 6);
                throw null;
            }
            c0146 = (C0146) c0409.f1922;
            if (false) {
                c0146.m1160((byte) 7);
            } else if (bM1159 == 4) {
                AbstractC3681.m5330(c0146);
                throw null;
            }
            return new C1726(linkedHashMap);
        }
        AbstractC0743.m2188(obj);
        byte bM1160 = c0147.m1160((byte) 6);
        if (c0147.m1180() == 4) {
            C0146.m1152(c0147, "Unexpected leading comma", 0, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        c0978 = c0977;
        bM1159 = bM1160;
        C0146 c0148 = (C0146) c0408.f1922;
        if (!c0148.m1155()) {
            c0409 = c0408;
            c0146 = (C0146) c0409.f1922;
            if (bM1159 == 6) {
                c0146.m1160((byte) 7);
            } else if (bM1159 == 4) {
                AbstractC3681.m5330(c0146);
                throw null;
            }
            return new C1726(linkedHashMap);
        }
        String strM1164 = c0148.m1164();
        c0148.m1160((byte) 5);
        c1734.f5835 = c0978;
        c1734.f5836 = c0408;
        c1734.f5837 = linkedHashMap;
        c1734.f5838 = strM1164;
        c1734.f5839 = 0;
        c1734.f5842 = 1;
        c0978.f3584 = c1734;
        return EnumC0884.f3325;
    }

    public String toString() {
        switch (this.f1920) {
            case 6:
                return AbstractC1194.m2779(this.f1921, "Args of index ");
            case 7:
                return new String((char[]) this.f1922, 0, this.f1921);
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0102
    public boolean mo1124(View view) {
        ((BottomSheetBehavior) this.f1922).m649(this.f1921);
        return true;
    }

    public void m1602(int i, int i2, int i3) {
        C1660 c1660 = (C1660) this.f1922;
        int i4 = c1660.f5610;
        if (i >= i4) {
            for (int i5 = i - i4; i5 >= 0; i5--) {
                c1660.m3382(-1);
            }
        }
        c1660.m3386(i, i2);
        int i6 = i2 + i3;
        if (this.f1921 < i6) {
            this.f1921 = i6;
        }
    }

    @Override // p000.InterfaceC2578
    public InterfaceC2568 mo1314(InterfaceC2568 interfaceC2568, C2303 c2303) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC2568.get()).compress((Bitmap.CompressFormat) this.f1922, this.f1921, byteArrayOutputStream);
        interfaceC2568.mo1206();
        return new C0158(byteArrayOutputStream.toByteArray());
    }

    public void m1603(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f1922;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f1922 = Arrays.copyOf(cArr, i3);
        }
    }

    public AbstractC1715 m1604() throws Throwable {
        AbstractC1715 c1726;
        Object obj;
        C0146 c0146 = (C0146) this.f1922;
        byte bM1180 = c0146.m1180();
        if (bM1180 == 1) {
            return m1606(true);
        }
        if (bM1180 == 0) {
            return m1606(false);
        }
        if (bM1180 != 6) {
            if (bM1180 == 8) {
                return m1605();
            }
            C0146.m1152(c0146, "Cannot read Json element because of unexpected ".concat(AbstractC1460.m3221(bM1180)), 0, 6);
            throw null;
        }
        int i = this.f1921 + 1;
        this.f1921 = i;
        if (i == 200) {
            C1733 c1733 = new C1733(this, null);
            C0977 c0977 = new C0977();
            c0977.f3583 = c1733;
            c0977.f3584 = c0977;
            EnumC0884 enumC0884 = EnumC0884.f3325;
            c0977.f3585 = enumC0884;
            while (true) {
                obj = c0977.f3585;
                InterfaceC0842 interfaceC0842 = c0977.f3584;
                if (interfaceC0842 == null) {
                    break;
                }
                if (enumC0884.equals(obj)) {
                    try {
                        C1733 c1734 = c0977.f3583;
                        AbstractC3453.m4986(3, c1734);
                        C1733 c1735 = new C1733(c1734.f5834, interfaceC0842);
                        c1735.f5833 = c0977;
                        Object objMo1198 = c1735.mo1198(Unit.INSTANCE);
                        if (objMo1198 != enumC0884) {
                            interfaceC0842.mo933(objMo1198);
                        }
                    } catch (Throwable th) {
                        interfaceC0842.mo933(new C2585(th));
                    }
                } else {
                    c0977.f3585 = enumC0884;
                    interfaceC0842.mo933(obj);
                }
            }
            AbstractC0743.m2188(obj);
            c1726 = (AbstractC1715) obj;
        } else {
            byte bM1160 = c0146.m1160((byte) 6);
            if (c0146.m1180() == 4) {
                C0146.m1152(c0146, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c0146.m1155()) {
                String strM1164 = c0146.m1164();
                c0146.m1160((byte) 5);
                linkedHashMap.put(strM1164, m1604());
                bM1160 = c0146.m1159();
                if (bM1160 != 4) {
                    if (bM1160 == 7) {
                        break;
                    }
                    C0146.m1152(c0146, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
            }
            if (bM1160 == 6) {
                c0146.m1160((byte) 7);
            } else if (bM1160 == 4) {
                AbstractC3681.m5330(c0146);
                throw null;
            }
            c1726 = new C1726(linkedHashMap);
        }
        this.f1921--;
        return c1726;
    }

    public C1708 m1605() {
        C0146 c0146 = (C0146) this.f1922;
        byte bM1159 = c0146.m1159();
        if (c0146.m1180() == 4) {
            C0146.m1152(c0146, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c0146.m1155()) {
            arrayList.add(m1604());
            bM1159 = c0146.m1159();
            if (bM1159 != 4) {
                boolean z = bM1159 == 9;
                int i = c0146.f1149;
                if (!z) {
                    C0146.m1152(c0146, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bM1159 == 8) {
            c0146.m1160((byte) 9);
        } else if (bM1159 == 4) {
            AbstractC3681.m5329(c0146, "array");
            throw null;
        }
        return new C1708(arrayList);
    }

    public AbstractC1730 m1606(boolean z) {
        C0146 c0146 = (C0146) this.f1922;
        String strM1165 = !z ? c0146.m1165() : c0146.m1164();
        return (z || !AbstractC2207.m4087(strM1165, "null")) ? new C1720(strM1165, z) : C1723.INSTANCE;
    }

    public void m1607() {
        C0591 c0591 = C0591.f2398;
        char[] cArr = (char[]) this.f1922;
        synchronized (c0591) {
            int i = c0591.f2399;
            if (cArr.length + i < AbstractC0265.f1461) {
                c0591.f2399 = i + cArr.length;
                ((C0256) c0591.f2400).addLast(cArr);
            }
        }
    }

    public void m1608(Object obj) {
        C1563 c1563 = (C1563) this.f1922;
        int i = this.f1921;
        if (i < 0) {
            throw new IllegalStateException("HookParam Method args index must be >= 0");
        }
        if (c1563.m3267().length == 0) {
            throw new IllegalStateException("HookParam Method args is empty, mabe not has args");
        }
        if (i > c1563.m3267().length - 1) {
            throw new IllegalStateException(("HookParam Method args index out of bounds, max is " + (c1563.m3267().length - 1)).toString());
        }
        Object[] objArrM3406 = c1563.f5438.m3406();
        if (objArrM3406 != null) {
            objArrM3406[i] = obj;
        }
    }

    public void m1609(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        m1603(this.f1921, length);
        str.getChars(0, str.length(), (char[]) this.f1922, this.f1921);
        this.f1921 += length;
    }

    public C0408(C1227 c1227, C0146 c0146) {
        this.f1920 = 8;
        this.f1922 = c0146;
        
    }

    public C0408(byte b, int i) {
        this.f1920 = i;
        switch (i) {
            case 2:
                this.f1921 = 0;
                this.f1922 = new StringBuilder();
                break;
            case 5:
                this.f1921 = 1;
                this.f1922 = Collections.singletonList(null);
                break;
            case 7:
                break;
            default:
                this.f1922 = Bitmap.CompressFormat.JPEG;
                this.f1921 = 100;
                break;
        }
    }

    public C0408(int i) {
        this.f1920 = 0;
        this.f1922 = new C1660(i);
    }

    public C0408(ArrayList arrayList) {
        this.f1920 = 5;
        this.f1921 = 0;
        this.f1922 = arrayList;
    }

    public C0408(int i, String str) {
        this.f1920 = 9;
        this.f1921 = i;
        this.f1922 = str;
    }
}
