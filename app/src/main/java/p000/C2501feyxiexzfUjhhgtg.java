package p000;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛴ要点脸ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2501feyxiexzfUjhhgtg implements InterfaceC0891feyxiexzfUjhhgtg, InterfaceC2973feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8169Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f8170Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f8171Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2501feyxiexzfUjhhgtg(int i, int i2, Object obj) {
        this.f8169Ujhhgtgfeyxiexzf = i2;
        this.f8171Ujhhgtgfeyxiexzf = obj;
        this.f8170Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object m3779Ujhhgtgfeyxiexzf(C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg, C3101Ujhhgtgfeyxiexzf c3101Ujhhgtgfeyxiexzf, AbstractC2483feyxiexzfUjhhgtg abstractC2483feyxiexzfUjhhgtg) throws Throwable {
        C0162Ujhhgtgfeyxiexzf c0162Ujhhgtgfeyxiexzf;
        LinkedHashMap linkedHashMap;
        C3101Ujhhgtgfeyxiexzf c3101Ujhhgtgfeyxiexzf2;
        byte bM4469Ujhhgtgfeyxiexzf;
        C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg2;
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf;
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf2 = (C3017Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
        if (abstractC2483feyxiexzfUjhhgtg instanceof C0162Ujhhgtgfeyxiexzf) {
            c0162Ujhhgtgfeyxiexzf = (C0162Ujhhgtgfeyxiexzf) abstractC2483feyxiexzfUjhhgtg;
            int i = c0162Ujhhgtgfeyxiexzf.f1346Ujhhgtgfeyxiexzf;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0162Ujhhgtgfeyxiexzf.f1346Ujhhgtgfeyxiexzf = i - Integer.MIN_VALUE;
            } else {
                c0162Ujhhgtgfeyxiexzf = new C0162Ujhhgtgfeyxiexzf(c2501feyxiexzfUjhhgtg, abstractC2483feyxiexzfUjhhgtg);
            }
        } else {
            c0162Ujhhgtgfeyxiexzf = new C0162Ujhhgtgfeyxiexzf(c2501feyxiexzfUjhhgtg, abstractC2483feyxiexzfUjhhgtg);
        }
        Object obj = c0162Ujhhgtgfeyxiexzf.f1344Ujhhgtgfeyxiexzf;
        int i2 = c0162Ujhhgtgfeyxiexzf.f1346Ujhhgtgfeyxiexzf;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c0162Ujhhgtgfeyxiexzf.f1343Ujhhgtgfeyxiexzf;
            String str = c0162Ujhhgtgfeyxiexzf.f1342Ujhhgtgfeyxiexzf;
            linkedHashMap = c0162Ujhhgtgfeyxiexzf.f1341Ujhhgtgfeyxiexzf;
            c2501feyxiexzfUjhhgtg2 = c0162Ujhhgtgfeyxiexzf.f1340Ujhhgtgfeyxiexzf;
            c3101Ujhhgtgfeyxiexzf2 = c0162Ujhhgtgfeyxiexzf.f1339Ujhhgtgfeyxiexzf;
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
            linkedHashMap.put(str, (AbstractC0120Ujhhgtgfeyxiexzf) obj);
            bM4469Ujhhgtgfeyxiexzf = ((C3017Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg2.f8171Ujhhgtgfeyxiexzf).m4469Ujhhgtgfeyxiexzf();
            if (bM4469Ujhhgtgfeyxiexzf == 4) {
                i3 = i4;
                c2501feyxiexzfUjhhgtg = c2501feyxiexzfUjhhgtg2;
            } else if (bM4469Ujhhgtgfeyxiexzf != 7) {
                C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf((C3017Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg2.f8171Ujhhgtgfeyxiexzf, "Expected end of the object or comma", 0, 6);
                throw null;
            }
            c3017Ujhhgtgfeyxiexzf = (C3017Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg2.f8171Ujhhgtgfeyxiexzf;
            if (bM4469Ujhhgtgfeyxiexzf == 6) {
                c3017Ujhhgtgfeyxiexzf.m4470Ujhhgtgfeyxiexzf((byte) 7);
            } else if (bM4469Ujhhgtgfeyxiexzf == 4) {
                AbstractC3611Ujhhgtgfeyxiexzf.m5220Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf);
                throw null;
            }
            return new C0127Ujhhgtgfeyxiexzf(linkedHashMap);
        }
        AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
        byte bM4470Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf2.m4470Ujhhgtgfeyxiexzf((byte) 6);
        if (c3017Ujhhgtgfeyxiexzf2.m4490feyxiexzfUjhhgtg() == 4) {
            C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf2, "Unexpected leading comma", 0, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        c3101Ujhhgtgfeyxiexzf2 = c3101Ujhhgtgfeyxiexzf;
        bM4469Ujhhgtgfeyxiexzf = bM4470Ujhhgtgfeyxiexzf;
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf3 = (C3017Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
        if (!c3017Ujhhgtgfeyxiexzf3.m4465Ujhhgtgfeyxiexzf()) {
            c2501feyxiexzfUjhhgtg2 = c2501feyxiexzfUjhhgtg;
            c3017Ujhhgtgfeyxiexzf = (C3017Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg2.f8171Ujhhgtgfeyxiexzf;
            if (bM4469Ujhhgtgfeyxiexzf == 6) {
                c3017Ujhhgtgfeyxiexzf.m4470Ujhhgtgfeyxiexzf((byte) 7);
            } else if (bM4469Ujhhgtgfeyxiexzf == 4) {
                AbstractC3611Ujhhgtgfeyxiexzf.m5220Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf);
                throw null;
            }
            return new C0127Ujhhgtgfeyxiexzf(linkedHashMap);
        }
        String strM4474Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf3.m4474Ujhhgtgfeyxiexzf();
        c3017Ujhhgtgfeyxiexzf3.m4470Ujhhgtgfeyxiexzf((byte) 5);
        c0162Ujhhgtgfeyxiexzf.f1339Ujhhgtgfeyxiexzf = c3101Ujhhgtgfeyxiexzf2;
        c0162Ujhhgtgfeyxiexzf.f1340Ujhhgtgfeyxiexzf = c2501feyxiexzfUjhhgtg;
        c0162Ujhhgtgfeyxiexzf.f1341Ujhhgtgfeyxiexzf = linkedHashMap;
        c0162Ujhhgtgfeyxiexzf.f1342Ujhhgtgfeyxiexzf = strM4474Ujhhgtgfeyxiexzf;
        c0162Ujhhgtgfeyxiexzf.f1343Ujhhgtgfeyxiexzf = i3;
        c0162Ujhhgtgfeyxiexzf.f1346Ujhhgtgfeyxiexzf = 1;
        c3101Ujhhgtgfeyxiexzf2.f9643Ujhhgtgfeyxiexzf = c0162Ujhhgtgfeyxiexzf;
        return EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
    }

    public String toString() {
        switch (this.f8169Ujhhgtgfeyxiexzf) {
            case 6:
                return AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(this.f8170Ujhhgtgfeyxiexzf, "Args of index ");
            case 7:
                return new String((char[]) this.f8171Ujhhgtgfeyxiexzf, 0, this.f8170Ujhhgtgfeyxiexzf);
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC2973feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public boolean mo2012Ujhhgtgfeyxiexzf(View view) {
        ((BottomSheetBehavior) this.f8171Ujhhgtgfeyxiexzf).m791feyxiexzfUjhhgtg(this.f8170Ujhhgtgfeyxiexzf);
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m3780Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = (C0684Ujhhgtgfeyxiexzf) this.f8171Ujhhgtgfeyxiexzf;
        int i4 = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
        if (i >= i4) {
            for (int i5 = i - i4; i5 >= 0; i5--) {
                c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(-1);
            }
        }
        c0684Ujhhgtgfeyxiexzf.m1946Ujhhgtgfeyxiexzf(i, i2);
        int i6 = i2 + i3;
        if (this.f8170Ujhhgtgfeyxiexzf < i6) {
            this.f8170Ujhhgtgfeyxiexzf = i6;
        }
    }

    @Override // p000.InterfaceC0891feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public InterfaceC0901feyxiexzfUjhhgtg mo2369Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC0901feyxiexzfUjhhgtg.get()).compress((Bitmap.CompressFormat) this.f8171Ujhhgtgfeyxiexzf, this.f8170Ujhhgtgfeyxiexzf, byteArrayOutputStream);
        interfaceC0901feyxiexzfUjhhgtg.mo1444Ujhhgtgfeyxiexzf();
        return new C3030feyxiexzfUjhhgtg(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public void m3781Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f8171Ujhhgtgfeyxiexzf;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f8171Ujhhgtgfeyxiexzf = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public AbstractC0120Ujhhgtgfeyxiexzf m3782Ujhhgtgfeyxiexzf() throws Throwable {
        AbstractC0120Ujhhgtgfeyxiexzf c0127Ujhhgtgfeyxiexzf;
        Object obj;
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = (C3017Ujhhgtgfeyxiexzf) this.f8171Ujhhgtgfeyxiexzf;
        byte bM4490feyxiexzfUjhhgtg = c3017Ujhhgtgfeyxiexzf.m4490feyxiexzfUjhhgtg();
        if (bM4490feyxiexzfUjhhgtg == 1) {
            return m3784Ujhhgtgfeyxiexzf(true);
        }
        if (bM4490feyxiexzfUjhhgtg == 0) {
            return m3784Ujhhgtgfeyxiexzf(false);
        }
        if (bM4490feyxiexzfUjhhgtg != 6) {
            if (bM4490feyxiexzfUjhhgtg == 8) {
                return m3783Ujhhgtgfeyxiexzf();
            }
            C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "Cannot read Json element because of unexpected ".concat(AbstractC3085Ujhhgtgfeyxiexzf.m4572feyxiexzfUjhhgtg(bM4490feyxiexzfUjhhgtg)), 0, 6);
            throw null;
        }
        int i = this.f8170Ujhhgtgfeyxiexzf + 1;
        this.f8170Ujhhgtgfeyxiexzf = i;
        if (i == 200) {
            C0161Ujhhgtgfeyxiexzf c0161Ujhhgtgfeyxiexzf = new C0161Ujhhgtgfeyxiexzf(this, null);
            C3101Ujhhgtgfeyxiexzf c3101Ujhhgtgfeyxiexzf = new C3101Ujhhgtgfeyxiexzf();
            c3101Ujhhgtgfeyxiexzf.f9642Ujhhgtgfeyxiexzf = c0161Ujhhgtgfeyxiexzf;
            c3101Ujhhgtgfeyxiexzf.f9643Ujhhgtgfeyxiexzf = c3101Ujhhgtgfeyxiexzf;
            EnumC3746Ujhhgtgfeyxiexzf enumC3746Ujhhgtgfeyxiexzf = EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
            c3101Ujhhgtgfeyxiexzf.f9644Ujhhgtgfeyxiexzf = enumC3746Ujhhgtgfeyxiexzf;
            while (true) {
                obj = c3101Ujhhgtgfeyxiexzf.f9644Ujhhgtgfeyxiexzf;
                InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = c3101Ujhhgtgfeyxiexzf.f9643Ujhhgtgfeyxiexzf;
                if (interfaceC3704Ujhhgtgfeyxiexzf == null) {
                    break;
                }
                if (enumC3746Ujhhgtgfeyxiexzf.equals(obj)) {
                    try {
                        C0161Ujhhgtgfeyxiexzf c0161Ujhhgtgfeyxiexzf2 = c3101Ujhhgtgfeyxiexzf.f9642Ujhhgtgfeyxiexzf;
                        AbstractC1791feyxiexzfUjhhgtg.m3132Ujhhgtgfeyxiexzf(3, c0161Ujhhgtgfeyxiexzf2);
                        C0161Ujhhgtgfeyxiexzf c0161Ujhhgtgfeyxiexzf3 = new C0161Ujhhgtgfeyxiexzf(c0161Ujhhgtgfeyxiexzf2.f1338Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf);
                        c0161Ujhhgtgfeyxiexzf3.f1337Ujhhgtgfeyxiexzf = c3101Ujhhgtgfeyxiexzf;
                        Object objMo1208Ujhhgtgfeyxiexzf = c0161Ujhhgtgfeyxiexzf3.mo1208Ujhhgtgfeyxiexzf(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
                        if (objMo1208Ujhhgtgfeyxiexzf != enumC3746Ujhhgtgfeyxiexzf) {
                            interfaceC3704Ujhhgtgfeyxiexzf.mo2588Ujhhgtgfeyxiexzf(objMo1208Ujhhgtgfeyxiexzf);
                        }
                    } catch (Throwable th) {
                        interfaceC3704Ujhhgtgfeyxiexzf.mo2588Ujhhgtgfeyxiexzf(new C0919feyxiexzfUjhhgtg(th));
                    }
                } else {
                    c3101Ujhhgtgfeyxiexzf.f9644Ujhhgtgfeyxiexzf = enumC3746Ujhhgtgfeyxiexzf;
                    interfaceC3704Ujhhgtgfeyxiexzf.mo2588Ujhhgtgfeyxiexzf(obj);
                }
            }
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
            c0127Ujhhgtgfeyxiexzf = (AbstractC0120Ujhhgtgfeyxiexzf) obj;
        } else {
            byte bM4470Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf.m4470Ujhhgtgfeyxiexzf((byte) 6);
            if (c3017Ujhhgtgfeyxiexzf.m4490feyxiexzfUjhhgtg() == 4) {
                C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c3017Ujhhgtgfeyxiexzf.m4465Ujhhgtgfeyxiexzf()) {
                String strM4474Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf.m4474Ujhhgtgfeyxiexzf();
                c3017Ujhhgtgfeyxiexzf.m4470Ujhhgtgfeyxiexzf((byte) 5);
                linkedHashMap.put(strM4474Ujhhgtgfeyxiexzf, m3782Ujhhgtgfeyxiexzf());
                bM4470Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf.m4469Ujhhgtgfeyxiexzf();
                if (bM4470Ujhhgtgfeyxiexzf != 4) {
                    if (bM4470Ujhhgtgfeyxiexzf == 7) {
                        break;
                    }
                    C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
            }
            if (bM4470Ujhhgtgfeyxiexzf == 6) {
                c3017Ujhhgtgfeyxiexzf.m4470Ujhhgtgfeyxiexzf((byte) 7);
            } else if (bM4470Ujhhgtgfeyxiexzf == 4) {
                AbstractC3611Ujhhgtgfeyxiexzf.m5220Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf);
                throw null;
            }
            c0127Ujhhgtgfeyxiexzf = new C0127Ujhhgtgfeyxiexzf(linkedHashMap);
        }
        this.f8170Ujhhgtgfeyxiexzf--;
        return c0127Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C0730Ujhhgtgfeyxiexzf m3783Ujhhgtgfeyxiexzf() {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = (C3017Ujhhgtgfeyxiexzf) this.f8171Ujhhgtgfeyxiexzf;
        byte bM4469Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf.m4469Ujhhgtgfeyxiexzf();
        if (c3017Ujhhgtgfeyxiexzf.m4490feyxiexzfUjhhgtg() == 4) {
            C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c3017Ujhhgtgfeyxiexzf.m4465Ujhhgtgfeyxiexzf()) {
            arrayList.add(m3782Ujhhgtgfeyxiexzf());
            bM4469Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf.m4469Ujhhgtgfeyxiexzf();
            if (bM4469Ujhhgtgfeyxiexzf != 4) {
                boolean z = bM4469Ujhhgtgfeyxiexzf == 9;
                int i = c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf;
                if (!z) {
                    C3017Ujhhgtgfeyxiexzf.m4462Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bM4469Ujhhgtgfeyxiexzf == 8) {
            c3017Ujhhgtgfeyxiexzf.m4470Ujhhgtgfeyxiexzf((byte) 9);
        } else if (bM4469Ujhhgtgfeyxiexzf == 4) {
            AbstractC3611Ujhhgtgfeyxiexzf.m5219Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "array");
            throw null;
        }
        return new C0730Ujhhgtgfeyxiexzf(arrayList);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public AbstractC0158Ujhhgtgfeyxiexzf m3784Ujhhgtgfeyxiexzf(boolean z) {
        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = (C3017Ujhhgtgfeyxiexzf) this.f8171Ujhhgtgfeyxiexzf;
        String strM4475Ujhhgtgfeyxiexzf = !z ? c3017Ujhhgtgfeyxiexzf.m4475Ujhhgtgfeyxiexzf() : c3017Ujhhgtgfeyxiexzf.m4474Ujhhgtgfeyxiexzf();
        return (z || !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(strM4475Ujhhgtgfeyxiexzf, "null")) ? new C0121Ujhhgtgfeyxiexzf(strM4475Ujhhgtgfeyxiexzf, z) : C0131Ujhhgtgfeyxiexzf.INSTANCE;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m3785Ujhhgtgfeyxiexzf() {
        C2688Ujhhgtgfeyxiexzf c2688Ujhhgtgfeyxiexzf = C2688Ujhhgtgfeyxiexzf.f8580Ujhhgtgfeyxiexzf;
        char[] cArr = (char[]) this.f8171Ujhhgtgfeyxiexzf;
        synchronized (c2688Ujhhgtgfeyxiexzf) {
            int i = c2688Ujhhgtgfeyxiexzf.f8572Ujhhgtgfeyxiexzf;
            if (cArr.length + i < AbstractC2393Ujhhgtgfeyxiexzf.f7779Ujhhgtgfeyxiexzf) {
                c2688Ujhhgtgfeyxiexzf.f8572Ujhhgtgfeyxiexzf = i + cArr.length;
                ((C2377Ujhhgtgfeyxiexzf) c2688Ujhhgtgfeyxiexzf.f8573Ujhhgtgfeyxiexzf).addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3786Ujhhgtgfeyxiexzf(Object obj) {
        C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) this.f8171Ujhhgtgfeyxiexzf;
        int i = this.f8170Ujhhgtgfeyxiexzf;
        if (i < 0) {
            throw new IllegalStateException("HookParam Method args index must be >= 0");
        }
        if (c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf().length == 0) {
            throw new IllegalStateException("HookParam Method args is empty, mabe not has args");
        }
        if (i > c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf().length - 1) {
            throw new IllegalStateException(("HookParam Method args index out of bounds, max is " + (c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf().length - 1)).toString());
        }
        Object[] objArrM1292Ujhhgtgfeyxiexzf = c0578Ujhhgtgfeyxiexzf.f2598Ujhhgtgfeyxiexzf.m1292Ujhhgtgfeyxiexzf();
        if (objArrM1292Ujhhgtgfeyxiexzf != null) {
            objArrM1292Ujhhgtgfeyxiexzf[i] = obj;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m3787Ujhhgtgfeyxiexzf(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        m3781Ujhhgtgfeyxiexzf(this.f8170Ujhhgtgfeyxiexzf, length);
        str.getChars(0, str.length(), (char[]) this.f8171Ujhhgtgfeyxiexzf, this.f8170Ujhhgtgfeyxiexzf);
        this.f8170Ujhhgtgfeyxiexzf += length;
    }

    public C2501feyxiexzfUjhhgtg(C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf, C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf) {
        this.f8169Ujhhgtgfeyxiexzf = 8;
        this.f8171Ujhhgtgfeyxiexzf = c3017Ujhhgtgfeyxiexzf;
    }

    public C2501feyxiexzfUjhhgtg(byte b, int i) {
        this.f8169Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 2:
                this.f8170Ujhhgtgfeyxiexzf = 0;
                this.f8171Ujhhgtgfeyxiexzf = new StringBuilder();
                break;
            case 5:
                this.f8170Ujhhgtgfeyxiexzf = 1;
                this.f8171Ujhhgtgfeyxiexzf = Collections.singletonList(null);
                break;
            case 7:
                break;
            default:
                this.f8171Ujhhgtgfeyxiexzf = Bitmap.CompressFormat.JPEG;
                this.f8170Ujhhgtgfeyxiexzf = 100;
                break;
        }
    }

    public C2501feyxiexzfUjhhgtg(int i) {
        this.f8169Ujhhgtgfeyxiexzf = 0;
        this.f8171Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(i);
    }

    public C2501feyxiexzfUjhhgtg(ArrayList arrayList) {
        this.f8169Ujhhgtgfeyxiexzf = 5;
        this.f8170Ujhhgtgfeyxiexzf = 0;
        this.f8171Ujhhgtgfeyxiexzf = arrayList;
    }

    public C2501feyxiexzfUjhhgtg(int i, String str) {
        this.f8169Ujhhgtgfeyxiexzf = 9;
        this.f8170Ujhhgtgfeyxiexzf = i;
        this.f8171Ujhhgtgfeyxiexzf = str;
    }
}
