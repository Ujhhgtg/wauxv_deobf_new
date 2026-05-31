package p000;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᛸᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1931 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Matcher f6357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final CharSequence f6358;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1930 f6359;

    public C1931(Matcher matcher, CharSequence charSequence) {
        this.f6357 = matcher;
        this.f6358 = charSequence;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List m3883() {
        if (this.f6359 == null) {
            this.f6359 = new C1930(this);
        }
        return this.f6359;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1931 m3884() {
        Matcher matcher = this.f6357;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f6358;
        if (iEnd <= charSequence.length()) {
            return AbstractC1272.m3093(matcher.pattern().matcher(charSequence), iEnd, charSequence);
        }
        return null;
    }
}
