package p000;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲈᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2400 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final File f7679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final File f7680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final File f7681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final File f7682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2933 f7683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f7684;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2933 f7685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2933 f7686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2933 f7687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2933 f7688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2933 f7689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f7690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C1681 f7691;

    public C2400(File file) {
        this.f7679 = file;
        String[] strArr = AbstractC1471.f5234;
        this.f7680 = new File(file, "main.java");
        this.f7681 = new File(file, "info.prop");
        this.f7682 = new File(file, "readme.md");
        this.f7683 = new C2933(new C2399(this, 0));
        String name = file.getName();
        this.f7684 = name;
        this.f7685 = new C2933(new C2399(this, 1));
        this.f7686 = new C2933(new C2399(this, 2));
        this.f7687 = new C2933(new C2399(this, 3));
        this.f7688 = new C2933(new C2399(this, 4));
        this.f7689 = new C2933(new C2399(this, 5));
        StringBuilder sbM4787 = AbstractC2844.m4787(name);
        sbM4787.append(".enabled");
        this.f7690 = sbM4787.toString();
        this.f7691 = new C1681(this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2400) && AbstractC1469.m3322(((C2400) obj).f7680.getAbsolutePath(), this.f7680.getAbsolutePath());
    }

    public final int hashCode() {
        return this.f7680.getAbsolutePath().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("Plugin(pluginDir=");
        sb.append(this.f7679);
        sb.append(", id='");
        sb.append(this.f7684);
        sb.append("', name='");
        sb.append((String) this.f7685.getValue());
        sb.append("', author='");
        sb.append((String) this.f7686.getValue());
        sb.append("', version='");
        sb.append((String) this.f7687.getValue());
        sb.append("', updateTime='");
        sb.append((String) this.f7688.getValue());
        sb.append("', isEnabled=");
        sb.append(m4345());
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean m4345() {
        C0519 c0519 = AbstractC1586.f5502;
        if (c0519 != null) {
            return c0519.m1985().getBoolean(this.f7690, false);
        }
        throw new IllegalArgumentException("PluginConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4346(String str) throws IOException {
        ArrayList arrayList = C3741.f11709;
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("Plugin[");
        sb.append(this.f7684);
        sb.append("]: ");
        sb.append((Object) str);
        C3741.m5315(sb.toString(), null, 14);
        C1681 c1681 = this.f7691;
        c1681.m3559(new C2416(((C2400) c1681.f5660).f7684, "E", String.valueOf(str)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4347(boolean z) {
        C0519 c0519 = AbstractC1586.f5502;
        if (c0519 == null) {
            throw new IllegalArgumentException("PluginConfig must be init".toString());
        }
        c0519.m1985().putBoolean(this.f7690, z);
    }
}
