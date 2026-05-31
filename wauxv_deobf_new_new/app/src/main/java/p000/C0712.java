package p000;

import android.app.AlertDialog;
import com.alibaba.fastjson2.JSONWriter;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤞᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0712 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2717;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2718;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0712(Object obj, InterfaceC0841 interfaceC0841, int i) {
        super(2, interfaceC0841);
        this.f2717 = i;
        this.f2718 = obj;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) throws Throwable {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f2717) {
            case 0:
                return ((C0712) mo1343(interfaceC0841, interfaceC0882)).mo1344(C3554.UNIT);
            case 1:
                C0712 c0712 = (C0712) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3554 = C3554.UNIT;
                c0712.mo1344(c3554);
                return c3554;
            default:
                C0712 c0713 = (C0712) mo1343(interfaceC0841, interfaceC0882);
                C3554 c3555 = C3554.UNIT;
                c0713.mo1344(c3555);
                return c3555;
        }
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f2717) {
            case 0:
                return new C0712((C0714) this.f2718, interfaceC0841, 0);
            case 1:
                return new C0712((C0814) this.f2718, interfaceC0841, 1);
            default:
                return new C0712((AlertDialog) this.f2718, interfaceC0841, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        long length;
        switch (this.f2717) {
            case 0:
                AbstractC1470.m3372(obj);
                Iterator it = ((C0714) this.f2718).f2723.iterator();
                long j = 0;
                while (it.hasNext()) {
                    File file = new File((String) it.next());
                    if (!file.exists()) {
                        length = 0;
                    } else if (file.isFile()) {
                        length = file.length();
                    } else {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            long jM4888 = 0;
                            for (File file2 : fileArrListFiles) {
                                jM4888 += AbstractC2902.m4888(file2);
                            }
                            length = jM4888;
                        } else {
                            length = 0;
                        }
                    }
                    j += length;
                }
                String[] strArr = AbstractC1471.f5234;
                if (j < 1024) {
                    String str = String.format(Locale.CHINA, "%.2f B", Arrays.copyOf(new Object[]{Double.valueOf(j)}, 1));
                    "format(...)";
                    return str;
                }
                if (j < JSONWriter.MASK_USE_SINGLE_QUOTES) {
                    String str2 = String.format(Locale.CHINA, "%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1));
                    "format(...)";
                    return str2;
                }
                if (j < JSONWriter.MASK_ESCAPE_NONE_ASCII) {
                    String str3 = String.format(Locale.CHINA, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf((j / 1024.0d) / 1024.0d)}, 1));
                    "format(...)";
                    return str3;
                }
                String str4 = String.format(Locale.CHINA, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(((j / 1024.0d) / 1024.0d) / 1024.0d)}, 1));
                "format(...)";
                return str4;
            case 1:
                AbstractC1470.m3372(obj);
                C0814 c0814 = (C0814) this.f2718;
                ((C1993) c0814.f3189.getValue()).mo3533(new C0441(c0814)).m3985();
                return C3554.UNIT;
            default:
                AbstractC1470.m3372(obj);
                ((AlertDialog) this.f2718).dismiss();
                return C3554.UNIT;
        }
    }
}
