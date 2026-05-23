package p000;

import android.app.AlertDialog;
import com.alibaba.fastjson2.JSONWriter;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᲁᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0717 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2723;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f2724;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0717(Object obj, InterfaceC0842 interfaceC0842, int i) {
        super(2, interfaceC0842);
        this.f2723 = i;
        this.f2724 = obj;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) throws Throwable {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f2723) {
            case 0:
                return ((C0717) mo1197(interfaceC0842, interfaceC0883)).mo1198(C3497.f10997);
            default:
                C0717 c0717 = (C0717) mo1197(interfaceC0842, interfaceC0883);
                C3497 c3497 = C3497.f10997;
                c0717.mo1198(c3497);
                return c3497;
        }
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (this.f2723) {
            case 0:
                return new C0717((C0719) this.f2724, interfaceC0842, 0);
            default:
                return new C0717((AlertDialog) this.f2724, interfaceC0842, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Throwable {
        long length;
        switch (this.f2723) {
            case 0:
                AbstractC0743.m2188(obj);
                Iterator it = ((C0719) this.f2724).f2729.iterator();
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
                            long jM2981 = 0;
                            for (File file2 : fileArrListFiles) {
                                jM2981 += AbstractC1270.m2981(file2);
                            }
                            length = jM2981;
                        } else {
                            length = 0;
                        }
                    }
                    j += length;
                }
                String[] strArr = AbstractC1574.f5469;
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
            default:
                AbstractC0743.m2188(obj);
                ((AlertDialog) this.f2724).dismiss();
                return C3497.f10997;
        }
    }
}
