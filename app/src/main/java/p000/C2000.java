package p000;

import com.umeng.analytics.pro.bc;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2000 implements Serializable, Cloneable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final HashMap f6665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public String f6666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6669 = 0;

    static {
        HashMap map = new HashMap(17);
        f6665 = map;
        map.put("public", 1);
        map.put("private", 2);
        map.put("protected", 4);
        map.put("static", 8);
        map.put("final", 16);
        map.put("synchronized", 32);
        map.put("volatile", 64);
        map.put("transient", 128);
        map.put("native", Integer.valueOf(bc.e));
        map.put("interface", 512);
        map.put("abstract", 1024);
        map.put("strict", 2048);
        map.put("synthetic", 4096);
        map.put("annotation", 8192);
        map.put("enum", Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE));
        map.put("mandated", 32768);
        map.put("default", 65536);
    }

    public C2000(int i) {
        m3861(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static int m3858(String str) {
        Integer num = (Integer) f6665.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(AbstractC1194.m2785("Unknown modifier: '", str, "'"));
    }

    public final Object clone() {
        return (C2000) super.clone();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Modifiers: ");
        sb.append(Modifier.toString(this.f6669));
        int i = this.f6669;
        HashMap map = f6665;
        if ((i & ((Integer) map.get("enum")).intValue()) != 0) {
            str = " enum";
        } else {
            str = (this.f6669 & ((Integer) map.get("default")).intValue()) != 0 ? " default" : "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3859(int i) {
        if ((this.f6667 & i) != 0) {
            if (i < 7) {
                int i2 = this.f6669;
                if ((i2 & 7) > 0 && (i2 | i) != i2) {
                    throw new IllegalStateException("public/private/protected cannot be used in combination.");
                }
            }
            this.f6669 = i | this.f6669;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6666);
        sb.append(" cannot be declared '");
        HashMap map = f6665;
        for (String strValueOf : map.keySet()) {
            if (i == ((Integer) map.get(strValueOf)).intValue()) {
                throw new IllegalStateException(AbstractC2784.m4752(sb, strValueOf, "'"));
            }
        }
        strValueOf = String.valueOf(i);
        throw new IllegalStateException(AbstractC2784.m4752(sb, strValueOf, "'"));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3860(String str) {
        m3859(m3858(str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3861(int i) {
        this.f6668 = i;
        if (i == 0) {
            this.f6667 = Modifier.classModifiers();
            this.f6666 = "Class";
            return;
        }
        if (i == 1) {
            this.f6667 = Modifier.interfaceModifiers();
            this.f6666 = "Interface";
            return;
        }
        HashMap map = f6665;
        if (i == 2) {
            this.f6667 = Modifier.methodModifiers() | ((Integer) map.get("default")).intValue();
            this.f6666 = "Method";
            return;
        }
        if (i == 3) {
            this.f6667 = Modifier.fieldModifiers() | ((Integer) map.get("enum")).intValue();
            this.f6666 = "Field";
        } else if (i == 4) {
            this.f6667 = Modifier.parameterModifiers();
            this.f6666 = "Parameter";
        } else if (i != 5) {
            this.f6667 = 0;
            this.f6666 = "Unknown";
        } else {
            this.f6667 = Modifier.constructorModifiers();
            this.f6666 = "Constructor";
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2000 m3862() {
        return (C2000) super.clone();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m3863(int i) {
        return (i & this.f6669) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m3864(String str) {
        return m3863(m3858(str));
    }
}
