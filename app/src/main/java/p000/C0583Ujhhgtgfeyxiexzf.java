package p000;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛴᛱfeyxiexzfᛱᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0583Ujhhgtgfeyxiexzf extends AbstractC2924Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final Pattern[][] f2617Ujhhgtgfeyxiexzf = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Pattern f2619Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0584Ujhhgtgfeyxiexzf f2618Ujhhgtgfeyxiexzf = new C0584Ujhhgtgfeyxiexzf(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f2620Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C2501feyxiexzfUjhhgtg f2621Ujhhgtgfeyxiexzf = new C2501feyxiexzfUjhhgtg((byte) 0, 2);

    public C0583Ujhhgtgfeyxiexzf(Pattern pattern) {
        this.f2619Ujhhgtgfeyxiexzf = pattern;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1839Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = this.f2621Ujhhgtgfeyxiexzf;
        StringBuilder sb = (StringBuilder) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
        if (c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf++;
        Pattern pattern = this.f2619Ujhhgtgfeyxiexzf;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f2620Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1840Ujhhgtgfeyxiexzf() {
        ((StringBuilder) this.f2621Ujhhgtgfeyxiexzf.f8171Ujhhgtgfeyxiexzf).toString();
        this.f2618Ujhhgtgfeyxiexzf.getClass();
        this.f2621Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final AbstractC2516feyxiexzfUjhhgtg mo1152Ujhhgtgfeyxiexzf() {
        return this.f2618Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final C2515feyxiexzfUjhhgtg mo1154Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg) {
        if (this.f2620Ujhhgtgfeyxiexzf) {
            return null;
        }
        if (c3215feyxiexzfUjhhgtg.f10091Ujhhgtgfeyxiexzf && this.f2619Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        return C2515feyxiexzfUjhhgtg.m3791Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg.f10085Ujhhgtgfeyxiexzf);
    }
}
