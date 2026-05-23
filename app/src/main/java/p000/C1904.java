package p000;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᤝᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1904 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Matcher f6278;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final CharSequence f6279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1903 f6280;

    public C1904(Matcher matcher, CharSequence charSequence) {
        this.f6278 = matcher;
        this.f6279 = charSequence;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List m3699() {
        if (this.f6280 == null) {
            this.f6280 = new C1903(this);
        }
        return this.f6280;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1904 m3700() {
        Matcher matcher = this.f6278;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f6279;
        if (iEnd <= charSequence.length()) {
            return AbstractC2209.m4123(matcher.pattern().matcher(charSequence), iEnd, charSequence);
        }
        return null;
    }
}
