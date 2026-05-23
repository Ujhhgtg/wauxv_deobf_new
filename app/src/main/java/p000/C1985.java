package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1985 extends C1653 {

    public final List f6595;

    public final String f6596;

    public C1985(String str, C1985 c1985, List list, String str2) {
        super(str, c1985);
        this.f6595 = list;
        this.f6596 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1985(String str, ArrayList arrayList) {
        String str2;
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(str2, null, arrayList, str);
    }
}
