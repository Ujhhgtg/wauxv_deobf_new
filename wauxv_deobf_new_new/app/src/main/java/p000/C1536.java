package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲈᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1536 extends AbstractC0061 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5391;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC0403 f5392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Serializable f5393;

    public C1536() {
        this.f5391 = 1;
        this.f5392 = new C1639();
        this.f5393 = new ArrayList();
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1061(CharSequence charSequence) {
        switch (this.f5391) {
            case 1:
                ((ArrayList) this.f5393).add(charSequence);
                break;
        }
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1063() {
        int i;
        switch (this.f5391) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f5393;
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
                                        case Opcodes.FCONST_1 /* 12 */:
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
                ((C1639) this.f5392).f5532 = sb.toString();
                break;
        }
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0403 mo1064() {
        switch (this.f5391) {
            case 0:
                return (C1535) this.f5392;
            default:
                return (C1639) this.f5392;
        }
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public void mo1066(C1654 c1654) {
        switch (this.f5391) {
            case 0:
                c1654.m3528((String) this.f5393, (C1535) this.f5392);
                break;
        }
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0404 mo1067(C1093 c1093) {
        switch (this.f5391) {
            case 0:
                return null;
            default:
                if (c1093.f3928 >= 4) {
                    return new C0404(-1, c1093.f3924 + 4, false);
                }
                if (c1093.f3929) {
                    return C0404.m1740(c1093.f3926);
                }
                return null;
        }
    }

    public C1536(int i, String str) {
        this.f5391 = 0;
        C1535 c1535 = new C1535();
        this.f5392 = c1535;
        c1535.f5390 = i;
        this.f5393 = str;
    }
}
