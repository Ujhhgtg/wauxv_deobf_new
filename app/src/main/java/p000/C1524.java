package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲇᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1524 extends AbstractC0054 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5360;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC0428 f5361;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Serializable f5362;

    public C1524() {
        this.f5360 = 1;
        this.f5361 = new C1626();
        this.f5362 = new ArrayList();
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo917(CharSequence charSequence) {
        switch (this.f5360) {
            case 1:
                ((ArrayList) this.f5362).add(charSequence);
                break;
        }
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo919() {
        int i;
        switch (this.f5360) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f5362;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char cCharAt = charSequence.charAt(i2);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case 12 /* 12 */:
                                        case '\r':
                                            break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        if (i2 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < size + 1; i++) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((C1626) this.f5361).f5498 = sb.toString();
                break;
        }
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0428 mo920() {
        switch (this.f5360) {
            case 0:
                return (C1523) this.f5361;
            default:
                return (C1626) this.f5361;
        }
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo922(C1640 c1640) {
        switch (this.f5360) {
            case 0:
                c1640.m3364((String) this.f5362, (C1523) this.f5361);
                break;
        }
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0429 mo923(C1088 c1088) {
        switch (this.f5360) {
            case 0:
                return null;
            default:
                if (c1088.f3917 >= 4) {
                    return new C0429(-1, c1088.f3913 + 4, false);
                }
                if (c1088.f3918) {
                    return C0429.m1634(c1088.f3915);
                }
                return null;
        }
    }

    public C1524(int i, String str) {
        this.f5360 = 0;
        C1523 c1523 = new C1523();
        this.f5361 = c1523;
        c1523.f5359 = i;
        this.f5362 = str;
    }
}
