package p000;

import bsh.BshMethod;
import bsh.C0012;
import bsh.Primitive;
import bsh.RunnableC0008;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᲈᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2426 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2400 f7770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final RunnableC0008 f7771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f7772;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final SecretKeySpec f7773;

    public C2426(C2400 c2400, RunnableC0008 runnableC0008, String str) {
        this.f7770 = c2400;
        this.f7771 = runnableC0008;
        this.f7772 = str;
        this.f7773 = new SecretKeySpec("0123456789abcdef".getBytes(AbstractC0580.UTF_8), "AES");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m4360(String str, Object... objArr) {
        Object c2641;
        Throwable thM4616;
        RunnableC0008 runnableC0008 = this.f7771;
        C2400 c2400 = this.f7770;
        if (c2400.f7680.exists()) {
            try {
                BshMethod[] bshMethodArrM371 = runnableC0008.f505.m371();
                int length = bshMethodArrM371.length;
                int i = 0;
                BshMethod bshMethod = null;
                boolean z = false;
                while (true) {
                    if (i >= length) {
                        if (!z) {
                        }
                        thM4616 = C2642.m4616(c2641);
                        if (thM4616 != null) {
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = AbstractC1471.f5234;
                            sb.append("callBshMethod ");
                            sb.append(str);
                            sb.append(" Failed: ");
                            sb.append(thM4616.getMessage());
                            c2400.m4346(sb.toString());
                        }
                        if (c2641 instanceof C2641) {
                            return null;
                        }
                        return c2641;
                    }
                    BshMethod bshMethod2 = bshMethodArrM371[i];
                    if (AbstractC1469.m3322(bshMethod2.getName(), str)) {
                        if (!z) {
                            z = true;
                            bshMethod = bshMethod2;
                        }
                    }
                    i++;
                    bshMethod = null;
                    break;
                }
                if (bshMethod != null) {
                    c2641 = bshMethod.invoke(objArr, runnableC0008);
                    if (AbstractC1469.m3322(c2641, Primitive.VOID)) {
                        c2641 = C3554.UNIT;
                    } else if (c2641 instanceof Primitive) {
                        c2641 = ((Primitive) c2641).getValue();
                    }
                    thM4616 = C2642.m4616(c2641);
                    if (thM4616 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        String[] strArr2 = AbstractC1471.f5234;
                        sb2.append("callBshMethod ");
                        sb2.append(str);
                        sb2.append(" Failed: ");
                        sb2.append(thM4616.getMessage());
                        c2400.m4346(sb2.toString());
                    }
                    if (c2641 instanceof C2641) {
                        return null;
                    }
                    return c2641;
                }
            } catch (Throwable th) {
                c2641 = new C2641(th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4361() {
        this.f7771.f505.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4362() throws IOException {
        File file = this.f7770.f7680;
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), AbstractC0580.UTF_8);
        try {
            RunnableC0008 runnableC0008 = this.f7771;
            C0012 c0012 = runnableC0008.f505;
            String str = runnableC0008.f507;
            if (str == null) {
                str = "eval stream";
            }
            runnableC0008.m339(inputStreamReader, c0012, str);
            inputStreamReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3528.m5090(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m4363(String str) {
        if (!this.f7770.f7680.exists()) {
            return false;
        }
        for (BshMethod bshMethod : this.f7771.f505.m371()) {
            if (AbstractC1469.m3322(bshMethod.getName(), str)) {
                return true;
            }
        }
        return false;
    }
}
